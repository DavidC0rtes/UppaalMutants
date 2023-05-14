package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class TadNoRedundant implements Command {

    private final Mutator mutantOperator;

    public TadNoRedundant(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        mutantOperator.prepareTadNoRedundantOperator();
    }

    @Override
    public String getName() {
        return "tadNoRedundant";
    }
}
