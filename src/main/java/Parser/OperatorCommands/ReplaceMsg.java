package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class ReplaceMsg implements Command {

    private final Mutator mutantOperator;

    public ReplaceMsg(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        //mutantOperator.prepareReplaceMsg();
    }

    @Override
    public String getName() {
        return "replaceMsg";
    }
}
