package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class MaskVarChannels implements Command {
    private final Mutator mutantOperator;
    private String channel;

    public MaskVarChannels(Mutator mutantOperator, String[] args) {
        this.mutantOperator = mutantOperator;
        this.channel = args != null ? args[0] : "";
    }

    @Override
    public void execute() {
        mutantOperator.prepareMaskVarChannelsOp(channel);
    }

    @Override
    public String getName() {
        return "maskVarChannels";
    }
}
