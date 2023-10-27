package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class UrgLoc implements Command {
    private Mutator mutantOperator;

    public UrgLoc(Mutator mu) {
        this.mutantOperator = mu;
    }
    @Override
    public void execute() {
       mutantOperator.prepareLocModifierOpV2("urgLoc");
    }

    @Override
    public String getName() {
        return "urgLoc";
    }
}
