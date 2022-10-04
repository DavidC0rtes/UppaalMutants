package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

import java.util.Arrays;

public class MaskVarClocks implements Command {
    private final Mutator mutantOperator;
    private final String clock;

    public MaskVarClocks(Mutator mutantOperator, String[] args) {
        this.mutantOperator = mutantOperator;
        if (args != null && args.length == 1) {
            this.clock =  args[0];
        } else {
            throw new RuntimeException("Bad number of arguments.");
        }

    }

    @Override
    public void execute() {
        mutantOperator.prepareMaskVarClocksOp(clock);
    }

    @Override
    public String getName() {
        return "maskVarClocks";
    }
}
