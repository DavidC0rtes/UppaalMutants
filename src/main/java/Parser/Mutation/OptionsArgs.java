package Parser.Mutation;
import Parser.Errors.*;

import org.apache.commons.cli.*;

import java.io.File;
import java.util.Scanner;

public class OptionsArgs {
    private File modelFile;
    private String queryFile;
    private String verifyTaFile;
    private String pathMutants;
    private boolean log;
    private boolean tmi;
    private boolean tad;
    private String tadSync;
    private boolean tadRandomSync;
    private boolean smi;
    private boolean smiNoRedundant;
    private boolean cxl;
    private boolean cxs;
    private boolean ccn;
    private boolean broadChan;
    private boolean parInt, parSeq = false;
    private String env;
    private Options options;

    public OptionsArgs(){
        this.options = new Options();
        this.modelFile = null;
        this.queryFile = "";
        this.verifyTaFile = "";
        this.pathMutants = "";
        this.log = false;
        this.tmi = false;
        this.tad = false;
        this.tadSync = "";
        this.tadRandomSync = false;
        this.smi = false;
        this.smiNoRedundant = false;
        this.cxl = false;
        this.cxs = false;
        this.ccn = false;
        this.broadChan = false;
        this.env = "";
    }

    public void parseArgs(String[] args) throws ParseException, NoModelError, NoVerifyTaError {

        Option modelOpt = Option.builder("m")
                .longOpt("model")
                .hasArg()
                .desc("Required argument, specifies the file containing the model to mutate.")
                .argName("path").build();
        Option queryOpt = Option.builder("q")
                .longOpt("query")
                .hasArg()
                .desc("Specifies the query file containing the properties of the model.")
                .argName("path").build();

        Option verifyOpt = Option.builder("v")
                .longOpt("verifyTa")
                .hasArg()
                .desc("Specifies the path where the uppaal verifyta file is located to verify models.")
                .argName("path").build();

        Option pathOpt = Option.builder("p")
                .longOpt("pathMutants")
                .hasArg()
                .desc("Specifies the folder path where the mutants will be located and the log file (if it is indicated).")
                .argName("path").build();

        Option helpOpt = new Option( "h", "help", false, "Shows this help screen.");
        Option logOpt = new Option( "l", "log", false, "Produce a file that contains a record of generated mutants in mutant folder.");
        Option tmiOpt = new Option ( "tmi" , false, "Enable tmi operator. Transition MIssing operator removes a transition.");
        Option tadOpt = new Option ( "tad" , false, "Enable tad operator. Transition ADd operator adds a transition between two states. This operator make an internal action (tau/siilent). The new transitions will not be where the automaton already had another transition");

        Option tadSyncOpt = Option.builder("tadSync")
                .hasArg()
                .desc("Enable tad operator. Transition ADd operator adds a transition between two states. This operator use the specified action as an output action (action!). Be sure the action is on the environment of the system to verify it. The new transitions will not be where the automaton already had another external transition")
                .argName("action").build();

        Option tadRandomOpt = new Option ( "tadRandomSync" , false, "Enable tad operator. Transition ADd operator adds a transition between two states. This operator use a random channel on the environment as an output action (a!). The new transitions will not be where the automaton already had another external transition");

        Option smiOpt = new Option ( "smi" , false, "Enable smi operator. State MIssing operator removes a state (other than the initial state) and all its incoming/outgoing transitions.");
        Option smiNoRedundantOpt = new Option ( "smiNoRedundant" , false, "Enable smi operator. State MIssing operator removes a state (other than the initial state) and all its incoming/outgoing transitions. This operator avoid some redundant mutants with the tmi operator. Generate a subset of smi mutants");
        Option cxlOpt = new Option ( "cxl" , false, "Enable cxl operator. Constant eXchange L operator increases the constant of a clock constraint.");
        Option cxsOpt = new Option ( "cxs" , false, "Enable cxs operator. Constant eXchange S operator decreases the constant of a clock constraint.");
        Option ccnOpt = new Option ( "ccn" , false, "Enable ccn operator. Clock Constraint Negation operator negates a clock constraint.");
        Option broadChanOpt = new Option(
                "broadChan",
                false,
                "Enable broadChan operator. Adds the broadcast prefix to an existing channel."
        );
        Option parIntOpt = new Option(
                "parInt",
                false,
                "Enable the ParInt operator. Deletes an arbitrary input action."
        );
        Option parSeqOpt = new Option(
                "parSeq",
                false,
                "Enables the ParSeq operator. Two parallel actions become sequential."
        );

        Option envOpt = Option.builder("env")
                .hasArg()
                .desc("Specify the name of the automaton to make the mutants")
                .argName("action").build();

        options.addOption(helpOpt);
        options.addOption(modelOpt);
        options.addOption(queryOpt);
        options.addOption(verifyOpt);
        options.addOption(pathOpt);
        options.addOption(logOpt);
        options.addOption(tmiOpt);
        options.addOption(tadOpt);
        options.addOption(tadSyncOpt);
        options.addOption(tadRandomOpt);
        options.addOption(smiOpt);
        options.addOption(smiNoRedundantOpt);
        options.addOption(cxlOpt);
        options.addOption(cxsOpt);
        options.addOption(ccnOpt);
        options.addOption(broadChanOpt);
        options.addOption(parIntOpt);
        options.addOption(parSeqOpt);
        options.addOption(envOpt);

        CommandLineParser argsParser = new DefaultParser();
        CommandLine line = argsParser.parse(options, args);


        if(line.hasOption("m")){
            this.modelFile = new File(line.getOptionValue("m"));
        }
        if(line.hasOption("q")){
            this.queryFile = line.getOptionValue("q");
        }
        if(line.hasOption("p")){
            this.pathMutants = line.getOptionValue("p");
        }
        if(line.hasOption("h")){
            this.printHelp();
        }
        this.log = line.hasOption("log");
        this.tmi = line.hasOption("tmi");
        this.tad = line.hasOption("tad");

        if(line.hasOption("tadSync")){
            this.tadSync = line.getOptionValue("tadSync");
        }

        this.tadRandomSync = line.hasOption("tadRandomSync");
        this.smi = line.hasOption("smi");
        this.smiNoRedundant = line.hasOption("smiNoRedundant");
        this.cxl = line.hasOption("cxl");
        this.cxs = line.hasOption("cxs");
        this.ccn = line.hasOption("ccn");
        this.broadChan = line.hasOption("broadChan");
        this.parInt = line.hasOption("parInt");
        this.parSeq = line.hasOption("parSeq");


        if(line.hasOption("env")){
            this.env = line.getOptionValue("env");
            System.out.println("el ambiente es " + this.env);
        }

        if(!line.hasOption("m")){
            throw new NoModelError("No model file option to mutate");
        }

        if(!line.hasOption("v")){
            throw new NoVerifyTaError("no VerifyTa path specified");
        }

        if(line.hasOption("v")){
            this.verifyTaFile = line.getOptionValue("v");
        }
    }

