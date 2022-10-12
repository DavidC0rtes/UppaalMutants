package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class DelOutput implements Command {

    private final Mutator mutantOperator;

    public DelOutput(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        this.mutantOperator.prepareDelOutput();
    }

    @Override
    public String getName() {
        return "delOutput";
    }
}
