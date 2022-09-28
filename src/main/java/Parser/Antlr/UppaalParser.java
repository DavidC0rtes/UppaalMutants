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
		OPEN_SYNC=8, OPEN_LBLTR=9, OPEN_SELECT=10, OPEN_INV=11, OPEN_DECLARATION=12, 
		OPEN_PARAMETER=13, OPEN=14, OPEN_SLASH=15, XMLDeclOpen=16, TEXT=17, NTA=18, 
		DECLARATION=19, TEMPLATE=20, BRANCHPOINT=21, LOCATION=22, COLOR=23, NAME=24, 
		PARAMETER=25, INIT=26, REF=27, ID=28, X=29, Y=30, URGENT_LOC=31, COMMITTED=32, 
		LABEL=33, KIND=34, TRANSITION=35, SOURCE=36, TARGET=37, NAIL=38, SYSTEM=39, 
		QUERIES=40, QUERY=41, FORMULA=42, QUERY_COMMENT=43, ASSIGNMENT=44, SELECT=45, 
		INVARIANT=46, CLOSE=47, SPECIAL_CLOSE=48, SLASH_CLOSE=49, EQUALS=50, STRING=51, 
		Name=52, S=53, PI=54, SLASH_COMMENT=55, LINE_COMMENT=56, CLOSE_LABEL=57, 
		CLOSE_DECLARATION=58, CLOSE_PARAMETER=59, GUARD_S=60, NAT=61, POINT=62, 
		FOR=63, WHILE=64, DO=65, IF=66, ELSE=67, RETURN=68, PRIORITY=69, DEFAULT=70, 
		APOSTROPHE=71, LEFT_PARENTHESIS=72, RIGHT_PARENTHESIS=73, LEFT_BRACKET=74, 
		RIGHT_BRACKET=75, LEFT_BRACE=76, RIGHT_BRACE=77, COMMA=78, SEMICOLON=79, 
		INCREMENT=80, DECREMENT=81, ASSIGN=82, ASSIGN_COLON=83, ASSIGN_ADD=84, 
		ASSIGN_SUB=85, ASSIGN_MUL=86, ASSIGN_DIV=87, ASSIGN_PERCENT=88, ASSIGN_OR=89, 
		ASSIGN_AND=90, ASSIGN_XOR=91, ASSIGN_LSHIFT=92, ASSIGN_RSHIFT=93, ADD=94, 
		SUB=95, EXCLAMATION=96, NOT=97, LESS=98, LESSEQ=99, COMPARE=100, DIFFERENT=101, 
		GREATEREQ=102, GREATER=103, MUL=104, DIV=105, PERCENT=106, BITAND=107, 
		BITOR=108, BITXOR=109, LSHIFT=110, RSHIFT=111, AND_SYMBOL=112, OR_SYMBOL=113, 
		MINIMUM=114, MAXIMUM=115, OR=116, AND=117, IMPLY=118, QUESTION=119, COLON=120, 
		LOOKUP_OP=121, FORALL=122, EXISTS=123, SUM=124, URGENT=125, BROADCAST=126, 
		META=127, CONST=128, TYPEDEF=129, INT=130, DOUBLE=131, CLOCK=132, CHAN=133, 
		BOOL=134, SCALAR=135, STRUCT=136, TRUE=137, FALSE=138, IDENTIFIER=139;
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
		RULE_branchpoint = 45, RULE_location = 46, RULE_labelLoc = 47, RULE_name = 48, 
		RULE_color = 49, RULE_transition = 50, RULE_labelTransGuard = 51, RULE_labelTransSyncInput = 52, 
		RULE_labelTransSyncOutput = 53, RULE_labelTrans = 54, RULE_labelUpdate = 55, 
		RULE_labelSelect = 56, RULE_selectList = 57, RULE_guardExpr = 58, RULE_guardArguments = 59, 
		RULE_guardType = 60, RULE_guardTypeId = 61, RULE_source = 62, RULE_target = 63, 
		RULE_nail = 64, RULE_system = 65, RULE_queries = 66, RULE_query = 67, 
		RULE_formula = 68, RULE_comment = 69;
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
			"location", "labelLoc", "name", "color", "transition", "labelTransGuard", 
			"labelTransSyncInput", "labelTransSyncOutput", "labelTrans", "labelUpdate", 
			"labelSelect", "selectList", "guardExpr", "guardArguments", "guardType", 
			"guardTypeId", "source", "target", "nail", "system", "queries", "query", 
			"formula", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'<'", "'</'", null, null, "'nta'", "'declaration'", "'template'", 
			"'branchpoint'", "'location'", "'color'", "'name'", "'parameter'", "'init'", 
			"'ref'", "'id'", "'x'", "'y'", null, "'committed'", "'label'", "'kind'", 
			"'transition'", "'source'", "'target'", "'nail'", "'system'", "'queries'", 
			"'query'", "'formula'", "'comment'", "'\"assignment\"'", "'\"select\"'", 
			"'\"invariant\"'", "'>'", null, "'/>'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'for'", "'while'", "'do'", 
			"'if'", "'else'", "'return'", "'priority'", "'default'", "'''", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'++'", "'--'", null, 
			"':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&amp;='", "'^='", 
			"'&lt;&lt;='", "'&gt;&gt;='", "'+'", "'-'", "'!'", "'not'", "'&lt;'", 
			"'&lt;='", "'=='", "'!='", "'&gt;='", "'&gt;'", "'*'", "'/'", "'%'", 
			"'&amp;'", "'|'", "'^'", "'&lt;&lt;'", "'&gt;&gt;'", "'&amp;&amp;'", 
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
			"OPEN_SYNC", "OPEN_LBLTR", "OPEN_SELECT", "OPEN_INV", "OPEN_DECLARATION", 
			"OPEN_PARAMETER", "OPEN", "OPEN_SLASH", "XMLDeclOpen", "TEXT", "NTA", 
			"DECLARATION", "TEMPLATE", "BRANCHPOINT", "LOCATION", "COLOR", "NAME", 
			"PARAMETER", "INIT", "REF", "ID", "X", "Y", "URGENT_LOC", "COMMITTED", 
			"LABEL", "KIND", "TRANSITION", "SOURCE", "TARGET", "NAIL", "SYSTEM", 
			"QUERIES", "QUERY", "FORMULA", "QUERY_COMMENT", "ASSIGNMENT", "SELECT", 
			"INVARIANT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "EQUALS", "STRING", 
			"Name", "S", "PI", "SLASH_COMMENT", "LINE_COMMENT", "CLOSE_LABEL", "CLOSE_DECLARATION", 
			"CLOSE_PARAMETER", "GUARD_S", "NAT", "POINT", "FOR", "WHILE", "DO", "IF", 
			"ELSE", "RETURN", "PRIORITY", "DEFAULT", "APOSTROPHE", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", 
			"COMMA", "SEMICOLON", "INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", 
			"ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", 
			"ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", 
			"ADD", "SUB", "EXCLAMATION", "NOT", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", 
			"GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", 
			"LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", 
			"OR", "AND", "IMPLY", "QUESTION", "COLON", "LOOKUP_OP", "FORALL", "EXISTS", 
			"SUM", "URGENT", "BROADCAST", "META", "CONST", "TYPEDEF", "INT", "DOUBLE", 
			"CLOCK", "CHAN", "BOOL", "SCALAR", "STRUCT", "TRUE", "FALSE", "IDENTIFIER"
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XMLDeclOpen) {
				{
				setState(140);
				prolog();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(143);
				misc();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			nta();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(150);
				misc();
				}
				}
				setState(155);
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
			setState(156);
			match(XMLDeclOpen);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name) {
				{
				{
				setState(157);
				attribute();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(165);
				chardata();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << OPEN) | (1L << PI))) != 0)) {
				{
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
					{
					setState(168);
					element();
					}
					break;
				case EntityRef:
				case CharRef:
					{
					setState(169);
					reference();
					}
					break;
				case CDATA:
					{
					setState(170);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(171);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(172);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(175);
					chardata();
					}
				}

				}
				}
				setState(182);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(OPEN);
				setState(184);
				match(Name);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(185);
					attribute();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(CLOSE);
				setState(192);
				content();
				setState(193);
				match(OPEN_SLASH);
				setState(194);
				match(Name);
				setState(195);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(OPEN);
				setState(198);
				match(Name);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Name) {
					{
					{
					setState(199);
					attribute();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
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
			setState(208);
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
			setState(210);
			match(Name);
			setState(211);
			match(EQUALS);
			setState(212);
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
			setState(214);
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
			setState(216);
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
			setState(218);
			match(OPEN);
			setState(219);
			match(NTA);
			setState(220);
			match(CLOSE);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(221);
				misc();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			declaration();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(228);
				misc();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(234);
					template();
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
						{
						{
						setState(235);
						misc();
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(245);
			system();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(246);
				misc();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(252);
				queries();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(253);
					misc();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(261);
			match(OPEN_SLASH);
			setState(262);
			match(NTA);
			setState(263);
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
			setState(265);
			match(OPEN_DECLARATION);
			setState(266);
			declContent();
			setState(267);
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
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					declarations();
					}
					} 
				}
				setState(274);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				typeDecl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				function();
				}
				break;
			case 4:
				_localctx = new ChanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(282);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(POINT);
				}
				break;
			case LEFT_PARENTHESIS:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(LEFT_PARENTHESIS);
				setState(286);
				expr(0);
				setState(287);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(INCREMENT);
				setState(290);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(DECREMENT);
				setState(292);
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
				setState(293);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (SUB - 94)) | (1L << (EXCLAMATION - 94)) | (1L << (NOT - 94)))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(FORALL);
				setState(296);
				match(LEFT_PARENTHESIS);
				setState(297);
				match(IDENTIFIER);
				setState(298);
				match(COLON);
				setState(299);
				type();
				setState(300);
				match(RIGHT_PARENTHESIS);
				setState(301);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(EXISTS);
				setState(304);
				match(LEFT_PARENTHESIS);
				setState(305);
				match(IDENTIFIER);
				setState(306);
				match(COLON);
				setState(307);
				type();
				setState(308);
				match(RIGHT_PARENTHESIS);
				setState(309);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(SUM);
				setState(312);
				match(LEFT_PARENTHESIS);
				setState(313);
				match(IDENTIFIER);
				setState(314);
				match(COLON);
				setState(315);
				type();
				setState(316);
				match(RIGHT_PARENTHESIS);
				setState(317);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(324);
						((AssignExprContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ASSIGN_COLON - 82)) | (1L << (ASSIGN_ADD - 82)) | (1L << (ASSIGN_SUB - 82)) | (1L << (ASSIGN_MUL - 82)) | (1L << (ASSIGN_DIV - 82)) | (1L << (ASSIGN_PERCENT - 82)) | (1L << (ASSIGN_OR - 82)) | (1L << (ASSIGN_AND - 82)) | (1L << (ASSIGN_XOR - 82)) | (1L << (ASSIGN_LSHIFT - 82)) | (1L << (ASSIGN_RSHIFT - 82)))) != 0)) ) {
							((AssignExprContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(325);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(327);
						((ComparisonExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (LESS - 98)) | (1L << (LESSEQ - 98)) | (1L << (COMPARE - 98)) | (1L << (DIFFERENT - 98)) | (1L << (GREATEREQ - 98)) | (1L << (GREATER - 98)))) != 0)) ) {
							((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(328);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(330);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (COMMA - 78)) | (1L << (ADD - 78)) | (1L << (SUB - 78)) | (1L << (MUL - 78)) | (1L << (DIV - 78)) | (1L << (PERCENT - 78)) | (1L << (BITAND - 78)) | (1L << (BITOR - 78)) | (1L << (BITXOR - 78)) | (1L << (LSHIFT - 78)) | (1L << (RSHIFT - 78)) | (1L << (AND_SYMBOL - 78)) | (1L << (OR_SYMBOL - 78)) | (1L << (MINIMUM - 78)) | (1L << (MAXIMUM - 78)) | (1L << (OR - 78)) | (1L << (AND - 78)) | (1L << (IMPLY - 78)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(333);
						match(QUESTION);
						setState(334);
						expr(0);
						setState(335);
						match(COLON);
						setState(336);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(339);
						match(LEFT_BRACKET);
						setState(340);
						expr(0);
						setState(341);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(344);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(346);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(348);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(350);
						match(LOOKUP_OP);
						setState(351);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(353);
						match(LEFT_PARENTHESIS);
						setState(354);
						arguments();
						setState(355);
						match(RIGHT_PARENTHESIS);
						}
						break;
					}
					} 
				}
				setState(361);
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
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(362);
				expr(0);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					expr(0);
					}
					}
					setState(369);
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
			setState(372);
			type();
			setState(373);
			variableID();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(374);
				match(COMMA);
				setState(375);
				variableID();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (URGENT - 125)) | (1L << (BROADCAST - 125)) | (1L << (META - 125)) | (1L << (CONST - 125)))) != 0)) {
				{
				setState(385);
				prefix();
				}
			}

			setState(388);
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
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URGENT:
				_localctx = new UrgentPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(URGENT);
				}
				break;
			case BROADCAST:
				_localctx = new BroadcastPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(BROADCAST);
				}
				break;
			case META:
				_localctx = new MetaPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(META);
				}
				break;
			case CONST:
				_localctx = new ConstPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
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
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				match(INT);
				setState(403);
				match(LEFT_BRACKET);
				setState(404);
				expr(0);
				setState(405);
				match(COMMA);
				setState(406);
				expr(0);
				setState(407);
				match(RIGHT_BRACKET);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(409);
				match(SCALAR);
				setState(410);
				match(LEFT_BRACKET);
				setState(411);
				expr(0);
				setState(412);
				match(RIGHT_BRACKET);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				match(STRUCT);
				setState(415);
				match(LEFT_BRACE);
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(416);
					fieldDecl();
					}
					}
					setState(419); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (URGENT - 125)) | (1L << (BROADCAST - 125)) | (1L << (META - 125)) | (1L << (CONST - 125)) | (1L << (INT - 125)) | (1L << (DOUBLE - 125)) | (1L << (CLOCK - 125)) | (1L << (CHAN - 125)) | (1L << (BOOL - 125)) | (1L << (SCALAR - 125)) | (1L << (STRUCT - 125)) | (1L << (IDENTIFIER - 125)))) != 0) );
				setState(421);
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
			setState(425);
			type();
			setState(426);
			varFieldDecl();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(427);
				match(COMMA);
				setState(428);
				varFieldDecl();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
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
			setState(436);
			match(IDENTIFIER);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(437);
				arrayDecl();
				}
				}
				setState(442);
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
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(LEFT_BRACKET);
				setState(444);
				expr(0);
				setState(445);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(LEFT_BRACKET);
				setState(448);
				type();
				setState(449);
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
			setState(453);
			match(IDENTIFIER);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(454);
				arrayDecl();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==ASSIGN_COLON) {
				{
				setState(460);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ASSIGN_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(461);
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
			setState(476);
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
				setState(464);
				expr(0);
				}
				break;
			case LEFT_BRACE:
				_localctx = new InitialiserArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LEFT_BRACE);
				setState(466);
				initialiser();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(467);
					match(COMMA);
					setState(468);
					initialiser();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
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
			setState(478);
			match(TYPEDEF);
			setState(479);
			type();
			setState(480);
			varFieldDecl();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(481);
				match(COMMA);
				setState(482);
				varFieldDecl();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
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
			                
			setState(491);
			type();
			setState(492);
			match(IDENTIFIER);
			setState(493);
			match(LEFT_PARENTHESIS);
			setState(494);
			funcParameters();
			setState(495);
			match(RIGHT_PARENTHESIS);
			setState(496);
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
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (URGENT - 125)) | (1L << (BROADCAST - 125)) | (1L << (META - 125)) | (1L << (CONST - 125)) | (1L << (INT - 125)) | (1L << (DOUBLE - 125)) | (1L << (CLOCK - 125)) | (1L << (CHAN - 125)) | (1L << (BOOL - 125)) | (1L << (SCALAR - 125)) | (1L << (STRUCT - 125)) | (1L << (IDENTIFIER - 125)))) != 0)) {
				{
				setState(499);
				funcParameter();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(500);
					match(COMMA);
					setState(501);
					funcParameter();
					}
					}
					setState(506);
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
			setState(509);
			type();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(510);
				match(BITAND);
				}
			}

			setState(513);
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
			setState(515);
			match(LEFT_BRACE);
			setState(516);
			declContent();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (FOR - 61)) | (1L << (WHILE - 61)) | (1L << (DO - 61)) | (1L << (IF - 61)) | (1L << (RETURN - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (LEFT_BRACE - 61)) | (1L << (SEMICOLON - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				{
				setState(517);
				statement();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				block();
				}
				break;
			case 2:
				_localctx = new StatementSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new StatementExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				expr(0);
				setState(528);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				forLoop();
				}
				break;
			case 5:
				_localctx = new StatementIterationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				iteration();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				whileLoop();
				}
				break;
			case 7:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				doWhile();
				}
				break;
			case 8:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(534);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(535);
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
			setState(538);
			match(FOR);
			setState(539);
			match(LEFT_PARENTHESIS);
			setState(540);
			expr(0);
			setState(541);
			match(SEMICOLON);
			setState(542);
			expr(0);
			setState(543);
			match(SEMICOLON);
			setState(544);
			expr(0);
			setState(545);
			match(RIGHT_PARENTHESIS);
			setState(546);
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
			setState(548);
			match(FOR);
			setState(549);
			match(LEFT_PARENTHESIS);
			setState(550);
			match(IDENTIFIER);
			setState(551);
			match(COLON);
			setState(552);
			type();
			setState(553);
			match(RIGHT_PARENTHESIS);
			setState(554);
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
			setState(556);
			match(WHILE);
			setState(557);
			match(LEFT_PARENTHESIS);
			setState(558);
			expr(0);
			setState(559);
			match(RIGHT_PARENTHESIS);
			setState(560);
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
			setState(562);
			match(DO);
			setState(563);
			statement();
			setState(564);
			match(WHILE);
			setState(565);
			match(LEFT_PARENTHESIS);
			setState(566);
			expr(0);
			setState(567);
			match(RIGHT_PARENTHESIS);
			setState(568);
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
			setState(570);
			match(IF);
			setState(571);
			match(LEFT_PARENTHESIS);
			setState(572);
			expr(0);
			setState(573);
			match(RIGHT_PARENTHESIS);
			setState(574);
			statement();
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(575);
				match(ELSE);
				setState(576);
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
			setState(579);
			match(RETURN);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(580);
				expr(0);
				}
			}

			setState(583);
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
			setState(585);
			match(CHAN);
			setState(586);
			match(PRIORITY);
			setState(587);
			chanOrDef();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==LESS) {
				{
				{
				setState(588);
				chanSeparator();
				setState(589);
				chanOrDef();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
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
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(598);
				chanExpr(0);
				}
				break;
			case DEFAULT:
				{
				setState(599);
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
			setState(602);
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

			setState(605);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(614);
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
					setState(607);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(608);
					match(LEFT_BRACKET);
					setState(609);
					expr(0);
					setState(610);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(616);
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
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(617);
				chardata();
				}
			}

			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << CDATA) | (1L << EntityRef) | (1L << CharRef) | (1L << PI))) != 0)) {
				{
				{
				setState(624);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EntityRef:
				case CharRef:
					{
					setState(620);
					reference();
					}
					break;
				case CDATA:
					{
					setState(621);
					match(CDATA);
					}
					break;
				case PI:
					{
					setState(622);
					match(PI);
					}
					break;
				case COMMENT:
					{
					setState(623);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(626);
					chardata();
					}
				}

				}
				}
				setState(633);
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
			setState(634);
			match(OPEN);
			setState(635);
			match(TEMPLATE);
			setState(636);
			match(CLOSE);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(637);
				misc();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			tempContent();
			setState(644);
			match(OPEN_SLASH);
			setState(645);
			match(TEMPLATE);
			setState(646);
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
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(648);
				name();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(649);
					misc();
					}
					}
					setState(654);
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
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARAMETER) {
				{
				setState(658);
				parameter();
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(659);
					misc();
					}
					}
					setState(664);
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
			                
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_DECLARATION) {
				{
				setState(668);
				declaration();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(669);
					misc();
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(691); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						{
						setState(677);
						location();
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(678);
							misc();
							}
							}
							setState(683);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(684);
						branchpoint();
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(685);
							misc();
							}
							}
							setState(690);
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
				setState(693); 
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
			setState(696);
			initLoc();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(697);
				misc();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}

			                    this.initLocationId=_localctx.initLoc().STRING().getText();

			                
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(704);
				transition();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(705);
					misc();
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(715);
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
			setState(718);
			match(OPEN_PARAMETER);
			setState(719);
			funcParameters();
			setState(720);
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
			setState(722);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(723);
			match(EQUALS);
			setState(724);
			match(STRING);
			setState(725);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(726);
			match(EQUALS);
			setState(727);
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
			setState(729);
			match(OPEN);
			setState(730);
			match(INIT);
			setState(731);
			match(REF);
			setState(732);
			match(EQUALS);
			setState(733);
			match(STRING);
			setState(734);
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
			setState(736);
			match(OPEN);
			setState(737);
			match(BRANCHPOINT);
			setState(738);
			match(ID);
			setState(739);
			match(EQUALS);
			setState(740);
			match(STRING);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(741);
				coordinate();
				}
			}

			setState(744);
			match(CLOSE);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(745);
				misc();
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
			match(OPEN_SLASH);
			setState(752);
			match(BRANCHPOINT);
			setState(753);
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
		public List<LabelLocContext> labelLoc() {
			return getRuleContexts(LabelLocContext.class);
		}
		public LabelLocContext labelLoc(int i) {
			return getRuleContext(LabelLocContext.class,i);
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
			setState(755);
			match(OPEN);
			setState(756);
			match(LOCATION);
			setState(757);
			match(ID);
			setState(758);
			match(EQUALS);
			setState(759);
			match(STRING);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(760);
				coordinate();
				}
			}

			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(763);
				color();
				}
			}

			setState(766);
			match(CLOSE);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(767);
				misc();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(773);
				name();
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(774);
					misc();
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_INV) {
				{
				{
				setState(782);
				labelLoc();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(783);
					misc();
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(794);
				match(OPEN);
				setState(795);
				_la = _input.LA(1);
				if ( !(_la==URGENT_LOC || _la==COMMITTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(796);
				match(SLASH_CLOSE);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(797);
					misc();
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(805);
			match(OPEN_SLASH);
			setState(806);
			match(LOCATION);
			setState(807);
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
		enterRule(_localctx, 94, RULE_labelLoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(OPEN_INV);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(810);
				misc();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			expr(0);
			setState(817);
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
		enterRule(_localctx, 96, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(OPEN);
			setState(820);
			match(NAME);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(821);
				coordinate();
				}
			}

			setState(824);
			match(CLOSE);
			setState(825);
			anything();
			setState(826);
			match(OPEN_SLASH);
			setState(827);
			match(NAME);
			setState(828);
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
		enterRule(_localctx, 98, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(COLOR);
			setState(831);
			match(EQUALS);
			setState(832);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(OPEN);
			setState(835);
			match(TRANSITION);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(836);
				color();
				}
			}

			setState(839);
			match(CLOSE);

			                    this.currentTransition++;
			                
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(841);
				misc();
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(847);
			source();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(848);
				misc();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(854);
			target();
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(855);
				misc();
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(861);
						labelTrans();
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(862);
							misc();
							}
							}
							setState(867);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(868);
						labelTransGuard();
						setState(872);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(869);
							misc();
							}
							}
							setState(874);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 3:
						{
						setState(875);
						labelTransSyncInput();
						setState(879);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(876);
							misc();
							}
							}
							setState(881);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 4:
						{
						setState(882);
						labelTransSyncOutput();
						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
							{
							{
							setState(883);
							misc();
							}
							}
							setState(888);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(894);
				nail();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(895);
					misc();
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			match(OPEN_SLASH);
			setState(907);
			match(TRANSITION);
			setState(908);
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
			setState(911);
			match(OPEN_GUARD);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(912);
				guardExpr(0);
				}
			}

			setState(915);
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
			setState(917);
			match(OPEN_SYNC);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(918);
				expr(0);
				setState(919);
				match(QUESTION);
				}
			}

			setState(923);
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
			setState(927);
			match(OPEN_SYNC);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(928);
				expr(0);
				setState(929);
				match(EXCLAMATION);
				}
			}

			setState(933);
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
		public TerminalNode OPEN() { return getToken(UppaalParser.OPEN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(UppaalParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(UppaalParser.LABEL, i);
		}
		public TerminalNode KIND() { return getToken(UppaalParser.KIND, 0); }
		public TerminalNode EQUALS() { return getToken(UppaalParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(UppaalParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(OPEN);
			setState(938);
			match(LABEL);
			setState(939);
			match(KIND);
			setState(940);
			match(EQUALS);
			setState(941);
			match(STRING);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(942);
				coordinate();
				}
			}

			setState(945);
			match(CLOSE);
			setState(946);
			anything();
			setState(947);
			match(OPEN_SLASH);
			setState(948);
			match(LABEL);
			setState(949);
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
			setState(951);
			match(OPEN_LBLTR);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(952);
				misc();
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(958);
			expr(0);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(959);
				match(COMMA);
				setState(960);
				expr(0);
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966);
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
			setState(968);
			match(OPEN_SELECT);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(969);
				misc();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			selectList(0);
			setState(976);
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
			setState(979);
			match(IDENTIFIER);
			setState(980);
			match(COLON);
			setState(981);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_selectList);
					setState(983);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(984);
					match(COMMA);
					setState(985);
					match(IDENTIFIER);
					setState(986);
					match(COLON);
					setState(987);
					type();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_guardExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(994);
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
				setState(996);
				match(NAT);
				}
				break;
			case 3:
				{
				_localctx = new DoubleGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(997);
				match(POINT);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(998);
				match(LEFT_PARENTHESIS);
				setState(999);
				guardExpr(0);
				setState(1000);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new IncrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002);
				match(INCREMENT);
				setState(1003);
				guardExpr(15);
				}
				break;
			case 6:
				{
				_localctx = new DecrementGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1004);
				match(DECREMENT);
				setState(1005);
				guardExpr(13);
				}
				break;
			case 7:
				{
				_localctx = new UnaryGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1006);
				((UnaryGuardContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (SUB - 94)) | (1L << (EXCLAMATION - 94)) | (1L << (NOT - 94)))) != 0)) ) {
					((UnaryGuardContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1007);
				guardExpr(11);
				}
				break;
			case 8:
				{
				_localctx = new FuncGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1008);
				match(IDENTIFIER);
				setState(1009);
				match(LEFT_PARENTHESIS);
				setState(1010);
				guardArguments();
				setState(1011);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 9:
				{
				_localctx = new ForallGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				match(FORALL);
				setState(1014);
				match(LEFT_PARENTHESIS);
				setState(1015);
				match(IDENTIFIER);
				setState(1016);
				match(COLON);
				setState(1017);
				guardType();
				setState(1018);
				match(RIGHT_PARENTHESIS);
				setState(1019);
				guardExpr(5);
				}
				break;
			case 10:
				{
				_localctx = new ExistsGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1021);
				match(EXISTS);
				setState(1022);
				match(LEFT_PARENTHESIS);
				setState(1023);
				match(IDENTIFIER);
				setState(1024);
				match(COLON);
				setState(1025);
				guardType();
				setState(1026);
				match(RIGHT_PARENTHESIS);
				setState(1027);
				guardExpr(4);
				}
				break;
			case 11:
				{
				_localctx = new SumGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1029);
				match(SUM);
				setState(1030);
				match(LEFT_PARENTHESIS);
				setState(1031);
				match(IDENTIFIER);
				setState(1032);
				match(COLON);
				setState(1033);
				guardType();
				setState(1034);
				match(RIGHT_PARENTHESIS);
				setState(1035);
				guardExpr(3);
				}
				break;
			case 12:
				{
				_localctx = new TrueGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1037);
				match(TRUE);
				}
				break;
			case 13:
				{
				_localctx = new FalseGuardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1038);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1073);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new AssignGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1041);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1042);
						((AssignGuardContext)_localctx).assign = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ASSIGN_COLON - 82)) | (1L << (ASSIGN_ADD - 82)) | (1L << (ASSIGN_SUB - 82)) | (1L << (ASSIGN_MUL - 82)) | (1L << (ASSIGN_DIV - 82)) | (1L << (ASSIGN_PERCENT - 82)) | (1L << (ASSIGN_OR - 82)) | (1L << (ASSIGN_AND - 82)) | (1L << (ASSIGN_XOR - 82)) | (1L << (ASSIGN_LSHIFT - 82)) | (1L << (ASSIGN_RSHIFT - 82)))) != 0)) ) {
							((AssignGuardContext)_localctx).assign = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1043);
						guardExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1044);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");

						                              this.isClockLeft = this.isClockRight;
						                              this.isClockRight = false;
						                          
						setState(1046);
						((ComparisonGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (LESS - 98)) | (1L << (LESSEQ - 98)) | (1L << (COMPARE - 98)) | (1L << (DIFFERENT - 98)) | (1L << (GREATEREQ - 98)) | (1L << (GREATER - 98)))) != 0)) ) {
							((ComparisonGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1047);
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
						setState(1050);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1051);
						((BinaryGuardContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (COMMA - 78)) | (1L << (ADD - 78)) | (1L << (SUB - 78)) | (1L << (MUL - 78)) | (1L << (DIV - 78)) | (1L << (PERCENT - 78)) | (1L << (BITAND - 78)) | (1L << (BITOR - 78)) | (1L << (BITXOR - 78)) | (1L << (LSHIFT - 78)) | (1L << (RSHIFT - 78)) | (1L << (AND_SYMBOL - 78)) | (1L << (OR_SYMBOL - 78)) | (1L << (MINIMUM - 78)) | (1L << (MAXIMUM - 78)) | (1L << (OR - 78)) | (1L << (AND - 78)) | (1L << (IMPLY - 78)))) != 0)) ) {
							((BinaryGuardContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1052);
						guardExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1053);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1054);
						match(QUESTION);
						setState(1055);
						guardExpr(0);
						setState(1056);
						match(COLON);
						setState(1057);
						guardExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1059);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1060);
						match(LEFT_BRACKET);
						setState(1061);
						guardExpr(0);
						setState(1062);
						match(RIGHT_BRACKET);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1064);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1065);
						match(APOSTROPHE);
						}
						break;
					case 7:
						{
						_localctx = new GuardIncrementContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1066);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1067);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new GuardDecrementContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1068);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1069);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotGuardContext(new GuardExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_guardExpr);
						setState(1070);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1071);
						match(LOOKUP_OP);
						setState(1072);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1077);
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
		enterRule(_localctx, 118, RULE_guardArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (NAT - 61)) | (1L << (POINT - 61)) | (1L << (LEFT_PARENTHESIS - 61)) | (1L << (INCREMENT - 61)) | (1L << (DECREMENT - 61)) | (1L << (ADD - 61)) | (1L << (SUB - 61)) | (1L << (EXCLAMATION - 61)) | (1L << (NOT - 61)) | (1L << (FORALL - 61)) | (1L << (EXISTS - 61)) | (1L << (SUM - 61)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (TRUE - 137)) | (1L << (FALSE - 137)) | (1L << (IDENTIFIER - 137)))) != 0)) {
				{
				setState(1078);
				guardExpr(0);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1079);
					match(COMMA);
					setState(1080);
					guardExpr(0);
					}
					}
					setState(1085);
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
		enterRule(_localctx, 120, RULE_guardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META || _la==CONST) {
				{
				setState(1088);
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

			setState(1091);
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
		enterRule(_localctx, 122, RULE_guardTypeId);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new GuardTypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(INT);
				}
				break;
			case 2:
				_localctx = new GuardTypeIntDomainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(INT);
				setState(1095);
				match(LEFT_BRACKET);
				setState(1096);
				guardExpr(0);
				setState(1097);
				match(COMMA);
				setState(1098);
				guardExpr(0);
				setState(1099);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				_localctx = new GuardTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				match(SCALAR);
				setState(1102);
				match(LEFT_BRACKET);
				setState(1103);
				guardExpr(0);
				setState(1104);
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
		enterRule(_localctx, 124, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1108);
			match(OPEN);
			setState(1109);
			match(SOURCE);
			setState(1110);
			match(REF);
			setState(1111);
			match(EQUALS);
			setState(1112);
			match(STRING);
			setState(1113);
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
		enterRule(_localctx, 126, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(OPEN);
			setState(1118);
			match(TARGET);
			setState(1119);
			match(REF);
			setState(1120);
			match(EQUALS);
			setState(1121);
			match(STRING);
			setState(1122);
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
		enterRule(_localctx, 128, RULE_nail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(OPEN);
			setState(1126);
			match(NAIL);
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(1127);
				coordinate();
				}
			}

			setState(1130);
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
		enterRule(_localctx, 130, RULE_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(OPEN);
			setState(1133);
			match(SYSTEM);
			setState(1134);
			match(CLOSE);
			setState(1135);
			anything();
			setState(1136);
			match(OPEN_SLASH);
			setState(1137);
			match(SYSTEM);
			setState(1138);
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
		enterRule(_localctx, 132, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(OPEN);
			setState(1141);
			match(QUERIES);
			setState(1142);
			match(CLOSE);
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1143);
				misc();
				}
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN) {
				{
				{
				setState(1149);
				query();
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1150);
					misc();
					}
					}
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1161);
			match(OPEN_SLASH);
			setState(1162);
			match(QUERIES);
			setState(1163);
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
		enterRule(_localctx, 134, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(OPEN);
			setState(1166);
			match(QUERY);
			setState(1167);
			match(CLOSE);
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
				{
				{
				setState(1168);
				misc();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1174);
				formula();
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1175);
					misc();
					}
					}
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1183);
				comment();
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SEA_WS) | (1L << PI))) != 0)) {
					{
					{
					setState(1184);
					misc();
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1192);
			match(OPEN_SLASH);
			setState(1193);
			match(QUERY);
			setState(1194);
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
		enterRule(_localctx, 136, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(OPEN);
			setState(1197);
			match(FORMULA);
			setState(1198);
			match(CLOSE);
			setState(1199);
			anything();
			setState(1200);
			match(OPEN_SLASH);
			setState(1201);
			match(FORMULA);
			setState(1202);
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
		enterRule(_localctx, 138, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(OPEN);
			setState(1205);
			match(QUERY_COMMENT);
			setState(1206);
			match(CLOSE);
			setState(1207);
			anything();
			setState(1208);
			match(OPEN_SLASH);
			setState(1209);
			match(QUERY_COMMENT);
			setState(1210);
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
		case 58:
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
		"\u0004\u0001\u008b\u04bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"E\u0001\u0000\u0003\u0000\u008e\b\u0000\u0001\u0000\u0005\u0000\u0091"+
		"\b\u0000\n\u0000\f\u0000\u0094\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0098\b\u0000\n\u0000\f\u0000\u009b\t\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u009f\b\u0001\n\u0001\f\u0001\u00a2\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002\u00a7\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002\u0001\u0002\u0003\u0002"+
		"\u00b1\b\u0002\u0005\u0002\u00b3\b\u0002\n\u0002\f\u0002\u00b6\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00bb\b\u0003\n\u0003"+
		"\f\u0003\u00be\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00c9\b\u0003\n\u0003\f\u0003\u00cc\t\u0003\u0001\u0003\u0003\u0003\u00cf"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0001\b\u0001\b\u0005"+
		"\b\u00e6\b\b\n\b\f\b\u00e9\t\b\u0001\b\u0001\b\u0005\b\u00ed\b\b\n\b\f"+
		"\b\u00f0\t\b\u0004\b\u00f2\b\b\u000b\b\f\b\u00f3\u0001\b\u0001\b\u0005"+
		"\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\b\u0001\b\u0005\b\u00ff\b\b\n\b\f"+
		"\b\u0102\t\b\u0003\b\u0104\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0005\n\u010f\b\n\n\n\f\n\u0112\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0118\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0142\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0166\b\f\n\f\f\f\u0169\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u016e\b\r\n\r\f\r\u0171\t\r\u0003\r\u0173\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0179\b\u000e"+
		"\n\u000e\f\u000e\u017c\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0003\u000f\u0183\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u018b\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u01a2\b\u0011\u000b\u0011\f"+
		"\u0011\u01a3\u0001\u0011\u0001\u0011\u0003\u0011\u01a8\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ae\b\u0012\n\u0012"+
		"\f\u0012\u01b1\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u01b7\b\u0013\n\u0013\f\u0013\u01ba\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01c4\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01c8"+
		"\b\u0015\n\u0015\f\u0015\u01cb\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01cf\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u01d6\b\u0016\n\u0016\f\u0016\u01d9\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01dd\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u01e4\b\u0017\n\u0017\f\u0017\u01e7\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01f7\b\u0019\n\u0019\f\u0019\u01fa"+
		"\t\u0019\u0003\u0019\u01fc\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0200\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u0207\b\u001b\n\u001b\f\u001b\u020a\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0219\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0242\b!\u0001"+
		"\"\u0001\"\u0003\"\u0246\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u0250\b#\n#\f#\u0253\t#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u0259\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u0265\b&\n&\f&\u0268\t&\u0001\'\u0003\'\u026b\b"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0271\b\'\u0001\'\u0003\'\u0274"+
		"\b\'\u0005\'\u0276\b\'\n\'\f\'\u0279\t\'\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u027f\b(\n(\f(\u0282\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0005)\u028b\b)\n)\f)\u028e\t)\u0003)\u0290\b)\u0001)\u0001)\u0001)"+
		"\u0005)\u0295\b)\n)\f)\u0298\t)\u0003)\u029a\b)\u0001)\u0001)\u0001)\u0005"+
		")\u029f\b)\n)\f)\u02a2\t)\u0003)\u02a4\b)\u0001)\u0001)\u0005)\u02a8\b"+
		")\n)\f)\u02ab\t)\u0001)\u0001)\u0005)\u02af\b)\n)\f)\u02b2\t)\u0004)\u02b4"+
		"\b)\u000b)\f)\u02b5\u0001)\u0001)\u0001)\u0005)\u02bb\b)\n)\f)\u02be\t"+
		")\u0001)\u0001)\u0001)\u0005)\u02c3\b)\n)\f)\u02c6\t)\u0005)\u02c8\b)"+
		"\n)\f)\u02cb\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02e7"+
		"\b-\u0001-\u0001-\u0005-\u02eb\b-\n-\f-\u02ee\t-\u0001-\u0001-\u0001-"+
		"\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02fa\b.\u0001"+
		".\u0003.\u02fd\b.\u0001.\u0001.\u0005.\u0301\b.\n.\f.\u0304\t.\u0001."+
		"\u0001.\u0005.\u0308\b.\n.\f.\u030b\t.\u0003.\u030d\b.\u0001.\u0001.\u0005"+
		".\u0311\b.\n.\f.\u0314\t.\u0005.\u0316\b.\n.\f.\u0319\t.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u031f\b.\n.\f.\u0322\t.\u0003.\u0324\b.\u0001."+
		"\u0001.\u0001.\u0001.\u0001/\u0001/\u0005/\u032c\b/\n/\f/\u032f\t/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00030\u0337\b0\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00032\u0346\b2\u00012\u00012\u00012\u00052\u034b\b2\n2\f2\u034e\t2"+
		"\u00012\u00012\u00052\u0352\b2\n2\f2\u0355\t2\u00012\u00012\u00052\u0359"+
		"\b2\n2\f2\u035c\t2\u00012\u00012\u00052\u0360\b2\n2\f2\u0363\t2\u0001"+
		"2\u00012\u00052\u0367\b2\n2\f2\u036a\t2\u00012\u00012\u00052\u036e\b2"+
		"\n2\f2\u0371\t2\u00012\u00012\u00052\u0375\b2\n2\f2\u0378\t2\u00052\u037a"+
		"\b2\n2\f2\u037d\t2\u00012\u00012\u00052\u0381\b2\n2\f2\u0384\t2\u0005"+
		"2\u0386\b2\n2\f2\u0389\t2\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00033\u0392\b3\u00013\u00013\u00014\u00014\u00014\u00014\u00034\u039a"+
		"\b4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00035\u03a4"+
		"\b5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u03b0\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00057\u03ba\b7\n7\f7\u03bd\t7\u00017\u00017\u00017\u00057\u03c2\b7"+
		"\n7\f7\u03c5\t7\u00017\u00017\u00018\u00018\u00058\u03cb\b8\n8\f8\u03ce"+
		"\t8\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00059\u03dd\b9\n9\f9\u03e0\t9\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0410\b:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u0432\b:\n:"+
		"\f:\u0435\t:\u0001;\u0001;\u0001;\u0005;\u043a\b;\n;\f;\u043d\t;\u0003"+
		";\u043f\b;\u0001<\u0003<\u0442\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003"+
		"=\u0453\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0003@\u0469\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0005B\u0479\bB\nB"+
		"\fB\u047c\tB\u0001B\u0001B\u0005B\u0480\bB\nB\fB\u0483\tB\u0005B\u0485"+
		"\bB\nB\fB\u0488\tB\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0005C\u0492\bC\nC\fC\u0495\tC\u0001C\u0001C\u0005C\u0499\bC\nC\fC\u049c"+
		"\tC\u0003C\u049e\bC\u0001C\u0001C\u0005C\u04a2\bC\nC\fC\u04a5\tC\u0003"+
		"C\u04a7\bC\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0000\u0004\u0018LrtF\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u0000"+
		"\f\u0001\u0000\u0004\u0005\u0002\u0000\u0006\u0006\u0011\u0011\u0003\u0000"+
		"\u0001\u0001\u0006\u000666\u0001\u0000^a\u0001\u0000R]\u0001\u0000bg\u0003"+
		"\u0000NN^_hv\u0001\u0000RS\u0002\u0000NNbb\u0001\u0000\u001d\u001e\u0001"+
		"\u0000\u001f \u0001\u0000\u007f\u0080\u0527\u0000\u008d\u0001\u0000\u0000"+
		"\u0000\u0002\u009c\u0001\u0000\u0000\u0000\u0004\u00a6\u0001\u0000\u0000"+
		"\u0000\u0006\u00ce\u0001\u0000\u0000\u0000\b\u00d0\u0001\u0000\u0000\u0000"+
		"\n\u00d2\u0001\u0000\u0000\u0000\f\u00d6\u0001\u0000\u0000\u0000\u000e"+
		"\u00d8\u0001\u0000\u0000\u0000\u0010\u00da\u0001\u0000\u0000\u0000\u0012"+
		"\u0109\u0001\u0000\u0000\u0000\u0014\u0110\u0001\u0000\u0000\u0000\u0016"+
		"\u0117\u0001\u0000\u0000\u0000\u0018\u0141\u0001\u0000\u0000\u0000\u001a"+
		"\u0172\u0001\u0000\u0000\u0000\u001c\u0174\u0001\u0000\u0000\u0000\u001e"+
		"\u0182\u0001\u0000\u0000\u0000 \u018a\u0001\u0000\u0000\u0000\"\u01a7"+
		"\u0001\u0000\u0000\u0000$\u01a9\u0001\u0000\u0000\u0000&\u01b4\u0001\u0000"+
		"\u0000\u0000(\u01c3\u0001\u0000\u0000\u0000*\u01c5\u0001\u0000\u0000\u0000"+
		",\u01dc\u0001\u0000\u0000\u0000.\u01de\u0001\u0000\u0000\u00000\u01ea"+
		"\u0001\u0000\u0000\u00002\u01fb\u0001\u0000\u0000\u00004\u01fd\u0001\u0000"+
		"\u0000\u00006\u0203\u0001\u0000\u0000\u00008\u0218\u0001\u0000\u0000\u0000"+
		":\u021a\u0001\u0000\u0000\u0000<\u0224\u0001\u0000\u0000\u0000>\u022c"+
		"\u0001\u0000\u0000\u0000@\u0232\u0001\u0000\u0000\u0000B\u023a\u0001\u0000"+
		"\u0000\u0000D\u0243\u0001\u0000\u0000\u0000F\u0249\u0001\u0000\u0000\u0000"+
		"H\u0258\u0001\u0000\u0000\u0000J\u025a\u0001\u0000\u0000\u0000L\u025c"+
		"\u0001\u0000\u0000\u0000N\u026a\u0001\u0000\u0000\u0000P\u027a\u0001\u0000"+
		"\u0000\u0000R\u028f\u0001\u0000\u0000\u0000T\u02ce\u0001\u0000\u0000\u0000"+
		"V\u02d2\u0001\u0000\u0000\u0000X\u02d9\u0001\u0000\u0000\u0000Z\u02e0"+
		"\u0001\u0000\u0000\u0000\\\u02f3\u0001\u0000\u0000\u0000^\u0329\u0001"+
		"\u0000\u0000\u0000`\u0333\u0001\u0000\u0000\u0000b\u033e\u0001\u0000\u0000"+
		"\u0000d\u0342\u0001\u0000\u0000\u0000f\u038f\u0001\u0000\u0000\u0000h"+
		"\u0395\u0001\u0000\u0000\u0000j\u039f\u0001\u0000\u0000\u0000l\u03a9\u0001"+
		"\u0000\u0000\u0000n\u03b7\u0001\u0000\u0000\u0000p\u03c8\u0001\u0000\u0000"+
		"\u0000r\u03d2\u0001\u0000\u0000\u0000t\u040f\u0001\u0000\u0000\u0000v"+
		"\u043e\u0001\u0000\u0000\u0000x\u0441\u0001\u0000\u0000\u0000z\u0452\u0001"+
		"\u0000\u0000\u0000|\u0454\u0001\u0000\u0000\u0000~\u045d\u0001\u0000\u0000"+
		"\u0000\u0080\u0465\u0001\u0000\u0000\u0000\u0082\u046c\u0001\u0000\u0000"+
		"\u0000\u0084\u0474\u0001\u0000\u0000\u0000\u0086\u048d\u0001\u0000\u0000"+
		"\u0000\u0088\u04ac\u0001\u0000\u0000\u0000\u008a\u04b4\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0099\u0003\u0010\b\u0000"+
		"\u0096\u0098\u0003\u000e\u0007\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0001\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a0\u0005\u0010\u0000\u0000"+
		"\u009d\u009f\u0003\n\u0005\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u00050\u0000\u0000\u00a4\u0003"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\f\u0006\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ae\u0003\u0006\u0003\u0000\u00a9\u00ae\u0003"+
		"\b\u0004\u0000\u00aa\u00ae\u0005\u0002\u0000\u0000\u00ab\u00ae\u00056"+
		"\u0000\u0000\u00ac\u00ae\u0005\u0001\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00b1\u0003\f\u0006"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0005\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000e\u0000"+
		"\u0000\u00b8\u00bc\u00054\u0000\u0000\u00b9\u00bb\u0003\n\u0005\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005/\u0000\u0000\u00c0\u00c1\u0003\u0004\u0002\u0000\u00c1"+
		"\u00c2\u0005\u000f\u0000\u0000\u00c2\u00c3\u00054\u0000\u0000\u00c3\u00c4"+
		"\u0005/\u0000\u0000\u00c4\u00cf\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u000e\u0000\u0000\u00c6\u00ca\u00054\u0000\u0000\u00c7\u00c9\u0003\n"+
		"\u0005\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u00051\u0000\u0000\u00ce\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00cf\u0007\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0007\u0000\u0000\u0000\u00d1\t\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u00054\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4\u00d5"+
		"\u00053\u0000\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007"+
		"\u0001\u0000\u0000\u00d7\r\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0002"+
		"\u0000\u0000\u00d9\u000f\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u000e"+
		"\u0000\u0000\u00db\u00dc\u0005\u0012\u0000\u0000\u00dc\u00e0\u0005/\u0000"+
		"\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e7\u0003\u0012\t\u0000"+
		"\u00e4\u00e6\u0003\u000e\u0007\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ee\u0003P(\u0000\u00eb\u00ed"+
		"\u0003\u000e\u0007\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9"+
		"\u0003\u0082A\u0000\u00f6\u00f8\u0003\u000e\u0007\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0103\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0100\u0003"+
		"\u0084B\u0000\u00fd\u00ff\u0003\u000e\u0007\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u00fc\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u000f\u0000\u0000\u0106\u0107\u0005\u0012"+
		"\u0000\u0000\u0107\u0108\u0005/\u0000\u0000\u0108\u0011\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\f\u0000\u0000\u010a\u010b\u0003\u0014\n\u0000"+
		"\u010b\u010c\u0005:\u0000\u0000\u010c\u0013\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0003\u0016\u000b\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0015\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0118\u0003\u001c\u000e\u0000\u0114"+
		"\u0118\u0003.\u0017\u0000\u0115\u0118\u00030\u0018\u0000\u0116\u0118\u0003"+
		"F#\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119\u011a\u0006\f\uffff\uffff"+
		"\u0000\u011a\u0142\u0005\u008b\u0000\u0000\u011b\u0142\u0005=\u0000\u0000"+
		"\u011c\u0142\u0005>\u0000\u0000\u011d\u011e\u0005H\u0000\u0000\u011e\u011f"+
		"\u0003\u0018\f\u0000\u011f\u0120\u0005I\u0000\u0000\u0120\u0142\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005P\u0000\u0000\u0122\u0142\u0003\u0018"+
		"\f\u000f\u0123\u0124\u0005Q\u0000\u0000\u0124\u0142\u0003\u0018\f\r\u0125"+
		"\u0126\u0007\u0003\u0000\u0000\u0126\u0142\u0003\u0018\f\u000b\u0127\u0128"+
		"\u0005z\u0000\u0000\u0128\u0129\u0005H\u0000\u0000\u0129\u012a\u0005\u008b"+
		"\u0000\u0000\u012a\u012b\u0005x\u0000\u0000\u012b\u012c\u0003\u001e\u000f"+
		"\u0000\u012c\u012d\u0005I\u0000\u0000\u012d\u012e\u0003\u0018\f\u0005"+
		"\u012e\u0142\u0001\u0000\u0000\u0000\u012f\u0130\u0005{\u0000\u0000\u0130"+
		"\u0131\u0005H\u0000\u0000\u0131\u0132\u0005\u008b\u0000\u0000\u0132\u0133"+
		"\u0005x\u0000\u0000\u0133\u0134\u0003\u001e\u000f\u0000\u0134\u0135\u0005"+
		"I\u0000\u0000\u0135\u0136\u0003\u0018\f\u0004\u0136\u0142\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005|\u0000\u0000\u0138\u0139\u0005H\u0000\u0000"+
		"\u0139\u013a\u0005\u008b\u0000\u0000\u013a\u013b\u0005x\u0000\u0000\u013b"+
		"\u013c\u0003\u001e\u000f\u0000\u013c\u013d\u0005I\u0000\u0000\u013d\u013e"+
		"\u0003\u0018\f\u0003\u013e\u0142\u0001\u0000\u0000\u0000\u013f\u0142\u0005"+
		"\u0089\u0000\u0000\u0140\u0142\u0005\u008a\u0000\u0000\u0141\u0119\u0001"+
		"\u0000\u0000\u0000\u0141\u011b\u0001\u0000\u0000\u0000\u0141\u011c\u0001"+
		"\u0000\u0000\u0000\u0141\u011d\u0001\u0000\u0000\u0000\u0141\u0121\u0001"+
		"\u0000\u0000\u0000\u0141\u0123\u0001\u0000\u0000\u0000\u0141\u0125\u0001"+
		"\u0000\u0000\u0000\u0141\u0127\u0001\u0000\u0000\u0000\u0141\u012f\u0001"+
		"\u0000\u0000\u0000\u0141\u0137\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0167\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\n\f\u0000\u0000\u0144\u0145\u0007\u0004"+
		"\u0000\u0000\u0145\u0166\u0003\u0018\f\r\u0146\u0147\n\n\u0000\u0000\u0147"+
		"\u0148\u0007\u0005\u0000\u0000\u0148\u0166\u0003\u0018\f\u000b\u0149\u014a"+
		"\n\t\u0000\u0000\u014a\u014b\u0007\u0006\u0000\u0000\u014b\u0166\u0003"+
		"\u0018\f\n\u014c\u014d\n\b\u0000\u0000\u014d\u014e\u0005w\u0000\u0000"+
		"\u014e\u014f\u0003\u0018\f\u0000\u014f\u0150\u0005x\u0000\u0000\u0150"+
		"\u0151\u0003\u0018\f\t\u0151\u0166\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\n\u0013\u0000\u0000\u0153\u0154\u0005J\u0000\u0000\u0154\u0155\u0003"+
		"\u0018\f\u0000\u0155\u0156\u0005K\u0000\u0000\u0156\u0166\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\n\u0012\u0000\u0000\u0158\u0166\u0005G\u0000"+
		"\u0000\u0159\u015a\n\u0010\u0000\u0000\u015a\u0166\u0005P\u0000\u0000"+
		"\u015b\u015c\n\u000e\u0000\u0000\u015c\u0166\u0005Q\u0000\u0000\u015d"+
		"\u015e\n\u0007\u0000\u0000\u015e\u015f\u0005y\u0000\u0000\u015f\u0166"+
		"\u0005\u008b\u0000\u0000\u0160\u0161\n\u0006\u0000\u0000\u0161\u0162\u0005"+
		"H\u0000\u0000\u0162\u0163\u0003\u001a\r\u0000\u0163\u0164\u0005I\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0143\u0001\u0000\u0000"+
		"\u0000\u0165\u0146\u0001\u0000\u0000\u0000\u0165\u0149\u0001\u0000\u0000"+
		"\u0000\u0165\u014c\u0001\u0000\u0000\u0000\u0165\u0152\u0001\u0000\u0000"+
		"\u0000\u0165\u0157\u0001\u0000\u0000\u0000\u0165\u0159\u0001\u0000\u0000"+
		"\u0000\u0165\u015b\u0001\u0000\u0000\u0000\u0165\u015d\u0001\u0000\u0000"+
		"\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u0019\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u016a\u016f\u0003\u0018\f\u0000\u016b\u016c\u0005N\u0000\u0000"+
		"\u016c\u016e\u0003\u0018\f\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e"+
		"\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u001b\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0003\u001e\u000f\u0000\u0175\u017a\u0003*\u0015\u0000\u0176\u0177"+
		"\u0005N\u0000\u0000\u0177\u0179\u0003*\u0015\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0001\u0000"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e\u0005O\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0006\u000e\uffff"+
		"\uffff\u0000\u0180\u001d\u0001\u0000\u0000\u0000\u0181\u0183\u0003 \u0010"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0003\"\u0011\u0000"+
		"\u0185\u001f\u0001\u0000\u0000\u0000\u0186\u018b\u0005}\u0000\u0000\u0187"+
		"\u018b\u0005~\u0000\u0000\u0188\u018b\u0005\u007f\u0000\u0000\u0189\u018b"+
		"\u0005\u0080\u0000\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018a\u0187"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018b!\u0001\u0000\u0000\u0000\u018c\u01a8\u0005"+
		"\u008b\u0000\u0000\u018d\u01a8\u0005\u0082\u0000\u0000\u018e\u01a8\u0005"+
		"\u0083\u0000\u0000\u018f\u01a8\u0005\u0084\u0000\u0000\u0190\u01a8\u0005"+
		"\u0085\u0000\u0000\u0191\u01a8\u0005\u0086\u0000\u0000\u0192\u0193\u0005"+
		"\u0082\u0000\u0000\u0193\u0194\u0005J\u0000\u0000\u0194\u0195\u0003\u0018"+
		"\f\u0000\u0195\u0196\u0005N\u0000\u0000\u0196\u0197\u0003\u0018\f\u0000"+
		"\u0197\u0198\u0005K\u0000\u0000\u0198\u01a8\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u0087\u0000\u0000\u019a\u019b\u0005J\u0000\u0000\u019b\u019c"+
		"\u0003\u0018\f\u0000\u019c\u019d\u0005K\u0000\u0000\u019d\u01a8\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\u0088\u0000\u0000\u019f\u01a1\u0005"+
		"L\u0000\u0000\u01a0\u01a2\u0003$\u0012\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0005M\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a7\u018c\u0001\u0000\u0000\u0000\u01a7\u018d\u0001\u0000\u0000\u0000"+
		"\u01a7\u018e\u0001\u0000\u0000\u0000\u01a7\u018f\u0001\u0000\u0000\u0000"+
		"\u01a7\u0190\u0001\u0000\u0000\u0000\u01a7\u0191\u0001\u0000\u0000\u0000"+
		"\u01a7\u0192\u0001\u0000\u0000\u0000\u01a7\u0199\u0001\u0000\u0000\u0000"+
		"\u01a7\u019e\u0001\u0000\u0000\u0000\u01a8#\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0003\u001e\u000f\u0000\u01aa\u01af\u0003&\u0013\u0000\u01ab\u01ac"+
		"\u0005N\u0000\u0000\u01ac\u01ae\u0003&\u0013\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005O\u0000"+
		"\u0000\u01b3%\u0001\u0000\u0000\u0000\u01b4\u01b8\u0005\u008b\u0000\u0000"+
		"\u01b5\u01b7\u0003(\u0014\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\'\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005J\u0000\u0000\u01bc\u01bd\u0003"+
		"\u0018\f\u0000\u01bd\u01be\u0005K\u0000\u0000\u01be\u01c4\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0005J\u0000\u0000\u01c0\u01c1\u0003\u001e\u000f"+
		"\u0000\u01c1\u01c2\u0005K\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c3\u01bb\u0001\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c4)\u0001\u0000\u0000\u0000\u01c5\u01c9\u0005\u008b\u0000\u0000\u01c6"+
		"\u01c8\u0003(\u0014\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01ce\u0001\u0000\u0000\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0007\u0007\u0000\u0000\u01cd\u01cf"+
		"\u0003,\u0016\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf+\u0001\u0000\u0000\u0000\u01d0\u01dd\u0003\u0018"+
		"\f\u0000\u01d1\u01d2\u0005L\u0000\u0000\u01d2\u01d7\u0003,\u0016\u0000"+
		"\u01d3\u01d4\u0005N\u0000\u0000\u01d4\u01d6\u0003,\u0016\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0005M\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01d0\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d1\u0001\u0000\u0000\u0000\u01dd-\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\u0081\u0000\u0000\u01df\u01e0\u0003\u001e"+
		"\u000f\u0000\u01e0\u01e5\u0003&\u0013\u0000\u01e1\u01e2\u0005N\u0000\u0000"+
		"\u01e2\u01e4\u0003&\u0013\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005O\u0000\u0000\u01e9/\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0006\u0018\uffff\uffff\u0000\u01eb\u01ec"+
		"\u0003\u001e\u000f\u0000\u01ec\u01ed\u0005\u008b\u0000\u0000\u01ed\u01ee"+
		"\u0005H\u0000\u0000\u01ee\u01ef\u00032\u0019\u0000\u01ef\u01f0\u0005I"+
		"\u0000\u0000\u01f0\u01f1\u00036\u001b\u0000\u01f1\u01f2\u0006\u0018\uffff"+
		"\uffff\u0000\u01f21\u0001\u0000\u0000\u0000\u01f3\u01f8\u00034\u001a\u0000"+
		"\u01f4\u01f5\u0005N\u0000\u0000\u01f5\u01f7\u00034\u001a\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01f3"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc3\u0001"+
		"\u0000\u0000\u0000\u01fd\u01ff\u0003\u001e\u000f\u0000\u01fe\u0200\u0005"+
		"k\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0003&\u0013"+
		"\u0000\u02025\u0001\u0000\u0000\u0000\u0203\u0204\u0005L\u0000\u0000\u0204"+
		"\u0208\u0003\u0014\n\u0000\u0205\u0207\u00038\u001c\u0000\u0206\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0005M\u0000\u0000\u020c7\u0001\u0000\u0000\u0000\u020d\u0219\u00036"+
		"\u001b\u0000\u020e\u0219\u0005O\u0000\u0000\u020f\u0210\u0003\u0018\f"+
		"\u0000\u0210\u0211\u0005O\u0000\u0000\u0211\u0219\u0001\u0000\u0000\u0000"+
		"\u0212\u0219\u0003:\u001d\u0000\u0213\u0219\u0003<\u001e\u0000\u0214\u0219"+
		"\u0003>\u001f\u0000\u0215\u0219\u0003@ \u0000\u0216\u0219\u0003B!\u0000"+
		"\u0217\u0219\u0003D\"\u0000\u0218\u020d\u0001\u0000\u0000\u0000\u0218"+
		"\u020e\u0001\u0000\u0000\u0000\u0218\u020f\u0001\u0000\u0000\u0000\u0218"+
		"\u0212\u0001\u0000\u0000\u0000\u0218\u0213\u0001\u0000\u0000\u0000\u0218"+
		"\u0214\u0001\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000\u0218"+
		"\u0216\u0001\u0000\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219"+
		"9\u0001\u0000\u0000\u0000\u021a\u021b\u0005?\u0000\u0000\u021b\u021c\u0005"+
		"H\u0000\u0000\u021c\u021d\u0003\u0018\f\u0000\u021d\u021e\u0005O\u0000"+
		"\u0000\u021e\u021f\u0003\u0018\f\u0000\u021f\u0220\u0005O\u0000\u0000"+
		"\u0220\u0221\u0003\u0018\f\u0000\u0221\u0222\u0005I\u0000\u0000\u0222"+
		"\u0223\u00038\u001c\u0000\u0223;\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"?\u0000\u0000\u0225\u0226\u0005H\u0000\u0000\u0226\u0227\u0005\u008b\u0000"+
		"\u0000\u0227\u0228\u0005x\u0000\u0000\u0228\u0229\u0003\u001e\u000f\u0000"+
		"\u0229\u022a\u0005I\u0000\u0000\u022a\u022b\u00038\u001c\u0000\u022b="+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0005@\u0000\u0000\u022d\u022e\u0005"+
		"H\u0000\u0000\u022e\u022f\u0003\u0018\f\u0000\u022f\u0230\u0005I\u0000"+
		"\u0000\u0230\u0231\u00038\u001c\u0000\u0231?\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0005A\u0000\u0000\u0233\u0234\u00038\u001c\u0000\u0234\u0235\u0005"+
		"@\u0000\u0000\u0235\u0236\u0005H\u0000\u0000\u0236\u0237\u0003\u0018\f"+
		"\u0000\u0237\u0238\u0005I\u0000\u0000\u0238\u0239\u0005O\u0000\u0000\u0239"+
		"A\u0001\u0000\u0000\u0000\u023a\u023b\u0005B\u0000\u0000\u023b\u023c\u0005"+
		"H\u0000\u0000\u023c\u023d\u0003\u0018\f\u0000\u023d\u023e\u0005I\u0000"+
		"\u0000\u023e\u0241\u00038\u001c\u0000\u023f\u0240\u0005C\u0000\u0000\u0240"+
		"\u0242\u00038\u001c\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242C\u0001\u0000\u0000\u0000\u0243\u0245\u0005"+
		"D\u0000\u0000\u0244\u0246\u0003\u0018\f\u0000\u0245\u0244\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0005O\u0000\u0000\u0248E\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0005\u0085\u0000\u0000\u024a\u024b\u0005E\u0000\u0000\u024b"+
		"\u0251\u0003H$\u0000\u024c\u024d\u0003J%\u0000\u024d\u024e\u0003H$\u0000"+
		"\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u024c\u0001\u0000\u0000\u0000"+
		"\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0255\u0005O\u0000\u0000\u0255"+
		"G\u0001\u0000\u0000\u0000\u0256\u0259\u0003L&\u0000\u0257\u0259\u0005"+
		"F\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000"+
		"\u0000\u0000\u0259I\u0001\u0000\u0000\u0000\u025a\u025b\u0007\b\u0000"+
		"\u0000\u025bK\u0001\u0000\u0000\u0000\u025c\u025d\u0006&\uffff\uffff\u0000"+
		"\u025d\u025e\u0005\u008b\u0000\u0000\u025e\u0266\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\n\u0001\u0000\u0000\u0260\u0261\u0005J\u0000\u0000\u0261"+
		"\u0262\u0003\u0018\f\u0000\u0262\u0263\u0005K\u0000\u0000\u0263\u0265"+
		"\u0001\u0000\u0000\u0000\u0264\u025f\u0001\u0000\u0000\u0000\u0265\u0268"+
		"\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267M\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u026b\u0003\f\u0006\u0000\u026a\u0269\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u0277\u0001\u0000"+
		"\u0000\u0000\u026c\u0271\u0003\b\u0004\u0000\u026d\u0271\u0005\u0002\u0000"+
		"\u0000\u026e\u0271\u00056\u0000\u0000\u026f\u0271\u0005\u0001\u0000\u0000"+
		"\u0270\u026c\u0001\u0000\u0000\u0000\u0270\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u0274\u0003\f\u0006\u0000\u0273"+
		"\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0276\u0001\u0000\u0000\u0000\u0275\u0270\u0001\u0000\u0000\u0000\u0276"+
		"\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0001\u0000\u0000\u0000\u0278O\u0001\u0000\u0000\u0000\u0279\u0277"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0005\u000e\u0000\u0000\u027b\u027c"+
		"\u0005\u0014\u0000\u0000\u027c\u0280\u0005/\u0000\u0000\u027d\u027f\u0003"+
		"\u000e\u0007\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001"+
		"\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\u0003R)\u0000\u0284\u0285\u0005\u000f\u0000"+
		"\u0000\u0285\u0286\u0005\u0014\u0000\u0000\u0286\u0287\u0005/\u0000\u0000"+
		"\u0287Q\u0001\u0000\u0000\u0000\u0288\u028c\u0003`0\u0000\u0289\u028b"+
		"\u0003\u000e\u0007\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028b\u028e"+
		"\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c"+
		"\u0001\u0000\u0000\u0000\u028f\u0288\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0299"+
		"\u0006)\uffff\uffff\u0000\u0292\u0296\u0003T*\u0000\u0293\u0295\u0003"+
		"\u000e\u0007\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u0298\u0001"+
		"\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001"+
		"\u0000\u0000\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001"+
		"\u0000\u0000\u0000\u0299\u0292\u0001\u0000\u0000\u0000\u0299\u029a\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u02a3\u0006"+
		")\uffff\uffff\u0000\u029c\u02a0\u0003\u0012\t\u0000\u029d\u029f\u0003"+
		"\u000e\u0007\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029f\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a3\u029c\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02b3\u0001\u0000\u0000\u0000\u02a5\u02a9\u0003"+
		"\\.\u0000\u02a6\u02a8\u0003\u000e\u0007\u0000\u02a7\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02b4\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02b0\u0003Z-\u0000"+
		"\u02ad\u02af\u0003\u000e\u0007\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000"+
		"\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02a5\u0001\u0000\u0000\u0000"+
		"\u02b3\u02ac\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0006)\uffff\uffff\u0000"+
		"\u02b8\u02bc\u0003X,\u0000\u02b9\u02bb\u0003\u000e\u0007\u0000\u02ba\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf"+
		"\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c9"+
		"\u0006)\uffff\uffff\u0000\u02c0\u02c4\u0003d2\u0000\u02c1\u02c3\u0003"+
		"\u000e\u0007\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c0\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001"+
		"\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0006)\uffff\uffff\u0000\u02cdS\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0005\r\u0000\u0000\u02cf\u02d0\u00032\u0019"+
		"\u0000\u02d0\u02d1\u0005;\u0000\u0000\u02d1U\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d3\u0007\t\u0000\u0000\u02d3\u02d4\u00052\u0000\u0000\u02d4\u02d5"+
		"\u00053\u0000\u0000\u02d5\u02d6\u0007\t\u0000\u0000\u02d6\u02d7\u0005"+
		"2\u0000\u0000\u02d7\u02d8\u00053\u0000\u0000\u02d8W\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0005\u000e\u0000\u0000\u02da\u02db\u0005\u001a\u0000"+
		"\u0000\u02db\u02dc\u0005\u001b\u0000\u0000\u02dc\u02dd\u00052\u0000\u0000"+
		"\u02dd\u02de\u00053\u0000\u0000\u02de\u02df\u00051\u0000\u0000\u02dfY"+
		"\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005\u000e\u0000\u0000\u02e1\u02e2"+
		"\u0005\u0015\u0000\u0000\u02e2\u02e3\u0005\u001c\u0000\u0000\u02e3\u02e4"+
		"\u00052\u0000\u0000\u02e4\u02e6\u00053\u0000\u0000\u02e5\u02e7\u0003V"+
		"+\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ec\u0005/\u0000\u0000"+
		"\u02e9\u02eb\u0003\u000e\u0007\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u000f\u0000\u0000"+
		"\u02f0\u02f1\u0005\u0015\u0000\u0000\u02f1\u02f2\u0005/\u0000\u0000\u02f2"+
		"[\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005\u000e\u0000\u0000\u02f4\u02f5"+
		"\u0005\u0016\u0000\u0000\u02f5\u02f6\u0005\u001c\u0000\u0000\u02f6\u02f7"+
		"\u00052\u0000\u0000\u02f7\u02f9\u00053\u0000\u0000\u02f8\u02fa\u0003V"+
		"+\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fc\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003b1\u0000\u02fc"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fe\u0302\u0005/\u0000\u0000\u02ff\u0301"+
		"\u0003\u000e\u0007\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0301\u0304"+
		"\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303\u030c\u0001\u0000\u0000\u0000\u0304\u0302"+
		"\u0001\u0000\u0000\u0000\u0305\u0309\u0003`0\u0000\u0306\u0308\u0003\u000e"+
		"\u0007\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000"+
		"\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030c\u0305\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u0317\u0001\u0000\u0000\u0000\u030e\u0312\u0003^/\u0000"+
		"\u030f\u0311\u0003\u000e\u0007\u0000\u0310\u030f\u0001\u0000\u0000\u0000"+
		"\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000"+
		"\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u030e\u0001\u0000\u0000\u0000"+
		"\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0323\u0001\u0000\u0000\u0000"+
		"\u0319\u0317\u0001\u0000\u0000\u0000\u031a\u031b\u0005\u000e\u0000\u0000"+
		"\u031b\u031c\u0007\n\u0000\u0000\u031c\u0320\u00051\u0000\u0000\u031d"+
		"\u031f\u0003\u000e\u0007\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f"+
		"\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322"+
		"\u0320\u0001\u0000\u0000\u0000\u0323\u031a\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0005\u000f\u0000\u0000\u0326\u0327\u0005\u0016\u0000\u0000\u0327"+
		"\u0328\u0005/\u0000\u0000\u0328]\u0001\u0000\u0000\u0000\u0329\u032d\u0005"+
		"\u000b\u0000\u0000\u032a\u032c\u0003\u000e\u0007\u0000\u032b\u032a\u0001"+
		"\u0000\u0000\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001"+
		"\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001"+
		"\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0331\u0003"+
		"\u0018\f\u0000\u0331\u0332\u00059\u0000\u0000\u0332_\u0001\u0000\u0000"+
		"\u0000\u0333\u0334\u0005\u000e\u0000\u0000\u0334\u0336\u0005\u0018\u0000"+
		"\u0000\u0335\u0337\u0003V+\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338"+
		"\u0339\u0005/\u0000\u0000\u0339\u033a\u0003N\'\u0000\u033a\u033b\u0005"+
		"\u000f\u0000\u0000\u033b\u033c\u0005\u0018\u0000\u0000\u033c\u033d\u0005"+
		"/\u0000\u0000\u033da\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u0017\u0000"+
		"\u0000\u033f\u0340\u00052\u0000\u0000\u0340\u0341\u00053\u0000\u0000\u0341"+
		"c\u0001\u0000\u0000\u0000\u0342\u0343\u0005\u000e\u0000\u0000\u0343\u0345"+
		"\u0005#\u0000\u0000\u0344\u0346\u0003b1\u0000\u0345\u0344\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000"+
		"\u0000\u0000\u0347\u0348\u0005/\u0000\u0000\u0348\u034c\u00062\uffff\uffff"+
		"\u0000\u0349\u034b\u0003\u000e\u0007\u0000\u034a\u0349\u0001\u0000\u0000"+
		"\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000"+
		"\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u034f\u0001\u0000\u0000"+
		"\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f\u0353\u0003|>\u0000\u0350"+
		"\u0352\u0003\u000e\u0007\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0352"+
		"\u0355\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353"+
		"\u0354\u0001\u0000\u0000\u0000\u0354\u0356\u0001\u0000\u0000\u0000\u0355"+
		"\u0353\u0001\u0000\u0000\u0000\u0356\u035a\u0003~?\u0000\u0357\u0359\u0003"+
		"\u000e\u0007\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0359\u035c\u0001"+
		"\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001"+
		"\u0000\u0000\u0000\u035b\u037b\u0001\u0000\u0000\u0000\u035c\u035a\u0001"+
		"\u0000\u0000\u0000\u035d\u0361\u0003l6\u0000\u035e\u0360\u0003\u000e\u0007"+
		"\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000"+
		"\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000"+
		"\u0000\u0362\u037a\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000"+
		"\u0000\u0364\u0368\u0003f3\u0000\u0365\u0367\u0003\u000e\u0007\u0000\u0366"+
		"\u0365\u0001\u0000\u0000\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368"+
		"\u0366\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369"+
		"\u037a\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036b"+
		"\u036f\u0003h4\u0000\u036c\u036e\u0003\u000e\u0007\u0000\u036d\u036c\u0001"+
		"\u0000\u0000\u0000\u036e\u0371\u0001\u0000\u0000\u0000\u036f\u036d\u0001"+
		"\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u037a\u0001"+
		"\u0000\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0372\u0376\u0003"+
		"j5\u0000\u0373\u0375\u0003\u000e\u0007\u0000\u0374\u0373\u0001\u0000\u0000"+
		"\u0000\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000"+
		"\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379\u035d\u0001\u0000\u0000"+
		"\u0000\u0379\u0364\u0001\u0000\u0000\u0000\u0379\u036b\u0001\u0000\u0000"+
		"\u0000\u0379\u0372\u0001\u0000\u0000\u0000\u037a\u037d\u0001\u0000\u0000"+
		"\u0000\u037b\u0379\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000"+
		"\u0000\u037c\u0387\u0001\u0000\u0000\u0000\u037d\u037b\u0001\u0000\u0000"+
		"\u0000\u037e\u0382\u0003\u0080@\u0000\u037f\u0381\u0003\u000e\u0007\u0000"+
		"\u0380\u037f\u0001\u0000\u0000\u0000\u0381\u0384\u0001\u0000\u0000\u0000"+
		"\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000"+
		"\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000"+
		"\u0385\u037e\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000"+
		"\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000"+
		"\u0388\u038a\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0005\u000f\u0000\u0000\u038b\u038c\u0005#\u0000\u0000\u038c"+
		"\u038d\u0005/\u0000\u0000\u038d\u038e\u00062\uffff\uffff\u0000\u038ee"+
		"\u0001\u0000\u0000\u0000\u038f\u0391\u0005\u0007\u0000\u0000\u0390\u0392"+
		"\u0003t:\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000"+
		"\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0394\u00059\u0000"+
		"\u0000\u0394g\u0001\u0000\u0000\u0000\u0395\u0399\u0005\b\u0000\u0000"+
		"\u0396\u0397\u0003\u0018\f\u0000\u0397\u0398\u0005w\u0000\u0000\u0398"+
		"\u039a\u0001\u0000\u0000\u0000\u0399\u0396\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039c\u00059\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u00064\uffff\uffff\u0000\u039ei\u0001\u0000\u0000\u0000\u039f\u03a3\u0005"+
		"\b\u0000\u0000\u03a0\u03a1\u0003\u0018\f\u0000\u03a1\u03a2\u0005`\u0000"+
		"\u0000\u03a2\u03a4\u0001\u0000\u0000\u0000\u03a3\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a6\u00059\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a8\u00065\uffff\uffff\u0000\u03a8k\u0001\u0000\u0000\u0000\u03a9"+
		"\u03aa\u0005\u000e\u0000\u0000\u03aa\u03ab\u0005!\u0000\u0000\u03ab\u03ac"+
		"\u0005\"\u0000\u0000\u03ac\u03ad\u00052\u0000\u0000\u03ad\u03af\u0005"+
		"3\u0000\u0000\u03ae\u03b0\u0003V+\u0000\u03af\u03ae\u0001\u0000\u0000"+
		"\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b1\u03b2\u0005/\u0000\u0000\u03b2\u03b3\u0003N\'\u0000\u03b3"+
		"\u03b4\u0005\u000f\u0000\u0000\u03b4\u03b5\u0005!\u0000\u0000\u03b5\u03b6"+
		"\u0005/\u0000\u0000\u03b6m\u0001\u0000\u0000\u0000\u03b7\u03bb\u0005\t"+
		"\u0000\u0000\u03b8\u03ba\u0003\u000e\u0007\u0000\u03b9\u03b8\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bd\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000"+
		"\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0001\u0000"+
		"\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03be\u03c3\u0003\u0018"+
		"\f\u0000\u03bf\u03c0\u0005N\u0000\u0000\u03c0\u03c2\u0003\u0018\f\u0000"+
		"\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u00059\u0000\u0000\u03c7o\u0001\u0000\u0000\u0000\u03c8\u03cc"+
		"\u0005\n\u0000\u0000\u03c9\u03cb\u0003\u000e\u0007\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u03ce\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cf\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cc\u0001\u0000\u0000\u0000\u03cf\u03d0\u0003"+
		"r9\u0000\u03d0\u03d1\u00059\u0000\u0000\u03d1q\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d3\u00069\uffff\uffff\u0000\u03d3\u03d4\u0005\u008b\u0000\u0000"+
		"\u03d4\u03d5\u0005x\u0000\u0000\u03d5\u03d6\u0003\u001e\u000f\u0000\u03d6"+
		"\u03de\u0001\u0000\u0000\u0000\u03d7\u03d8\n\u0001\u0000\u0000\u03d8\u03d9"+
		"\u0005N\u0000\u0000\u03d9\u03da\u0005\u008b\u0000\u0000\u03da\u03db\u0005"+
		"x\u0000\u0000\u03db\u03dd\u0003\u001e\u000f\u0000\u03dc\u03d7\u0001\u0000"+
		"\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000"+
		"\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03dfs\u0001\u0000\u0000"+
		"\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e2\u0006:\uffff\uffff"+
		"\u0000\u03e2\u03e3\u0005\u008b\u0000\u0000\u03e3\u0410\u0006:\uffff\uffff"+
		"\u0000\u03e4\u0410\u0005=\u0000\u0000\u03e5\u0410\u0005>\u0000\u0000\u03e6"+
		"\u03e7\u0005H\u0000\u0000\u03e7\u03e8\u0003t:\u0000\u03e8\u03e9\u0005"+
		"I\u0000\u0000\u03e9\u0410\u0001\u0000\u0000\u0000\u03ea\u03eb\u0005P\u0000"+
		"\u0000\u03eb\u0410\u0003t:\u000f\u03ec\u03ed\u0005Q\u0000\u0000\u03ed"+
		"\u0410\u0003t:\r\u03ee\u03ef\u0007\u0003\u0000\u0000\u03ef\u0410\u0003"+
		"t:\u000b\u03f0\u03f1\u0005\u008b\u0000\u0000\u03f1\u03f2\u0005H\u0000"+
		"\u0000\u03f2\u03f3\u0003v;\u0000\u03f3\u03f4\u0005I\u0000\u0000\u03f4"+
		"\u0410\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005z\u0000\u0000\u03f6\u03f7"+
		"\u0005H\u0000\u0000\u03f7\u03f8\u0005\u008b\u0000\u0000\u03f8\u03f9\u0005"+
		"x\u0000\u0000\u03f9\u03fa\u0003x<\u0000\u03fa\u03fb\u0005I\u0000\u0000"+
		"\u03fb\u03fc\u0003t:\u0005\u03fc\u0410\u0001\u0000\u0000\u0000\u03fd\u03fe"+
		"\u0005{\u0000\u0000\u03fe\u03ff\u0005H\u0000\u0000\u03ff\u0400\u0005\u008b"+
		"\u0000\u0000\u0400\u0401\u0005x\u0000\u0000\u0401\u0402\u0003x<\u0000"+
		"\u0402\u0403\u0005I\u0000\u0000\u0403\u0404\u0003t:\u0004\u0404\u0410"+
		"\u0001\u0000\u0000\u0000\u0405\u0406\u0005|\u0000\u0000\u0406\u0407\u0005"+
		"H\u0000\u0000\u0407\u0408\u0005\u008b\u0000\u0000\u0408\u0409\u0005x\u0000"+
		"\u0000\u0409\u040a\u0003x<\u0000\u040a\u040b\u0005I\u0000\u0000\u040b"+
		"\u040c\u0003t:\u0003\u040c\u0410\u0001\u0000\u0000\u0000\u040d\u0410\u0005"+
		"\u0089\u0000\u0000\u040e\u0410\u0005\u008a\u0000\u0000\u040f\u03e1\u0001"+
		"\u0000\u0000\u0000\u040f\u03e4\u0001\u0000\u0000\u0000\u040f\u03e5\u0001"+
		"\u0000\u0000\u0000\u040f\u03e6\u0001\u0000\u0000\u0000\u040f\u03ea\u0001"+
		"\u0000\u0000\u0000\u040f\u03ec\u0001\u0000\u0000\u0000\u040f\u03ee\u0001"+
		"\u0000\u0000\u0000\u040f\u03f0\u0001\u0000\u0000\u0000\u040f\u03f5\u0001"+
		"\u0000\u0000\u0000\u040f\u03fd\u0001\u0000\u0000\u0000\u040f\u0405\u0001"+
		"\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u040e\u0001"+
		"\u0000\u0000\u0000\u0410\u0433\u0001\u0000\u0000\u0000\u0411\u0412\n\f"+
		"\u0000\u0000\u0412\u0413\u0007\u0004\u0000\u0000\u0413\u0432\u0003t:\r"+
		"\u0414\u0415\n\n\u0000\u0000\u0415\u0416\u0006:\uffff\uffff\u0000\u0416"+
		"\u0417\u0007\u0005\u0000\u0000\u0417\u0418\u0003t:\u000b\u0418\u0419\u0006"+
		":\uffff\uffff\u0000\u0419\u0432\u0001\u0000\u0000\u0000\u041a\u041b\n"+
		"\t\u0000\u0000\u041b\u041c\u0007\u0006\u0000\u0000\u041c\u0432\u0003t"+
		":\n\u041d\u041e\n\b\u0000\u0000\u041e\u041f\u0005w\u0000\u0000\u041f\u0420"+
		"\u0003t:\u0000\u0420\u0421\u0005x\u0000\u0000\u0421\u0422\u0003t:\t\u0422"+
		"\u0432\u0001\u0000\u0000\u0000\u0423\u0424\n\u0013\u0000\u0000\u0424\u0425"+
		"\u0005J\u0000\u0000\u0425\u0426\u0003t:\u0000\u0426\u0427\u0005K\u0000"+
		"\u0000\u0427\u0432\u0001\u0000\u0000\u0000\u0428\u0429\n\u0012\u0000\u0000"+
		"\u0429\u0432\u0005G\u0000\u0000\u042a\u042b\n\u0010\u0000\u0000\u042b"+
		"\u0432\u0005P\u0000\u0000\u042c\u042d\n\u000e\u0000\u0000\u042d\u0432"+
		"\u0005Q\u0000\u0000\u042e\u042f\n\u0007\u0000\u0000\u042f\u0430\u0005"+
		"y\u0000\u0000\u0430\u0432\u0005\u008b\u0000\u0000\u0431\u0411\u0001\u0000"+
		"\u0000\u0000\u0431\u0414\u0001\u0000\u0000\u0000\u0431\u041a\u0001\u0000"+
		"\u0000\u0000\u0431\u041d\u0001\u0000\u0000\u0000\u0431\u0423\u0001\u0000"+
		"\u0000\u0000\u0431\u0428\u0001\u0000\u0000\u0000\u0431\u042a\u0001\u0000"+
		"\u0000\u0000\u0431\u042c\u0001\u0000\u0000\u0000\u0431\u042e\u0001\u0000"+
		"\u0000\u0000\u0432\u0435\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000"+
		"\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434u\u0001\u0000\u0000"+
		"\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0436\u043b\u0003t:\u0000\u0437"+
		"\u0438\u0005N\u0000\u0000\u0438\u043a\u0003t:\u0000\u0439\u0437\u0001"+
		"\u0000\u0000\u0000\u043a\u043d\u0001\u0000\u0000\u0000\u043b\u0439\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043f\u0001"+
		"\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043e\u0436\u0001"+
		"\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043fw\u0001\u0000"+
		"\u0000\u0000\u0440\u0442\u0007\u000b\u0000\u0000\u0441\u0440\u0001\u0000"+
		"\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u0444\u0003z=\u0000\u0444y\u0001\u0000\u0000\u0000"+
		"\u0445\u0453\u0005\u0082\u0000\u0000\u0446\u0447\u0005\u0082\u0000\u0000"+
		"\u0447\u0448\u0005J\u0000\u0000\u0448\u0449\u0003t:\u0000\u0449\u044a"+
		"\u0005N\u0000\u0000\u044a\u044b\u0003t:\u0000\u044b\u044c\u0005K\u0000"+
		"\u0000\u044c\u0453\u0001\u0000\u0000\u0000\u044d\u044e\u0005\u0087\u0000"+
		"\u0000\u044e\u044f\u0005J\u0000\u0000\u044f\u0450\u0003t:\u0000\u0450"+
		"\u0451\u0005K\u0000\u0000\u0451\u0453\u0001\u0000\u0000\u0000\u0452\u0445"+
		"\u0001\u0000\u0000\u0000\u0452\u0446\u0001\u0000\u0000\u0000\u0452\u044d"+
		"\u0001\u0000\u0000\u0000\u0453{\u0001\u0000\u0000\u0000\u0454\u0455\u0005"+
		"\u000e\u0000\u0000\u0455\u0456\u0005$\u0000\u0000\u0456\u0457\u0005\u001b"+
		"\u0000\u0000\u0457\u0458\u00052\u0000\u0000\u0458\u0459\u00053\u0000\u0000"+
		"\u0459\u045a\u00051\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b"+
		"\u045c\u0006>\uffff\uffff\u0000\u045c}\u0001\u0000\u0000\u0000\u045d\u045e"+
		"\u0005\u000e\u0000\u0000\u045e\u045f\u0005%\u0000\u0000\u045f\u0460\u0005"+
		"\u001b\u0000\u0000\u0460\u0461\u00052\u0000\u0000\u0461\u0462\u00053\u0000"+
		"\u0000\u0462\u0463\u00051\u0000\u0000\u0463\u0464\u0006?\uffff\uffff\u0000"+
		"\u0464\u007f\u0001\u0000\u0000\u0000\u0465\u0466\u0005\u000e\u0000\u0000"+
		"\u0466\u0468\u0005&\u0000\u0000\u0467\u0469\u0003V+\u0000\u0468\u0467"+
		"\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u00051\u0000\u0000\u046b\u0081\u0001"+
		"\u0000\u0000\u0000\u046c\u046d\u0005\u000e\u0000\u0000\u046d\u046e\u0005"+
		"\'\u0000\u0000\u046e\u046f\u0005/\u0000\u0000\u046f\u0470\u0003N\'\u0000"+
		"\u0470\u0471\u0005\u000f\u0000\u0000\u0471\u0472\u0005\'\u0000\u0000\u0472"+
		"\u0473\u0005/\u0000\u0000\u0473\u0083\u0001\u0000\u0000\u0000\u0474\u0475"+
		"\u0005\u000e\u0000\u0000\u0475\u0476\u0005(\u0000\u0000\u0476\u047a\u0005"+
		"/\u0000\u0000\u0477\u0479\u0003\u000e\u0007\u0000\u0478\u0477\u0001\u0000"+
		"\u0000\u0000\u0479\u047c\u0001\u0000\u0000\u0000\u047a\u0478\u0001\u0000"+
		"\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u0486\u0001\u0000"+
		"\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047d\u0481\u0003\u0086"+
		"C\u0000\u047e\u0480\u0003\u000e\u0007\u0000\u047f\u047e\u0001\u0000\u0000"+
		"\u0000\u0480\u0483\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000"+
		"\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0485\u0001\u0000\u0000"+
		"\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0484\u047d\u0001\u0000\u0000"+
		"\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000"+
		"\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0489\u0001\u0000\u0000"+
		"\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048a\u0005\u000f\u0000"+
		"\u0000\u048a\u048b\u0005(\u0000\u0000\u048b\u048c\u0005/\u0000\u0000\u048c"+
		"\u0085\u0001\u0000\u0000\u0000\u048d\u048e\u0005\u000e\u0000\u0000\u048e"+
		"\u048f\u0005)\u0000\u0000\u048f\u0493\u0005/\u0000\u0000\u0490\u0492\u0003"+
		"\u000e\u0007\u0000\u0491\u0490\u0001\u0000\u0000\u0000\u0492\u0495\u0001"+
		"\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0493\u0494\u0001"+
		"\u0000\u0000\u0000\u0494\u049d\u0001\u0000\u0000\u0000\u0495\u0493\u0001"+
		"\u0000\u0000\u0000\u0496\u049a\u0003\u0088D\u0000\u0497\u0499\u0003\u000e"+
		"\u0007\u0000\u0498\u0497\u0001\u0000\u0000\u0000\u0499\u049c\u0001\u0000"+
		"\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000"+
		"\u0000\u0000\u049b\u049e\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000"+
		"\u0000\u0000\u049d\u0496\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000"+
		"\u0000\u0000\u049e\u04a6\u0001\u0000\u0000\u0000\u049f\u04a3\u0003\u008a"+
		"E\u0000\u04a0\u04a2\u0003\u000e\u0007\u0000\u04a1\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a2\u04a5\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a7\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u049f\u0001\u0000\u0000"+
		"\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000"+
		"\u0000\u04a8\u04a9\u0005\u000f\u0000\u0000\u04a9\u04aa\u0005)\u0000\u0000"+
		"\u04aa\u04ab\u0005/\u0000\u0000\u04ab\u0087\u0001\u0000\u0000\u0000\u04ac"+
		"\u04ad\u0005\u000e\u0000\u0000\u04ad\u04ae\u0005*\u0000\u0000\u04ae\u04af"+
		"\u0005/\u0000\u0000\u04af\u04b0\u0003N\'\u0000\u04b0\u04b1\u0005\u000f"+
		"\u0000\u0000\u04b1\u04b2\u0005*\u0000\u0000\u04b2\u04b3\u0005/\u0000\u0000"+
		"\u04b3\u0089\u0001\u0000\u0000\u0000\u04b4\u04b5\u0005\u000e\u0000\u0000"+
		"\u04b5\u04b6\u0005+\u0000\u0000\u04b6\u04b7\u0005/\u0000\u0000\u04b7\u04b8"+
		"\u0003N\'\u0000\u04b8\u04b9\u0005\u000f\u0000\u0000\u04b9\u04ba\u0005"+
		"+\u0000\u0000\u04ba\u04bb\u0005/\u0000\u0000\u04bb\u008b\u0001\u0000\u0000"+
		"\u0000s\u008d\u0092\u0099\u00a0\u00a6\u00ad\u00b0\u00b4\u00bc\u00ca\u00ce"+
		"\u00e0\u00e7\u00ee\u00f3\u00f9\u0100\u0103\u0110\u0117\u0141\u0165\u0167"+
		"\u016f\u0172\u017a\u0182\u018a\u01a3\u01a7\u01af\u01b8\u01c3\u01c9\u01ce"+
		"\u01d7\u01dc\u01e5\u01f8\u01fb\u01ff\u0208\u0218\u0241\u0245\u0251\u0258"+
		"\u0266\u026a\u0270\u0273\u0277\u0280\u028c\u028f\u0296\u0299\u02a0\u02a3"+
		"\u02a9\u02b0\u02b3\u02b5\u02bc\u02c4\u02c9\u02e6\u02ec\u02f9\u02fc\u0302"+
		"\u0309\u030c\u0312\u0317\u0320\u0323\u032d\u0336\u0345\u034c\u0353\u035a"+
		"\u0361\u0368\u036f\u0376\u0379\u037b\u0382\u0387\u0391\u0399\u03a3\u03af"+
		"\u03bb\u03c3\u03cc\u03de\u040f\u0431\u0433\u043b\u043e\u0441\u0452\u0468"+
		"\u047a\u0481\u0486\u0493\u049a\u049d\u04a3\u04a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}