package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class CommLoc implements Command {
    private Mutator mutantOperator;

    public CommLoc(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override

    public void execute() {
        mutantOperator.prepareLocModifierOp("commLoc");
    }

    @Override
    public String getName() {
        return "commLoc";
    }
}
