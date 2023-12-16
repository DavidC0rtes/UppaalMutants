package Parser.Main;
import Parser.Command.Command;
import Parser.Errors.NoModelError;
import Parser.Errors.NoVerifyTaError;
import Parser.Invoker.Switch;
import Parser.OperatorCommands.*;
import Parser.OperatorCommands.SmiNoRedundant;
import Parser.Receiver.Mutator;
import Parser.Mutation.OptionsArgs;

import org.apache.commons.cli.*;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////


import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
//////////////////////////////////////////////////////////////////////

public class EntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);
    private static ArrayList<Command> commandsArray = new ArrayList<Command>();

    public static void main(String[] args)  {
        long startTime = System.currentTimeMillis();
        String output = "";
        OptionsArgs opt = new OptionsArgs();

        try{
            opt.parseArgs(args);
        } catch (ParseException e) {
            opt.printHelp();
            logger.error(e.toString());
            System.exit(1);
        } catch (NoModelError e) {
            System.out.println("-m,--model <path> is a required option" +
                    "\nTry `java -jar MutationUppaal.jar -h' for more information" +
                    "\nPress enter to exit.");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.exit(1);
        } catch (NoVerifyTaError e) {
            System.out.println("-v,--verifyta <path> is a required option to score" +
                    "\nDo you want to generate the mutants without scoring? (y/n)\n");
            Scanner scan = new Scanner(System.in);
            String response = scan.next();
            while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
                System.out.println("\nInvalid response. Try again.");
                response = scan.next();
            }
            if (response.equalsIgnoreCase("n")) {
                System.out.println("\nTry `java -jar MutationUppaal.jar -h' for more information");
                System.out.println("\nPress enter to exit.");
                scan = new Scanner(System.in);
                scan.nextLine();
                System.exit(1);
            } else {
                System.out.println("\nFine. Mutants without score will be generated");
            }
        }

        String path = opt.getPathMutants();

        if(opt.getPathMutants().equals("")){
            String here = System.getProperty("user.dir");
            String idFile = Long.toString(System.currentTimeMillis());
            path = here.concat(File.separator + "Mutation"+ idFile);
        }

        System.out.println("mutants will be created in this path: "+path);

        File fileMutants = new File(path);
        fileMutants.mkdirs();
        if(!fileMutants.exists()){
            logger.debug("there was an error creating the directory indicated " +
                    "\nwith the path option [-p <path>]. You may have indicated a wrong route. " +
                    "\nPress enter to exit.");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.exit(1);
        }

        Mutator mutator = null;
        try {
            mutator = new Mutator(opt.getModelFile().getAbsolutePath(), fileMutants, opt.getEnv());
        }catch (IOException e){
            logger.error(
                    "File {} does not exist: {}",
                    opt.getModelFile(),
                    e.toString()
            );
            System.exit(1);
        }

 /*     Command ccnMutant = new Ccn(mutator);
        Command cxlMutant = new Cxl(mutator);
        Command cxsMutant = new Cxs(mutator);
        Command smiMutant = new Smi(mutator);
        Command smiNoRedundant = new SmiNoRedundant(mutator);
        Command tadMutant = new Tad(mutator);
        Command tadRandomSyncMutant = new TadRandomSync(mutator);
        //prepare mutants only  if opt.getTadSync!=""
        Command tadSyncMutant = new TadSync(mutator, opt.getTadSync());
        Command tmiMutant = new Tmi(mutator);
        Command broadChanMutant = new BroadChan(mutator);
        Command parIntMutant = new ParInt(mutator);
        Command parSeqMutant = new ParSeq(mutator);
        Command maskVarClocks = new MaskVarClocks(mutator);*/

        boolean addAllResult = Collections.addAll(commandsArray,
               /*new Ccn(mutator),
                new Cxl(mutator),
                new Cxs(mutator),
                new Smi(mutator),
                new SmiNoRedundant(mutator),
                //new Tad(mutator),
                new SmiNoRedundant(mutator),
                new TadRandomSync(mutator),
                new TadNoRedundant(mutator),
                new TadSync(mutator, opt.getTadSync()),
                new Tmi(mutator),*/
                new BroadChan(mutator),
                new UrgChan(mutator),
                new DelSync(mutator),
                new SyncSeq(mutator),
                new MaskVarClocks(mutator),
                new MaskVarChannels(mutator),
                //new DelOutput(mutator),
                new CommLoc(mutator),
                new UrgLoc(mutator),
                new ReplaceMsg(mutator)
        );

        if (!addAllResult) {
            logger.error("Couldn't create command objects and/or array");
            System.exit(1);
        }

        /*Switch mySwitch = new Switch(tmiMutant, tadMutant, tadSyncMutant, tadRandomSyncMutant,
                smiMutant, smiNoRedundant,
                cxlMutant, cxsMutant, ccnMutant, broadChanMutant, parIntMutant, parSeqMutant);
*/
        Switch mySwitch = new Switch();

        final boolean runAll = opt.checkOption("all");
        commandsArray.forEach((comm) -> {
            if (opt.checkOption(comm.getName()) || runAll) {
                mySwitch.runOperator(comm);
            }
        });

/*        if(opt.isTmi()) mySwitch.tmi();
        if(opt.isTad()) mySwitch.tad();
        if(!opt.getTadSync().equals("")) mySwitch.tadSync();
        if(opt.isTadRandomSync()) mySwitch.setTadRandomSync();
        if(opt.isSmi()) mySwitch.smi();
        if(opt.isSmiNoRedundant()) mySwitch.smiNoRedundant();
        if(opt.isCxl()) mySwitch.cxl();
        if(opt.isCxs()) mySwitch.cxs();
        if(opt.isCcn()) mySwitch.ccn();
        if(opt.isBroadChan()) mySwitch.broadChan();
        if(opt.isParInt()) mySwitch.parInt();
        if(opt.isParSeq()) mySwitch.parSeq();
        if(opt.isMaskVarClocks()) mySwitch.runOperator(maskVarClocks);*/

        mutator.runOperators();
        try {
            mutator.joinOperators();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }

        output = output.concat(mutator.infoMutants());

        try {
            if(!opt.getVerifyTaFile().equals("")) {
                output =output.concat(
                        mutator.verifyMutants(
                                path,
                                opt.getVerifyTaFile(),
                                opt.getQueryFile()
                        )
                );
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        output = output.concat("Time execution: " +
                String.format("%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)))
        );
        try {
            if(opt.isLog()){
                FileWriter myWriter = null;
                myWriter = new FileWriter(new File(fileMutants, "log"));
                myWriter.write(output);
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create CSV report file
        try (FileWriter writer = new FileWriter(new File(fileMutants, "report.csv"))){
            writer.write(mutator.getCSVKilledMutants());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(output);

    }
}
