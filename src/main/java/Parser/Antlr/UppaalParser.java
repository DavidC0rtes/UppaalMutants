// Generated from /home/david/eclipse-workspace/UppaalMutants/src/main/java/Parser/Antlr/UppaalParser.g4 by ANTLR 4.10.1
package Parser.Antlr;

    import java.util.HashMap;
    import java.util.HashSet;
    import Parser.Mutation.*;
    import Parser.Graph.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UppaalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CDATA=2, DTD=3, EntityRef=4, CharRef=5, SEA_WS=6, OPEN_GUARD=7, 
		OPEN_SYNC=8, OPEN_LBLTR=9, OPEN_SELECT=10, OPEN_INV=11, OPEN_LBLCOM=12, 
		OPEN_DECLARATION=13, OPEN_PARAMETER=14, OPEN=15, OPEN_SLASH=16, XMLDeclOpen=17, 
		TEXT=18, NTA=19, DECLARATION=20, TEMPLATE=21, BRANCHPOINT=22, LOCATION=23, 
		COLOR=24, NAME=25, PARAMETER=26, INIT=27, REF=28, ID=29, X=30, Y=31, URGENT_LOC=32, 
		COMMITTED=33, LABEL=34, KIND=35, TRANSITION=36, SOURCE=37, TARGET=38, 
		NAIL=39, SYSTEM=40, QUERIES=41, QUERY=42, FORMULA=43, QUERY_COMMENT=44, 
		ASSIGNMENT=45, SELECT=46, INVARIANT=47, CLOSE=48, SPECIAL_CLOSE=49, SLASH_CLOSE=50, 
		EQUALS=51, STRING=52, Name=53, S=54, PI=55, SLASH_COMMENT=56, LINE_COMMENT=57, 
		CLOSE_LABEL=58, CLOSE_DECLARATION=59, CLOSE_PARAMETER=60, GUARD_S=61, 
		NAT=62, POINT=63, FOR=64, WHILE=65, DO=66, IF=67, ELSE=68, RETURN=69, 
		PRIORITY=70, DEFAULT=71, APOSTROPHE=72, LEFT_PARENTHESIS=73, RIGHT_PARENTHESIS=74, 
		LEFT_BRACKET=75, RIGHT_BRACKET=76, LEFT_BRACE=77, RIGHT_BRACE=78, COMMA=79, 
		SEMICOLON=80, INCREMENT=81, DECREMENT=82, ASSIGN=83, ASSIGN_COLON=84, 
		ASSIGN_ADD=85, ASSIGN_SUB=86, ASSIGN_MUL=87, ASSIGN_DIV=88, ASSIGN_PERCENT=89, 
		ASSIGN_OR=90, ASSIGN_AND=91, ASSIGN_XOR=92, ASSIGN_LSHIFT=93, ASSIGN_RSHIFT=94, 
		ADD=95, SUB=96, EXCLAMATION=97, NOT=98, LESS=99, LESSEQ=100, COMPARE=101, 
		DIFFERENT=102, GREATEREQ=103, GREATER=104, MUL=105, DIV=106, PERCENT=107, 
		BITAND=108, BITOR=109, BITXOR=110, LSHIFT=111, RSHIFT=112, AND_SYMBOL=113, 
		OR_SYMBOL=114, MINIMUM=115, MAXIMUM=116, OR=117, AND=118, IMPLY=119, QUESTION=120, 
		COLON=121, LOOKUP_OP=122, FORALL=123, EXISTS=124, SUM=125, URGENT=126, 
		BROADCAST=127, META=128, CONST=129, TYPEDEF=130, INT=131, DOUBLE=132, 
		CLOCK=133, CHAN=134, BOOL=135, SCALAR=136, STRUCT=137, TRUE=138, FALSE=139, 
		IDENTIFIER=140;
	public static final int
		RULE_model = 0, RULE_prolog = 1, RULE_content = 2, RULE_element = 3, RULE_reference = 4, 
		RULE_attribute = 5, RULE_chardata = 6, RULE_misc = 7, RULE_nta = 8, RULE_declaration = 9, 
		RULE_declContent = 10, RULE_declarations = 11, RULE_expr = 12, RULE_arguments = 13, 
		RULE_variableDecl = 14, RULE_type = 15, RULE_prefix = 16, RULE_typeId = 17, 
		RULE_fieldDecl = 18, RULE_varFieldDecl = 19, RULE_arrayDecl = 20, RULE_variableID = 21, 
		RULE_initialiser = 22, RULE_typeDecl = 23, RULE_function = 24, RULE_funcParameters = 25, 
		RULE_funcParameter = 26, RULE_block = 27, RULE_statement = 28, RULE_forLoop = 29, 
		RULE_iteration = 30, RULE_whileLoop = 31, RULE_doWhile = 32, RULE_ifStatement = 33, 
		RULE_returnStatement = 34, RULE_chanPriority = 35, RULE_chanOrDef = 36, 
		RULE_chanSeparator = 37, RULE_chanExpr = 38, RULE_anything = 39, RULE_template = 40, 
		RULE_tempContent = 41, RULE_parameter = 42, RULE_coordinate = 43, RULE_initLoc = 44, 
		RULE_branchpoint = 45, RULE_location = 46, RULE_name = 47, RULE_color = 48, 
		RULE_labelLoc = 49, RULE_transition = 50, RULE_labelTransGuard = 51, RULE_labelTransSyncInput = 52, 
		RULE_labelTransSyncOutput = 53, RULE_labelTrans = 54, RULE_labelUpdate = 55, 
		RULE_labelSelect = 56, RULE_selectList = 57, RULE_labelComments = 58, 
		RULE_guardExpr = 59, RULE_guardArguments = 60, RULE_guardType = 61, RULE_guardTypeId = 62, 
		RULE_source = 63, RULE_target = 64, RULE_nail = 65, RULE_system = 66, 
		RULE_queries = 67, RULE_query = 68, RULE_formula = 69, RULE_comment = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "prolog", "content", "element", "reference", "attribute", "chardata", 
			"misc", "nta", "declaration", "declContent", "declarations", "expr", 
			"arguments", "variableDecl", "type", "prefix", "typeId", "fieldDecl", 
			"varFieldDecl", "arrayDecl", "variableID", "initialiser", "typeDecl", 
			"function", "funcParameters", "funcParameter", "block", "statement", 
			"forLoop", "iteration", "whileLoop", "doWhile", "ifStatement", "returnStatement", 
			"chanPriority", "chanOrDef", "chanSeparator", "chanExpr", "anything", 
			"template", "tempContent", "parameter", "coordinate", "initLoc", "branchpoint", 
			"location", "name", "color", "labelLoc", "transition", "labelTransGuard", 
			"labelTransSyncInput", "labelTransSyncOutput", "labelTrans", "labelUpdate", 
			"labelSelect", "selectList", "labelComments", "guardExpr", "guardArguments", 
			"guardType", "guardTypeId", "source", "target", "nail", "system", "queries", 
			"query", "formula", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<'", "'</'", null, null, "'nta'", "'declaration'", 
			"'template'", "'branchpoint'", "'location'", "'color'", "'name'", "'parameter'", 
			"'init'", "'ref'", "'id'", "'x'", "'y'", null, "'committed'", "'label'", 
			"'kind'", "'transition'", "'source'", "'target'", "'nail'", "'system'", 
			"'queries'", "'query'", "'formula'", "'comment'", "'\"assignment\"'", 
			"'\"select\"'", "'\"invariant\"'", "'>'", null, "'/>'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'for'", 
			"'while'", "'do'", "'if'", "'else'", "'return'", "'priority'", "'default'", 
			"'''", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'++'", 
			"'--'", null, "':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", 
			"'&amp;='", "'^='", "'&lt;&lt;='", "'&gt;&gt;='", "'+'", "'-'", "'!'", 
			"'not'", "'&lt;'", "'&lt;='", "'=='", "'!='", "'&gt;='", "'&gt;'", "'*'", 
			"'/'", "'%'", "'&amp;'", "'|'", "'^'", "'&lt;&lt;'", "'&gt;&gt;'", "'&amp;&amp;'", 
			"'||'", "'&lt;?'", "'&gt;?'", "'or'", "'and'", "'imply'", "'?'", "':'", 
			"'.'", "'forall'", "'exists'", "'sum'", null, "'broadcast'", "'meta'", 
			"'const'", "'typedef'", "'int'", "'double'", "'clock'", "'chan'", "'bool'", 
			"'scalar'", "'struct'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CDATA", "DTD", "EntityRef", "CharRef", "SEA_WS", "OPEN_GUARD", 
			"OPEN_SYNC", "OPEN_LBLTR", "OPEN_SELECT", "OPEN_INV", "OPEN_LBLCOM", 
			"OPEN_DECLARATION", "OPEN_PARAMETER", "OPEN", "OPEN_SLASH", "XMLDeclOpen", 
			"TEXT", "NTA", "DECLARATION", "TEMPLATE", "BRANCHPOINT", "LOCATION", 
			"COLOR", "NAME", "PARAMETER", "INIT", "REF", "ID", "X", "Y", "URGENT_LOC", 
			"COMMITTED", "LABEL", "KIND", "TRANSITION", "SOURCE", "TARGET", "NAIL", 
			"SYSTEM", "QUERIES", "QUERY", "FORMULA", "QUERY_COMMENT", "ASSIGNMENT", 
			"SELECT", "INVARIANT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "EQUALS", 
			"STRING", "Name", "S", "PI", "SLASH_COMMENT", "LINE_COMMENT", "CLOSE_LABEL", 
			"CLOSE_DECLARATION", "CLOSE_PARAMETER", "GUARD_S", "NAT", "POINT", "FOR", 
			"WHILE", "DO", "IF", "ELSE", "RETURN", "PRIORITY", "DEFAULT", "APOSTROPHE", 
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BRACE", "RIGHT_BRACE", "COMMA", "SEMICOLON", "INCREMENT", "DECREMENT", 
			"ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", 
			"ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", 
			"ASSIGN_RSHIFT", "ADD", "SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", 
			"COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", 
			"BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", 
			"MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY", "QUESTION", "COLON", "LOOKUP_OP", 
			"FORALL", "EXISTS", "SUM", "URGENT", "BROADCAST", "META", "CONST", "TYPEDEF", 
			"INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", "SCALAR", "STRUCT", "TRUE", 
			"FALSE", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UppaalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 // add members to generated UppaalParser
	    private int num=0;

	    //Graphs to avoid redundant mutants of smi operator, every template has an graph
	    //graphs is <Key, Value> hashmap
	    //          <name_of_template_Key, graph>

	    HashMap<String, Graph> graphs = new HashMap<String, Graph>();

	    //Number of controllable transitions (input actions <expr> "?")
	    //The purpose is to know how many transitions can be removed, each one will be a mutant

	    //TMI array will contain the number of transitions (in reading order)
	    //that has controllable transitions (input actions <expr> "?")
	    //TMI.get(0) will has the transition that should be removed, until TMI.get(n)
	    private ArrayList<Integer> tmi = new ArrayList<Integer>();

	    //Counter with the number of the current transition
	    private int currentTransition = 0;

	    //env will contain as key, "Global" for global declaration and the name of each template
	    //env will contain as value, and array of string


	    private String currentEnv = "Global";
	    private HashMap<String, ArrayList<ChanType>> channelEnv = new HashMap<String, ArrayList<ChanType>>()
	        {{
	            put(currentEnv, new ArrayList<ChanType>());
	        }};
	    private HashMap<String, HashSet<ClockType>> clockEnv = new HashMap<String, HashSet<ClockType>>()
	        {{
	            put(currentEnv, new HashSet<ClockType>());
	        }};
	    private boolean isFunctionEnv = false;

	    //transitionsTad is a <Key, Value> hashmap
	    //                    <name_of_template_Key, <key, value>>
	    //                    <name_of_template_key, <source_key, set_of_targets>
	    //transitionsTad is a structure to save in each template the locations that does not have input/output actions (<expr> "?"/"!") synchro
	    //these will be candidates to mutatants, adding transitions with output actions ( <expr> "!")
	    private HashMap<String, HashMap<String, HashSet<String>>> transitionsTad = new HashMap<String, HashMap<String, HashSet<String>>>();
	    private String currentSource = "";
	    private String currentTarget = "";

	    //transitionsTadNoSync is a structure similar to transitionsTad, this one will be used to make transitions between location that has not
	    //any transition
	    private HashMap<String, HashMap<String, HashSet<String>>> transitionsTadNoSync = new HashMap<String, HashMap<String, HashSet<String>>>();

	    //locationsSmi is a <Key, Value > hashmap
	    //                  <name_of_template_Key, <value>>
	    //                  <name_of_template_Key, <set_of_locations>>
	    //locations that has at least one input action ( <expr> "?" ) per template
	    private HashMap<String, HashSet<String>> locationsSmi = new HashMap<String, HashSet<String>>();
	    private String initLocationId = "";

	    ///////////////////////////////////////////////////////////////////////////
	    //private boolean isClockId = false;
	    private boolean isControllable = false;

	    private boolean isClockLeft = false;
	    private boolean isClockRight = false;
	    private int clockLessNum = 0;
	    private int clockGreaterNum = 0;
	    private int clockEqualNum = 0;
	    private int clockDifferentNum = 0;

	    //CXL Constant eXchange L operator increases the constant of a clock constraint.
	    private int numCxl = 0;
	    //CXS Constant eXchange S operator decreases the constant of a clock constraint.
	    private int numCxs = 0;
	    //CCN Clock Constraint Negation operator negates a clock constraint.
	    private int numCcn = 0;

	    public int getNum(){
	        return this.num;
	    }
	    public void setNum(int num){
	        this.num = num;
	    }
	    public HashMap<String, ArrayList<ChanType>> getChannelEnv (){
	        return this.channelEnv;
	    }
	    public HashMap<String, HashSet<ClockType>> getClockEnv (){
	        return this.clockEnv;
	    }
	    public ArrayList<Integer> getTmi(){
	        return this.tmi;
	    }

	    public HashMap<String, HashMap<String, HashSet<String>>> getTransitionsTad(){
	        return this.transitionsTad;
	    }

	    public HashMap<String, HashMap<String, HashSet<String>>> getTransitionsTadNoSync(){
	        return this.transitionsTadNoSync;
	    }

	    public HashMap<String, HashSet<String>> getLocationsSmi(){
	        return this.locationsSmi;
	    }

	    public int getNumCxl(){
	        return this.numCxl;
	    }
	    public int getNumCxs(){
	        return this.numCxs;
	    }
	    public int getNumCcn(){
	        return this.numCcn;
	    }
	    public HashMap<String, Graph> getGraphs(){
	        return this.graphs;
	    }


	    private String envTarget;
	    public UppaalParser(TokenStream input, String envTarget){
	        this(input);
	        this.envTarget = envTarget;
	    }

	public UppaalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelContext extends ParserRuleContext {
		public NtaContext nta() {
			return getRuleContext(NtaContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(142);
				prolog();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(145);
				misc();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			nta();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(152);
				misc();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode XMLDeclOpen() { return getToken(UppaalParser.XMLDeclOpen, 0); }
		public TerminalNode SPECIAL_CLOSE() { return getToken(UppaalParser.SPECIAL_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitProlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prolog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(XMLDeclOpen);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(159);
				attribute();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(SPECIAL_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(UppaalParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(UppaalParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(UppaalParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(UppaalParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(UppaalParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(UppaalParser.COMMENT, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(167);
				chardata();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(170);
					element();
					}
					break;
				case EntityRef:
				case CharRef:
					{
					setState(171);
					reference();
					}
					break;
				case CDATA:
					{
					setState(172);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(173);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(174);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(177);
					chardata();
					}
				}

				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> Name() { return getTokens(UppaalParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(UppaalParser.Name, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(OPEN);
				setState(186);
				match(Name);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(187);
					attribute();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(CLOSE);
				setState(194);
				content();
				setState(195);
				match(OPEN_SLASH);
				setState(196);
				match(Name);
				setState(197);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(OPEN);
				setState(200);
				match(Name);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(201);
					attribute();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(SLASH_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode EntityRef() { return getToken(UppaalParser.EntityRef, 0); }
		public TerminalNode CharRef() { return getToken(UppaalParser.CharRef, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==EntityRef || _la==CharRef) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(UppaalParser.Name, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Name);
			setState(213);
			match(EQUALS);
			setState(214);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(UppaalParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(UppaalParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(UppaalParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(UppaalParser.PI, 0); }
		public TerminalNode SEA_WS() { return getToken(UppaalParser.SEA_WS, 0); }
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_misc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NtaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> NTA() { return getTokens(UppaalParser.NTA); }
		public TerminalNode NTA(int i) {
			return getToken(UppaalParser.NTA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
		}
		public NtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtaContext nta() throws RecognitionException {
		NtaContext _localctx = new NtaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nta);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OPEN);
			setState(221);
			match(NTA);
			setState(222);
			match(CLOSE);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(223);
				misc();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			declaration();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(230);
				misc();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(236);
					template();
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(237);
						misc();
						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(247);
			system();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(248);
				misc();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(254);
				queries();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(255);
					misc();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(OPEN_SLASH);
			setState(264);
			match(NTA);
			setState(265);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode OPEN_DECLARATION() { return getToken(UppaalParser.OPEN_DECLARATION, 0); }
		public DeclContentContext declContent() {
			return getRuleContext(DeclContentContext.class,0);
		}
		public TerminalNode CLOSE_DECLARATION() { return getToken(UppaalParser.CLOSE_DECLARATION, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(OPEN_DECLARATION);
			setState(268);
			declContent();
			setState(269);
			match(CLOSE_DECLARATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContentContext extends ParserRuleContext {
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public DeclContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDeclContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDeclContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDeclContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContentContext declContent() throws RecognitionException {
		DeclContentContext _localctx = new DeclContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					declarations();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends DeclarationsContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationContext extends DeclarationsContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeclarationContext extends DeclarationsContext {
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public TypeDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanDeclarationContext extends DeclarationsContext {
		public ChanPriorityContext chanPriority() {
			return getRuleContext(ChanPriorityContext.class,0);
		}
		public ChanDeclarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarations);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				typeDecl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				function();
				}
				break;
			case 4:
				_localctx = new ChanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				chanPriority();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementExprContext extends ExprContext {
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(UppaalParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends ExprContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(UppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(UppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(UppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(UppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(UppaalParser.GREATER, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(UppaalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(UppaalParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(UppaalParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(UppaalParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(UppaalParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(UppaalParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(UppaalParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(UppaalParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(UppaalParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(UppaalParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(UppaalParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(UppaalParser.OR, 0); }
		public TerminalNode AND() { return getToken(UppaalParser.AND, 0); }
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode IMPLY() { return getToken(UppaalParser.IMPLY, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public ExprIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExprIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExprIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LOOKUP_OP() { return getToken(UppaalParser.LOOKUP_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExprContext extends ExprContext {
		public TerminalNode FORALL() { return getToken(UppaalParser.FORALL, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(UppaalParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public ExprDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExprDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExprDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExprDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token assign;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(UppaalParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(UppaalParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(UppaalParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(UppaalParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(UppaalParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(UppaalParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(UppaalParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(UppaalParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(UppaalParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(UppaalParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(UppaalParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(UppaalParser.ASSIGN_RSHIFT, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode POINT() { return getToken(UppaalParser.POINT, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(UppaalParser.APOSTROPHE, 0); }
		public StopWatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStopWatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStopWatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStopWatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatExprContext extends ExprContext {
		public TerminalNode NAT() { return getToken(UppaalParser.NAT, 0); }
		public NatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(UppaalParser.EXISTS, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExprContext {
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(284);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(POINT);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(LEFT_PARENTHESIS);
				setState(288);
				expr(0);
				setState(289);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(INCREMENT);
				setState(292);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(DECREMENT);
				setState(294);
				expr(13);
				}
				break;
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (ADD - 95)) | (1L << (SUB - 95)) | (1L << (EXCLAMATION - 95)) | (1L << (NOT - 95)))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(FORALL);
				setState(298);
				match(LEFT_PARENTHESIS);
				setState(299);
				match(IDENTIFIER);
				setState(300);
				match(COLON);
				setState(301);
				type();
				setState(302);
				match(RIGHT_PARENTHESIS);
				setState(303);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(EXISTS);
				setState(306);
				match(LEFT_PARENTHESIS);
				setState(307);
				match(IDENTIFIER);
				setState(308);
				match(COLON);
				setState(309);
				type();
				setState(310);
				match(RIGHT_PARENTHESIS);
				setState(311);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(SUM);
				setState(314);
				match(LEFT_PARENTHESIS);
				setState(315);
				match(IDENTIFIER);
				setState(316);
				match(COLON);
				setState(317);
				type();
				setState(318);
				match(RIGHT_PARENTHESIS);
				setState(319);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(326);
						((AssignExprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ASSIGN - 83)) | (1L << (ASSIGN_COLON - 83)) | (1L << (ASSIGN_ADD - 83)) | (1L << (ASSIGN_SUB - 83)) | (1L << (ASSIGN_MUL - 83)) | (1L << (ASSIGN_DIV - 83)) | (1L << (ASSIGN_PERCENT - 83)) | (1L << (ASSIGN_OR - 83)) | (1L << (ASSIGN_AND - 83)) | (1L << (ASSIGN_XOR - 83)) | (1L << (ASSIGN_LSHIFT - 83)) | (1L << (ASSIGN_RSHIFT - 83)))) != 0)) ) {
							((AssignExprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(329);
						((ComparisonExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (LESS - 99)) | (1L << (LESSEQ - 99)) | (1L << (COMPARE - 99)) | (1L << (DIFFERENT - 99)) | (1L << (GREATEREQ - 99)) | (1L << (GREATER - 99)))) != 0)) ) {
							((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(330);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(332);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (COMMA - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (DIV - 79)) | (1L << (PERCENT - 79)) | (1L << (BITAND - 79)) | (1L << (BITOR - 79)) | (1L << (BITXOR - 79)) | (1L << (LSHIFT - 79)) | (1L << (RSHIFT - 79)) | (1L << (AND_SYMBOL - 79)) | (1L << (OR_SYMBOL - 79)) | (1L << (MINIMUM - 79)) | (1L << (MAXIMUM - 79)) | (1L << (OR - 79)) | (1L << (AND - 79)) | (1L << (IMPLY - 79)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
						match(QUESTION);
						setState(336);
						expr(0);
						setState(337);
						match(COLON);
						setState(338);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(341);
						match(LEFT_BRACKET);
						setState(342);
						expr(0);
						setState(343);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(346);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(348);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(350);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(352);
						match(LOOKUP_OP);
						setState(353);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(355);
						match(LEFT_PARENTHESIS);
						setState(356);
						arguments();
						setState(357);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(364);
				expr(0);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(365);
					match(COMMA);
					setState(366);
					expr(0);
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableIDContext> variableID() {
			return getRuleContexts(VariableIDContext.class);
		}
		public VariableIDContext variableID(int i) {
			return getRuleContext(VariableIDContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			type();
			setState(375);
			variableID();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(376);
				match(COMMA);
				setState(377);
				variableID();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(SEMICOLON);
			}

			                    if(!this.isFunctionEnv){

			                        String typeId = _localctx.type().typeId().getText();

			                        String prefix = _localctx.type().prefix() != null
			                        		? _localctx.type().prefix().getText()
			                        		: "";

			                        if(typeId.equals("chan")){
			                            List<UppaalParser.VariableIDContext> variablesId = _localctx.variableID();

			                            for(UppaalParser.VariableIDContext variableId: variablesId){
			                                String chanId = variableId.IDENTIFIER().getText();
			                                int dimensions = variableId.arrayDecl().size();
			                                channelEnv.get(currentEnv).add(new ChanType(chanId, dimensions, prefix));
			                            }
			                        }
			                        else if(typeId.equals("clock")){
			                            List<UppaalParser.VariableIDContext> variablesId = _localctx.variableID();
			                            for(UppaalParser.VariableIDContext variableId: variablesId){
			                                String clockId = variableId.IDENTIFIER().getText();
			                                clockEnv.get(currentEnv).add(new ClockType(clockId));
			                            }
			                        }
			                        //env.get(currentEnv).add();
			                    }
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (URGENT - 126)) | (1L << (BROADCAST - 126)) | (1L << (META - 126)) | (1L << (CONST - 126)))) != 0)) {
				{
				setState(387);
				prefix();
				}
			}

			setState(390);
			typeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	 
		public PrefixContext() { }
		public void copyFrom(PrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BroadcastPrefixContext extends PrefixContext {
		public TerminalNode BROADCAST() { return getToken(UppaalParser.BROADCAST, 0); }
		public BroadcastPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBroadcastPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBroadcastPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBroadcastPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MetaPrefixContext extends PrefixContext {
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public MetaPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterMetaPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitMetaPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitMetaPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstPrefixContext extends PrefixContext {
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public ConstPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterConstPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitConstPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitConstPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UrgentPrefixContext extends PrefixContext {
		public TerminalNode URGENT() { return getToken(UppaalParser.URGENT, 0); }
		public UrgentPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUrgentPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUrgentPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUrgentPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_prefix);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URGENT:
				_localctx = new UrgentPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(URGENT);
				}
				break;
			case BROADCAST:
				_localctx = new BroadcastPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(BROADCAST);
				}
				break;
			case META:
				_localctx = new MetaPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(META);
				}
				break;
			case CONST:
				_localctx = new ConstPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdContext extends ParserRuleContext {
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
	 
		public TypeIdContext() { }
		public void copyFrom(TypeIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends TypeIdContext {
		public TerminalNode BOOL() { return getToken(UppaalParser.BOOL, 0); }
		public BoolTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeIdContext {
		public TerminalNode STRUCT() { return getToken(UppaalParser.STRUCT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeIdContext {
		public TerminalNode DOUBLE() { return getToken(UppaalParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends TypeIdContext {
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ScalarTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeIdContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainTypeContext extends TypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public IntDomainTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIntDomainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIntDomainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIntDomainType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public IntTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockTypeContext extends TypeIdContext {
		public TerminalNode CLOCK() { return getToken(UppaalParser.CLOCK, 0); }
		public ClockTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanTypeContext extends TypeIdContext {
		public TerminalNode CHAN() { return getToken(UppaalParser.CHAN, 0); }
		public ChanTypeContext(TypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeId);
		int _la;
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				match(INT);
				setState(405);
				match(LEFT_BRACKET);
				setState(406);
				expr(0);
				setState(407);
				match(COMMA);
				setState(408);
				expr(0);
				setState(409);
				match(RIGHT_BRACKET);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				match(SCALAR);
				setState(412);
				match(LEFT_BRACKET);
				setState(413);
				expr(0);
				setState(414);
				match(RIGHT_BRACKET);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(416);
				match(STRUCT);
				setState(417);
				match(LEFT_BRACE);
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(418);
					fieldDecl();
					}
					}
					setState(421); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (URGENT - 126)) | (1L << (BROADCAST - 126)) | (1L << (META - 126)) | (1L << (CONST - 126)) | (1L << (INT - 126)) | (1L << (DOUBLE - 126)) | (1L << (CLOCK - 126)) | (1L << (CHAN - 126)) | (1L << (BOOL - 126)) | (1L << (SCALAR - 126)) | (1L << (STRUCT - 126)) | (1L << (IDENTIFIER - 126)))) != 0) );
				setState(423);
				match(RIGHT_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			type();
			setState(428);
			varFieldDecl();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(429);
				match(COMMA);
				setState(430);
				varFieldDecl();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarFieldDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VarFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVarFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVarFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVarFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarFieldDeclContext varFieldDecl() throws RecognitionException {
		VarFieldDeclContext _localctx = new VarFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varFieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(IDENTIFIER);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(439);
				arrayDecl();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclContext extends ParserRuleContext {
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
	 
		public ArrayDeclContext() { }
		public void copyFrom(ArrayDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclExprContext extends ArrayDeclContext {
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayDeclExprContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclTypeContext extends ArrayDeclContext {
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayDeclTypeContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayDecl);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(LEFT_BRACKET);
				setState(446);
				expr(0);
				setState(447);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(LEFT_BRACKET);
				setState(450);
				type();
				setState(451);
				match(RIGHT_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIDContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(UppaalParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(UppaalParser.ASSIGN_COLON, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VariableIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterVariableID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitVariableID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitVariableID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIDContext variableID() throws RecognitionException {
		VariableIDContext _localctx = new VariableIDContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(IDENTIFIER);
			{
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(456);
				arrayDecl();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==ASSIGN_COLON) {
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				initialiser();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
	 
		public InitialiserContext() { }
		public void copyFrom(InitialiserContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitialiserExprContext extends InitialiserContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitialiserExprContext(InitialiserContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitialiserExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitialiserExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitialiserExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitialiserArrayContext extends InitialiserContext {
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public List<InitialiserContext> initialiser() {
			return getRuleContexts(InitialiserContext.class);
		}
		public InitialiserContext initialiser(int i) {
			return getRuleContext(InitialiserContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public InitialiserArrayContext(InitialiserContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitialiserArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitialiserArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitialiserArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initialiser);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
			case POINT:
			case LEFT_PARENTHESIS:
			case INCREMENT:
			case DECREMENT:
			case ADD:
			case SUB:
			case EXCLAMATION:
			case NOT:
			case FORALL:
			case EXISTS:
			case SUM:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				_localctx = new InitialiserExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				expr(0);
				}
				break;
			case LEFT_BRACE:
				_localctx = new InitialiserArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(LEFT_BRACE);
				setState(468);
				initialiser();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(469);
					match(COMMA);
					setState(470);
					initialiser();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(RIGHT_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(UppaalParser.TYPEDEF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(TYPEDEF);
			setState(481);
			type();
			setState(482);
			varFieldDecl();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(483);
				match(COMMA);
				setState(484);
				varFieldDecl();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                    this.isFunctionEnv = true;
			                
			setState(493);
			type();
			setState(494);
			match(IDENTIFIER);
			setState(495);
			match(LEFT_PARENTHESIS);
			setState(496);
			funcParameters();
			setState(497);
			match(RIGHT_PARENTHESIS);
			setState(498);
			block();

			                    this.isFunctionEnv = false;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParametersContext extends ParserRuleContext {
		public List<FuncParameterContext> funcParameter() {
			return getRuleContexts(FuncParameterContext.class);
		}
		public FuncParameterContext funcParameter(int i) {
			return getRuleContext(FuncParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (URGENT - 126)) | (1L << (BROADCAST - 126)) | (1L << (META - 126)) | (1L << (CONST - 126)) | (1L << (INT - 126)) | (1L << (DOUBLE - 126)) | (1L << (CLOCK - 126)) | (1L << (CHAN - 126)) | (1L << (BOOL - 126)) | (1L << (SCALAR - 126)) | (1L << (STRUCT - 126)) | (1L << (IDENTIFIER - 126)))) != 0)) {
				{
				setState(501);
				funcParameter();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(502);
					match(COMMA);
					setState(503);
					funcParameter();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarFieldDeclContext varFieldDecl() {
			return getRuleContext(VarFieldDeclContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
		public FuncParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterContext funcParameter() throws RecognitionException {
		FuncParameterContext _localctx = new FuncParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			type();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(512);
				match(BITAND);
				}
			}

			setState(515);
			varFieldDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(UppaalParser.LEFT_BRACE, 0); }
		public DeclContentContext declContent() {
			return getRuleContext(DeclContentContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(UppaalParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(LEFT_BRACE);
			setState(518);
			declContent();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (FOR - 62)) | (1L << (WHILE - 62)) | (1L << (DO - 62)) | (1L << (IF - 62)) | (1L << (RETURN - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (LEFT_BRACE - 62)) | (1L << (SEMICOLON - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				{
				setState(519);
				statement();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForContext extends StatementContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementExprContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public StatementExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementSemicolonContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public StatementSemicolonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIterationContext extends StatementContext {
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public StatementIterationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDoWhileContext extends StatementContext {
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public StatementDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				block();
				}
				break;
			case 2:
				_localctx = new StatementSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new StatementExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				expr(0);
				setState(530);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				forLoop();
				}
				break;
			case 5:
				_localctx = new StatementIterationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				iteration();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				whileLoop();
				}
				break;
			case 7:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				doWhile();
				}
				break;
			case 8:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(536);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(537);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(UppaalParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(UppaalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(UppaalParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(FOR);
			setState(541);
			match(LEFT_PARENTHESIS);
			setState(542);
			expr(0);
			setState(543);
			match(SEMICOLON);
			setState(544);
			expr(0);
			setState(545);
			match(SEMICOLON);
			setState(546);
			expr(0);
			setState(547);
			match(RIGHT_PARENTHESIS);
			setState(548);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(UppaalParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(FOR);
			setState(551);
			match(LEFT_PARENTHESIS);
			setState(552);
			match(IDENTIFIER);
			setState(553);
			match(COLON);
			setState(554);
			type();
			setState(555);
			match(RIGHT_PARENTHESIS);
			setState(556);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UppaalParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(WHILE);
			setState(559);
			match(LEFT_PARENTHESIS);
			setState(560);
			expr(0);
			setState(561);
			match(RIGHT_PARENTHESIS);
			setState(562);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(UppaalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(UppaalParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(DO);
			setState(565);
			statement();
			setState(566);
			match(WHILE);
			setState(567);
			match(LEFT_PARENTHESIS);
			setState(568);
			expr(0);
			setState(569);
			match(RIGHT_PARENTHESIS);
			setState(570);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UppaalParser.IF, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UppaalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(IF);
			setState(573);
			match(LEFT_PARENTHESIS);
			setState(574);
			expr(0);
			setState(575);
			match(RIGHT_PARENTHESIS);
			setState(576);
			statement();
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(577);
				match(ELSE);
				setState(578);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(UppaalParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(RETURN);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(582);
				expr(0);
				}
			}

			setState(585);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanPriorityContext extends ParserRuleContext {
		public TerminalNode CHAN() { return getToken(UppaalParser.CHAN, 0); }
		public TerminalNode PRIORITY() { return getToken(UppaalParser.PRIORITY, 0); }
		public List<ChanOrDefContext> chanOrDef() {
			return getRuleContexts(ChanOrDefContext.class);
		}
		public ChanOrDefContext chanOrDef(int i) {
			return getRuleContext(ChanOrDefContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UppaalParser.SEMICOLON, 0); }
		public List<ChanSeparatorContext> chanSeparator() {
			return getRuleContexts(ChanSeparatorContext.class);
		}
		public ChanSeparatorContext chanSeparator(int i) {
			return getRuleContext(ChanSeparatorContext.class,i);
		}
		public ChanPriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanPriority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanPriorityContext chanPriority() throws RecognitionException {
		ChanPriorityContext _localctx = new ChanPriorityContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_chanPriority);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(CHAN);
			setState(588);
			match(PRIORITY);
			setState(589);
			chanOrDef();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==LESS) {
				{
				{
				setState(590);
				chanSeparator();
				setState(591);
				chanOrDef();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanOrDefContext extends ParserRuleContext {
		public ChanExprContext chanExpr() {
			return getRuleContext(ChanExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(UppaalParser.DEFAULT, 0); }
		public ChanOrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanOrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanOrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanOrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanOrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanOrDefContext chanOrDef() throws RecognitionException {
		ChanOrDefContext _localctx = new ChanOrDefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chanOrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(600);
				chanExpr(0);
				}
				break;
			case DEFAULT:
				{
				setState(601);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanSeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public ChanSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSeparatorContext chanSeparator() throws RecognitionException {
		ChanSeparatorContext _localctx = new ChanSeparatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_chanSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==LESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanExprContext extends ParserRuleContext {
		public ChanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanExpr; }
	 
		public ChanExprContext() { }
		public void copyFrom(ChanExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChanArrayContext extends ChanExprContext {
		public ChanExprContext chanExpr() {
			return getRuleContext(ChanExprContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ChanArrayContext(ChanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanIdentifierContext extends ChanExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public ChanIdentifierContext(ChanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterChanIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitChanIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitChanIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanExprContext chanExpr() throws RecognitionException {
		return chanExpr(0);
	}

	private ChanExprContext chanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChanExprContext _localctx = new ChanExprContext(_ctx, _parentState);
		ChanExprContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_chanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ChanIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(607);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChanArrayContext(new ChanExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_chanExpr);
					setState(609);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(610);
					match(LEFT_BRACKET);
					setState(611);
					expr(0);
					setState(612);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AnythingContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(UppaalParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(UppaalParser.CDATA, i);
		}
		public List<TerminalNode> PI() { return getTokens(UppaalParser.PI); }
		public TerminalNode PI(int i) {
			return getToken(UppaalParser.PI, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(UppaalParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(UppaalParser.COMMENT, i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(619);
				chardata();
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(626);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(622);
					reference();
					}
					break;
				case CDATA:
					{
					setState(623);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(624);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(625);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(628);
					chardata();
					}
				}

				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> TEMPLATE() { return getTokens(UppaalParser.TEMPLATE); }
		public TerminalNode TEMPLATE(int i) {
			return getToken(UppaalParser.TEMPLATE, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TempContentContext tempContent() {
			return getRuleContext(TempContentContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(OPEN);
			setState(637);
			match(TEMPLATE);
			setState(638);
			match(CLOSE);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(639);
				misc();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			tempContent();
			setState(646);
			match(OPEN_SLASH);
			setState(647);
			match(TEMPLATE);
			setState(648);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempContentContext extends ParserRuleContext {
		public ArrayList<String> namesLocations = new ArrayList<String>();
		public InitLocContext initLoc() {
			return getRuleContext(InitLocContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public List<BranchpointContext> branchpoint() {
			return getRuleContexts(BranchpointContext.class);
		}
		public BranchpointContext branchpoint(int i) {
			return getRuleContext(BranchpointContext.class,i);
		}
		public TempContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTempContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTempContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTempContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempContentContext tempContent() throws RecognitionException {
		TempContentContext _localctx = new TempContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tempContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(650);
				name();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(651);
					misc();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}

			                    if(_localctx.name()!=null){
			                        currentEnv = _localctx.name().anything().getText();
			                        channelEnv.put(currentEnv, new ArrayList<ChanType>());
			                        clockEnv.put(currentEnv, new HashSet<ClockType>());
			                        transitionsTad.put(currentEnv, new HashMap<String, HashSet<String>>());
			                        transitionsTadNoSync.put(currentEnv, new HashMap<String, HashSet<String>>());
			                        locationsSmi.put(currentEnv, new HashSet<String>());

			                        graphs.put(currentEnv, new Graph());
			                    }
			                
			{
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARAMETER) {
				{
				setState(660);
				parameter();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(661);
					misc();
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}

			                    if(_localctx.parameter()!=null){
			                        List<UppaalParser.FuncParameterContext> funcParameters = _localctx.parameter().funcParameters().funcParameter();
			                        for(UppaalParser.FuncParameterContext funcParameter: funcParameters){
			                            String typeId = funcParameter.type().typeId().getText();
			                            if(typeId.equals("chan")){
			                                String chanId = funcParameter.varFieldDecl().IDENTIFIER().getText();
			                                int dimensions = funcParameter.varFieldDecl().arrayDecl().size();
			                                channelEnv.get(currentEnv).add(new ChanType(chanId, dimensions, ""));
			                            }
			                            else if (typeId.equals("clock")){
			                                String clockId = funcParameter.varFieldDecl().IDENTIFIER().getText();
			                                clockEnv.get(currentEnv).add(new ClockType(clockId));
			                            }
			                        }
			                    }
			                
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_DECLARATION) {
				{
				setState(670);
				declaration();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(671);
					misc();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(693); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(693);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						{
						setState(679);
						location();
						setState(683);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(680);
							misc();
							}
							}
							setState(685);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(686);
						branchpoint();
						setState(690);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(687);
							misc();
							}
							}
							setState(692);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(695); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}

			                    List<UppaalParser.LocationContext> locations = _localctx.location();
			                    for(UppaalParser.LocationContext location: locations){
			                        _localctx.namesLocations.add(location.STRING().getText());
			                    }
			                    for(String locationSource: _localctx.namesLocations){
			                        HashSet<String> target = new HashSet<String>();
			                        HashSet<String> targetNoSync = new HashSet<String>();
			                        for(String locationTarget: _localctx.namesLocations){
			                            target.add(locationTarget);
			                            targetNoSync.add(locationTarget);
			                        }
			                        this.transitionsTad.get(this.currentEnv).put(locationSource, target);
			                        this.transitionsTadNoSync.get(this.currentEnv).put(locationSource, targetNoSync);

			                        //For graph
			                        this.graphs.get(this.currentEnv).addNode(locationSource);
			                    }

			                
			{
			setState(698);
			initLoc();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(699);
				misc();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}

			                    this.initLocationId=_localctx.initLoc().STRING().getText();

			                
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(706);
				transition();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(707);
					misc();
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                    this.graphs.get(this.currentEnv).setInitialNode(initLocationId);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode OPEN_PARAMETER() { return getToken(UppaalParser.OPEN_PARAMETER, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public TerminalNode CLOSE_PARAMETER() { return getToken(UppaalParser.CLOSE_PARAMETER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(OPEN_PARAMETER);
			setState(721);
			funcParameters();
			setState(722);
			match(CLOSE_PARAMETER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordinateContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(UppaalParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(UppaalParser.EQUALS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(UppaalParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UppaalParser.STRING, i);
		}
		public List<TerminalNode> X() { return getTokens(UppaalParser.X); }
		public TerminalNode X(int i) {
			return getToken(UppaalParser.X, i);
		}
		public List<TerminalNode> Y() { return getTokens(UppaalParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(UppaalParser.Y, i);
		}
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitCoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_coordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(725);
			match(EQUALS);
			setState(726);
			match(STRING);
			setState(727);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(728);
			match(EQUALS);
			setState(729);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitLocContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode INIT() { return getToken(UppaalParser.INIT, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public InitLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterInitLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitInitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitInitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitLocContext initLoc() throws RecognitionException {
		InitLocContext _localctx = new InitLocContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_initLoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(OPEN);
			setState(732);
			match(INIT);
			setState(733);
			match(REF);
			setState(734);
			match(EQUALS);
			setState(735);
			match(STRING);
			setState(736);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchpointContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> BRANCHPOINT() { return getTokens(UppaalParser.BRANCHPOINT); }
		public TerminalNode BRANCHPOINT(int i) {
			return getToken(UppaalParser.BRANCHPOINT, i);
		}
		public TerminalNode ID() { return getToken(UppaalParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public BranchpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBranchpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBranchpoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBranchpoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchpointContext branchpoint() throws RecognitionException {
		BranchpointContext _localctx = new BranchpointContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_branchpoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(OPEN);
			setState(739);
			match(BRANCHPOINT);
			setState(740);
			match(ID);
			setState(741);
			match(EQUALS);
			setState(742);
			match(STRING);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(743);
				coordinate();
				}
			}

			setState(746);
			match(CLOSE);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(747);
				misc();
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(753);
			match(OPEN_SLASH);
			setState(754);
			match(BRANCHPOINT);
			setState(755);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(UppaalParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(UppaalParser.OPEN, i);
		}
		public List<TerminalNode> LOCATION() { return getTokens(UppaalParser.LOCATION); }
		public TerminalNode LOCATION(int i) {
			return getToken(UppaalParser.LOCATION, i);
		}
		public TerminalNode ID() { return getToken(UppaalParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelLocContext labelLoc() {
			return getRuleContext(LabelLocContext.class,0);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public TerminalNode URGENT_LOC() { return getToken(UppaalParser.URGENT_LOC, 0); }
		public TerminalNode COMMITTED() { return getToken(UppaalParser.COMMITTED, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(OPEN);
			setState(758);
			match(LOCATION);
			setState(759);
			match(ID);
			setState(760);
			match(EQUALS);
			setState(761);
			match(STRING);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(762);
				coordinate();
				}
			}

			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(765);
				color();
				}
			}

			setState(768);
			match(CLOSE);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(769);
				misc();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(775);
				name();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(776);
					misc();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_INV) {
				{
				setState(784);
				labelLoc();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(785);
					misc();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(793);
				match(OPEN);
				setState(794);
				_la = _input.LA(1);
				if ( !(_la==URGENT_LOC || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(795);
				match(SLASH_CLOSE);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(796);
					misc();
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(804);
			match(OPEN_SLASH);
			setState(805);
			match(LOCATION);
			setState(806);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> NAME() { return getTokens(UppaalParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(UppaalParser.NAME, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(OPEN);
			setState(809);
			match(NAME);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(810);
				coordinate();
				}
			}

			setState(813);
			match(CLOSE);
			setState(814);
			anything();
			setState(815);
			match(OPEN_SLASH);
			setState(816);
			match(NAME);
			setState(817);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(UppaalParser.COLOR, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(COLOR);
			setState(820);
			match(EQUALS);
			setState(821);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelLocContext extends ParserRuleContext {
		public TerminalNode OPEN_INV() { return getToken(UppaalParser.OPEN_INV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelLocContext labelLoc() throws RecognitionException {
		LabelLocContext _localctx = new LabelLocContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labelLoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(OPEN_INV);
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(824);
				misc();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			expr(0);
			setState(831);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> TRANSITION() { return getTokens(UppaalParser.TRANSITION); }
		public TerminalNode TRANSITION(int i) {
			return getToken(UppaalParser.TRANSITION, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<LabelTransContext> labelTrans() {
			return getRuleContexts(LabelTransContext.class);
		}
		public LabelTransContext labelTrans(int i) {
			return getRuleContext(LabelTransContext.class,i);
		}
		public List<LabelTransGuardContext> labelTransGuard() {
			return getRuleContexts(LabelTransGuardContext.class);
		}
		public LabelTransGuardContext labelTransGuard(int i) {
			return getRuleContext(LabelTransGuardContext.class,i);
		}
		public List<LabelTransSyncInputContext> labelTransSyncInput() {
			return getRuleContexts(LabelTransSyncInputContext.class);
		}
		public LabelTransSyncInputContext labelTransSyncInput(int i) {
			return getRuleContext(LabelTransSyncInputContext.class,i);
		}
		public List<LabelTransSyncOutputContext> labelTransSyncOutput() {
			return getRuleContexts(LabelTransSyncOutputContext.class);
		}
		public LabelTransSyncOutputContext labelTransSyncOutput(int i) {
			return getRuleContext(LabelTransSyncOutputContext.class,i);
		}
		public List<NailContext> nail() {
			return getRuleContexts(NailContext.class);
		}
		public NailContext nail(int i) {
			return getRuleContext(NailContext.class,i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(OPEN);
			setState(834);
			match(TRANSITION);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(835);
				color();
				}
			}

			setState(838);
			match(CLOSE);

			                    this.currentTransition++;
			                
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(840);
				misc();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(846);
			source();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(847);
				misc();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(853);
			target();
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(854);
				misc();
				}
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_GUARD) | (1L << OPEN_SYNC) | (1L << OPEN_LBLTR) | (1L << OPEN_SELECT) | (1L << OPEN_LBLCOM))) != 0)) {
				{
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(860);
					labelTrans();
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(861);
						misc();
						}
						}
						setState(866);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(867);
					labelTransGuard();
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(868);
						misc();
						}
						}
						setState(873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(874);
					labelTransSyncInput();
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(875);
						misc();
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 4:
					{
					setState(881);
					labelTransSyncOutput();
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(882);
						misc();
						}
						}
						setState(887);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(893);
				nail();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(894);
					misc();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(905);
			match(OPEN_SLASH);
			setState(906);
			match(TRANSITION);
			setState(907);
			match(CLOSE);

			                    if(this.currentEnv.equals(this.envTarget)){
			                        if(this.isControllable){
			                            // It is an input transition '?'
			                            // clock >= num  --Mute to-> clock >= num+1
			                            this.numCxl += this.clockGreaterNum;
			                            // clock <= num  --Mute to-> clock <= num-1
			                            this.numCxs += this.clockLessNum;
			                        }
			                        else{
			                            // It is an output transition '!'
			                            // clock <= num  --Mute to-> clock <= num+1
			                            this.numCxl += this.clockLessNum;
			                            // clock >= num  --Mute to-> clock >= num-1
			                            this.numCxs += this.clockGreaterNum;
			                        }

			                    }

			                    if(this.currentEnv.equals(this.envTarget)){
			                        this.numCcn += this.clockGreaterNum + this.clockLessNum;
			                    }
			                    this.isControllable = false;
			                    this.clockGreaterNum = 0;
			                    this.clockLessNum = 0;
			                    this.clockEqualNum = 0;
			                    this.clockDifferentNum = 0;
			                    this.isClockLeft = false;
			                    this.isClockRight = false;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelTransGuardContext extends ParserRuleContext {
		public TerminalNode OPEN_GUARD() { return getToken(UppaalParser.OPEN_GUARD, 0); }
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public LabelTransGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelTransGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTransGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTransGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTransGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTransGuardContext labelTransGuard() throws RecognitionException {
		LabelTransGuardContext _localctx = new LabelTransGuardContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_labelTransGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(OPEN_GUARD);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(911);
				guardExpr(0);
				}
			}

			setState(914);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelTransSyncInputContext extends ParserRuleContext {
		public TerminalNode OPEN_SYNC() { return getToken(UppaalParser.OPEN_SYNC, 0); }
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(UppaalParser.QUESTION, 0); }
		public LabelTransSyncInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelTransSyncInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTransSyncInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTransSyncInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTransSyncInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTransSyncInputContext labelTransSyncInput() throws RecognitionException {
		LabelTransSyncInputContext _localctx = new LabelTransSyncInputContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_labelTransSyncInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			match(OPEN_SYNC);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(917);
				expr(0);
				setState(918);
				match(QUESTION);
				}
			}

			setState(922);
			match(CLOSE_LABEL);
			}

			                         //flag to know if a transition is controllable (<expr> '?')
			                         this.isControllable = true;

			                         if(this.currentEnv.equals(this.envTarget) || this.currentEnv.equals("")){
			                            //Add to tmi array to remove transition on tmi mutants
			                            this.tmi.add(this.currentTransition);
			                         }


			                         //If has a synchro input remove from possible transition to make an output on tad mutants
			                         //due to a transition can not has two synchro labels
			                         this.transitionsTad.get(currentEnv).get(currentSource).remove(currentTarget);


			                         //if it has at least one incoming action, then a mutant will be created without the target location
			                         if(!this.initLocationId.equals(this.currentTarget)){
			                            this.locationsSmi.get(this.currentEnv).add(this.currentTarget);
			                         }
			                     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelTransSyncOutputContext extends ParserRuleContext {
		public TerminalNode OPEN_SYNC() { return getToken(UppaalParser.OPEN_SYNC, 0); }
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public LabelTransSyncOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelTransSyncOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTransSyncOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTransSyncOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTransSyncOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTransSyncOutputContext labelTransSyncOutput() throws RecognitionException {
		LabelTransSyncOutputContext _localctx = new LabelTransSyncOutputContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_labelTransSyncOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(926);
			match(OPEN_SYNC);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(927);
				expr(0);
				setState(928);
				match(EXCLAMATION);
				}
			}

			setState(932);
			match(CLOSE_LABEL);
			}

			                        //If has a synchro input remove from possible transition to make an output on tad mutants
			                        //due to a transition can not has two synchro labels
			                        this.transitionsTad.get(currentEnv).get(currentSource).remove(currentTarget);
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelTransContext extends ParserRuleContext {
		public LabelSelectContext labelSelect() {
			return getRuleContext(LabelSelectContext.class,0);
		}
		public LabelUpdateContext labelUpdate() {
			return getRuleContext(LabelUpdateContext.class,0);
		}
		public LabelCommentsContext labelComments() {
			return getRuleContext(LabelCommentsContext.class,0);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelTransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelTrans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelTrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelTrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelTrans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTransContext labelTrans() throws RecognitionException {
		LabelTransContext _localctx = new LabelTransContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_labelTrans);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SELECT:
				{
				setState(936);
				labelSelect();
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(937);
						misc();
						}
						} 
					}
					setState(942);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case OPEN_LBLTR:
				{
				setState(943);
				labelUpdate();
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(944);
						misc();
						}
						} 
					}
					setState(949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case OPEN_LBLCOM:
				{
				setState(950);
				labelComments();
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(951);
						misc();
						}
						} 
					}
					setState(956);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelUpdateContext extends ParserRuleContext {
		public TerminalNode OPEN_LBLTR() { return getToken(UppaalParser.OPEN_LBLTR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public LabelUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelUpdateContext labelUpdate() throws RecognitionException {
		LabelUpdateContext _localctx = new LabelUpdateContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_labelUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(OPEN_LBLTR);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(960);
				misc();
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966);
			expr(0);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(967);
				match(COMMA);
				setState(968);
				expr(0);
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelSelectContext extends ParserRuleContext {
		public TerminalNode OPEN_SELECT() { return getToken(UppaalParser.OPEN_SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public LabelSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelSelectContext labelSelect() throws RecognitionException {
		LabelSelectContext _localctx = new LabelSelectContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_labelSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(OPEN_SELECT);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(977);
				misc();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			selectList(0);
			setState(984);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		return selectList(0);
	}

	private SelectListContext selectList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectListContext _localctx = new SelectListContext(_ctx, _parentState);
		SelectListContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_selectList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(987);
			match(IDENTIFIER);
			setState(988);
			match(COLON);
			setState(989);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selectList);
					setState(991);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(992);
					match(COMMA);
					setState(993);
					match(IDENTIFIER);
					setState(994);
					match(COLON);
					setState(995);
					type();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LabelCommentsContext extends ParserRuleContext {
		public TerminalNode OPEN_LBLCOM() { return getToken(UppaalParser.OPEN_LBLCOM, 0); }
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode CLOSE_LABEL() { return getToken(UppaalParser.CLOSE_LABEL, 0); }
		public LabelCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelComments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterLabelComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitLabelComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitLabelComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelCommentsContext labelComments() throws RecognitionException {
		LabelCommentsContext _localctx = new LabelCommentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_labelComments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(OPEN_LBLCOM);
			setState(1002);
			anything();
			setState(1003);
			match(CLOSE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardExprContext extends ParserRuleContext {
		public GuardExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardExpr; }
	 
		public GuardExprContext() { }
		public void copyFrom(GuardExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumGuardContext extends GuardExprContext {
		public TerminalNode SUM() { return getToken(UppaalParser.SUM, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public GuardTypeContext guardType() {
			return getRuleContext(GuardTypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public SumGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSumGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSumGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSumGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisGuardContext extends GuardExprContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public ParenthesisGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterParenthesisGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitParenthesisGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitParenthesisGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseGuardContext extends GuardExprContext {
		public TerminalNode FALSE() { return getToken(UppaalParser.FALSE, 0); }
		public FalseGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFalseGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFalseGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFalseGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignGuardContext extends GuardExprContext {
		public Token assign;
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(UppaalParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(UppaalParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(UppaalParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(UppaalParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(UppaalParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(UppaalParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(UppaalParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(UppaalParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(UppaalParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(UppaalParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(UppaalParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(UppaalParser.ASSIGN_RSHIFT, 0); }
		public AssignGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterAssignGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitAssignGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitAssignGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotGuardContext extends GuardExprContext {
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode LOOKUP_OP() { return getToken(UppaalParser.LOOKUP_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public DotGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDotGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDotGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDotGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementGuardContext extends GuardExprContext {
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public DecrementGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDecrementGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDecrementGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDecrementGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryGuardContext extends GuardExprContext {
		public Token unary;
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(UppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(UppaalParser.NOT, 0); }
		public UnaryGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterUnaryGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitUnaryGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitUnaryGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonGuardContext extends GuardExprContext {
		public Token binary;
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(UppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(UppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(UppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(UppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(UppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(UppaalParser.GREATER, 0); }
		public ComparisonGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComparisonGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComparisonGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComparisonGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierGuardContext extends GuardExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public IdentifierGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIdentifierGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIdentifierGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIdentifierGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryGuardContext extends GuardExprContext {
		public Token binary;
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(UppaalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(UppaalParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(UppaalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(UppaalParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(UppaalParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(UppaalParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(UppaalParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(UppaalParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(UppaalParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(UppaalParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(UppaalParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(UppaalParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(UppaalParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(UppaalParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(UppaalParser.OR, 0); }
		public TerminalNode AND() { return getToken(UppaalParser.AND, 0); }
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode IMPLY() { return getToken(UppaalParser.IMPLY, 0); }
		public BinaryGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterBinaryGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitBinaryGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitBinaryGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatGuardContext extends GuardExprContext {
		public TerminalNode NAT() { return getToken(UppaalParser.NAT, 0); }
		public NatGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNatGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNatGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNatGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsGuardContext extends GuardExprContext {
		public TerminalNode EXISTS() { return getToken(UppaalParser.EXISTS, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public GuardTypeContext guardType() {
			return getRuleContext(GuardTypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public ExistsGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterExistsGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitExistsGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitExistsGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchGuardContext extends GuardExprContext {
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(UppaalParser.APOSTROPHE, 0); }
		public StopWatchGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterStopWatchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitStopWatchGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitStopWatchGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayGuardContext extends GuardExprContext {
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public ArrayGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterArrayGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitArrayGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitArrayGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallGuardContext extends GuardExprContext {
		public TerminalNode FORALL() { return getToken(UppaalParser.FORALL, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public GuardTypeContext guardType() {
			return getRuleContext(GuardTypeContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public ForallGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterForallGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitForallGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitForallGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardDecrementContext extends GuardExprContext {
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(UppaalParser.DECREMENT, 0); }
		public GuardDecrementContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueGuardContext extends GuardExprContext {
		public TerminalNode TRUE() { return getToken(UppaalParser.TRUE, 0); }
		public TrueGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTrueGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTrueGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTrueGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfGuardContext extends GuardExprContext {
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(UppaalParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(UppaalParser.COLON, 0); }
		public IfGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIfGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIfGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIfGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncGuardContext extends GuardExprContext {
		public TerminalNode IDENTIFIER() { return getToken(UppaalParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(UppaalParser.LEFT_PARENTHESIS, 0); }
		public GuardArgumentsContext guardArguments() {
			return getRuleContext(GuardArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(UppaalParser.RIGHT_PARENTHESIS, 0); }
		public FuncGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFuncGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFuncGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFuncGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementGuardContext extends GuardExprContext {
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public IncrementGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterIncrementGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitIncrementGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitIncrementGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleGuardContext extends GuardExprContext {
		public TerminalNode POINT() { return getToken(UppaalParser.POINT, 0); }
		public DoubleGuardContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterDoubleGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitDoubleGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitDoubleGuard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardIncrementContext extends GuardExprContext {
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(UppaalParser.INCREMENT, 0); }
		public GuardIncrementContext(GuardExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardExprContext guardExpr() throws RecognitionException {
		return guardExpr(0);
	}

	private GuardExprContext guardExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardExprContext _localctx = new GuardExprContext(_ctx, _parentState);
		GuardExprContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_guardExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1006);
				match(IDENTIFIER);

				                this.isClockRight |= this.clockEnv.get(this.currentEnv).contains(new ClockType(_localctx.getText()));
				                this.isClockRight |= this.clockEnv.get("Global").contains(new ClockType(_localctx.getText()));
				            
				}
				break;
			case 2:
				{
				_localctx = new NatGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1008);
				match(NAT);
				}
				break;
			case 3:
				{
				_localctx = new DoubleGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				match(POINT);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1010);
				match(LEFT_PARENTHESIS);
				setState(1011);
				guardExpr(0);
				setState(1012);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new IncrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1014);
				match(INCREMENT);
				setState(1015);
				guardExpr(15);
				}
				break;
			case 6:
				{
				_localctx = new DecrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1016);
				match(DECREMENT);
				setState(1017);
				guardExpr(13);
				}
				break;
			case 7:
				{
				_localctx = new UnaryGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1018);
				((UnaryGuardContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (ADD - 95)) | (1L << (SUB - 95)) | (1L << (EXCLAMATION - 95)) | (1L << (NOT - 95)))) != 0)) ) {
					((UnaryGuardContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1019);
				guardExpr(11);
				}
				break;
			case 8:
				{
				_localctx = new FuncGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1020);
				match(IDENTIFIER);
				setState(1021);
				match(LEFT_PARENTHESIS);
				setState(1022);
				guardArguments();
				setState(1023);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 9:
				{
				_localctx = new ForallGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1025);
				match(FORALL);
				setState(1026);
				match(LEFT_PARENTHESIS);
				setState(1027);
				match(IDENTIFIER);
				setState(1028);
				match(COLON);
				setState(1029);
				guardType();
				setState(1030);
				match(RIGHT_PARENTHESIS);
				setState(1031);
				guardExpr(5);
				}
				break;
			case 10:
				{
				_localctx = new ExistsGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1033);
				match(EXISTS);
				setState(1034);
				match(LEFT_PARENTHESIS);
				setState(1035);
				match(IDENTIFIER);
				setState(1036);
				match(COLON);
				setState(1037);
				guardType();
				setState(1038);
				match(RIGHT_PARENTHESIS);
				setState(1039);
				guardExpr(4);
				}
				break;
			case 11:
				{
				_localctx = new SumGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1041);
				match(SUM);
				setState(1042);
				match(LEFT_PARENTHESIS);
				setState(1043);
				match(IDENTIFIER);
				setState(1044);
				match(COLON);
				setState(1045);
				guardType();
				setState(1046);
				match(RIGHT_PARENTHESIS);
				setState(1047);
				guardExpr(3);
				}
				break;
			case 12:
				{
				_localctx = new TrueGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1049);
				match(TRUE);
				}
				break;
			case 13:
				{
				_localctx = new FalseGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1050);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1085);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new AssignGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1053);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1054);
						((AssignGuardContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ASSIGN - 83)) | (1L << (ASSIGN_COLON - 83)) | (1L << (ASSIGN_ADD - 83)) | (1L << (ASSIGN_SUB - 83)) | (1L << (ASSIGN_MUL - 83)) | (1L << (ASSIGN_DIV - 83)) | (1L << (ASSIGN_PERCENT - 83)) | (1L << (ASSIGN_OR - 83)) | (1L << (ASSIGN_AND - 83)) | (1L << (ASSIGN_XOR - 83)) | (1L << (ASSIGN_LSHIFT - 83)) | (1L << (ASSIGN_RSHIFT - 83)))) != 0)) ) {
							((AssignGuardContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1055);
						guardExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1056);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");

						                              this.isClockLeft = this.isClockRight;
						                              this.isClockRight = false;
						                          
						setState(1058);
						((ComparisonGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (LESS - 99)) | (1L << (LESSEQ - 99)) | (1L << (COMPARE - 99)) | (1L << (DIFFERENT - 99)) | (1L << (GREATEREQ - 99)) | (1L << (GREATER - 99)))) != 0)) ) {
							((ComparisonGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1059);
						guardExpr(11);

						                              String operator = ((ComparisonGuardContext) _localctx).binary.getText();

						                              if(this.isClockLeft ^ this.isClockRight){
						                                  if(this.isClockLeft){
						                                      if(operator.equals("&lt;") ||operator.equals("&lt;=")){
						                                          this.clockLessNum++;
						                                      }
						                                      if(operator.equals("&gt;") ||operator.equals("&gt;=")){
						                                          this.clockGreaterNum++;
						                                      }

						                                  }
						                                  //then this.isClockRight is true
						                                  else {
						                                      if(operator.equals("&gt;") ||operator.equals("&gt;=")){
						                                          this.clockLessNum++;
						                                      }
						                                      if(operator.equals("&lt;") ||operator.equals("&lt;=")){
						                                          this.clockGreaterNum++;
						                                      }
						                                  }
						                                  if(operator.equals("==")){
						                                      this.clockEqualNum++;
						                                  }
						                                  if(operator.equals("!=")){
						                                      this.clockDifferentNum++;
						                                  }
						                              }
						                              this.isClockLeft = false;
						                              this.isClockRight = false;
						                          
						}
						break;
					case 3:
						{
						_localctx = new BinaryGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1062);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1063);
						((BinaryGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (COMMA - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (MUL - 79)) | (1L << (DIV - 79)) | (1L << (PERCENT - 79)) | (1L << (BITAND - 79)) | (1L << (BITOR - 79)) | (1L << (BITXOR - 79)) | (1L << (LSHIFT - 79)) | (1L << (RSHIFT - 79)) | (1L << (AND_SYMBOL - 79)) | (1L << (OR_SYMBOL - 79)) | (1L << (MINIMUM - 79)) | (1L << (MAXIMUM - 79)) | (1L << (OR - 79)) | (1L << (AND - 79)) | (1L << (IMPLY - 79)))) != 0)) ) {
							((BinaryGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1064);
						guardExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1065);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1066);
						match(QUESTION);
						setState(1067);
						guardExpr(0);
						setState(1068);
						match(COLON);
						setState(1069);
						guardExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1071);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1072);
						match(LEFT_BRACKET);
						setState(1073);
						guardExpr(0);
						setState(1074);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1076);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1077);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new GuardIncrementContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1078);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1079);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new GuardDecrementContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1080);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1081);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1082);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1083);
						match(LOOKUP_OP);
						setState(1084);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GuardArgumentsContext extends ParserRuleContext {
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UppaalParser.COMMA, i);
		}
		public GuardArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardArgumentsContext guardArguments() throws RecognitionException {
		GuardArgumentsContext _localctx = new GuardArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_guardArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NAT - 62)) | (1L << (POINT - 62)) | (1L << (LEFT_PARENTHESIS - 62)) | (1L << (INCREMENT - 62)) | (1L << (DECREMENT - 62)) | (1L << (ADD - 62)) | (1L << (SUB - 62)) | (1L << (EXCLAMATION - 62)) | (1L << (NOT - 62)) | (1L << (FORALL - 62)) | (1L << (EXISTS - 62)) | (1L << (SUM - 62)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (TRUE - 138)) | (1L << (FALSE - 138)) | (1L << (IDENTIFIER - 138)))) != 0)) {
				{
				setState(1090);
				guardExpr(0);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1091);
					match(COMMA);
					setState(1092);
					guardExpr(0);
					}
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardTypeContext extends ParserRuleContext {
		public GuardTypeIdContext guardTypeId() {
			return getRuleContext(GuardTypeIdContext.class,0);
		}
		public TerminalNode META() { return getToken(UppaalParser.META, 0); }
		public TerminalNode CONST() { return getToken(UppaalParser.CONST, 0); }
		public GuardTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardTypeContext guardType() throws RecognitionException {
		GuardTypeContext _localctx = new GuardTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_guardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(1100);
				_la = _input.LA(1);
				if ( !(_la==META || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1103);
			guardTypeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardTypeIdContext extends ParserRuleContext {
		public GuardTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardTypeId; }
	 
		public GuardTypeIdContext() { }
		public void copyFrom(GuardTypeIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GuardTypeIntDomainContext extends GuardTypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public List<GuardExprContext> guardExpr() {
			return getRuleContexts(GuardExprContext.class);
		}
		public GuardExprContext guardExpr(int i) {
			return getRuleContext(GuardExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(UppaalParser.COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public GuardTypeIntDomainContext(GuardTypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeIntDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeIntDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeIntDomain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardTypeScalarContext extends GuardTypeIdContext {
		public TerminalNode SCALAR() { return getToken(UppaalParser.SCALAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(UppaalParser.LEFT_BRACKET, 0); }
		public GuardExprContext guardExpr() {
			return getRuleContext(GuardExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(UppaalParser.RIGHT_BRACKET, 0); }
		public GuardTypeScalarContext(GuardTypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardTypeIntContext extends GuardTypeIdContext {
		public TerminalNode INT() { return getToken(UppaalParser.INT, 0); }
		public GuardTypeIntContext(GuardTypeIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterGuardTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitGuardTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitGuardTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardTypeIdContext guardTypeId() throws RecognitionException {
		GuardTypeIdContext _localctx = new GuardTypeIdContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_guardTypeId);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new GuardTypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				match(INT);
				}
				break;
			case 2:
				_localctx = new GuardTypeIntDomainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(INT);
				setState(1107);
				match(LEFT_BRACKET);
				setState(1108);
				guardExpr(0);
				setState(1109);
				match(COMMA);
				setState(1110);
				guardExpr(0);
				setState(1111);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				_localctx = new GuardTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				match(SCALAR);
				setState(1114);
				match(LEFT_BRACKET);
				setState(1115);
				guardExpr(0);
				setState(1116);
				match(RIGHT_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode SOURCE() { return getToken(UppaalParser.SOURCE, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1120);
			match(OPEN);
			setState(1121);
			match(SOURCE);
			setState(1122);
			match(REF);
			setState(1123);
			match(EQUALS);
			setState(1124);
			match(STRING);
			setState(1125);
			match(SLASH_CLOSE);
			}

			                    this.currentSource = _localctx.STRING().getText();
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode TARGET() { return getToken(UppaalParser.TARGET, 0); }
		public TerminalNode REF() { return getToken(UppaalParser.REF, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(OPEN);
			setState(1130);
			match(TARGET);
			setState(1131);
			match(REF);
			setState(1132);
			match(EQUALS);
			setState(1133);
			match(STRING);
			setState(1134);
			match(SLASH_CLOSE);

			                    this.currentTarget = _localctx.STRING().getText();
			                    this.transitionsTadNoSync.get(currentEnv).get(currentSource).remove(currentTarget);
			                    this.graphs.get(currentEnv).addEdge(currentSource, currentTarget);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NailContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public TerminalNode NAIL() { return getToken(UppaalParser.NAIL, 0); }
		public TerminalNode SLASH_CLOSE() { return getToken(UppaalParser.SLASH_CLOSE, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public NailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterNail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitNail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitNail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NailContext nail() throws RecognitionException {
		NailContext _localctx = new NailContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(OPEN);
			setState(1138);
			match(NAIL);
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(1139);
				coordinate();
				}
			}

			setState(1142);
			match(SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> SYSTEM() { return getTokens(UppaalParser.SYSTEM); }
		public TerminalNode SYSTEM(int i) {
			return getToken(UppaalParser.SYSTEM, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(OPEN);
			setState(1145);
			match(SYSTEM);
			setState(1146);
			match(CLOSE);
			setState(1147);
			anything();
			setState(1148);
			match(OPEN_SLASH);
			setState(1149);
			match(SYSTEM);
			setState(1150);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueriesContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERIES() { return getTokens(UppaalParser.QUERIES); }
		public TerminalNode QUERIES(int i) {
			return getToken(UppaalParser.QUERIES, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(OPEN);
			setState(1153);
			match(QUERIES);
			setState(1154);
			match(CLOSE);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1155);
				misc();
				}
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(1161);
				query();
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1162);
					misc();
					}
					}
					setState(1167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1173);
			match(OPEN_SLASH);
			setState(1174);
			match(QUERIES);
			setState(1175);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERY() { return getTokens(UppaalParser.QUERY); }
		public TerminalNode QUERY(int i) {
			return getToken(UppaalParser.QUERY, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(OPEN);
			setState(1178);
			match(QUERY);
			setState(1179);
			match(CLOSE);
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1180);
				misc();
				}
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1186);
				formula();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1187);
					misc();
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1195);
				comment();
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1196);
					misc();
					}
					}
					setState(1201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1204);
			match(OPEN_SLASH);
			setState(1205);
			match(QUERY);
			setState(1206);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> FORMULA() { return getTokens(UppaalParser.FORMULA); }
		public TerminalNode FORMULA(int i) {
			return getToken(UppaalParser.FORMULA, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(OPEN);
			setState(1209);
			match(FORMULA);
			setState(1210);
			match(CLOSE);
			setState(1211);
			anything();
			setState(1212);
			match(OPEN_SLASH);
			setState(1213);
			match(FORMULA);
			setState(1214);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> QUERY_COMMENT() { return getTokens(UppaalParser.QUERY_COMMENT); }
		public TerminalNode QUERY_COMMENT(int i) {
			return getToken(UppaalParser.QUERY_COMMENT, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(UppaalParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(UppaalParser.CLOSE, i);
		}
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public TerminalNode OPEN_SLASH() { return getToken(UppaalParser.OPEN_SLASH, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UppaalParserListener ) ((UppaalParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UppaalParserVisitor ) return ((UppaalParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(OPEN);
			setState(1217);
			match(QUERY_COMMENT);
			setState(1218);
			match(CLOSE);
			setState(1219);
			anything();
			setState(1220);
			match(OPEN_SLASH);
			setState(1221);
			match(QUERY_COMMENT);
			setState(1222);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 38:
			return chanExpr_sempred((ChanExprContext)_localctx, predIndex);
		case 57:
			return selectList_sempred((SelectListContext)_localctx, predIndex);
		case 59:
			return guardExpr_sempred((GuardExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean chanExpr_sempred(ChanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean selectList_sempred(SelectListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean guardExpr_sempred(GuardExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 19);
		case 17:
			return precpred(_ctx, 18);
		case 18:
			return precpred(_ctx, 16);
		case 19:
			return precpred(_ctx, 14);
		case 20:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008c\u04c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0001\u0000\u0003\u0000\u0090\b\u0000\u0001\u0000\u0005"+
		"\u0000\u0093\b\u0000\n\u0000\f\u0000\u0096\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u009a\b\u0000\n\u0000\f\u0000\u009d\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u00a1\b\u0001\n\u0001\f\u0001\u00a4\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0003\u0002\u00a9\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b0\b\u0002\u0001\u0002"+
		"\u0003\u0002\u00b3\b\u0002\u0005\u0002\u00b5\b\u0002\n\u0002\f\u0002\u00b8"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00bd\b\u0003"+
		"\n\u0003\f\u0003\u00c0\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00cb\b\u0003\n\u0003\f\u0003\u00ce\t\u0003\u0001\u0003\u0003\u0003"+
		"\u00d1\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00e1\b\b\n\b\f\b\u00e4\t\b\u0001\b\u0001\b"+
		"\u0005\b\u00e8\b\b\n\b\f\b\u00eb\t\b\u0001\b\u0001\b\u0005\b\u00ef\b\b"+
		"\n\b\f\b\u00f2\t\b\u0004\b\u00f4\b\b\u000b\b\f\b\u00f5\u0001\b\u0001\b"+
		"\u0005\b\u00fa\b\b\n\b\f\b\u00fd\t\b\u0001\b\u0001\b\u0005\b\u0101\b\b"+
		"\n\b\f\b\u0104\t\b\u0003\b\u0106\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0005\n\u0111\b\n\n\n\f\n\u0114\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011a\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0144\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0168\b\f\n\f\f\f\u016b\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u0170\b\r\n\r\f\r\u0173\t\r\u0003\r\u0175"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u017b"+
		"\b\u000e\n\u000e\f\u000e\u017e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0003\u000f\u0185\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u018d\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u01a4\b\u0011\u000b\u0011"+
		"\f\u0011\u01a5\u0001\u0011\u0001\u0011\u0003\u0011\u01aa\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01b0\b\u0012\n"+
		"\u0012\f\u0012\u01b3\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01b9\b\u0013\n\u0013\f\u0013\u01bc\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01c6\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u01ca\b\u0015\n\u0015\f\u0015\u01cd\t\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01d1\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01d8\b\u0016\n\u0016\f\u0016\u01db\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01df\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01e6\b\u0017\n\u0017\f\u0017\u01e9"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01f9\b\u0019\n\u0019\f\u0019"+
		"\u01fc\t\u0019\u0003\u0019\u01fe\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0202\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0209\b\u001b\n\u001b\f\u001b\u020c\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u021b\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0244"+
		"\b!\u0001\"\u0001\"\u0003\"\u0248\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u0252\b#\n#\f#\u0255\t#\u0001#\u0001#\u0001"+
		"$\u0001$\u0003$\u025b\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u0267\b&\n&\f&\u026a\t&\u0001\'\u0003\'"+
		"\u026d\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0273\b\'\u0001\'\u0003"+
		"\'\u0276\b\'\u0005\'\u0278\b\'\n\'\f\'\u027b\t\'\u0001(\u0001(\u0001("+
		"\u0001(\u0005(\u0281\b(\n(\f(\u0284\t(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0005)\u028d\b)\n)\f)\u0290\t)\u0003)\u0292\b)\u0001)"+
		"\u0001)\u0001)\u0005)\u0297\b)\n)\f)\u029a\t)\u0003)\u029c\b)\u0001)\u0001"+
		")\u0001)\u0005)\u02a1\b)\n)\f)\u02a4\t)\u0003)\u02a6\b)\u0001)\u0001)"+
		"\u0005)\u02aa\b)\n)\f)\u02ad\t)\u0001)\u0001)\u0005)\u02b1\b)\n)\f)\u02b4"+
		"\t)\u0004)\u02b6\b)\u000b)\f)\u02b7\u0001)\u0001)\u0001)\u0005)\u02bd"+
		"\b)\n)\f)\u02c0\t)\u0001)\u0001)\u0001)\u0005)\u02c5\b)\n)\f)\u02c8\t"+
		")\u0005)\u02ca\b)\n)\f)\u02cd\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u02e9\b-\u0001-\u0001-\u0005-\u02ed\b-\n-\f-\u02f0\t-\u0001-"+
		"\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u02fc\b.\u0001.\u0003.\u02ff\b.\u0001.\u0001.\u0005.\u0303\b.\n.\f."+
		"\u0306\t.\u0001.\u0001.\u0005.\u030a\b.\n.\f.\u030d\t.\u0003.\u030f\b"+
		".\u0001.\u0001.\u0005.\u0313\b.\n.\f.\u0316\t.\u0003.\u0318\b.\u0001."+
		"\u0001.\u0001.\u0001.\u0005.\u031e\b.\n.\f.\u0321\t.\u0003.\u0323\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u032c\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00051\u033a\b1\n1\f1\u033d\t1\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00032\u0345\b2\u00012\u00012\u00012\u00052\u034a\b2\n2\f2\u034d\t2"+
		"\u00012\u00012\u00052\u0351\b2\n2\f2\u0354\t2\u00012\u00012\u00052\u0358"+
		"\b2\n2\f2\u035b\t2\u00012\u00012\u00052\u035f\b2\n2\f2\u0362\t2\u0001"+
		"2\u00012\u00052\u0366\b2\n2\f2\u0369\t2\u00012\u00012\u00052\u036d\b2"+
		"\n2\f2\u0370\t2\u00012\u00012\u00052\u0374\b2\n2\f2\u0377\t2\u00052\u0379"+
		"\b2\n2\f2\u037c\t2\u00012\u00012\u00052\u0380\b2\n2\f2\u0383\t2\u0005"+
		"2\u0385\b2\n2\f2\u0388\t2\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00033\u0391\b3\u00013\u00013\u00014\u00014\u00014\u00014\u00034\u0399"+
		"\b4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00035\u03a3"+
		"\b5\u00015\u00015\u00015\u00015\u00016\u00016\u00056\u03ab\b6\n6\f6\u03ae"+
		"\t6\u00016\u00016\u00056\u03b2\b6\n6\f6\u03b5\t6\u00016\u00016\u00056"+
		"\u03b9\b6\n6\f6\u03bc\t6\u00036\u03be\b6\u00017\u00017\u00057\u03c2\b"+
		"7\n7\f7\u03c5\t7\u00017\u00017\u00017\u00057\u03ca\b7\n7\f7\u03cd\t7\u0001"+
		"7\u00017\u00018\u00018\u00058\u03d3\b8\n8\f8\u03d6\t8\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00059\u03e5\b9\n9\f9\u03e8\t9\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u041c\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u043e"+
		"\b;\n;\f;\u0441\t;\u0001<\u0001<\u0001<\u0005<\u0446\b<\n<\f<\u0449\t"+
		"<\u0003<\u044b\b<\u0001=\u0003=\u044e\b=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u045f\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0003A\u0475\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0005C\u0485"+
		"\bC\nC\fC\u0488\tC\u0001C\u0001C\u0005C\u048c\bC\nC\fC\u048f\tC\u0005"+
		"C\u0491\bC\nC\fC\u0494\tC\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0005D\u049e\bD\nD\fD\u04a1\tD\u0001D\u0001D\u0005D\u04a5\bD"+
		"\nD\fD\u04a8\tD\u0003D\u04aa\bD\u0001D\u0001D\u0005D\u04ae\bD\nD\fD\u04b1"+
		"\tD\u0003D\u04b3\bD\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0000\u0004\u0018LrvG\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u0000\f\u0001\u0000\u0004\u0005\u0002\u0000\u0006\u0006\u0012"+
		"\u0012\u0003\u0000\u0001\u0001\u0006\u000677\u0001\u0000_b\u0001\u0000"+
		"S^\u0001\u0000ch\u0003\u0000OO_`iw\u0001\u0000ST\u0002\u0000OOcc\u0001"+
		"\u0000\u001e\u001f\u0001\u0000 !\u0001\u0000\u0080\u0081\u0536\u0000\u008f"+
		"\u0001\u0000\u0000\u0000\u0002\u009e\u0001\u0000\u0000\u0000\u0004\u00a8"+
		"\u0001\u0000\u0000\u0000\u0006\u00d0\u0001\u0000\u0000\u0000\b\u00d2\u0001"+
		"\u0000\u0000\u0000\n\u00d4\u0001\u0000\u0000\u0000\f\u00d8\u0001\u0000"+
		"\u0000\u0000\u000e\u00da\u0001\u0000\u0000\u0000\u0010\u00dc\u0001\u0000"+
		"\u0000\u0000\u0012\u010b\u0001\u0000\u0000\u0000\u0014\u0112\u0001\u0000"+
		"\u0000\u0000\u0016\u0119\u0001\u0000\u0000\u0000\u0018\u0143\u0001\u0000"+
		"\u0000\u0000\u001a\u0174\u0001\u0000\u0000\u0000\u001c\u0176\u0001\u0000"+
		"\u0000\u0000\u001e\u0184\u0001\u0000\u0000\u0000 \u018c\u0001\u0000\u0000"+
		"\u0000\"\u01a9\u0001\u0000\u0000\u0000$\u01ab\u0001\u0000\u0000\u0000"+
		"&\u01b6\u0001\u0000\u0000\u0000(\u01c5\u0001\u0000\u0000\u0000*\u01c7"+
		"\u0001\u0000\u0000\u0000,\u01de\u0001\u0000\u0000\u0000.\u01e0\u0001\u0000"+
		"\u0000\u00000\u01ec\u0001\u0000\u0000\u00002\u01fd\u0001\u0000\u0000\u0000"+
		"4\u01ff\u0001\u0000\u0000\u00006\u0205\u0001\u0000\u0000\u00008\u021a"+
		"\u0001\u0000\u0000\u0000:\u021c\u0001\u0000\u0000\u0000<\u0226\u0001\u0000"+
		"\u0000\u0000>\u022e\u0001\u0000\u0000\u0000@\u0234\u0001\u0000\u0000\u0000"+
		"B\u023c\u0001\u0000\u0000\u0000D\u0245\u0001\u0000\u0000\u0000F\u024b"+
		"\u0001\u0000\u0000\u0000H\u025a\u0001\u0000\u0000\u0000J\u025c\u0001\u0000"+
		"\u0000\u0000L\u025e\u0001\u0000\u0000\u0000N\u026c\u0001\u0000\u0000\u0000"+
		"P\u027c\u0001\u0000\u0000\u0000R\u0291\u0001\u0000\u0000\u0000T\u02d0"+
		"\u0001\u0000\u0000\u0000V\u02d4\u0001\u0000\u0000\u0000X\u02db\u0001\u0000"+
		"\u0000\u0000Z\u02e2\u0001\u0000\u0000\u0000\\\u02f5\u0001\u0000\u0000"+
		"\u0000^\u0328\u0001\u0000\u0000\u0000`\u0333\u0001\u0000\u0000\u0000b"+
		"\u0337\u0001\u0000\u0000\u0000d\u0341\u0001\u0000\u0000\u0000f\u038e\u0001"+
		"\u0000\u0000\u0000h\u0394\u0001\u0000\u0000\u0000j\u039e\u0001\u0000\u0000"+
		"\u0000l\u03bd\u0001\u0000\u0000\u0000n\u03bf\u0001\u0000\u0000\u0000p"+
		"\u03d0\u0001\u0000\u0000\u0000r\u03da\u0001\u0000\u0000\u0000t\u03e9\u0001"+
		"\u0000\u0000\u0000v\u041b\u0001\u0000\u0000\u0000x\u044a\u0001\u0000\u0000"+
		"\u0000z\u044d\u0001\u0000\u0000\u0000|\u045e\u0001\u0000\u0000\u0000~"+
		"\u0460\u0001\u0000\u0000\u0000\u0080\u0469\u0001\u0000\u0000\u0000\u0082"+
		"\u0471\u0001\u0000\u0000\u0000\u0084\u0478\u0001\u0000\u0000\u0000\u0086"+
		"\u0480\u0001\u0000\u0000\u0000\u0088\u0499\u0001\u0000\u0000\u0000\u008a"+
		"\u04b8\u0001\u0000\u0000\u0000\u008c\u04c0\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0003\u0002\u0001\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0094\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0003\u000e\u0007\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u009b\u0003\u0010\b\u0000\u0098\u009a"+
		"\u0003\u000e\u0007\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u0001\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a2\u0005\u0011\u0000\u0000\u009f\u00a1"+
		"\u0003\n\u0005\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u00051\u0000\u0000\u00a6\u0003\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0003\f\u0006\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b6\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b0\u0003\u0006\u0003\u0000\u00ab\u00b0\u0003\b\u0004\u0000"+
		"\u00ac\u00b0\u0005\u0002\u0000\u0000\u00ad\u00b0\u00057\u0000\u0000\u00ae"+
		"\u00b0\u0005\u0001\u0000\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00af"+
		"\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\f\u0006\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u0005\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000f\u0000\u0000\u00ba\u00be"+
		"\u00055\u0000\u0000\u00bb\u00bd\u0003\n\u0005\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"0\u0000\u0000\u00c2\u00c3\u0003\u0004\u0002\u0000\u00c3\u00c4\u0005\u0010"+
		"\u0000\u0000\u00c4\u00c5\u00055\u0000\u0000\u00c5\u00c6\u00050\u0000\u0000"+
		"\u00c6\u00d1\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u000f\u0000\u0000"+
		"\u00c8\u00cc\u00055\u0000\u0000\u00c9\u00cb\u0003\n\u0005\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u00052\u0000\u0000\u00d0\u00b9\u0001\u0000\u0000\u0000\u00d0\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d1\u0007\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0007\u0000\u0000\u0000\u00d3\t\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"5\u0000\u0000\u00d5\u00d6\u00053\u0000\u0000\u00d6\u00d7\u00054\u0000"+
		"\u0000\u00d7\u000b\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000"+
		"\u0000\u00d9\r\u0001\u0000\u0000\u0000\u00da\u00db\u0007\u0002\u0000\u0000"+
		"\u00db\u000f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000"+
		"\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00e2\u00050\u0000\u0000\u00df"+
		"\u00e1\u0003\u000e\u0007\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e9\u0003\u0012\t\u0000\u00e6\u00e8"+
		"\u0003\u000e\u0007\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00f3\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f0\u0003P(\u0000\u00ed\u00ef\u0003\u000e"+
		"\u0007\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ec\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fb\u0003\u0084"+
		"B\u0000\u00f8\u00fa\u0003\u000e\u0007\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0105\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0003\u0086C\u0000"+
		"\u00ff\u0101\u0003\u000e\u0007\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u00fe\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005\u0010\u0000\u0000\u0108\u0109\u0005\u0013\u0000\u0000"+
		"\u0109\u010a\u00050\u0000\u0000\u010a\u0011\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\r\u0000\u0000\u010c\u010d\u0003\u0014\n\u0000\u010d\u010e"+
		"\u0005;\u0000\u0000\u010e\u0013\u0001\u0000\u0000\u0000\u010f\u0111\u0003"+
		"\u0016\u000b\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0015\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u011a\u0003\u001c\u000e\u0000\u0116\u011a\u0003"+
		".\u0017\u0000\u0117\u011a\u00030\u0018\u0000\u0118\u011a\u0003F#\u0000"+
		"\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u0017\u0001\u0000\u0000\u0000\u011b\u011c\u0006\f\uffff\uffff\u0000"+
		"\u011c\u0144\u0005\u008c\u0000\u0000\u011d\u0144\u0005>\u0000\u0000\u011e"+
		"\u0144\u0005?\u0000\u0000\u011f\u0120\u0005I\u0000\u0000\u0120\u0121\u0003"+
		"\u0018\f\u0000\u0121\u0122\u0005J\u0000\u0000\u0122\u0144\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0005Q\u0000\u0000\u0124\u0144\u0003\u0018\f"+
		"\u000f\u0125\u0126\u0005R\u0000\u0000\u0126\u0144\u0003\u0018\f\r\u0127"+
		"\u0128\u0007\u0003\u0000\u0000\u0128\u0144\u0003\u0018\f\u000b\u0129\u012a"+
		"\u0005{\u0000\u0000\u012a\u012b\u0005I\u0000\u0000\u012b\u012c\u0005\u008c"+
		"\u0000\u0000\u012c\u012d\u0005y\u0000\u0000\u012d\u012e\u0003\u001e\u000f"+
		"\u0000\u012e\u012f\u0005J\u0000\u0000\u012f\u0130\u0003\u0018\f\u0005"+
		"\u0130\u0144\u0001\u0000\u0000\u0000\u0131\u0132\u0005|\u0000\u0000\u0132"+
		"\u0133\u0005I\u0000\u0000\u0133\u0134\u0005\u008c\u0000\u0000\u0134\u0135"+
		"\u0005y\u0000\u0000\u0135\u0136\u0003\u001e\u000f\u0000\u0136\u0137\u0005"+
		"J\u0000\u0000\u0137\u0138\u0003\u0018\f\u0004\u0138\u0144\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005}\u0000\u0000\u013a\u013b\u0005I\u0000\u0000"+
		"\u013b\u013c\u0005\u008c\u0000\u0000\u013c\u013d\u0005y\u0000\u0000\u013d"+
		"\u013e\u0003\u001e\u000f\u0000\u013e\u013f\u0005J\u0000\u0000\u013f\u0140"+
		"\u0003\u0018\f\u0003\u0140\u0144\u0001\u0000\u0000\u0000\u0141\u0144\u0005"+
		"\u008a\u0000\u0000\u0142\u0144\u0005\u008b\u0000\u0000\u0143\u011b\u0001"+
		"\u0000\u0000\u0000\u0143\u011d\u0001\u0000\u0000\u0000\u0143\u011e\u0001"+
		"\u0000\u0000\u0000\u0143\u011f\u0001\u0000\u0000\u0000\u0143\u0123\u0001"+
		"\u0000\u0000\u0000\u0143\u0125\u0001\u0000\u0000\u0000\u0143\u0127\u0001"+
		"\u0000\u0000\u0000\u0143\u0129\u0001\u0000\u0000\u0000\u0143\u0131\u0001"+
		"\u0000\u0000\u0000\u0143\u0139\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0169\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\n\f\u0000\u0000\u0146\u0147\u0007\u0004"+
		"\u0000\u0000\u0147\u0168\u0003\u0018\f\r\u0148\u0149\n\n\u0000\u0000\u0149"+
		"\u014a\u0007\u0005\u0000\u0000\u014a\u0168\u0003\u0018\f\u000b\u014b\u014c"+
		"\n\t\u0000\u0000\u014c\u014d\u0007\u0006\u0000\u0000\u014d\u0168\u0003"+
		"\u0018\f\n\u014e\u014f\n\b\u0000\u0000\u014f\u0150\u0005x\u0000\u0000"+
		"\u0150\u0151\u0003\u0018\f\u0000\u0151\u0152\u0005y\u0000\u0000\u0152"+
		"\u0153\u0003\u0018\f\t\u0153\u0168\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\n\u0013\u0000\u0000\u0155\u0156\u0005K\u0000\u0000\u0156\u0157\u0003"+
		"\u0018\f\u0000\u0157\u0158\u0005L\u0000\u0000\u0158\u0168\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\n\u0012\u0000\u0000\u015a\u0168\u0005H\u0000"+
		"\u0000\u015b\u015c\n\u0010\u0000\u0000\u015c\u0168\u0005Q\u0000\u0000"+
		"\u015d\u015e\n\u000e\u0000\u0000\u015e\u0168\u0005R\u0000\u0000\u015f"+
		"\u0160\n\u0007\u0000\u0000\u0160\u0161\u0005z\u0000\u0000\u0161\u0168"+
		"\u0005\u008c\u0000\u0000\u0162\u0163\n\u0006\u0000\u0000\u0163\u0164\u0005"+
		"I\u0000\u0000\u0164\u0165\u0003\u001a\r\u0000\u0165\u0166\u0005J\u0000"+
		"\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0145\u0001\u0000\u0000"+
		"\u0000\u0167\u0148\u0001\u0000\u0000\u0000\u0167\u014b\u0001\u0000\u0000"+
		"\u0000\u0167\u014e\u0001\u0000\u0000\u0000\u0167\u0154\u0001\u0000\u0000"+
		"\u0000\u0167\u0159\u0001\u0000\u0000\u0000\u0167\u015b\u0001\u0000\u0000"+
		"\u0000\u0167\u015d\u0001\u0000\u0000\u0000\u0167\u015f\u0001\u0000\u0000"+
		"\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u0019\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016c\u0171\u0003\u0018\f\u0000\u016d\u016e\u0005O\u0000\u0000"+
		"\u016e\u0170\u0003\u0018\f\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170"+
		"\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u016c\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u001b\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0003\u001e\u000f\u0000\u0177\u017c\u0003*\u0015\u0000\u0178\u0179"+
		"\u0005O\u0000\u0000\u0179\u017b\u0003*\u0015\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0005P\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0006\u000e\uffff"+
		"\uffff\u0000\u0182\u001d\u0001\u0000\u0000\u0000\u0183\u0185\u0003 \u0010"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0003\"\u0011\u0000"+
		"\u0187\u001f\u0001\u0000\u0000\u0000\u0188\u018d\u0005~\u0000\u0000\u0189"+
		"\u018d\u0005\u007f\u0000\u0000\u018a\u018d\u0005\u0080\u0000\u0000\u018b"+
		"\u018d\u0005\u0081\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018d!\u0001\u0000\u0000\u0000\u018e\u01aa"+
		"\u0005\u008c\u0000\u0000\u018f\u01aa\u0005\u0083\u0000\u0000\u0190\u01aa"+
		"\u0005\u0084\u0000\u0000\u0191\u01aa\u0005\u0085\u0000\u0000\u0192\u01aa"+
		"\u0005\u0086\u0000\u0000\u0193\u01aa\u0005\u0087\u0000\u0000\u0194\u0195"+
		"\u0005\u0083\u0000\u0000\u0195\u0196\u0005K\u0000\u0000\u0196\u0197\u0003"+
		"\u0018\f\u0000\u0197\u0198\u0005O\u0000\u0000\u0198\u0199\u0003\u0018"+
		"\f\u0000\u0199\u019a\u0005L\u0000\u0000\u019a\u01aa\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u0088\u0000\u0000\u019c\u019d\u0005K\u0000\u0000"+
		"\u019d\u019e\u0003\u0018\f\u0000\u019e\u019f\u0005L\u0000\u0000\u019f"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0089\u0000\u0000\u01a1"+
		"\u01a3\u0005M\u0000\u0000\u01a2\u01a4\u0003$\u0012\u0000\u01a3\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0005N\u0000\u0000\u01a8\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a9\u018e\u0001\u0000\u0000\u0000\u01a9\u018f\u0001\u0000"+
		"\u0000\u0000\u01a9\u0190\u0001\u0000\u0000\u0000\u01a9\u0191\u0001\u0000"+
		"\u0000\u0000\u01a9\u0192\u0001\u0000\u0000\u0000\u01a9\u0193\u0001\u0000"+
		"\u0000\u0000\u01a9\u0194\u0001\u0000\u0000\u0000\u01a9\u019b\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a0\u0001\u0000\u0000\u0000\u01aa#\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0003\u001e\u000f\u0000\u01ac\u01b1\u0003&\u0013\u0000"+
		"\u01ad\u01ae\u0005O\u0000\u0000\u01ae\u01b0\u0003&\u0013\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005P\u0000\u0000\u01b5%\u0001\u0000\u0000\u0000\u01b6\u01ba\u0005\u008c"+
		"\u0000\u0000\u01b7\u01b9\u0003(\u0014\u0000\u01b8\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\'\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005K\u0000\u0000\u01be"+
		"\u01bf\u0003\u0018\f\u0000\u01bf\u01c0\u0005L\u0000\u0000\u01c0\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005K\u0000\u0000\u01c2\u01c3\u0003"+
		"\u001e\u000f\u0000\u01c3\u01c4\u0005L\u0000\u0000\u01c4\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c5\u01bd\u0001\u0000\u0000\u0000\u01c5\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c6)\u0001\u0000\u0000\u0000\u01c7\u01cb\u0005\u008c\u0000"+
		"\u0000\u01c8\u01ca\u0003(\u0014\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01d0\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0007\u0007\u0000\u0000"+
		"\u01cf\u01d1\u0003,\u0016\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1+\u0001\u0000\u0000\u0000\u01d2\u01df"+
		"\u0003\u0018\f\u0000\u01d3\u01d4\u0005M\u0000\u0000\u01d4\u01d9\u0003"+
		",\u0016\u0000\u01d5\u01d6\u0005O\u0000\u0000\u01d6\u01d8\u0003,\u0016"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0005N\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000"+
		"\u01de\u01d2\u0001\u0000\u0000\u0000\u01de\u01d3\u0001\u0000\u0000\u0000"+
		"\u01df-\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0082\u0000\u0000\u01e1"+
		"\u01e2\u0003\u001e\u000f\u0000\u01e2\u01e7\u0003&\u0013\u0000\u01e3\u01e4"+
		"\u0005O\u0000\u0000\u01e4\u01e6\u0003&\u0013\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005P\u0000"+
		"\u0000\u01eb/\u0001\u0000\u0000\u0000\u01ec\u01ed\u0006\u0018\uffff\uffff"+
		"\u0000\u01ed\u01ee\u0003\u001e\u000f\u0000\u01ee\u01ef\u0005\u008c\u0000"+
		"\u0000\u01ef\u01f0\u0005I\u0000\u0000\u01f0\u01f1\u00032\u0019\u0000\u01f1"+
		"\u01f2\u0005J\u0000\u0000\u01f2\u01f3\u00036\u001b\u0000\u01f3\u01f4\u0006"+
		"\u0018\uffff\uffff\u0000\u01f41\u0001\u0000\u0000\u0000\u01f5\u01fa\u0003"+
		"4\u001a\u0000\u01f6\u01f7\u0005O\u0000\u0000\u01f7\u01f9\u00034\u001a"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fd\u01f5\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe3\u0001\u0000\u0000\u0000\u01ff\u0201\u0003\u001e\u000f\u0000"+
		"\u0200\u0202\u0005l\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0003&\u0013\u0000\u02045\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"M\u0000\u0000\u0206\u020a\u0003\u0014\n\u0000\u0207\u0209\u00038\u001c"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005N\u0000\u0000\u020e7\u0001\u0000\u0000\u0000\u020f"+
		"\u021b\u00036\u001b\u0000\u0210\u021b\u0005P\u0000\u0000\u0211\u0212\u0003"+
		"\u0018\f\u0000\u0212\u0213\u0005P\u0000\u0000\u0213\u021b\u0001\u0000"+
		"\u0000\u0000\u0214\u021b\u0003:\u001d\u0000\u0215\u021b\u0003<\u001e\u0000"+
		"\u0216\u021b\u0003>\u001f\u0000\u0217\u021b\u0003@ \u0000\u0218\u021b"+
		"\u0003B!\u0000\u0219\u021b\u0003D\"\u0000\u021a\u020f\u0001\u0000\u0000"+
		"\u0000\u021a\u0210\u0001\u0000\u0000\u0000\u021a\u0211\u0001\u0000\u0000"+
		"\u0000\u021a\u0214\u0001\u0000\u0000\u0000\u021a\u0215\u0001\u0000\u0000"+
		"\u0000\u021a\u0216\u0001\u0000\u0000\u0000\u021a\u0217\u0001\u0000\u0000"+
		"\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021b9\u0001\u0000\u0000\u0000\u021c\u021d\u0005@\u0000\u0000\u021d"+
		"\u021e\u0005I\u0000\u0000\u021e\u021f\u0003\u0018\f\u0000\u021f\u0220"+
		"\u0005P\u0000\u0000\u0220\u0221\u0003\u0018\f\u0000\u0221\u0222\u0005"+
		"P\u0000\u0000\u0222\u0223\u0003\u0018\f\u0000\u0223\u0224\u0005J\u0000"+
		"\u0000\u0224\u0225\u00038\u001c\u0000\u0225;\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005@\u0000\u0000\u0227\u0228\u0005I\u0000\u0000\u0228\u0229\u0005"+
		"\u008c\u0000\u0000\u0229\u022a\u0005y\u0000\u0000\u022a\u022b\u0003\u001e"+
		"\u000f\u0000\u022b\u022c\u0005J\u0000\u0000\u022c\u022d\u00038\u001c\u0000"+
		"\u022d=\u0001\u0000\u0000\u0000\u022e\u022f\u0005A\u0000\u0000\u022f\u0230"+
		"\u0005I\u0000\u0000\u0230\u0231\u0003\u0018\f\u0000\u0231\u0232\u0005"+
		"J\u0000\u0000\u0232\u0233\u00038\u001c\u0000\u0233?\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0005B\u0000\u0000\u0235\u0236\u00038\u001c\u0000\u0236"+
		"\u0237\u0005A\u0000\u0000\u0237\u0238\u0005I\u0000\u0000\u0238\u0239\u0003"+
		"\u0018\f\u0000\u0239\u023a\u0005J\u0000\u0000\u023a\u023b\u0005P\u0000"+
		"\u0000\u023bA\u0001\u0000\u0000\u0000\u023c\u023d\u0005C\u0000\u0000\u023d"+
		"\u023e\u0005I\u0000\u0000\u023e\u023f\u0003\u0018\f\u0000\u023f\u0240"+
		"\u0005J\u0000\u0000\u0240\u0243\u00038\u001c\u0000\u0241\u0242\u0005D"+
		"\u0000\u0000\u0242\u0244\u00038\u001c\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244C\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u0005E\u0000\u0000\u0246\u0248\u0003\u0018\f\u0000\u0247"+
		"\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0005P\u0000\u0000\u024aE\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0005\u0086\u0000\u0000\u024c\u024d\u0005"+
		"F\u0000\u0000\u024d\u0253\u0003H$\u0000\u024e\u024f\u0003J%\u0000\u024f"+
		"\u0250\u0003H$\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u024e\u0001"+
		"\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001"+
		"\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u0257\u0005"+
		"P\u0000\u0000\u0257G\u0001\u0000\u0000\u0000\u0258\u025b\u0003L&\u0000"+
		"\u0259\u025b\u0005G\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a"+
		"\u0259\u0001\u0000\u0000\u0000\u025bI\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0007\b\u0000\u0000\u025dK\u0001\u0000\u0000\u0000\u025e\u025f\u0006"+
		"&\uffff\uffff\u0000\u025f\u0260\u0005\u008c\u0000\u0000\u0260\u0268\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\n\u0001\u0000\u0000\u0262\u0263\u0005K"+
		"\u0000\u0000\u0263\u0264\u0003\u0018\f\u0000\u0264\u0265\u0005L\u0000"+
		"\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0261\u0001\u0000\u0000"+
		"\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269M\u0001\u0000\u0000\u0000"+
		"\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u026d\u0003\f\u0006\u0000\u026c"+
		"\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d"+
		"\u0279\u0001\u0000\u0000\u0000\u026e\u0273\u0003\b\u0004\u0000\u026f\u0273"+
		"\u0005\u0002\u0000\u0000\u0270\u0273\u00057\u0000\u0000\u0271\u0273\u0005"+
		"\u0001\u0000\u0000\u0272\u026e\u0001\u0000\u0000\u0000\u0272\u026f\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0276\u0003"+
		"\f\u0006\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u0272\u0001\u0000"+
		"\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027aO\u0001\u0000\u0000"+
		"\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0005\u000f\u0000"+
		"\u0000\u027d\u027e\u0005\u0015\u0000\u0000\u027e\u0282\u00050\u0000\u0000"+
		"\u027f\u0281\u0003\u000e\u0007\u0000\u0280\u027f\u0001\u0000\u0000\u0000"+
		"\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000"+
		"\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0286\u0003R)\u0000\u0286\u0287"+
		"\u0005\u0010\u0000\u0000\u0287\u0288\u0005\u0015\u0000\u0000\u0288\u0289"+
		"\u00050\u0000\u0000\u0289Q\u0001\u0000\u0000\u0000\u028a\u028e\u0003^"+
		"/\u0000\u028b\u028d\u0003\u000e\u0007\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u028a\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293\u029b\u0006)\uffff\uffff\u0000\u0294\u0298\u0003T*\u0000"+
		"\u0295\u0297\u0003\u000e\u0007\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000"+
		"\u029a\u0298\u0001\u0000\u0000\u0000\u029b\u0294\u0001\u0000\u0000\u0000"+
		"\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000"+
		"\u029d\u02a5\u0006)\uffff\uffff\u0000\u029e\u02a2\u0003\u0012\t\u0000"+
		"\u029f\u02a1\u0003\u000e\u0007\u0000\u02a0\u029f\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u029e\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02b5\u0001\u0000\u0000\u0000"+
		"\u02a7\u02ab\u0003\\.\u0000\u02a8\u02aa\u0003\u000e\u0007\u0000\u02a9"+
		"\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab"+
		"\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac"+
		"\u02b6\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae"+
		"\u02b2\u0003Z-\u0000\u02af\u02b1\u0003\u000e\u0007\u0000\u02b0\u02af\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02a7\u0001"+
		"\u0000\u0000\u0000\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0006"+
		")\uffff\uffff\u0000\u02ba\u02be\u0003X,\u0000\u02bb\u02bd\u0003\u000e"+
		"\u0007\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000"+
		"\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c1\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c1\u02cb\u0006)\uffff\uffff\u0000\u02c2\u02c6\u0003d2"+
		"\u0000\u02c3\u02c5\u0003\u000e\u0007\u0000\u02c4\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c9\u02c2\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02cf\u0006)\uffff\uffff"+
		"\u0000\u02cfS\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\u000e\u0000\u0000"+
		"\u02d1\u02d2\u00032\u0019\u0000\u02d2\u02d3\u0005<\u0000\u0000\u02d3U"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0007\t\u0000\u0000\u02d5\u02d6\u0005"+
		"3\u0000\u0000\u02d6\u02d7\u00054\u0000\u0000\u02d7\u02d8\u0007\t\u0000"+
		"\u0000\u02d8\u02d9\u00053\u0000\u0000\u02d9\u02da\u00054\u0000\u0000\u02da"+
		"W\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u000f\u0000\u0000\u02dc\u02dd"+
		"\u0005\u001b\u0000\u0000\u02dd\u02de\u0005\u001c\u0000\u0000\u02de\u02df"+
		"\u00053\u0000\u0000\u02df\u02e0\u00054\u0000\u0000\u02e0\u02e1\u00052"+
		"\u0000\u0000\u02e1Y\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005\u000f\u0000"+
		"\u0000\u02e3\u02e4\u0005\u0016\u0000\u0000\u02e4\u02e5\u0005\u001d\u0000"+
		"\u0000\u02e5\u02e6\u00053\u0000\u0000\u02e6\u02e8\u00054\u0000\u0000\u02e7"+
		"\u02e9\u0003V+\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ee\u0005"+
		"0\u0000\u0000\u02eb\u02ed\u0003\u000e\u0007\u0000\u02ec\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005\u0010"+
		"\u0000\u0000\u02f2\u02f3\u0005\u0016\u0000\u0000\u02f3\u02f4\u00050\u0000"+
		"\u0000\u02f4[\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005\u000f\u0000\u0000"+
		"\u02f6\u02f7\u0005\u0017\u0000\u0000\u02f7\u02f8\u0005\u001d\u0000\u0000"+
		"\u02f8\u02f9\u00053\u0000\u0000\u02f9\u02fb\u00054\u0000\u0000\u02fa\u02fc"+
		"\u0003V+\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003`0\u0000"+
		"\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0304\u00050\u0000\u0000\u0301"+
		"\u0303\u0003\u000e\u0007\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303"+
		"\u0306\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304"+
		"\u0305\u0001\u0000\u0000\u0000\u0305\u030e\u0001\u0000\u0000\u0000\u0306"+
		"\u0304\u0001\u0000\u0000\u0000\u0307\u030b\u0003^/\u0000\u0308\u030a\u0003"+
		"\u000e\u0007\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a\u030d\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001"+
		"\u0000\u0000\u0000\u030e\u0307\u0001\u0000\u0000\u0000\u030e\u030f\u0001"+
		"\u0000\u0000\u0000\u030f\u0317\u0001\u0000\u0000\u0000\u0310\u0314\u0003"+
		"b1\u0000\u0311\u0313\u0003\u000e\u0007\u0000\u0312\u0311\u0001\u0000\u0000"+
		"\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000"+
		"\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u0310\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0322\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0005\u000f\u0000\u0000\u031a\u031b\u0007\n\u0000\u0000"+
		"\u031b\u031f\u00052\u0000\u0000\u031c\u031e\u0003\u000e\u0007\u0000\u031d"+
		"\u031c\u0001\u0000\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f"+
		"\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320"+
		"\u0323\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322"+
		"\u0319\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0005\u0010\u0000\u0000\u0325"+
		"\u0326\u0005\u0017\u0000\u0000\u0326\u0327\u00050\u0000\u0000\u0327]\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0005\u000f\u0000\u0000\u0329\u032b\u0005"+
		"\u0019\u0000\u0000\u032a\u032c\u0003V+\u0000\u032b\u032a\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u00050\u0000\u0000\u032e\u032f\u0003N\'\u0000\u032f"+
		"\u0330\u0005\u0010\u0000\u0000\u0330\u0331\u0005\u0019\u0000\u0000\u0331"+
		"\u0332\u00050\u0000\u0000\u0332_\u0001\u0000\u0000\u0000\u0333\u0334\u0005"+
		"\u0018\u0000\u0000\u0334\u0335\u00053\u0000\u0000\u0335\u0336\u00054\u0000"+
		"\u0000\u0336a\u0001\u0000\u0000\u0000\u0337\u033b\u0005\u000b\u0000\u0000"+
		"\u0338\u033a\u0003\u000e\u0007\u0000\u0339\u0338\u0001\u0000\u0000\u0000"+
		"\u033a\u033d\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u033f\u0003\u0018\f\u0000\u033f"+
		"\u0340\u0005:\u0000\u0000\u0340c\u0001\u0000\u0000\u0000\u0341\u0342\u0005"+
		"\u000f\u0000\u0000\u0342\u0344\u0005$\u0000\u0000\u0343\u0345\u0003`0"+
		"\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u00050\u0000\u0000"+
		"\u0347\u034b\u00062\uffff\uffff\u0000\u0348\u034a\u0003\u000e\u0007\u0000"+
		"\u0349\u0348\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000"+
		"\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000"+
		"\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000"+
		"\u034e\u0352\u0003~?\u0000\u034f\u0351\u0003\u000e\u0007\u0000\u0350\u034f"+
		"\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355"+
		"\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0359"+
		"\u0003\u0080@\u0000\u0356\u0358\u0003\u000e\u0007\u0000\u0357\u0356\u0001"+
		"\u0000\u0000\u0000\u0358\u035b\u0001\u0000\u0000\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u037a\u0001"+
		"\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u0360\u0003"+
		"l6\u0000\u035d\u035f\u0003\u000e\u0007\u0000\u035e\u035d\u0001\u0000\u0000"+
		"\u0000\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0379\u0001\u0000\u0000"+
		"\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0367\u0003f3\u0000\u0364"+
		"\u0366\u0003\u000e\u0007\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0366"+
		"\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367"+
		"\u0368\u0001\u0000\u0000\u0000\u0368\u0379\u0001\u0000\u0000\u0000\u0369"+
		"\u0367\u0001\u0000\u0000\u0000\u036a\u036e\u0003h4\u0000\u036b\u036d\u0003"+
		"\u000e\u0007\u0000\u036c\u036b\u0001\u0000\u0000\u0000\u036d\u0370\u0001"+
		"\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036e\u036f\u0001"+
		"\u0000\u0000\u0000\u036f\u0379\u0001\u0000\u0000\u0000\u0370\u036e\u0001"+
		"\u0000\u0000\u0000\u0371\u0375\u0003j5\u0000\u0372\u0374\u0003\u000e\u0007"+
		"\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000"+
		"\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000"+
		"\u0000\u0376\u0379\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000"+
		"\u0000\u0378\u035c\u0001\u0000\u0000\u0000\u0378\u0363\u0001\u0000\u0000"+
		"\u0000\u0378\u036a\u0001\u0000\u0000\u0000\u0378\u0371\u0001\u0000\u0000"+
		"\u0000\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u0386\u0001\u0000\u0000"+
		"\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u0381\u0003\u0082A\u0000"+
		"\u037e\u0380\u0003\u000e\u0007\u0000\u037f\u037e\u0001\u0000\u0000\u0000"+
		"\u0380\u0383\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000"+
		"\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000\u0000\u0000"+
		"\u0383\u0381\u0001\u0000\u0000\u0000\u0384\u037d\u0001\u0000\u0000\u0000"+
		"\u0385\u0388\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000"+
		"\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0389\u0001\u0000\u0000\u0000"+
		"\u0388\u0386\u0001\u0000\u0000\u0000\u0389\u038a\u0005\u0010\u0000\u0000"+
		"\u038a\u038b\u0005$\u0000\u0000\u038b\u038c\u00050\u0000\u0000\u038c\u038d"+
		"\u00062\uffff\uffff\u0000\u038de\u0001\u0000\u0000\u0000\u038e\u0390\u0005"+
		"\u0007\u0000\u0000\u038f\u0391\u0003v;\u0000\u0390\u038f\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000"+
		"\u0000\u0392\u0393\u0005:\u0000\u0000\u0393g\u0001\u0000\u0000\u0000\u0394"+
		"\u0398\u0005\b\u0000\u0000\u0395\u0396\u0003\u0018\f\u0000\u0396\u0397"+
		"\u0005x\u0000\u0000\u0397\u0399\u0001\u0000\u0000\u0000\u0398\u0395\u0001"+
		"\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039a\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u0005:\u0000\u0000\u039b\u039c\u0001\u0000"+
		"\u0000\u0000\u039c\u039d\u00064\uffff\uffff\u0000\u039di\u0001\u0000\u0000"+
		"\u0000\u039e\u03a2\u0005\b\u0000\u0000\u039f\u03a0\u0003\u0018\f\u0000"+
		"\u03a0\u03a1\u0005a\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000\u03a2"+
		"\u039f\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005:\u0000\u0000\u03a5\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u00065\uffff\uffff\u0000\u03a7k\u0001"+
		"\u0000\u0000\u0000\u03a8\u03ac\u0003p8\u0000\u03a9\u03ab\u0003\u000e\u0007"+
		"\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ae\u0001\u0000\u0000"+
		"\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ad\u03be\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000"+
		"\u0000\u03af\u03b3\u0003n7\u0000\u03b0\u03b2\u0003\u000e\u0007\u0000\u03b1"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4"+
		"\u03be\u0001\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6"+
		"\u03ba\u0003t:\u0000\u03b7\u03b9\u0003\u000e\u0007\u0000\u03b8\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03be\u0001"+
		"\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03a8\u0001"+
		"\u0000\u0000\u0000\u03bd\u03af\u0001\u0000\u0000\u0000\u03bd\u03b6\u0001"+
		"\u0000\u0000\u0000\u03bem\u0001\u0000\u0000\u0000\u03bf\u03c3\u0005\t"+
		"\u0000\u0000\u03c0\u03c2\u0003\u000e\u0007\u0000\u03c1\u03c0\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c6\u03cb\u0003\u0018"+
		"\f\u0000\u03c7\u03c8\u0005O\u0000\u0000\u03c8\u03ca\u0003\u0018\f\u0000"+
		"\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\u0005:\u0000\u0000\u03cfo\u0001\u0000\u0000\u0000\u03d0\u03d4"+
		"\u0005\n\u0000\u0000\u03d1\u03d3\u0003\u000e\u0007\u0000\u03d2\u03d1\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7\u03d8\u0003"+
		"r9\u0000\u03d8\u03d9\u0005:\u0000\u0000\u03d9q\u0001\u0000\u0000\u0000"+
		"\u03da\u03db\u00069\uffff\uffff\u0000\u03db\u03dc\u0005\u008c\u0000\u0000"+
		"\u03dc\u03dd\u0005y\u0000\u0000\u03dd\u03de\u0003\u001e\u000f\u0000\u03de"+
		"\u03e6\u0001\u0000\u0000\u0000\u03df\u03e0\n\u0001\u0000\u0000\u03e0\u03e1"+
		"\u0005O\u0000\u0000\u03e1\u03e2\u0005\u008c\u0000\u0000\u03e2\u03e3\u0005"+
		"y\u0000\u0000\u03e3\u03e5\u0003\u001e\u000f\u0000\u03e4\u03df\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e8\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7s\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005\f\u0000\u0000"+
		"\u03ea\u03eb\u0003N\'\u0000\u03eb\u03ec\u0005:\u0000\u0000\u03ecu\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0006;\uffff\uffff\u0000\u03ee\u03ef\u0005"+
		"\u008c\u0000\u0000\u03ef\u041c\u0006;\uffff\uffff\u0000\u03f0\u041c\u0005"+
		">\u0000\u0000\u03f1\u041c\u0005?\u0000\u0000\u03f2\u03f3\u0005I\u0000"+
		"\u0000\u03f3\u03f4\u0003v;\u0000\u03f4\u03f5\u0005J\u0000\u0000\u03f5"+
		"\u041c\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005Q\u0000\u0000\u03f7\u041c"+
		"\u0003v;\u000f\u03f8\u03f9\u0005R\u0000\u0000\u03f9\u041c\u0003v;\r\u03fa"+
		"\u03fb\u0007\u0003\u0000\u0000\u03fb\u041c\u0003v;\u000b\u03fc\u03fd\u0005"+
		"\u008c\u0000\u0000\u03fd\u03fe\u0005I\u0000\u0000\u03fe\u03ff\u0003x<"+
		"\u0000\u03ff\u0400\u0005J\u0000\u0000\u0400\u041c\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0005{\u0000\u0000\u0402\u0403\u0005I\u0000\u0000\u0403\u0404"+
		"\u0005\u008c\u0000\u0000\u0404\u0405\u0005y\u0000\u0000\u0405\u0406\u0003"+
		"z=\u0000\u0406\u0407\u0005J\u0000\u0000\u0407\u0408\u0003v;\u0005\u0408"+
		"\u041c\u0001\u0000\u0000\u0000\u0409\u040a\u0005|\u0000\u0000\u040a\u040b"+
		"\u0005I\u0000\u0000\u040b\u040c\u0005\u008c\u0000\u0000\u040c\u040d\u0005"+
		"y\u0000\u0000\u040d\u040e\u0003z=\u0000\u040e\u040f\u0005J\u0000\u0000"+
		"\u040f\u0410\u0003v;\u0004\u0410\u041c\u0001\u0000\u0000\u0000\u0411\u0412"+
		"\u0005}\u0000\u0000\u0412\u0413\u0005I\u0000\u0000\u0413\u0414\u0005\u008c"+
		"\u0000\u0000\u0414\u0415\u0005y\u0000\u0000\u0415\u0416\u0003z=\u0000"+
		"\u0416\u0417\u0005J\u0000\u0000\u0417\u0418\u0003v;\u0003\u0418\u041c"+
		"\u0001\u0000\u0000\u0000\u0419\u041c\u0005\u008a\u0000\u0000\u041a\u041c"+
		"\u0005\u008b\u0000\u0000\u041b\u03ed\u0001\u0000\u0000\u0000\u041b\u03f0"+
		"\u0001\u0000\u0000\u0000\u041b\u03f1\u0001\u0000\u0000\u0000\u041b\u03f2"+
		"\u0001\u0000\u0000\u0000\u041b\u03f6\u0001\u0000\u0000\u0000\u041b\u03f8"+
		"\u0001\u0000\u0000\u0000\u041b\u03fa\u0001\u0000\u0000\u0000\u041b\u03fc"+
		"\u0001\u0000\u0000\u0000\u041b\u0401\u0001\u0000\u0000\u0000\u041b\u0409"+
		"\u0001\u0000\u0000\u0000\u041b\u0411\u0001\u0000\u0000\u0000\u041b\u0419"+
		"\u0001\u0000\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u043f"+
		"\u0001\u0000\u0000\u0000\u041d\u041e\n\f\u0000\u0000\u041e\u041f\u0007"+
		"\u0004\u0000\u0000\u041f\u043e\u0003v;\r\u0420\u0421\n\n\u0000\u0000\u0421"+
		"\u0422\u0006;\uffff\uffff\u0000\u0422\u0423\u0007\u0005\u0000\u0000\u0423"+
		"\u0424\u0003v;\u000b\u0424\u0425\u0006;\uffff\uffff\u0000\u0425\u043e"+
		"\u0001\u0000\u0000\u0000\u0426\u0427\n\t\u0000\u0000\u0427\u0428\u0007"+
		"\u0006\u0000\u0000\u0428\u043e\u0003v;\n\u0429\u042a\n\b\u0000\u0000\u042a"+
		"\u042b\u0005x\u0000\u0000\u042b\u042c\u0003v;\u0000\u042c\u042d\u0005"+
		"y\u0000\u0000\u042d\u042e\u0003v;\t\u042e\u043e\u0001\u0000\u0000\u0000"+
		"\u042f\u0430\n\u0013\u0000\u0000\u0430\u0431\u0005K\u0000\u0000\u0431"+
		"\u0432\u0003v;\u0000\u0432\u0433\u0005L\u0000\u0000\u0433\u043e\u0001"+
		"\u0000\u0000\u0000\u0434\u0435\n\u0012\u0000\u0000\u0435\u043e\u0005H"+
		"\u0000\u0000\u0436\u0437\n\u0010\u0000\u0000\u0437\u043e\u0005Q\u0000"+
		"\u0000\u0438\u0439\n\u000e\u0000\u0000\u0439\u043e\u0005R\u0000\u0000"+
		"\u043a\u043b\n\u0007\u0000\u0000\u043b\u043c\u0005z\u0000\u0000\u043c"+
		"\u043e\u0005\u008c\u0000\u0000\u043d\u041d\u0001\u0000\u0000\u0000\u043d"+
		"\u0420\u0001\u0000\u0000\u0000\u043d\u0426\u0001\u0000\u0000\u0000\u043d"+
		"\u0429\u0001\u0000\u0000\u0000\u043d\u042f\u0001\u0000\u0000\u0000\u043d"+
		"\u0434\u0001\u0000\u0000\u0000\u043d\u0436\u0001\u0000\u0000\u0000\u043d"+
		"\u0438\u0001\u0000\u0000\u0000\u043d\u043a\u0001\u0000\u0000\u0000\u043e"+
		"\u0441\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u043f"+
		"\u0440\u0001\u0000\u0000\u0000\u0440w\u0001\u0000\u0000\u0000\u0441\u043f"+
		"\u0001\u0000\u0000\u0000\u0442\u0447\u0003v;\u0000\u0443\u0444\u0005O"+
		"\u0000\u0000\u0444\u0446\u0003v;\u0000\u0445\u0443\u0001\u0000\u0000\u0000"+
		"\u0446\u0449\u0001\u0000\u0000\u0000\u0447\u0445\u0001\u0000\u0000\u0000"+
		"\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u044b\u0001\u0000\u0000\u0000"+
		"\u0449\u0447\u0001\u0000\u0000\u0000\u044a\u0442\u0001\u0000\u0000\u0000"+
		"\u044a\u044b\u0001\u0000\u0000\u0000\u044by\u0001\u0000\u0000\u0000\u044c"+
		"\u044e\u0007\u000b\u0000\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044d"+
		"\u044e\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f"+
		"\u0450\u0003|>\u0000\u0450{\u0001\u0000\u0000\u0000\u0451\u045f\u0005"+
		"\u0083\u0000\u0000\u0452\u0453\u0005\u0083\u0000\u0000\u0453\u0454\u0005"+
		"K\u0000\u0000\u0454\u0455\u0003v;\u0000\u0455\u0456\u0005O\u0000\u0000"+
		"\u0456\u0457\u0003v;\u0000\u0457\u0458\u0005L\u0000\u0000\u0458\u045f"+
		"\u0001\u0000\u0000\u0000\u0459\u045a\u0005\u0088\u0000\u0000\u045a\u045b"+
		"\u0005K\u0000\u0000\u045b\u045c\u0003v;\u0000\u045c\u045d\u0005L\u0000"+
		"\u0000\u045d\u045f\u0001\u0000\u0000\u0000\u045e\u0451\u0001\u0000\u0000"+
		"\u0000\u045e\u0452\u0001\u0000\u0000\u0000\u045e\u0459\u0001\u0000\u0000"+
		"\u0000\u045f}\u0001\u0000\u0000\u0000\u0460\u0461\u0005\u000f\u0000\u0000"+
		"\u0461\u0462\u0005%\u0000\u0000\u0462\u0463\u0005\u001c\u0000\u0000\u0463"+
		"\u0464\u00053\u0000\u0000\u0464\u0465\u00054\u0000\u0000\u0465\u0466\u0005"+
		"2\u0000\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0468\u0006?\uffff"+
		"\uffff\u0000\u0468\u007f\u0001\u0000\u0000\u0000\u0469\u046a\u0005\u000f"+
		"\u0000\u0000\u046a\u046b\u0005&\u0000\u0000\u046b\u046c\u0005\u001c\u0000"+
		"\u0000\u046c\u046d\u00053\u0000\u0000\u046d\u046e\u00054\u0000\u0000\u046e"+
		"\u046f\u00052\u0000\u0000\u046f\u0470\u0006@\uffff\uffff\u0000\u0470\u0081"+
		"\u0001\u0000\u0000\u0000\u0471\u0472\u0005\u000f\u0000\u0000\u0472\u0474"+
		"\u0005\'\u0000\u0000\u0473\u0475\u0003V+\u0000\u0474\u0473\u0001\u0000"+
		"\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000"+
		"\u0000\u0000\u0476\u0477\u00052\u0000\u0000\u0477\u0083\u0001\u0000\u0000"+
		"\u0000\u0478\u0479\u0005\u000f\u0000\u0000\u0479\u047a\u0005(\u0000\u0000"+
		"\u047a\u047b\u00050\u0000\u0000\u047b\u047c\u0003N\'\u0000\u047c\u047d"+
		"\u0005\u0010\u0000\u0000\u047d\u047e\u0005(\u0000\u0000\u047e\u047f\u0005"+
		"0\u0000\u0000\u047f\u0085\u0001\u0000\u0000\u0000\u0480\u0481\u0005\u000f"+
		"\u0000\u0000\u0481\u0482\u0005)\u0000\u0000\u0482\u0486\u00050\u0000\u0000"+
		"\u0483\u0485\u0003\u000e\u0007\u0000\u0484\u0483\u0001\u0000\u0000\u0000"+
		"\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000\u0000"+
		"\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0492\u0001\u0000\u0000\u0000"+
		"\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048d\u0003\u0088D\u0000\u048a"+
		"\u048c\u0003\u000e\u0007\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048c"+
		"\u048f\u0001\u0000\u0000\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d"+
		"\u048e\u0001\u0000\u0000\u0000\u048e\u0491\u0001\u0000\u0000\u0000\u048f"+
		"\u048d\u0001\u0000\u0000\u0000\u0490\u0489\u0001\u0000\u0000\u0000\u0491"+
		"\u0494\u0001\u0000\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0492"+
		"\u0493\u0001\u0000\u0000\u0000\u0493\u0495\u0001\u0000\u0000\u0000\u0494"+
		"\u0492\u0001\u0000\u0000\u0000\u0495\u0496\u0005\u0010\u0000\u0000\u0496"+
		"\u0497\u0005)\u0000\u0000\u0497\u0498\u00050\u0000\u0000\u0498\u0087\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0005\u000f\u0000\u0000\u049a\u049b\u0005"+
		"*\u0000\u0000\u049b\u049f\u00050\u0000\u0000\u049c\u049e\u0003\u000e\u0007"+
		"\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001\u0000\u0000"+
		"\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a0\u04a9\u0001\u0000\u0000\u0000\u04a1\u049f\u0001\u0000\u0000"+
		"\u0000\u04a2\u04a6\u0003\u008aE\u0000\u04a3\u04a5\u0003\u000e\u0007\u0000"+
		"\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a5\u04a8\u0001\u0000\u0000\u0000"+
		"\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000"+
		"\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a6\u0001\u0000\u0000\u0000"+
		"\u04a9\u04a2\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000"+
		"\u04aa\u04b2\u0001\u0000\u0000\u0000\u04ab\u04af\u0003\u008cF\u0000\u04ac"+
		"\u04ae\u0003\u000e\u0007\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ae"+
		"\u04b1\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000\u04af"+
		"\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b3\u0001\u0000\u0000\u0000\u04b1"+
		"\u04af\u0001\u0000\u0000\u0000\u04b2\u04ab\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4"+
		"\u04b5\u0005\u0010\u0000\u0000\u04b5\u04b6\u0005*\u0000\u0000\u04b6\u04b7"+
		"\u00050\u0000\u0000\u04b7\u0089\u0001\u0000\u0000\u0000\u04b8\u04b9\u0005"+
		"\u000f\u0000\u0000\u04b9\u04ba\u0005+\u0000\u0000\u04ba\u04bb\u00050\u0000"+
		"\u0000\u04bb\u04bc\u0003N\'\u0000\u04bc\u04bd\u0005\u0010\u0000\u0000"+
		"\u04bd\u04be\u0005+\u0000\u0000\u04be\u04bf\u00050\u0000\u0000\u04bf\u008b"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005\u000f\u0000\u0000\u04c1\u04c2"+
		"\u0005,\u0000\u0000\u04c2\u04c3\u00050\u0000\u0000\u04c3\u04c4\u0003N"+
		"\'\u0000\u04c4\u04c5\u0005\u0010\u0000\u0000\u04c5\u04c6\u0005,\u0000"+
		"\u0000\u04c6\u04c7\u00050\u0000\u0000\u04c7\u008d\u0001\u0000\u0000\u0000"+
		"v\u008f\u0094\u009b\u00a2\u00a8\u00af\u00b2\u00b6\u00be\u00cc\u00d0\u00e2"+
		"\u00e9\u00f0\u00f5\u00fb\u0102\u0105\u0112\u0119\u0143\u0167\u0169\u0171"+
		"\u0174\u017c\u0184\u018c\u01a5\u01a9\u01b1\u01ba\u01c5\u01cb\u01d0\u01d9"+
		"\u01de\u01e7\u01fa\u01fd\u0201\u020a\u021a\u0243\u0247\u0253\u025a\u0268"+
		"\u026c\u0272\u0275\u0279\u0282\u028e\u0291\u0298\u029b\u02a2\u02a5\u02ab"+
		"\u02b2\u02b5\u02b7\u02be\u02c6\u02cb\u02e8\u02ee\u02fb\u02fe\u0304\u030b"+
		"\u030e\u0314\u0317\u031f\u0322\u032b\u033b\u0344\u034b\u0352\u0359\u0360"+
		"\u0367\u036e\u0375\u0378\u037a\u0381\u0386\u0390\u0398\u03a2\u03ac\u03b3"+
		"\u03ba\u03bd\u03c3\u03cb\u03d4\u03e6\u041b\u043d\u043f\u0447\u044a\u044d"+
		"\u045e\u0474\u0486\u048d\u0492\u049f\u04a6\u04a9\u04af\u04b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}