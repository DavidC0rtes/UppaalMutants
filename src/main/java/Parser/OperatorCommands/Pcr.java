package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class Pcr implements Command {
    private final Mutator mutantOperator;

    public Pcr(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        mutantOperator.preparePcrOperator();
    }

    @Override
    public String getName() {
        return "pcr";
    }
}
