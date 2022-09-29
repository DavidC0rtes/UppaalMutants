package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class UrgChan implements Command {
    private final Mutator mutator;

    public UrgChan(Mutator mutator) {
        this.mutator = mutator;
    }

    @Override
    public void execute() {
        mutator.prepareUBOperator("urgent");
    }

    @Override
    public String getName() {
        return "urgChan";
    }
}
