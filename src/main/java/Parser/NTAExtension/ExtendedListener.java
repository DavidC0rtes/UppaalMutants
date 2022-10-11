package Parser.NTAExtension;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseListener;

import java.util.*;

/**
 * In order to de-couple the grammar from the application code i built this class
 * to collect some useful information at parse time.
 */
public class ExtendedListener extends UppaalParserBaseListener {
    private final HashMap<String, ArrayList<String>> clockToTemplate = new HashMap<>();
    private final HashMap<String, ArrayList<String>> chanToTemplate = new HashMap<>();

    public HashMap<String, ArrayList<Integer>> getChanToInTran() {
        return chanToInTran;
    }

    private HashMap<String, ArrayList<Integer>> chanToInTran = new HashMap<>();

    public HashMap<String, ArrayList<Integer>> getChanToOutTran() {
        return chanToOutTran;
    }

    private HashMap<String, ArrayList<Integer>> chanToOutTran = new HashMap<>();
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


    public HashMap<String, ArrayList<String>> getClockToTemplate() {
        return clockToTemplate;
    }
    public HashMap<String, ArrayList<String>> getChanToTemplate() {
        return chanToTemplate;
    }
}
