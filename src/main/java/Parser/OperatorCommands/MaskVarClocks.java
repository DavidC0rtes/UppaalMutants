package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

import java.util.Arrays;

public class MaskVarClocks implements Command {
    private final Mutator mutantOperator;
    private String clock;

    public MaskVarClocks(Mutator mutantOperator, String[] args) {
        this.mutantOperator = mutantOperator;
        this.clock = args != null ? args[0] : "";
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
