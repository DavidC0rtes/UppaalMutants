package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class ParSeq implements Command {
    private final Mutator mutantOperator;

    public ParSeq(Mutator mo) {
        mutantOperator = mo;
    }
    @Override
    public void execute() {

    }
}
