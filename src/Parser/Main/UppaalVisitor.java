package Parser.Main;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseVisitor;
import Parser.Antlr.UppaalParserListener;

import java.util.List;

public class UppaalVisitor extends UppaalParserBaseVisitor<String> {

    private String output;
    private final int idOperator;
    private int indexOperator;

    public UppaalVisitor (int idOperator){
        this.output = "";
        this.idOperator = idOperator;
        this.indexOperator = 0;
    }

    @Override
    public String visitModel(UppaalParser.ModelContext ctx) {
        this.output = this.output.concat("\n");
        if(ctx.prolog()!=null){
            this.output = this.output.concat(visit(ctx.prolog()));
        }
        this.output = this.output.concat(visit(ctx.nta()));
        return this.output;
    }

    @Override
    public String visitProlog(UppaalParser.PrologContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNta(UppaalParser.NtaContext ctx) {
        String nta = "<nta>\n\t";
        nta = nta.concat(visit(ctx.declaration()).concat("\n"));

        List<UppaalParser.TemplateContext> templates = ctx.template();

        for(UppaalParser.TemplateContext template: templates){
            nta = nta.concat(visit(template)).concat("\n");
        }

        nta = nta.concat(visit(ctx.system())).concat("\n");

        if(ctx.queries() != null){
            nta = nta.concat(visit(ctx.queries())).concat("\n");
        }


        nta = nta.concat("</nta>");
        return nta;
    }

    @Override
    public String visitDeclaration(UppaalParser.DeclarationContext ctx) {
        return ctx.getText();
    }


    @Override
    public String visitTemplate(UppaalParser.TemplateContext ctx) {
        String template = "<template>";
        template = template.concat(visit(ctx.temp_content()));
        template = template.concat("\n</template>");
        return template;
    }

    @Override
    public String visitTemp_content(UppaalParser.Temp_contentContext ctx) {
        String temp_content = "\n";
        if(ctx.name() != null){
            //print <name> ~[<&]+ </name>
            temp_content = temp_content.concat(visit(ctx.name())).concat("\n");
        }
        if(ctx.parameter() != null){
            //print <parameter> ~[<&]+ </parameter>
            temp_content = temp_content.concat(visit(ctx.parameter())).concat("\n");
        }
        if(ctx.declaration() != null){
            //print <declaration> ~[<&] </declaration>
            temp_content = temp_content.concat(visit(ctx.declaration())).concat("\n");
        }

        List<UppaalParser.LocationContext> locations = ctx.location();

        for(UppaalParser.LocationContext location: locations){
            temp_content = temp_content.concat(visit(location)).concat("\n");
        }

        List<UppaalParser.TransitionContext> transitions = ctx.transition();

        for(UppaalParser.TransitionContext transition: transitions){
            temp_content = temp_content.concat(visit(transition)).concat("\n");
        }

        temp_content = temp_content.concat(visit(ctx.init_loc()));

        return temp_content;
    }

    @Override
    public String visitName(UppaalParser.NameContext ctx) {
        String name = "<name";
        if(ctx.coordinate() != null){
            name = name.concat(visit(ctx.coordinate()));
        }
        name = name.concat(">").concat(ctx.anything().getText());
        name = name.concat("</name>");
        return name;
    }

    @Override
    public String visitCoordinate(UppaalParser.CoordinateContext ctx) {
        String coordinate = " x=".concat(ctx.STRING(0).getText());
        coordinate = coordinate.concat(" y=").concat(ctx.STRING(1).getText());
        return coordinate;
    }

    @Override
    public String visitParameter(UppaalParser.ParameterContext ctx) {
        return ctx.getText().concat("\n");
    }

    @Override
    public String visitLocation(UppaalParser.LocationContext ctx) {
        String location = "<location id=".concat(ctx.STRING().getText());
        if(ctx.coordinate()!=null){
            location = location.concat(visit(ctx.coordinate())).concat(">");
        }
        if(ctx.name()!=null){
            location = location.concat("\n").concat(visit(ctx.name())).concat("\n");
        }

        List<UppaalParser.Label_locContext> labelLocs = ctx.label_loc();
        for(UppaalParser.Label_locContext labelLoc: labelLocs){
            location = location.concat(visit(labelLoc)).concat("\n");
        }

        if(ctx.URGENT()!=null){
            location = location.concat("<urgent/>\n");
        }
        if(ctx.COMMITTED()!=null){
            location = location.concat("<committed/>\n");
        }
        location = location.concat("</location>");
        return location;
    }

    @Override
    public String visitLabel_loc(UppaalParser.Label_locContext ctx) {
        String labelLoc = "<label kind=";
        labelLoc = labelLoc.concat(ctx.STRING().getText()).concat(">");
        labelLoc = labelLoc.concat(visit(ctx.anything()));
        labelLoc = labelLoc.concat("</label>");
        return labelLoc;
    }

    @Override
    public String visitInit_loc(UppaalParser.Init_locContext ctx) {
        String initLoc = "<init ref=";
        initLoc = initLoc.concat(ctx.STRING().getText());
        return initLoc;
    }

    @Override
    public String visitTransition(UppaalParser.TransitionContext ctx) {
        String transition = "<transition>";
        transition = transition.concat(visit(ctx.source())).concat("\n");
        transition = transition.concat(visit(ctx.target())).concat("\n");

        List<UppaalParser.Label_transContext> labels = ctx.label_trans();
        for(UppaalParser.Label_transContext label: labels){
            transition = transition.concat(visit(label));
        }

        transition = transition.concat("</transition>");
        return transition;
    }

    @Override
    public String visitSource(UppaalParser.SourceContext ctx) {
        String source = "<source ref=";
        source = source.concat(ctx.STRING().getText()).concat("/>");
        return source;
    }

    @Override
    public String visitTarget(UppaalParser.TargetContext ctx) {
        String target = "<target ref=";
        target = target.concat(ctx.STRING().getText()).concat("/>");
        return target;
    }

    @Override
    public String visitLabelTrans(UppaalParser.LabelTransContext ctx) {
        String label = "<label kind=";
        label = label.concat(ctx.STRING().getText());
        if(ctx.coordinate() != null){
            label = label.concat(visit(ctx.coordinate()));
        }
        label = label.concat(">").concat(ctx.anything().getText());
        label = label.concat("</label>");
        return label;
    }

    @Override
    public String visitLabelTransGuard(UppaalParser.LabelTransGuardContext ctx) {
        String label = ctx.OPEN_GUARD().getText();
        if(ctx.guard_expr()!=null){
            label = label.concat(visit(ctx.guard_expr()));
        }

        label = label.concat("</label>").concat("\n");
        return label;
    }

    @Override
    public String visitIdentifierGuard(UppaalParser.IdentifierGuardContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitNatGuard(UppaalParser.NatGuardContext ctx) {
        return ctx.NAT_GUARD().getText();
    }

    @Override
    public String visitArrayGuard(UppaalParser.ArrayGuardContext ctx) {
        return visit(ctx.guard_expr(0)).concat("[").concat(visit(ctx.guard_expr(1))).concat("]");
    }

    @Override
    public String visitStopWatchGuard(UppaalParser.StopWatchGuardContext ctx) {
        return visit(ctx.guard_expr()).concat("'");
    }

    @Override
    public String visitParenthesisGuard(UppaalParser.ParenthesisGuardContext ctx) {
        String guard = "(";
        guard = guard.concat(visit(ctx.guard_expr())).concat(")");
        return guard;
    }

    @Override
    public String visitGuardIncrement(UppaalParser.GuardIncrementContext ctx) {
        return visit(ctx.guard_expr()).concat("++");
    }

    @Override
    public String visitIncrementGuard(UppaalParser.IncrementGuardContext ctx) {
        return ("++").concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitGuardDecrement(UppaalParser.GuardDecrementContext ctx) {
        return visit(ctx.guard_expr()).concat("--");
    }

    @Override
    public String visitDecrementGuard(UppaalParser.DecrementGuardContext ctx) {
        return ("--").concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitAssignGuard(UppaalParser.AssignGuardContext ctx) {
        String assign = visit(ctx.guard_expr(0));
        assign = assign.concat(ctx.assign.getText());
        assign = assign.concat(visit(ctx.guard_expr(1)));
        return assign;
    }

    @Override
    public String visitUnaryGuard(UppaalParser.UnaryGuardContext ctx) {
        return ctx.unary.getText().concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitComparisonGuard(UppaalParser.ComparisonGuardContext ctx) {
        String guard = visit(ctx.guard_expr(0));
        this.indexOperator++;
        if(this.idOperator!=this.indexOperator){
            guard = guard.concat(" ").concat(ctx.binary.getText()).concat(" ");
            guard = guard.concat(visit(ctx.guard_expr(1)));
            return guard;
        }
        switch (ctx.binary.getType()){
            case UppaalParser.GREATER:
                guard = guard.concat(" &lt; ");
                break;
            case UppaalParser.GREATEREQ:
                guard = guard.concat(" &lt= ");
                break;
            case UppaalParser.LESS:
                guard = guard.concat(" &gt ");
                break;
            case UppaalParser.LESSEQ:
                guard = guard.concat(" &gt= ");
                break;
            case UppaalParser.COMPARE:
                guard = guard.concat(" != ");
                break;
            case UppaalParser.DIFFERENT:
                guard = guard.concat(" == ");
                break;
        }
        guard = guard.concat(visit(ctx.guard_expr(1)));
        return guard;
    }

    @Override
    public String visitBinaryGuard(UppaalParser.BinaryGuardContext ctx) {
        String guard = visit(ctx.guard_expr(0));
        guard = guard.concat(" ").concat(ctx.binary.getText()).concat(" ");
        guard = guard.concat(visit(ctx.guard_expr(1)));
        return guard;
    }

    @Override
    public String visitIfGuard(UppaalParser.IfGuardContext ctx) {
        return visit(ctx.guard_expr(0)).concat(" ? ").concat(visit(ctx.guard_expr(1))).concat(" : ").concat(visit(ctx.guard_expr(2)));
    }

    @Override
    public String visitDotGuard(UppaalParser.DotGuardContext ctx) {
        return visit(ctx.guard_expr()).concat(".").concat(ctx.IDENTIFIER().getText());
    }

    @Override
    public String visitFuncGuard(UppaalParser.FuncGuardContext ctx) {
        return visit(ctx.guard_expr()).concat("(").concat(visit(ctx.arguments())).concat(")");
    }

    @Override
    public String visitForallGuard(UppaalParser.ForallGuardContext ctx) {
        return ("forall(").concat(ctx.IDENTIFIER().getText()).concat(":").concat(visit(ctx.type())).concat(")").concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitExistsGuard(UppaalParser.ExistsGuardContext ctx) {
        return ("exists(").concat(ctx.IDENTIFIER().getText()).concat(":").concat(visit(ctx.type())).concat(")").concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitSumGuard(UppaalParser.SumGuardContext ctx) {
        return ("sum(").concat(ctx.IDENTIFIER().getText()).concat(":").concat(visit(ctx.type())).concat(")").concat(visit(ctx.guard_expr()));
    }

    @Override
    public String visitTrueGuard(UppaalParser.TrueGuardContext ctx) {
        return "true";
    }

    @Override
    public String visitFalseGuard(UppaalParser.FalseGuardContext ctx) {
        return "false";
    }

    @Override
    public String visitArguments(UppaalParser.ArgumentsContext ctx) {
        String arguments = "";

        List<UppaalParser.Guard_exprContext> expressions = ctx.guard_expr();

        String separator = "";
        for(UppaalParser.Guard_exprContext expr: expressions){
            arguments = arguments.concat(separator).concat(visit(expr));
            separator = ", ";
        }
        return arguments;
    }

    @Override
    public String visitType(UppaalParser.TypeContext ctx) {
        String type = "";
        if(ctx.META() != null){
            type = "meta ";
        }
        if(ctx.CONST() != null){
            type = "const ";
        }
        return type.concat(visit(ctx.typeId()));
    }

    @Override
    public String visitTypeInt(UppaalParser.TypeIntContext ctx) {
        return "int";
    }

    @Override
    public String visitTypeIntDomain(UppaalParser.TypeIntDomainContext ctx) {
        return ("int[").concat(visit(ctx.guard_expr(0))).concat(", ").concat(visit(ctx.guard_expr(1))).concat("]");
    }

    @Override
    public String visitTypeScalar(UppaalParser.TypeScalarContext ctx) {
        return ("scalar[").concat(visit(ctx.guard_expr())).concat("]");
    }

    @Override
    public String visitSystem(UppaalParser.SystemContext ctx) {
        return ("<system>").concat(visit(ctx.anything())).concat("</system>");
    }

    @Override
    public String visitQueries(UppaalParser.QueriesContext ctx) {
        String queries = "";
        List<UppaalParser.QueryContext> queryList = ctx.query();
        for(UppaalParser.QueryContext query: queryList){
            queries = queries.concat(visit(query));
        }
        return ("<queries>").concat(visit(ctx.content())).concat("</queries>");
    }

    @Override
    public String visitQuery(UppaalParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }

    @Override
    public String visitFormula(UppaalParser.FormulaContext ctx) {
        return super.visitFormula(ctx);
    }

    @Override
    public String visitComment(UppaalParser.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public String visitAnything(UppaalParser.AnythingContext ctx) {
        return ctx.getText();
    }

}
