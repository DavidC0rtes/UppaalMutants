package Parser.OperatorCommands;

import Parser.Command.Command;
import Parser.Receiver.Mutator;

public class DelSync implements Command {

    private final Mutator mutantOperator;
    private boolean followGuidelines;

    public DelSync(Mutator mutantOperator) {
        this.mutantOperator = mutantOperator;
        followGuidelines = true;
    }

    public DelSync(Mutator mutantOperator, boolean followGuidelines) {
        this.mutantOperator = mutantOperator;
        this.followGuidelines = followGuidelines;
    }
    public void setFollowGuidelines(boolean followGuidelines) {
        this.followGuidelines = followGuidelines;
    }

    public boolean followsGuidelines() {
        return followGuidelines;
    }

    @Override
    public void execute() {
        this.mutantOperator.prepareDelSyncOperator();
    }

    @Override
    public String getName() {
        return "delSync";
    }
}
