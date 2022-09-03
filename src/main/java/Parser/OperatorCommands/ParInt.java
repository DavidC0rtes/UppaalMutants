package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class ParInt implements Command {

    private final Mutator mutantOperator;
    private String chanTarget;

    public ParInt(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }
    @Override
    public void execute() {
        this.mutantOperator.prepareParIntOperator();
    }
}
