package Parser.NTAExtension;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseListener;
import Parser.Graph.Graph;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.NTA;
import org.antlr.v4.runtime.RuleContext;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * In order to de-couple the grammar from the application code I built this class
 * to collect some useful information at parse time.
 */
public class ExtendedListener extends UppaalParserBaseListener {
    private final HashMap<String, ArrayList<String>> clockToTemplate = new HashMap<>();
    private final HashMap<String, ArrayList<String>> chanToTemplate = new HashMap<>();

    public HashMap<String, ArrayList<Integer>> getChanToInTran() {
        return chanToInTran;
    }

    private final HashMap<String, ArrayList<Integer>> chanToInTran = new HashMap<>();

    private final HashMap<Integer, ArrayList<String>> transitionSyncSwap = new HashMap<>();
    private HashMap<String, HashMap<String, HashSet<String>>> tadNoRedundantMap;

    public HashMap<String, ArrayList<Integer>> getChanToOutTran() {
        return chanToOutTran;
    }

    private final HashMap<String, ArrayList<Integer>> chanToOutTran = new HashMap<>();
    private final ArrayList<Integer> locations = new ArrayList<>();
    private final ArrayList<UppaalParser.TransitionContext> syncTransitions = new ArrayList<>();

    private String currentEnv = "Global";

    @Override
    public void enterVariableDecl(UppaalParser.VariableDeclContext ctx) {
        String type = ctx.type().typeId().getText();
        if (currentEnv.equals("Global")) {
            if (type.equals("clock")) {
                for (UppaalParser.VariableIDContext varId : ctx.variableID()) {
                    if (!clockToTemplate.containsKey(varId.getText())) {
                        clockToTemplate.put(
                                varId.IDENTIFIER().getText(),
                                new ArrayList<>(Collections.singleton(varId.getText()))
                        );
                    }
                }
            } else if (type.equals("chan")) {
                for (UppaalParser.VariableIDContext varId : ctx.variableID()) {
                    if (!chanToTemplate.containsKey(varId.getText())) {
                        chanToTemplate.put(
                                varId.IDENTIFIER().getText(),
                                new ArrayList<>(Collections.singleton(varId.getText()))
                        );

                        chanToInTran.put(
                                varId.IDENTIFIER().getText(),
                                new ArrayList<>()
                        );
                        chanToOutTran.put(
                                varId.IDENTIFIER().getText(),
                                new ArrayList<>()
                        );
                    }
                }
            }
        }
    }

    @Override
    public void enterTempContent(UppaalParser.TempContentContext ctx) {
        this.currentEnv = ctx.name().anything().getText();
        HashMap<String, List<Integer>> tran2Loc = new HashMap();

        // Traverse transitions and add neighbours to a structure.
        List<UppaalParser.TransitionContext> syncTransitions = ctx.transition();

        for (UppaalParser.TransitionContext tran : syncTransitions) {
            if ((tran.labelTransSyncInput().size() + tran.labelTransSyncOutput().size()) == 0) {
                continue;
            }
            tran2Loc.merge(
                    tran.source().getText(),
                    List.of(new Integer[]{tran.hashCode()}),
                    (v1, v2) -> Stream.of(v1, v2)
                            .flatMap(Collection::stream)
                            .collect(Collectors.toList())
            );
        }
    }


    private ArrayList<String> extractChannelsFromTransition(UppaalParser.TransitionContext t) {
        t.labelTransSyncInput().stream().map(RuleContext::getText);
        return null;
    }
    @Override
    public void enterIdentifierGuard(UppaalParser.IdentifierGuardContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        if (clockToTemplate.containsKey(key) && !clockToTemplate.get(key).contains(currentEnv)) {
            clockToTemplate.get(key).add(currentEnv);
        }
    }
    @Override
    public void enterLabelTransSyncInput(UppaalParser.LabelTransSyncInputContext ctx) {
        String key = ctx.expr().getText().split("\\[")[0];
        if (chanToTemplate.containsKey(key)) {

            chanToInTran.get(key).add(ctx.hashCode());

            if (!chanToTemplate.get(key).contains(currentEnv))
                chanToTemplate.get(key).add(currentEnv);
        }
    }
    @Override
    public void enterLabelTransSyncOutput(UppaalParser.LabelTransSyncOutputContext ctx) {
        String key = ctx.expr().getText().split("\\[")[0];

        if (chanToTemplate.containsKey(key)) {

            chanToOutTran.get(key).add(ctx.hashCode());

            if (!chanToTemplate.get(key).contains(currentEnv))
                chanToTemplate.get(key).add(currentEnv);
        }
    }
    @Override
    public void enterLocation(UppaalParser.LocationContext ctx) {
        locations.add(ctx.hashCode());
    }

    @Override
    public void enterTransition(UppaalParser.TransitionContext ctx) {
        if (ctx.labelTransSyncInput().size() > 0 || ctx.labelTransSyncOutput().size() > 0) {
            syncTransitions.add(ctx);
            transitionSyncSwap.put(ctx.hashCode(), new ArrayList<>());
        }
    }

    public HashMap<String, ArrayList<String>> getClockToTemplate() {
        return clockToTemplate;
    }
    public HashMap<String, ArrayList<String>> getChanToTemplate() {
        return chanToTemplate;
    }
    public ArrayList<Integer> getLocations() { return locations; }

    public ArrayList<UppaalParser.TransitionContext> getSyncTransitions() {
        return syncTransitions;
    }
}
