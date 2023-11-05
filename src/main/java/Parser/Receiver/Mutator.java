package Parser.Receiver;

import Parser.Antlr.UppaalLexer;
import Parser.Antlr.UppaalParser;
import Parser.Graph.Graph;
import Parser.Main.AppConfig;
import Parser.Mutation.ChanType;
import Parser.Mutation.UppaalVisitor;
import Parser.NTAExtension.ExtendedListener;
import be.unamur.uppaal.juppaal.*;
import be.unamur.uppaal.juppaal.declarations.Channel;
import be.unamur.uppaal.juppaal.labels.Synchronization;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Class <code>Mutator</code> defines the "engine" responsible
 * for scheduling mutations via the selected mutation operators using threads.
 */
public class Mutator {
    private File fileMutants;

    private String envTarget;
    private final String pathVerifyta;

    private final ArrayList<Thread> threadsTmi;
    private final ArrayList<Thread> threadsTad;
    private final ArrayList<Thread> threadsTadSync;
    private final ArrayList<Thread> threadsTadRandomSync;
    private final ArrayList<Thread> threadsSmi;
    private final ArrayList<Thread> threadsSmiNoRedundant;
    private final ArrayList<Thread> threadsCxl;
    private final ArrayList<Thread> threadsCxs;
    private final ArrayList<Thread> threadsCcn;

    private final ArrayList<Thread> threadsBroadChan;
    private final ArrayList<Thread> threadsDelSync = new ArrayList<>();
    private final ArrayList<Thread> threadsDelSyncNG = new ArrayList<>();
    private final ArrayList<Thread> threadsMaskVarClocks = new ArrayList<>();
    private final ArrayList<Thread> threadsMaskVarChannels = new ArrayList<>();
    private final ArrayList<Thread> threadsUrgChan = new ArrayList<>();
    private final ArrayList<Thread> threadsParSeq = new ArrayList<>();
    private final ArrayList<Thread> threadsdelOutput = new ArrayList<>();
    private final ArrayList<Thread> threadsCommLoc = new ArrayList<>();
    private final ArrayList<Thread> threadsUrgLoc = new ArrayList<>();
    private final ArrayList<Thread> threadsReplaceMsg = new ArrayList<>();
    private final ArrayList<Thread> threadsTadNoRedundant = new ArrayList<>();
    private UppaalParser parser;
    private ParseTree tree;
    private ExtendedListener listener;
    private final ArrayList arrayData = new ArrayList();
    private NTA nta;
    private Map<String, Channel> channels;
    private static final Logger logger = LoggerFactory.getLogger(Mutator.class);

    public Mutator() {
        this.pathVerifyta = AppConfig.getInstance().getVerifyTAPath();
        this.threadsTmi = new ArrayList<>();
        this.threadsTad = new ArrayList<>();
        this.threadsTadSync = new ArrayList<>();
        this.threadsTadRandomSync = new ArrayList<>();
        this.threadsSmi = new ArrayList<>();
        this.threadsSmiNoRedundant = new ArrayList<>();
        this.threadsCxl = new ArrayList<>();
        this.threadsCxs = new ArrayList<>();
        this.threadsCcn = new ArrayList<>();
        this.threadsBroadChan = new ArrayList<>();
    }

    public void parseModel(String modelFile, String envTarget) throws IOException {
        CharStream input = CharStreams.fromFileName(modelFile);
        UppaalLexer lexer = new UppaalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        this.envTarget = envTarget;
        this.parser = new UppaalParser(tokens, envTarget);
        this.tree = this.parser.model();

        // Create NTA walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // Create listener then feed to walker
        listener = new ExtendedListener();
        walker.walk(listener, tree);
    }

    public Mutator(String modelFile, File fileMutants, String envTarget) throws IOException {
        this.fileMutants = fileMutants;
        this.pathVerifyta = AppConfig.getInstance().getVerifyTAPath();
        this.threadsTmi = new ArrayList<>();
        this.threadsTad = new ArrayList<>();
        this.threadsTadSync = new ArrayList<>();
        this.threadsTadRandomSync = new ArrayList<>();
        this.threadsSmi = new ArrayList<>();
        this.threadsSmiNoRedundant = new ArrayList<>();
        this.threadsCxl = new ArrayList<>();
        this.threadsCxs = new ArrayList<>();
        this.threadsCcn = new ArrayList<>();
        this.threadsBroadChan = new ArrayList<>();

        parseModel(modelFile, envTarget);
        this.nta = new NTA(modelFile);
        this.channels = nta.populateChannels();
    }

    public String infoMutants(){
        String info = "Number of mutants:\n";
        info = info.concat("tmi ").concat(Integer.toString(this.threadsTmi.size())).concat("\n");
        info = info.concat("tad ").concat(Integer.toString(this.threadsTad.size())).concat("\n");
        info = info.concat("tadSync ").concat(Integer.toString(this.threadsTadSync.size())).concat("\n");
        info = info.concat("tadRandomSync ").concat(Integer.toString(this.threadsTadRandomSync.size())).concat("\n");
        info = info.concat("tadNoRedundant ").concat(Integer.toString(this.threadsTadNoRedundant.size())).concat("\n");
        info = info.concat("smi ").concat(Integer.toString(this.threadsSmi.size())).concat("\n");
        info = info.concat("smiNoRedundant ").concat(Integer.toString(this.threadsSmiNoRedundant.size())).concat("\n");
        info = info.concat("cxl ").concat(Integer.toString(this.threadsCxl.size())).concat("\n");
        info = info.concat("cxs ").concat(Integer.toString(this.threadsCxs.size())).concat("\n");
        info = info.concat("ccn ").concat(Integer.toString(this.threadsCcn.size())).concat("\n");
        info = info.concat("broadChan ").concat(Integer.toString(this.threadsBroadChan.size())).concat("\n");
        info = info.concat("delSync ").concat(Integer.toString(this.threadsDelSync.size())).concat("\n");
        info = info.concat("delSyncNG ").concat(Integer.toString(this.threadsDelSyncNG.size())).concat("\n");
        info = info.concat("parSeq ").concat(Integer.toString(this.threadsParSeq.size())).concat("\n");
        info = info.concat("maskVarClocks ").concat(Integer.toString(this.threadsMaskVarClocks.size())).concat("\n");
        info = info.concat("maskVarChannels ").concat(Integer.toString(this.threadsMaskVarChannels.size())).concat("\n");
        info = info.concat("urgChan ").concat(Integer.toString(this.threadsUrgChan.size())).concat("\n");
        info = info.concat("delOutput ").concat(Integer.toString(this.threadsdelOutput.size())).concat("\n");
        info = info.concat("commLoc ").concat(Integer.toString(this.threadsCommLoc.size())).concat("\n");
        info = info.concat("urgLoc ").concat(Integer.toString(this.threadsUrgLoc.size())).concat("\n");
        info = info.concat("ReplaceMsg ").concat(Integer.toString(this.threadsReplaceMsg.size())).concat("\n");
        info = info.concat("Total ").concat(Integer.toString(
                this.threadsTmi.size()
                        +this.threadsTad.size()
                        +this.threadsTadSync.size()
                        +this.threadsTadRandomSync.size()
                        +this.threadsTadNoRedundant.size()
                        +this.threadsSmi.size()
                        +this.threadsSmiNoRedundant.size()
                        +this.threadsCxl.size()
                        +this.threadsCxs.size()
                        +this.threadsCcn.size()
                        +this.threadsBroadChan.size()
                        +this.threadsDelSync.size()
                        +this.threadsParSeq.size()
                        +this.threadsMaskVarClocks.size()
                        +this.threadsMaskVarChannels.size()
                        +this.threadsUrgChan.size()
                        +this.threadsdelOutput.size()
                        +this.threadsCommLoc.size()
                        +this.threadsUrgLoc.size()
                        +this.threadsReplaceMsg.size()
                        +threadsDelSyncNG.size()
        )).concat("\n");
        return info;
    }

