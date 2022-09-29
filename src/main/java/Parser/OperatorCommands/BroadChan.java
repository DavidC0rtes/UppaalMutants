package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class BroadChan implements Command {

    private final Mutator mutantOperator;

    public BroadChan(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        this.mutantOperator.prepareUBOperator("broadcast");
    }

    @Override
    public String getName() {
        return "broadChan";
    }
}
