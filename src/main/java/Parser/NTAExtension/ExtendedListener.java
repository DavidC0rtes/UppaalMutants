package Parser.NTAExtension;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseListener;

import java.util.*;

public class ExtendedListener extends UppaalParserBaseListener {
    private final HashMap<String, HashSet<String>> clockToTemplate = new HashMap<>();
    private String currentEnv = "Global";


    @Override
    public void enterVariableDecl(UppaalParser.VariableDeclContext ctx) {
        if (currentEnv.equals("Global") && ctx.type().typeId().getText().equals("clock")) {
            for (UppaalParser.VariableIDContext varId : ctx.variableID()) {
              if (!clockToTemplate.containsKey(varId.getText())) {
                  clockToTemplate.put(varId.IDENTIFIER().getText(), new HashSet<String>());
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
        if (clockToTemplate.containsKey(key)) {
            HashSet<String> temp = clockToTemplate.get(key);
            temp.add(currentEnv);
        }
    }

    public HashMap<String, HashSet<String>> getClockToTemplate() {
        return clockToTemplate;
    }
}
