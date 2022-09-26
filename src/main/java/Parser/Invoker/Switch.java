package Parser.Invoker;
import Parser.Command.Command;

public class Switch {
    private Command tmi;
    private Command tad;
    private Command tadSync;
    private Command tadRandomSync;
    private Command smi;
    private Command smiNoRedundant;
    private Command cxl;
    private Command cxs;
    private Command ccn;
    private Command broadChan;
    private Command parInt;
    private Command parSeq;

    public Switch(Command tmi, Command tad, Command tadSync, Command tadRandomSync,
                  Command smi, Command smiNoRedundant,
                  Command cxl, Command cxs, Command ccn, Command broadChan, Command parInt,
                  Command parSeq) {
        this.tmi = tmi;
        this.tad = tad;
        this.tadSync = tadSync;
        this.tadRandomSync = tadRandomSync;
        this.smi = smi;
        this.smiNoRedundant = smiNoRedundant;
        this.cxl = cxl;
        this.cxs = cxs;
        this.ccn = ccn;
        this.broadChan = broadChan;
        this.parInt = parInt;
        this.parSeq = parSeq;
    }
    public Switch() {

    }

    public void tmi() {
        tmi.execute();
    }

    public void tad(){
        tad.execute();
    }

    public void tadSync(){
        tadSync.execute();
    }

    public void setTadRandomSync(){
        tadRandomSync.execute();
    }

    public void smi(){
        smi.execute();
    }

    public void smiNoRedundant(){
        smiNoRedundant.execute();
    }

    public void cxl(){
        cxl.execute();
    }

    public void cxs(){
        cxs.execute();
    }

    public void ccn(){
        ccn.execute();
    }

    public void broadChan() { broadChan.execute(); }
    public void parInt() { parInt.execute(); }

    public void parSeq() { parSeq.execute(); }

    public void runOperator(Command command) {
        command.execute();
    }
}
