package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class MaskVarChannels implements Command {
    private final Mutator mutantOperator;

    public MaskVarChannels(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        mutantOperator.prepareMaskVarChannelsOp();
    }

    @Override
    public String getName() {
        return "maskVarChannels";
    }
}
