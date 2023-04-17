package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class SyncSeq implements Command {
    private final Mutator mutantOperator;

    public SyncSeq(Mutator mo) {
        mutantOperator = mo;
    }
    @Override
    public void execute() {
        mutantOperator.prepareParSeqOperator();
    }

    @Override
    public String getName() {
        return "syncSeq";
    }
}
