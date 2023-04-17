package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class SyncSwap implements Command {

    private final Mutator mutantOperator;

    public SyncSwap(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        //mutantOperator.prepareReplaceMsg();
    }

    @Override
    public String getName() {
        return "syncSwap";
    }
}
