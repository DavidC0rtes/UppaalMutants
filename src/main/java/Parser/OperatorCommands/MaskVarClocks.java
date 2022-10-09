package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

import java.util.Arrays;

public class MaskVarClocks implements Command {
    private final Mutator mutantOperator;

    public MaskVarClocks(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
    }

    @Override
    public void execute() {
        mutantOperator.prepareMaskVarClocksOp();
    }

    @Override
    public String getName() {
        return "maskVarClocks";
    }
}