    private void addKilledData(Object val1, Object val2, Object val3)
    {
        arrayData.addAll(Arrays.asList(val1, val2, val3));
    }

    public String verifyMutants(String pathIn, String pathVerifyTa, String pathQuery) throws IOException, InterruptedException {
        addKilledData("Operator", "Generated mutants", "Killed mutants");
        String log = "";
        int killedTmi =  killedMutants(this.threadsTmi, pathIn, pathVerifyTa, pathQuery);
        int killedTad = killedMutants(this.threadsTad, pathIn, pathVerifyTa, pathQuery);
        int killedTadSync = killedMutants(this.threadsTadSync, pathIn, pathVerifyTa, pathQuery);
        int killedTadRandomSync = killedMutants(this.threadsTadRandomSync, pathIn, pathVerifyTa, pathQuery);
        int killedTadNoRedundant = killedMutants(this.threadsTadNoRedundant, pathIn, pathVerifyTa, pathQuery);
        addKilledData("tadNoRedundant", this.threadsTadNoRedundant.size(), killedTadNoRedundant);
        int killedSmi = killedMutants(this.threadsSmi, pathIn, pathVerifyTa, pathQuery);
        int killedSmiNoRedundant = killedMutants(this.threadsSmiNoRedundant, pathIn, pathVerifyTa, pathQuery);
        int killedCxl = killedMutants(this.threadsCxl, pathIn, pathVerifyTa, pathQuery);
        int killedCxs = killedMutants(this.threadsCxs, pathIn, pathVerifyTa, pathQuery);
        int killedCcn = killedMutants(this.threadsCcn, pathIn, pathVerifyTa, pathQuery);
        int killedBroadChan = killedMutants(this.threadsBroadChan, pathIn, pathVerifyTa, pathQuery);
        addKilledData("broadChan", threadsBroadChan.size(), killedBroadChan);
        int killedDelSync = killedMutants(this.threadsDelSync, pathIn, pathVerifyTa, pathQuery);
        int killedDelSyncNG = killedMutants(this.threadsDelSyncNG, pathIn, pathVerifyTa, pathQuery);

        addKilledData("delSync", threadsDelSync.size(), killedDelSync);
        addKilledData("delSyncNG", threadsDelSyncNG.size(), killedDelSyncNG);
        int killedParSeq = killedMutants(this.threadsParSeq, pathIn, pathVerifyTa, pathQuery);

        addKilledData("parSeq", threadsParSeq.size(), killedParSeq);
        int killedMaskVarClocks = killedMutants(this.threadsMaskVarClocks, pathIn, pathVerifyTa, pathQuery);
        addKilledData("maskVarClocks", threadsMaskVarClocks.size(), killedMaskVarClocks);
        int killedMaskVarChannels = killedMutants(this.threadsMaskVarChannels, pathIn, pathVerifyTa, pathQuery);

        addKilledData("maskVarChannels", threadsMaskVarChannels.size(), killedMaskVarChannels);
        int killedUrgChan = killedMutants(this.threadsUrgChan, pathIn, pathVerifyTa, pathQuery);

        addKilledData("urgChan", threadsUrgChan.size(), killedUrgChan);
        int killedDelOutput = killedMutants(this.threadsdelOutput, pathIn, pathVerifyTa, pathQuery);

        addKilledData("delOutput", threadsdelOutput.size(), killedDelOutput);

        int killedCommLoc = killedMutants(this.threadsCommLoc, pathIn, pathVerifyTa, pathQuery);
        addKilledData("commLoc", threadsCommLoc.size(), killedCommLoc);

        int killedUrgLoc = killedMutants(this.threadsUrgLoc, pathIn, pathVerifyTa, pathQuery);
        addKilledData("urgLoc", threadsUrgLoc.size(), killedCommLoc);

        int killedReplaceMsg = killedMutants(this.threadsReplaceMsg, pathIn, pathVerifyTa, pathQuery);
        addKilledData("ReplaceMsg", threadsReplaceMsg.size(), killedCommLoc);

        log = log.concat("Tmi killed ");
        log = log.concat(Integer.toString(killedTmi));
        log = log.concat("\nTad killed ");
        log = log.concat(Integer.toString(killedTad));
        log = log.concat("\ntadSync killed ");
        log = log.concat(Integer.toString(killedTadSync));
        log = log.concat("\ntadRandomSync killed ");
        log = log.concat(Integer.toString(killedTadRandomSync));
        log = log.concat("\ntadNoRedundant killed ");
        log = log.concat(Integer.toString(killedTadNoRedundant));
        log = log.concat("\nSmi killed ");
        log = log.concat(Integer.toString(killedSmi));
        log = log.concat("\nSmiNoRedundant killed ");
        log = log.concat(Integer.toString(killedSmiNoRedundant));
        log = log.concat("\nCxl killed ");
        log = log.concat(Integer.toString(killedCxl));
        log = log.concat("\nCxs killed ");
        log = log.concat(Integer.toString(killedCxs));
        log = log.concat("\nCcn killed ");
        log = log.concat(Integer.toString(killedCcn));
        log = log.concat("\nBroadChan killed ");
        log = log.concat(Integer.toString(killedBroadChan));
        log = log.concat("\nDelSync killed ");
        log = log.concat(Integer.toString(killedDelSync));
        log = log.concat("\nDelSyncNG killed ");
        log = log.concat(Integer.toString(killedDelSync));
        log = log.concat("\nParSeq killed ");
        log = log.concat(Integer.toString(killedParSeq));
        log = log.concat("\nMaskVarClocks killed ");
        log = log.concat(Integer.toString(killedMaskVarClocks));
        log = log.concat("\nMaskVarChannels killed ");
        log = log.concat(Integer.toString(killedMaskVarChannels));
        log = log.concat("\nUrgChan killed ");
        log = log.concat(Integer.toString(killedUrgChan));
        log = log.concat("\nDelOutput killed ");
        log = log.concat(Integer.toString(killedDelOutput));
        log = log.concat("\nCommLoc killed ");
        log = log.concat(Integer.toString(killedCommLoc));
        log = log.concat("\nUrgLoc killed ");
        log = log.concat(Integer.toString(killedUrgLoc));
        log = log.concat("\nReplaceMsg killed ");
        log = log.concat(Integer.toString(killedReplaceMsg));
        log = log.concat("\nScore ").concat(Integer.toString(
                killedTmi+killedTad+killedTadSync+killedTadRandomSync+killedSmi+killedCxl+killedCxs+killedCcn+
                        killedBroadChan + killedDelSync + killedDelSyncNG + killedParSeq + killedMaskVarClocks + killedMaskVarChannels
                        + killedUrgChan + killedDelOutput  + killedCommLoc + killedUrgLoc + killedReplaceMsg + killedTadNoRedundant
        )).concat("/").concat(Integer.toString(
                this.threadsTmi.size()
                        +this.threadsTad.size()
                        +this.threadsTadSync.size()
                        +this.threadsTadRandomSync.size()
                        +this.threadsTadNoRedundant.size()
                        +this.threadsSmi.size()
                        +this.threadsSmiNoRedundant.size()
                        +this.threadsCxl.size()
                        +this.threadsCxs.size()
                        +this.threadsCcn.size()
                        +this.threadsBroadChan.size()
                        +this.threadsDelSync.size()
                        +threadsDelSyncNG.size()
                        +this.threadsParSeq.size()
                        +this.threadsMaskVarClocks.size()
                        +this.threadsMaskVarChannels.size()
                        +this.threadsUrgChan.size()
                        +this.threadsdelOutput.size()
                        +this.threadsCommLoc.size()
                        +this.threadsUrgLoc.size()
                        +this.threadsReplaceMsg.size()
        ));
        log = log.concat("\n");
        return log;
    }

