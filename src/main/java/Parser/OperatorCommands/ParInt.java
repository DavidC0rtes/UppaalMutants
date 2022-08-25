package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class ParInt implements Command {

    private final Mutator mutantOperator;
    private String chanTarget;

    public ParInt(Mutator mutantOperator, String chanTarget) {
        this.mutantOperator = mutantOperator;
        this.chanTarget = chanTarget;
    }
    @Override
    public void execute() {
        this.mutantOperator.prepareParIntOperator();
    }
}
