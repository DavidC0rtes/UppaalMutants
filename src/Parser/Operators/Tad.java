package Parser.Operators;

import Parser.Command.Command;
import Parser.Receiver.MutantController;

public class Tad implements Command {
    private final MutantController mutantOperator;

    public Tad(MutantController mutantOperator){
        this.mutantOperator = mutantOperator;
    }

    public void execute(){
        this.mutantOperator.tadOperator();
    }
}