    public void printHelp(){
        HelpFormatter formatter = new HelpFormatter();
        String header = "Where [-m <file>] model is a required option\nIf [-q <file>] query is missing, the execution of verifyta will be done only with the model\n\n";
        String footer = "\n";
        formatter.setOptionComparator(null);
        formatter.printHelp("java -jar MutationUppaal.jar [OPTION]...", header, this.options, footer, false);
    }

    public File getModelFile() {
        return modelFile;
    }

    public void setModelFile(File modelFile) {
        this.modelFile = modelFile;
    }

    public String getQueryFile() {
        return queryFile;
    }

    public void setQueryFile(String queryFile) {
        this.queryFile = queryFile;
    }

    public String getPathMutants() {
        return pathMutants;
    }

    public void setPathMutants(String pathMutants) {
        this.pathMutants = pathMutants;
    }

    public String getVerifyTaFile() {
        return verifyTaFile;
    }

    public void setVerifyTaFile(String verifyTaFile) {
        this.verifyTaFile = verifyTaFile;
    }

    public boolean isLog() {
        return log;
    }

    public void setLog(boolean log) {
        this.log = log;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public boolean isTmi() {
        return tmi;
    }


    public void setTmi(boolean tmi) {
        this.tmi = tmi;
    }

    public boolean isTad() {
        return tad;
    }

    public void setTad(boolean tad) {
        this.tad = tad;
    }

    public String getTadSync() {
        return tadSync;
    }

    public void setTadSync(String tadSync) {
        this.tadSync = tadSync;
    }

    public boolean isTadRandomSync() {
        return tadRandomSync;
    }

    public void setTadRandomSync(boolean tadRandomSync) {
        this.tadRandomSync = tadRandomSync;
    }

    public boolean isSmi() {
        return smi;
    }

    public void setSmi(boolean smi) {
        this.smi = smi;
    }

    public boolean isSmiNoRedundant() {
        return smiNoRedundant;
    }

    public void setSmiNoRedundant(boolean smiNoRedundant) {
        this.smiNoRedundant = smiNoRedundant;
    }

    public boolean isCxl() {
        return cxl;
    }

    public void setCxl(boolean cxl) {
        this.cxl = cxl;
    }

    public boolean isCxs() {
        return cxs;
    }

    public void setCxs(boolean cxs) {
        this.cxs = cxs;
    }

    public boolean isCcn() {
        return ccn;
    }

    public void setCcn(boolean ccn) {
        this.ccn = ccn;
    }

    public boolean isBroadChan() { return broadChan; }
    public void setBroadChan() { this.broadChan = true; }

    public boolean isParInt() { return this.parInt; }
    public void setParInt() { this.parInt = true; }
    public boolean isParSeq() {return this.parSeq;}
    public String getEnv() {
        return env;
    }
}
