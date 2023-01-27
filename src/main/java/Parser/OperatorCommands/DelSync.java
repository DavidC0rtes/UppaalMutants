package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class DelSync implements Command {

    private final Mutator mutantOperator;

    public DelSync(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }
    @Override
    public void execute() {
        this.mutantOperator.prepareDelSyncOperator();
    }

    @Override
    public String getName() {
        return "delSync";
    }
}
