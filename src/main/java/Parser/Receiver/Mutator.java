package Parser.Receiver;

import Parser.Antlr.UppaalLexer;
import Parser.Antlr.UppaalParser;
import Parser.Graph.Graph;
import Parser.Mutation.ChanType;
import Parser.Mutation.UppaalVisitor;
import Parser.NTAExtension.ExtendedListener;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.NTA;
import de.tudarmstadt.es.juppaal.Transition;
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

/**
 * Class <code>Mutator</code> defines the "engine" responsible
 * for scheduling mutations via the selected mutation operators using threads.
 */
public class Mutator {
    private File fileMutants;

    private String envTarget;

    private ArrayList<Thread> threadsTmi;
    private ArrayList<Thread> threadsTad;
    private ArrayList<Thread> threadsTadSync;
    private ArrayList<Thread> threadsTadRandomSync;
    private ArrayList<Thread> threadsSmi;
    private ArrayList<Thread> threadsSmiNoRedundant;
    private ArrayList<Thread> threadsCxl;
    private ArrayList<Thread> threadsCxs;
    private ArrayList<Thread> threadsCcn;

    private ArrayList<Thread> threadsBroadChan;
    private ArrayList<Thread> threadsDelSync = new ArrayList<>();
    private ArrayList<Thread> threadsMaskVarClocks = new ArrayList<>();
    private final ArrayList<Thread> threadsMaskVarChannels = new ArrayList<>();
    private final ArrayList<Thread> threadsUrgChan = new ArrayList<>();
    private ArrayList<Thread> threadsParSeq = new ArrayList<>();
    private final ArrayList<Thread> threadsdelOutput = new ArrayList<>();
    private final ArrayList<Thread> threadsCommLoc = new ArrayList<>();
    private final ArrayList<Thread> threadsUrgLoc = new ArrayList<>();
    private final ArrayList<Thread> threadsReplaceMsg = new ArrayList<>();
    private final ArrayList<Thread> threadsTadNoRedundant = new ArrayList<>();
    private UppaalParser parser;
    private ParseTree tree;
    private ExtendedListener listener;
    private ArrayList arrayData = new ArrayList();
    private final NTA nta;
    private static final Logger logger = LoggerFactory.getLogger(Mutator.class);
    public Mutator(String modelFile, File fileMutants, String envTarget) throws IOException {

        this.fileMutants = fileMutants;
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
        this.nta = new NTA(modelFile);
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

        addKilledData("delSync", threadsDelSync.size(), killedDelSync);
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
                        killedBroadChan + killedDelSync + killedParSeq + killedMaskVarClocks + killedMaskVarChannels
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
                System.err.println(new String(p.getErrorStream().readAllBytes()));
                dead++;
                continue;
            }
            if (line.contains("NOT satisfied") || line.contains("MAY be satisfied")) {
                dead++;
                break;
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

    public void prepareLocModifierOp(String operator) {
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
    }
    public void prepareUBOperator(String prefix) {
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

    public void prepareDelSyncOperator() {
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
    public void prepareMaskVarClocksOp() {
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
    }

    public void prepareMaskVarChannelsOp() {
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
    }
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
        StringBuilder csv = new StringBuilder("");
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

