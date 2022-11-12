package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class ComLoc implements Command {
    private Mutator mutantOperator;

    public ComLoc(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        mutantOperator.prepareCommLoc();
    }

    @Override
    public String getName() {
        return "comLoc";
    }
}