    private ArrayList<String> getMutantsPaths(ArrayList<Thread> operatorThreads, String pathIn) {
        ArrayList<String> mutantsPaths = new ArrayList<>();
        for (String mutant : operatorThreads.stream().map(Thread::getName).toArray(String[]::new)) {
            String mutantPath = pathIn + File.separator + mutant;
            mutantsPaths.add(mutantPath);
        }
        return mutantsPaths;
    }
    public int killedMutants(ArrayList<String> mutantPaths, String pathQuery) {
        int dead = 0;
        for (String mutantPath : mutantPaths) {
            String command = pathVerifyta + " -q " + mutantPath;

            if (!pathQuery.isEmpty()) {
                command += " " + pathQuery;
            }

            ProcessBuilder verifypb = new ProcessBuilder(command.split(""));

            try {
                Process p = verifypb.start();

                if (!p.waitFor(40, TimeUnit.SECONDS)) {
                    System.err.printf("Process %s timed out%n", p.info().toString());
                    continue;
                }

                String line = new String(p.getInputStream().readAllBytes());

                if (line == null || line.isEmpty()) {
                    System.err.println(mutantPath + " got error from verifier: " + new String(p.getErrorStream().readAllBytes()));
                    dead++;
                    continue;
                }

                if (!line.contains("is satisfied")) {
                    dead++;
                    System.out.println("Mutant " + mutantPath + " result: " + line);
                } else {
                    System.out.println("Mutant " + mutantPath + " result: " + line);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        return dead;
    }


    /**
     * @param operatorThreads
     * @param pathIn
     * @param pathVerifyTa
     * @param pathQuery
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public int killedMutants(ArrayList<Thread> operatorThreads, String pathIn, String pathVerifyTa, String pathQuery) throws IOException, InterruptedException {
        String mutantPath = "";
        int dead = 0;
        for(String mutantTmi: operatorThreads.stream().map(Thread::getName).toArray(String[]::new)){
            mutantPath = pathIn + File.separator + mutantTmi;
            String command = pathVerifyTa.concat(" -q ").concat(mutantPath);

            if (!pathQuery.isEmpty()) command += " ".concat(pathQuery);

            //Process p = Runtime.getRuntime().exec(command);
            ProcessBuilder verifypb = new ProcessBuilder();
            verifypb.command(command.split(" "));

            Process p = verifypb.start();

            if (!p.waitFor(40, TimeUnit.SECONDS)) {
                logger.info(String.format("Process %s timed out", p.info().toString()));
                continue;
            }
            String line = new String(p.getInputStream().readAllBytes());

          /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();*/

            if(line == null || line.isEmpty() ){
                System.err.println(mutantPath + " got error from verifier: " + new String(p.getErrorStream().readAllBytes()));
                dead++;
                continue;
            }
            if (!line.contains("is satisfied")) {
                dead++;
                System.out.println("Mutant "+ mutantPath + " result: " +line);
                continue;
            }

            /*while ((line = reader.readLine())!=null){
                if (line.contains("NOT satisfied") || line.contains("MAY be satisfied")) {
                    dead++;
                    break;
                }
            }*/
            System.out.println("Mutant "+ mutantPath + " result: " +line);
        }
        return dead;
    }

    /**
     * Run operator generating mutants in fileIn path
     */
    public void runOperators(){
        this.runThreads(this.threadsTmi);
        this.runThreads(this.threadsTad);
        this.runThreads(this.threadsTadSync);
        this.runThreads(this.threadsTadRandomSync);
        this.runThreads(this.threadsTadNoRedundant);
        this.runThreads(this.threadsSmi);
        this.runThreads(this.threadsSmiNoRedundant);
        this.runThreads(this.threadsCxl);
        this.runThreads(this.threadsCxs);
        this.runThreads(this.threadsCcn);
        this.runThreads(this.threadsBroadChan);
        this.runThreads(this.threadsDelSync);
        this.runThreads(this.threadsDelSyncNG);
        this.runThreads(this.threadsParSeq);
        this.runThreads(this.threadsMaskVarClocks);
        this.runThreads(this.threadsMaskVarChannels);
        this.runThreads(this.threadsUrgChan);
        this.runThreads(this.threadsdelOutput);
        this.runThreads(this.threadsCommLoc);
        this.runThreads(this.threadsUrgLoc);
        this.runThreads(this.threadsReplaceMsg);
    }

    public void runThreads(ArrayList<Thread> threads){
        for (Thread mutantThread: threads){
            mutantThread.start();
        }
    }

    /**
     * Join functions to wait until every mutant is generated
     * @throws InterruptedException
     */
    public void joinOperators() throws InterruptedException {
        this.joinThreads(this.threadsTmi);
        this.joinThreads(this.threadsTad);
        this.joinThreads(this.threadsTadSync);
        this.joinThreads(this.threadsTadRandomSync);
        this.joinThreads(this.threadsTadNoRedundant);
        this.joinThreads(this.threadsSmi);
        this.joinThreads(this.threadsSmiNoRedundant);
        this.joinThreads(this.threadsCxl);
        this.joinThreads(this.threadsCxs);
        this.joinThreads(this.threadsCcn);
        this.joinThreads(this.threadsBroadChan);
        this.joinThreads(this.threadsDelSync);
        this.joinThreads(this.threadsDelSyncNG);
        this.joinThreads(this.threadsParSeq);
        this.joinThreads(this.threadsMaskVarClocks);
        this.joinThreads(this.threadsMaskVarChannels);
        this.joinThreads(this.threadsUrgChan);
        this.joinThreads(this.threadsdelOutput);
        this.joinThreads(this.threadsCommLoc);
        this.joinThreads(this.threadsUrgLoc);
        this.joinThreads(this.threadsReplaceMsg);
    }


    public void joinThreads(ArrayList<Thread> threads) throws InterruptedException {
        for (Thread mutantThread: threads){
            mutantThread.join();
        }
    }
    /*
    public void joinTmi() throws InterruptedException {
        for (Thread mutantThread: this.threadsTmi){
            mutantThread.join();
        }
    }
    public void joinTad() throws InterruptedException {
        for (Thread mutantThread: this.threadsTad){
            mutantThread.join();
        }
    }
    public void joinTadSync() throws InterruptedException {
        for (Thread mutantThread: this.threadsTadSync){
            mutantThread.join();
        }
    }
    public void joinTadRandomSync() throws  InterruptedException {
        for (Thread mutantThread: this.threadsTadRandomSync){
            mutantThread.join();
        }
    }
    public void joinSmi() throws InterruptedException {
        for (Thread mutantThread: this.threadsSmi){
            mutantThread.join();
        }
    }
    public void joinSmiNoRedundant() throws InterruptedException {
        for (Thread mutantThread: this.threadsSmiNoRedundant){
            mutantThread.join();
        }
    }
    public void joinCxl() throws InterruptedException {
        for (Thread mutantThread: this.threadsCxl){
            mutantThread.join();
        }
    }
    public void joinCxs() throws InterruptedException {
        for (Thread mutantThread: this.threadsCxs){
            mutantThread.join();
        }
    }
    public void joinCcn() throws InterruptedException {
        for (Thread mutantThread: this.threadsCcn){
            mutantThread.join();
        }
    }

     */

    public void prepareSyncSwap() {
        parser.getTransitionsTad();
    }

    private boolean canApplyLocModifier(Location location, String operator) {
        if (operator.equals("commLoc") && !location.getType().equals(Location.LocationType.COMMITTED)) {
            return true;
        }
        else return operator.equals("urgLoc") && !location.getType().equals(Location.LocationType.URGENT);
    }
    public void prepareLocModifierOpV2(String operator) {
        Map<String, ArrayList<Thread>> threadMap = Map.of(
                "commLoc", threadsCommLoc,
                "urgLoc", threadsUrgLoc
        );
        for (Automaton automaton : this.nta.getAutomata()) {
            for (Location location : automaton.getLocations()) {
               if (canApplyLocModifier(location, operator)) {
                   NTA mutant = new NTA(this.nta.getAbsoluteModelPath());
                   Location mloc = mutant.getAutomaton(location.getAutomaton().getName().toString())
                                    .getLocation(location.getName().toString());

                   Location.LocationType ltype = operator.equals("commLoc")
                           ? Location.LocationType.COMMITTED
                           : Location.LocationType.URGENT;

                   mloc.setType(ltype);
                   String fileName = operator + "_" + automaton.getName() + "_"+location.getName()+".xml";
                   String path = this.fileMutants.getPath() + File.separator + fileName;
                   threadMap.get(operator).add(new Thread(() ->  mutant.writeModelToFile(path), path));
               }
            }
        }
    }

    /*public void prepareLocModifierOp(String operator) {
        ArrayList<Integer> locations = listener.getLocations();
        Map<String, ArrayList<Thread>> threadMap = Map.of(
                "commLoc", threadsCommLoc,
                "urgLoc", threadsUrgLoc
        );
        int i = 0;
        for (Integer locHash : locations) {
            int finalI = i;
            threadMap.get(operator).add(new Thread(() -> {
                UppaalVisitor eval = new UppaalVisitor(
                        this.envTarget,
                        parser.getClockEnv(),
                        null,
                        "",
                        operator
                );
                eval.addHashCodeTarget(locHash);
                try (FileWriter writer = new FileWriter(new File(this.fileMutants, operator+ "_" + finalI+".xml"))){
                    writer.write(eval.visit(tree));
                } catch (IOException ex) {
                    logger.error(ex.getMessage());
                }
            }, operator + "_" + finalI+".xml"));
            i++;
        }
    }*/
    public void prepareUBOperatorOld(String prefix) {
        // A prefix is one of...
        String[] prefixes = {"broadcast", "urgent"};
        if (!prefixes[0].equals(prefix) && !prefixes[1].equals(prefix)) {
            logger.error("Invalid prefix " + prefix + " operator urg/broadChan.");
            return;
        }

        Map<String, ArrayList<Thread>> threadMap = Map.of(
                "broadcast", threadsBroadChan,
                "urgent", threadsUrgChan
        );

        // Only interested in global channels.
        ArrayList<ChanType> candidates = parser.getChannelEnv().get("Global");

        List<ChanType> finalCandidates = new ArrayList<>(candidates);
        finalCandidates.removeIf(x -> x.getPrefix().equals(prefix));

        String operator = prefix.equals("broadcast") ? "broadChan" : "urgChan";
        for (ChanType channel : finalCandidates) {

            threadMap.get(prefix).add(new Thread(() -> {
                UppaalVisitor eval = new UppaalVisitor(
                        this.envTarget,
                        parser.getClockEnv(),
                        channel,
                        "",
                        operator
                );

                try (FileWriter writer = new FileWriter(new File(this.fileMutants, operator + "_" + channel.getName() + ".xml"))) {
                    writer.write(eval.visit(tree));
                } catch (IOException e) {
                    logger.error("Error writing to file:{}", e.toString());
                }
            }, operator +"_" + channel.getName() + ".xml"));
        }
    }

    private boolean canPerformUBOp(Channel.ChanType cType, String prefix) {
        if (prefix.equals("broadcast") && !cType.equals(Channel.ChanType.BROADCAST)) {
            return true;
        }
        return prefix.equals("urgent") && !cType.equals(Channel.ChanType.URGENT);
    }

    private boolean isValidPrefix(String prefix) {
        return Arrays.asList("broadcast", "urgent").contains(prefix);
    }

    private Channel.ChanType getChannelType(String prefix) {
        if (prefix.equals("broadcast")) {
            return Channel.ChanType.BROADCAST;
        } else if (prefix.equals("urgent")) {
            return Channel.ChanType.URGENT;
        } else {
            throw new IllegalArgumentException("Invalid prefix: " + prefix);
        }
    }

    private String makeMutantPath(Channel channel, String operator) {
        String fileName = operator + "_" + channel.getName() + ".xml";
        return this.fileMutants.getPath() + File.separator + fileName;
    }

    private void updateChannelDeclaration(NTA mutant, Channel channel, String prefix) {
        for (ListIterator i = mutant.getDeclarations().getStrings().listIterator(); i.hasNext(); ) {
            String d = (String) i.next();
            if (d.contains("chan") && d.contains(channel.getName())) {
                i.set(d.replaceFirst(",(\\s)*" + channel.getName(), ""));
                break;
            }
        }
        mutant.getDeclarations().add(prefix + " chan " + channel.getName() + ";");
    }
    public void prepareUBOperator(String prefix) {
        if (!isValidPrefix(prefix)) {
            throw new IllegalArgumentException("Invalid prefix " + prefix + " operator urg/broadChan.");
        }

        Map<String, ArrayList<Thread>> threadMap = Map.of(
                "broadcast", threadsBroadChan,
                "urgent", threadsUrgChan
        );

        Channel.ChanType type = getChannelType(prefix);

        for (Channel channel : this.nta.populateChannels().values()) {
            NTA mutant = new NTA(this.nta.getAbsoluteModelPath());
            Channel.ChanType ogType = channel.getType();
            if (canPerformUBOp(ogType, prefix)) {
                Channel chan = mutant.populateChannels().get(channel.getName());
                chan.setType(type);

                updateChannelDeclaration(mutant, chan, prefix);

                String path = makeMutantPath(chan, prefix);
                threadMap.get(prefix).add(new Thread(() -> mutant.writeModelToFile(path), path));
            }
        }
    }

    /** Start DelSync **/
    private void handleTransitionDelSync(Transition transition, int idx) {
        Synchronization sync = transition.getSync();
        if (sync != null && !sync.toString().isEmpty()) {
            Channel chan = channels.get(sync.getPureChannelName());
            // if the channel is not binary, we only delete the receiver to prevent deadlocks.
            if (chan.getType() != Channel.ChanType.BINARY) {
                if (Objects.requireNonNull(sync.getSyncType()) == Synchronization.SyncType.RECEIVER) {
                    processSync(transition, idx, true);
                } else if (Objects.requireNonNull(sync.getSyncType()) == Synchronization.SyncType.INITIATOR) {
                    processSync(transition, idx, false);
                }
            } else {
                // delete receiver and initiator
                processMultipleSyncs(transition.getAutomaton().getName().toString(), idx);
            }
        }
    }

    private void processMultipleSyncs(String automatonName, int idx) {
        NTA mutant = new NTA(this.nta.getModelPath());

        Transition t1 = mutant.getAutomaton(automatonName).getTransitions().get(idx);

        for (Automaton ta : mutant.getAutomata()) {
            if (!ta.getName().toString().equals(automatonName)) {
                for (Transition t2 : ta.getTransitions()) {
                    if (t2.getSync() != null && !t2.getSync().toString().isEmpty()) {
                        if (t2.getSync().getChannelName().equals(t1.getSync().getChannelName())
                                && t1.getSync().getSyncType() != t2.getSync().getSyncType())
                        { // a matching transition is found
                            String fileName = "delSync_" + automatonName + "_"+ta.getName()+"_"+t1.getSync().getChannelName()+".xml";
                            t2.setSync(null);
                            t1.setSync(null);
                            String filePath = this.fileMutants.getPath() + File.separator + fileName;
                            threadsDelSync.add(new Thread(() -> mutant.writeModelToFile(filePath), fileName));
                            return;
                        }
                    }
                }
            }
        }
    }
    private void processSync(Transition transition, int idx, boolean guideline) {
        NTA mutant = new NTA(this.nta.getModelPath());
        String taioName = transition.getAutomaton().getName().toString();

        Transition mutantTransition = mutant.getAutomaton(taioName).getTransitions().get(idx);
        mutantTransition.setSync(null);
        String prefix = guideline ? "delSync_" : "delSyncNG_";
        if (guideline) {
            String fileName = prefix + taioName + idx + ".xml";
            String filePath = this.fileMutants.getPath() + File.separator + fileName;

            threadsDelSync.add(new Thread(() -> mutant.writeModelToFile(filePath), fileName));
        } else {
            String fileName = prefix + taioName + idx + ".xml";
            String filePath = this.fileMutants.getPath() + File.separator + fileName;

            threadsDelSyncNG.add(new Thread(() -> mutant.writeModelToFile(filePath), fileName));
        }
    }
    public void prepareDelSyncOperator() {
        // iterate through all automata of mutant
        for (Automaton taio : this.nta.getAutomata()) {
            // iterate through all transitions of taio
            ArrayList<Transition> ogTransitions = taio.getTransitions();
            // Classic for instead of for-each because we need to modify elements without affecting this.nta.
            for (int i = 0; i < ogTransitions.size(); i++) {
                handleTransitionDelSync(ogTransitions.get(i), i);
            }
        }
    }

    /*public void prepareDelSyncOperator() {
        // Only interested in global channels.
        ArrayList<ChanType> candidates = parser.getChannelEnv().get("Global");

        //Set<String> chanNames = listener.getChanToTemplate().keySet();
        for(ChanType channel : candidates) {
            int counter = 1;
            for (int hashCode : listener.getChanToInTran().get(channel.getName())) {
                for (int outHashCode : listener.getChanToOutTran().get(channel.getName())) {
                    int finalCounter = counter;
                    threadsDelSync.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(
                                this.envTarget,
                                parser.getClockEnv(),
                                channel,
                                "",
                                "delSync"
                        );

                        eval.addHashCodeTarget(hashCode);
                        eval.addOutHashCode(outHashCode);

                        try (FileWriter writer = new FileWriter(new File(this.fileMutants, "delSync_" + channel.getName() + finalCounter + ".xml"))) {
                            writer.write(eval.visit(tree));
                        } catch (IOException ex) {
                            logger.error("Error writing to file {}", ex.toString());
                        }
                    }, "delSync_" + channel + counter + ".xml"));
                    counter++;
                }
            }
        }
    }
*/
    /* Start parSeq*/
    public void prepareParSeqOperator() {
        Set<String> chanNames = listener.getChanToTemplate().keySet();
        // Only interested in global channels.
        ArrayList<ChanType> candidates = parser.getChannelEnv().get("Global");
        int counter = 0;
        for (ChanType channel : candidates) {
            for (int outputHash : listener.getChanToOutTran().get(channel.getName())) {
                for (int inputHash : listener.getChanToInTran().get(channel.getName())) {
                    int finalCounter = counter;
                    threadsParSeq.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(
                                this.envTarget,
                                parser.getClockEnv(),
                                channel,
                                "",
                                "parSeq"
                        );

                        eval.addHashCodeTarget(inputHash);
                        eval.addOutHashCode(outputHash);

                        try (FileWriter writer = new FileWriter(new File(this.fileMutants, "parSeq_"+channel.getName() + finalCounter +".xml"))){
                            writer.write(eval.visit(tree));
                        } catch (IOException ex) {
                            logger.error("Error writing to file {}", ex.toString());
                        }
                    }, "parSeq_"+channel + counter+".xml"));
                    counter++;
                }
            }
        }
    }

    private List<String> getClocks(NTA mutant) {
        return mutant.getDeclarations().getStrings()
                .stream()
                .filter(decl -> decl.contains("clock"))
                .map(decl -> decl.trim().replaceAll("clock|;", ""))
                .collect(Collectors.toList());
    }

    private boolean clockAlreadyExists(Automaton automaton, String clock) {
        return automaton.getDeclaration().getStrings().
                stream().anyMatch(x -> x.startsWith("clock") && x.contains(clock));
    }

    private String makePathMaskVarClocks(Automaton automaton, String clockName) {
        String filename = "maskVarClock_" + clockName + "_"+ automaton.getName() + ".xml";
        return fileMutants + File.separator + filename;
    }
    public void prepareMaskVarClocksOp() {
        for (String clockDecl : getClocks(this.nta)) {
            for (String clock : clockDecl.split(",")) {
                for (Automaton automaton : this.nta.getAutomata()) {
                    String clockName = clock.trim();
                    if (!clockAlreadyExists(automaton, clockName)) {
                        NTA mutant = new NTA(this.nta.getAbsoluteModelPath());
                        mutant.getAutomaton(automaton.getName().toString())
                                .getDeclaration()
                                .add("clock " + clockName + ";");

                        threadsMaskVarClocks.add(
                                new Thread(() -> mutant.writeModelToFile(makePathMaskVarClocks(automaton, clockName)),
                                        makePathMaskVarClocks(automaton, clockName))
                        );
                    }
                }
            }
        }
    }
    /*public void prepareMaskVarClocksOpOld() {
        HashMap<String, ArrayList<String>> clockToTemplate = listener.getClockToTemplate();
        for (var entry: clockToTemplate.entrySet()) {
            String declaration = entry.getValue().remove(0);
            for (String template : entry.getValue()) {
                threadsMaskVarClocks.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(
                            template,
                            parser.getClockEnv(),
                            null,
                            declaration,
                            "maskVarClocks"
                    );
                    try (FileWriter writer = new FileWriter(new File(
                            this.fileMutants,
                            "MaskVarClock_" + entry.getKey() + "_" + template + ".xml"))) {
                        writer.write(eval.visit(tree));
                    } catch (IOException ex) {
                        logger.error("Error writing to file {}", ex.toString());
                    }
                }, "MaskVarClock_" + entry.getKey() + "_" + template + ".xml"));
            }
        }
    }*/

    private String computeMaskVarChanPath(Automaton automaton, Channel channel) {
        String filename = "MaskVarChannel_" + channel.getName() + "_" + automaton.getName() + ".xml";
        return fileMutants + File.separator + filename;
    }
    public void prepareMaskVarChannelsOp() {
        for (Channel channel : this.channels.values()) {
            for (Automaton automaton : this.nta.getAutomata()) {
                //todo: check if channel is declared in automaton.
                NTA mutant = new NTA(this.nta.getAbsoluteModelPath());
                String chanDecl = String.format(
                        "%s chan %s;",
                        channel.getType().toString().toLowerCase(),
                        channel.getName()
                );

                mutant.getAutomaton(automaton.getName().toString())
                        .getDeclaration()
                        .add(chanDecl);

                threadsMaskVarChannels.add(new Thread(()-> {
                    mutant.writeModelToFile(computeMaskVarChanPath(automaton, channel));
                }, computeMaskVarChanPath(automaton, channel)));
            }
        }
    }
    /*public void prepareMaskVarChannelsOpold() {
        HashMap<String, ArrayList<String>> globalChans = listener.getChanToTemplate();
        for (var entry : globalChans.entrySet()) {
            String declaration = entry.getValue().remove(0);
            for ( String template : entry.getValue()) {
                threadsMaskVarChannels.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(
                            template,
                            parser.getClockEnv(),
                            null,
                            declaration,
                            "maskVarChannels"
                    );
                    try (FileWriter writer = new FileWriter(new File(
                            this.fileMutants, "MaskVarChannel_" + entry.getKey() + "_" +template + ".xml"
                    ))) {
                        writer.write(eval.visit(tree));
                    } catch (IOException ex) {
                        logger.error("Error writing to file {}", ex.toString());
                    }
                }, "MaskVarChannel_" + entry.getKey() + "_" +template + ".xml"));
            }
        }
    }*/
    public void prepareDelOutput() {
        for (String chan : listener.getChanToTemplate().keySet()) {
            int count = 0;
            for (int outputHashCode : listener.getChanToInTran().get(chan)) {
                int finalCount = count;
                threadsdelOutput.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(
                            this.envTarget,
                            parser.getClockEnv(),
                            null,
                            "",
                            "delOutput"
                    );
                    eval.addOutHashCode(outputHashCode);
                    try (FileWriter writer = new FileWriter(new File(
                            this.fileMutants, "delOutput_" + chan + "_" + finalCount + ".xml"
                    ))) {
                        writer.write(eval.visit(tree));
                    } catch (IOException ex) {
                        logger.error("Error writing to file {}", ex.toString());
                    }
                }, "delOutput_" + chan + "_" + count+".xml"));
                count++;
            }
        }
    }


    public void prepareTmiOperator(){
        for (int i : parser.getTmi()) {
            threadsTmi.add(new Thread(() -> {
                UppaalVisitor eval = new UppaalVisitor(i, "", "", "", "", "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(this.fileMutants, "tmi" + i + ".xml"));
                    myWriter.write(eval.visit(tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "tmi" + i + ".xml"));
        }
    }

    public void prepareTadOperator(){
        if(this.envTarget.equals("")){
            //Each template
            for (String template : parser.getTransitionsTad().keySet()) {
                //Each source
                for (String source : this.parser.getTransitionsTadNoSync().get(template).keySet()) {
                    HashSet<String> targets = this.parser.getTransitionsTadNoSync().get(template).get(source);
                    //If source does not have an available target, then continue
                    if (targets.isEmpty()) {
                        continue;
                    }

                    Iterator<String> iterTargets = targets.iterator();

                    for (int i = 0; i < targets.size(); i++) {
                        //Choose target
                        String target = iterTargets.next();

                        this.threadsTad.add(new Thread(() -> {
                            UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, "", "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                            FileWriter myWriter = null;
                            try {
                                myWriter = new FileWriter(new File(this.fileMutants, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                                myWriter.write(eval.visit(this.tree));
                                myWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                    }
                }
            }
        }


        if(this.parser.getTransitionsTad().containsKey(this.envTarget)){
            //Each source
            for (String source : this.parser.getTransitionsTadNoSync().get(this.envTarget).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTadNoSync().get(this.envTarget).get(source);
                //If source does not have an available target, then continue
                if (targets.isEmpty()) {
                    continue;
                }

                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();

                    this.threadsTad.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, this.envTarget, source, target, "", "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(this.fileMutants, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tad".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }

    }

    public void prepareTadSyncOperator(String chanSync) {
        if(this.envTarget.equals("")) {
            //Each template
            for (String template : parser.getTransitionsTad().keySet()) {
                //Each source
                for (String source : this.parser.getTransitionsTad().get(template).keySet()) {
                    HashSet<String> targets = this.parser.getTransitionsTad().get(template).get(source);
                    //If source does not have an available target, then continue
                    if (targets.isEmpty()) {
                        continue;
                    }


                    Iterator<String> iterTargets = targets.iterator();

                    for (int i = 0; i < targets.size(); i++) {
                        //Choose target
                        String target = iterTargets.next();

                        String output = chanSync.concat("!");
                        this.threadsTadSync.add(new Thread(() -> {
                            UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                            FileWriter myWriter = null;
                            try {
                                myWriter = new FileWriter(new File(this.fileMutants, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                                myWriter.write(eval.visit(this.tree));
                                myWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                    }
                }
            }
            return;
        }
        if(this.parser.getTransitionsTad().containsKey(this.envTarget)){

            for (String source : this.parser.getTransitionsTad().get(this.envTarget).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTad().get(this.envTarget).get(source);
                //If source does not have an available target, then continue
                if (targets.isEmpty()) {
                    continue;
                }

                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();

                    String output = chanSync.concat("!");
                    this.threadsTadSync.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, this.envTarget, source, target, output, "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(this.fileMutants, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tadSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }

        }
    }

    public void prepareTadRandomSyncOperator(){
        if(this.envTarget.equals("")){
            for (String template : parser.getTransitionsTad().keySet()) {
                String outputEnv = "";
                if (!this.parser.getChannelEnv().get("Global").isEmpty()) {
                    outputEnv = "Global";
                } else if (!this.parser.getChannelEnv().get(template).isEmpty()) {
                    outputEnv = template;
                } else {
                    continue;
                }
                for (String source : this.parser.getTransitionsTad().get(template).keySet()) {
                    HashSet<String> targets = this.parser.getTransitionsTad().get(template).get(source);

                    if (targets.isEmpty()) {
                        continue;
                    }

                    Iterator<String> iterTargets = targets.iterator();

                    for (int i = 0; i < targets.size(); i++) {
                        //Choose target
                        String target = iterTargets.next();
                        int chanPicked = 0;
                        String chan = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getName();
                        int dimensions = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getDimension();
                        for (int j=0; j<dimensions; j++){
                            chan = chan.concat("[0]");
                        }
                        String output = chan.concat("!");
                        this.threadsTadRandomSync.add(new Thread(() -> {
                            UppaalVisitor eval = new UppaalVisitor(-1, template, source, target, output, "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                            FileWriter myWriter = null;
                            try {
                                myWriter = new FileWriter(new File(this.fileMutants, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                                myWriter.write(eval.visit(this.tree));
                                myWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                    }
                }
            }
            return;
        }
        if(this.parser.getTransitionsTad().containsKey(this.envTarget)){
            String outputEnv = "";
            if (!this.parser.getChannelEnv().get("Global").isEmpty()) {
                outputEnv = "Global";
            } else if (!this.parser.getChannelEnv().get(this.envTarget).isEmpty()) {
                outputEnv = this.envTarget;
            } else {
                return;
            }
            for (String source : this.parser.getTransitionsTad().get(this.envTarget).keySet()) {
                HashSet<String> targets = this.parser.getTransitionsTad().get(this.envTarget).get(source);

                if (targets.isEmpty()) {
                    continue;
                }

                Iterator<String> iterTargets = targets.iterator();

                for (int i = 0; i < targets.size(); i++) {
                    //Choose target
                    String target = iterTargets.next();
                    int chanPicked = 0;
                    String chan = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getName();
                    int dimensions = this.parser.getChannelEnv().get(outputEnv).get(chanPicked).getDimension();
                    for (int j=0; j<dimensions; j++){
                        chan = chan.concat("[0]");
                    }
                    String output = chan.concat("!");
                    this.threadsTadRandomSync.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, this.envTarget, source, target, output, "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(this.fileMutants, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "tadRandomSync".concat(source.concat(target).replace("\"", "")).concat(".xml")));
                }
            }
        }

    }

    public void prepareSmiOperator(){

        if(this.envTarget.equals("")){
            for (String template : this.parser.getLocationsSmi().keySet()) {
                for (String idLocation : this.parser.getLocationsSmi().get(template)) {
                    threadsSmi.add(new Thread(() -> {
                        UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1, this.envTarget);
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(new File(this.fileMutants, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                            myWriter.write(eval.visit(this.tree));
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }, "smi".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                }
            }
            return;
        }
        if(this.parser.getLocationsSmi().containsKey(this.envTarget)){
            for (String idLocation : this.parser.getLocationsSmi().get(this.envTarget)) {
                threadsSmi.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1, this.envTarget);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(this.fileMutants, "smi".concat(this.envTarget).concat((idLocation).replace("\"", "")).concat(".xml")));
                        myWriter.write(eval.visit(this.tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, "smi".concat(this.envTarget).concat((idLocation).replace("\"", "")).concat(".xml")));
            }
        }


    }

    public void prepareSmiNoRedundantOperator(){

        //HashMap<String, HashSet<String>> smiNoRedundant = new HashMap<>(this.parser.getLocationsSmi());
        HashMap<String, HashSet<String>> smiNoRedundant = new HashMap<>();

        if(this.envTarget.equals("")) {
            for(Map.Entry<String, HashSet<String>> entry: this.parser.getLocationsSmi().entrySet()){
                HashSet<String> newSmiLocations = new HashSet<>(entry.getValue());
                smiNoRedundant.put(entry.getKey(), newSmiLocations);
            }
        }
        if(this.parser.getLocationsSmi().containsKey(this.envTarget)){

            HashSet<String>  newSmiLocations =  new HashSet<>( this.parser.getLocationsSmi().get(this.envTarget));
            smiNoRedundant.put(this.envTarget, newSmiLocations);
            System.out.println(smiNoRedundant);
            System.out.println(newSmiLocations);
        }

        for(String template : smiNoRedundant.keySet()){
            Graph graphTemplate = this.parser.getGraphs().get(template);
            ArrayList<ArrayList<Integer>> listGraph = graphTemplate.getNumericGraph();

            smiNoRedundant.get(template).removeIf(idLocation -> graphTemplate.samePreviousNode(listGraph, idLocation));
        }

        for (String template : smiNoRedundant.keySet()) {
            for (String idLocation : smiNoRedundant.get(template)) {

                threadsSmiNoRedundant.add(new Thread(() -> {
                    UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", idLocation, parser.getClockEnv(), -1, -1, -1, this.envTarget);
                    FileWriter myWriter = null;
                    try {
                        myWriter = new FileWriter(new File(this.fileMutants, "smiNoRedundant".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
                        myWriter.write(eval.visit(this.tree));
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }, "smiNoRedundant".concat(template).concat((idLocation).replace("\"", "")).concat(".xml")));
            }
        }
    }

    public void prepareCxlOperator(){
        for(int i=1; i<=this.parser.getNumCxl(); i++){
            int idCxl = i;
            this.threadsCxl.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), idCxl, -1, -1, this.envTarget);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(this.fileMutants, "cxl"+ idCxl +".xml"));
                    myWriter.write(eval.visit(this.tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "cxl"+ idCxl +".xml"));
        }
    }

    public void prepareCxsOperator(){
        for(int i=1; i<=this.parser.getNumCxs(); i++){
            int idCxs = i;
            this.threadsCxs.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), -1, idCxs, -1, this.envTarget);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(this.fileMutants, "cxs"+ idCxs +".xml"));
                    myWriter.write(eval.visit(this.tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "cxs"+ idCxs +".xml"));
        }
    }

    public void prepareCcnOperator(){
        for(int i=1; i<=parser.getNumCcn(); i++){
            int idCcn = i;
            this.threadsCcn.add(new Thread(()->{
                UppaalVisitor eval = new UppaalVisitor(-1, "", "", "", "", "", parser.getClockEnv(), -1, -1, idCcn, this.envTarget);
                FileWriter myWriter = null;
                try {
                    myWriter = new FileWriter(new File(this.fileMutants, "ccn"+ idCcn +".xml"));
                    myWriter.write(eval.visit(tree));
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, "ccn"+ idCcn +".xml"));
        }
    }

    public void prepareTadNoRedundantOperator() {
        //Each template
        for (String template : parser.getTransitionsTad().keySet()) {
            //Each source
            Automaton automaton = nta.getAutomaton(template);
            for (int i = 1; i < automaton.getLocations().size(); i++) {
                for (int j = 0; j < automaton.getLocations().size(); j++) {

                    Location source = automaton.getLocations().get(i);
                    Location target = automaton.getLocations().get(j);

                    if (!areConnected(source, target) && target.getOutgoingTransitions().size() > 1) {
                        String channel = pickRandomElement(listener.getChanToInTran().keySet());
                        this.threadsTadNoRedundant.add(new Thread(() -> {
                            UppaalVisitor eval = new UppaalVisitor(-1, template, '"' + source.getUniqueIdString() + '"', '"' + target.getUniqueIdString() + '"', channel + "!", "", parser.getClockEnv(), -1, -1, -1, this.envTarget);
                            try (FileWriter myWriter = new FileWriter(new File(this.fileMutants, "tadNoRedundant".concat(source.getUniqueIdString().concat(target.getUniqueIdString()).replace("\"", "")).concat("_" + template +  ".xml")))) {
                                myWriter.write(eval.visit(tree));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }, "tadNoRedundant" + source.getUniqueIdString() + target.getUniqueIdString() + "_" + template +  ".xml"));
                    }
                }
            }
        }
    }

    private String BFS(Automaton automaton, String targetLocation) {
        StringBuilder trace = new StringBuilder();

        Location init = automaton.getInit();
        Queue<Location> queue = new LinkedList<>();
        boolean[] visited = new boolean[automaton.getLocations().size()*2];

        queue.add(init);
        // GUARDAR PADRE (LOCACION) Y FUNCION PARA RECONSTRUIR EL CAMINO
        visited[init.getId()] = true;
        String sep = "";
        while (!queue.isEmpty()) {
            Location loc = queue.poll();
            visited[loc.getId()] = true;
            System.out.printf("polled location %s\n", loc);

            for (Transition transition : loc.getOutgoingTransitions()) {

                if (!visited[transition.getTarget().getId()]) {
                    trace.append(sep);
                    trace.append(transition.getSync() != null ? transition.getSync().toString() : "τ");
                    if (transition.getTarget().getUniqueIdString().equals(targetLocation.replaceAll("\"", ""))) {
                        return trace.toString();
                    }

                    //visited[transition.getTarget().getId()] = true;

                    queue.add(transition.getTarget());
                }

                sep=".";
            }
        }
        return "";

    }

    private boolean areConnected(Location source, Location target) {
        return source.getAutomaton().getTransitions(source, target).size() > 0;
    }



    public String getCSVKilledMutants() {
        StringBuilder csv = new StringBuilder();
        for (int i = 2; i < arrayData.size(); i+=3) {
            csv.append(arrayData.get(i - 2).toString());
            csv.append(",");
            csv.append(arrayData.get(i - 1).toString());
            csv.append(",");
            csv.append(arrayData.get(i).toString());
            csv.append("\n");
        }
        return csv.toString();
    }

    private static <T> T pickRandomElement(Collection<T> collection) {
        int idx = (int) (Math.random() * collection.size());
        for (T t : collection) if (--idx < 0) return t;
        throw new AssertionError();
    }
}

