// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawScriptGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, SPACE=23, COMMENT_BLOCK=24, 
		COMMENT_LINE=25, ASSIGN=26, BOOL=27, NUM=28, COMPARATOR=29, OPERATOR=30, 
		NEWLINE=31, CONST=32, ID=33;
	public static final int
		RULE_script = 0, RULE_consts = 1, RULE_props = 2, RULE_logic = 3, RULE_instruction = 4, 
		RULE_set_color = 5, RULE_set_draw_mode = 6, RULE_draw_mode = 7, RULE_square = 8, 
		RULE_rectangle = 9, RULE_ellipse = 10, RULE_shape = 11, RULE_position = 12, 
		RULE_size = 13, RULE_forLoop = 14, RULE_ifStatement = 15, RULE_condition = 16, 
		RULE_ml_instruction_block = 17, RULE_instruction_block = 18, RULE_assignment_block = 19, 
		RULE_constant = 20, RULE_id = 21, RULE_num = 22, RULE_bool = 23, RULE_data_item = 24, 
		RULE_assignment = 25, RULE_color = 26, RULE_x = 27, RULE_y = 28, RULE_point = 29, 
		RULE_interval = 30, RULE_dimension = 31, RULE_l_expression = 32, RULE_r_expression = 33, 
		RULE_binary_expression = 34, RULE_expression = 35, RULE_value = 36, RULE_arithmetic = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "consts", "props", "logic", "instruction", "set_color", "set_draw_mode", 
			"draw_mode", "square", "rectangle", "ellipse", "shape", "position", "size", 
			"forLoop", "ifStatement", "condition", "ml_instruction_block", "instruction_block", 
			"assignment_block", "constant", "id", "num", "bool", "data_item", "assignment", 
			"color", "x", "y", "point", "interval", "dimension", "l_expression", 
			"r_expression", "binary_expression", "expression", "value", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'consts'", "'props'", "'logic'", "'color'", "'line'", "'fill'", 
			"'square'", "'rectangle'", "'ellipse'", "'for'", "'in'", "'if'", "'else'", 
			"'{'", "'}'", "'|'", "','", "'['", "']'", "'~'", "'('", "')'", null, 
			null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SPACE", 
			"COMMENT_BLOCK", "COMMENT_LINE", "ASSIGN", "BOOL", "NUM", "COMPARATOR", 
			"OPERATOR", "NEWLINE", "CONST", "ID"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawScriptGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(76);
				match(NEWLINE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(82);
			consts();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(83);
				match(NEWLINE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(89);
			props();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(90);
				match(NEWLINE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(96);
			logic();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97);
				match(NEWLINE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstsContext extends ParserRuleContext {
		public Assignment_blockContext assignment_block() {
			return getRuleContext(Assignment_blockContext.class,0);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			assignment_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropsContext extends ParserRuleContext {
		public Assignment_blockContext assignment_block() {
			return getRuleContext(Assignment_blockContext.class,0);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__1);
			setState(107);
			assignment_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ParserRuleContext {
		public Instruction_blockContext instruction_block() {
			return getRuleContext(Instruction_blockContext.class,0);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			instruction_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public Set_colorContext set_color() {
			return getRuleContext(Set_colorContext.class,0);
		}
		public Set_draw_modeContext set_draw_mode() {
			return getRuleContext(Set_draw_modeContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(112);
				set_color();
				}
				break;
			case T__4:
			case T__5:
				{
				setState(113);
				set_draw_mode();
				}
				break;
			case T__9:
				{
				setState(114);
				forLoop();
				}
				break;
			case T__11:
				{
				setState(115);
				ifStatement();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				{
				setState(116);
				shape();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(NEWLINE);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Set_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterSet_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitSet_color(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitSet_color(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_colorContext set_color() throws RecognitionException {
		Set_colorContext _localctx = new Set_colorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_set_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__3);
			setState(126);
			color();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_draw_modeContext extends ParserRuleContext {
		public Draw_modeContext draw_mode() {
			return getRuleContext(Draw_modeContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Set_draw_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_draw_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterSet_draw_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitSet_draw_mode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitSet_draw_mode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_draw_modeContext set_draw_mode() throws RecognitionException {
		Set_draw_modeContext _localctx = new Set_draw_modeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_draw_mode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			draw_mode();
			setState(129);
			color();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Draw_modeContext extends ParserRuleContext {
		public Draw_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterDraw_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitDraw_mode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitDraw_mode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Draw_modeContext draw_mode() throws RecognitionException {
		Draw_modeContext _localctx = new Draw_modeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_draw_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SquareContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			position();
			setState(135);
			size();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RectangleContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public RectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterRectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitRectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleContext rectangle() throws RecognitionException {
		RectangleContext _localctx = new RectangleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__7);
			setState(138);
			position();
			setState(139);
			dimension();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EllipseContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public EllipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterEllipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitEllipse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitEllipse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipseContext ellipse() throws RecognitionException {
		EllipseContext _localctx = new EllipseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ellipse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(142);
			position();
			setState(143);
			dimension();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShapeContext extends ParserRuleContext {
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public RectangleContext rectangle() {
			return getRuleContext(RectangleContext.class,0);
		}
		public EllipseContext ellipse() {
			return getRuleContext(EllipseContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shape);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				square();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				rectangle();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				ellipse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			point();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawScriptGrammarParser.ID, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Instruction_blockContext instruction_block() {
			return getRuleContext(Instruction_blockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			match(ID);
			setState(156);
			match(T__10);
			setState(157);
			interval();
			setState(158);
			instruction_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<Instruction_blockContext> instruction_block() {
			return getRuleContexts(Instruction_blockContext.class);
		}
		public Instruction_blockContext instruction_block(int i) {
			return getRuleContext(Instruction_blockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__11);
			setState(161);
			condition();
			setState(162);
			instruction_block();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(163);
				match(NEWLINE);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__12);
			setState(170);
			instruction_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public TerminalNode COMPARATOR() { return getToken(DrawScriptGrammarParser.COMPARATOR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			binary_expression(0);
			setState(173);
			match(COMPARATOR);
			setState(174);
			binary_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ml_instruction_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Ml_instruction_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ml_instruction_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterMl_instruction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitMl_instruction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitMl_instruction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ml_instruction_blockContext ml_instruction_block() throws RecognitionException {
		Ml_instruction_blockContext _localctx = new Ml_instruction_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ml_instruction_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__13);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(177);
				match(NEWLINE);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				instruction();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 6128L) != 0 );
			setState(188);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Instruction_blockContext extends ParserRuleContext {
		public Ml_instruction_blockContext ml_instruction_block() {
			return getRuleContext(Ml_instruction_blockContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public Instruction_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterInstruction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitInstruction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitInstruction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_blockContext instruction_block() throws RecognitionException {
		Instruction_blockContext _localctx = new Instruction_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instruction_block);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				ml_instruction_block();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__11:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(191);
					match(NEWLINE);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				instruction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_blockContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawScriptGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawScriptGrammarParser.NEWLINE, i);
		}
		public Assignment_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterAssignment_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitAssignment_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitAssignment_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_blockContext assignment_block() throws RecognitionException {
		Assignment_blockContext _localctx = new Assignment_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(200);
				match(NEWLINE);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__13);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(207);
				match(NEWLINE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					assignment();
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(214);
						match(NEWLINE);
						}
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(225);
			assignment();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(226);
				match(NEWLINE);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DrawScriptGrammarParser.CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CONST);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawScriptGrammarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DrawScriptGrammarParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(DrawScriptGrammarParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(BOOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_itemContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterData_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitData_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitData_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_itemContext data_item() throws RecognitionException {
		Data_itemContext _localctx = new Data_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_data_item);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				constant();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DrawScriptGrammarParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			data_item();
			setState(247);
			match(ASSIGN);
			setState(248);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_color);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				expression();
				setState(251);
				match(T__15);
				setState(252);
				expression();
				setState(253);
				match(T__15);
				setState(254);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__15);
				setState(257);
				expression();
				setState(258);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				constant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class XContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			binary_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class YContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			binary_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			x();
			setState(268);
			match(T__16);
			setState(269);
			y();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			point();
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			x();
			setState(276);
			match(T__19);
			setState(277);
			y();
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public L_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterL_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitL_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitL_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_expressionContext l_expression() throws RecognitionException {
		L_expressionContext _localctx = new L_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_l_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class R_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterR_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitR_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitR_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_expressionContext r_expression() throws RecognitionException {
		R_expressionContext _localctx = new R_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_r_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(DrawScriptGrammarParser.OPERATOR, 0); }
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		return binary_expression(0);
	}

	private Binary_expressionContext binary_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, _parentState);
		Binary_expressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_binary_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(284);
					match(T__20);
					}
				}

				setState(287);
				expression();
				setState(288);
				match(OPERATOR);
				setState(289);
				expression();
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(290);
					match(T__21);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(293);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_binary_expression);
					setState(296);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(297);
					match(OPERATOR);
					setState(298);
					binary_expression(4);
					}
					} 
				}
				setState(303);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				constant();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				id();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				num();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				binary_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				point();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				interval();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				dimension();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				color();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				bool();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DrawScriptGrammarParser.CONST, 0); }
		public TerminalNode NUM() { return getToken(DrawScriptGrammarParser.NUM, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptGrammarListener ) ((DrawScriptGrammarListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptGrammarVisitor ) return ((DrawScriptGrammarVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CONST) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return binary_expression_sempred((Binary_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean binary_expression_sempred(Binary_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u0140\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000"+
		"\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\\\b\u0000"+
		"\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000c\b\u0000"+
		"\n\u0000\f\u0000f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004"+
		"\u0001\u0004\u0005\u0004y\b\u0004\n\u0004\f\u0004|\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0095\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a5\b\u000f\n\u000f"+
		"\f\u000f\u00a8\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00b3\b\u0011\n\u0011\f\u0011\u00b6\t\u0011\u0001\u0011\u0004\u0011\u00b9"+
		"\b\u0011\u000b\u0011\f\u0011\u00ba\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00c1\b\u0012\n\u0012\f\u0012\u00c4\t\u0012\u0001"+
		"\u0012\u0003\u0012\u00c7\b\u0012\u0001\u0013\u0005\u0013\u00ca\b\u0013"+
		"\n\u0013\f\u0013\u00cd\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00d1"+
		"\b\u0013\n\u0013\f\u0013\u00d4\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00d8\b\u0013\n\u0013\f\u0013\u00db\t\u0013\u0005\u0013\u00dd\b\u0013"+
		"\n\u0013\f\u0013\u00e0\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e4"+
		"\b\u0013\n\u0013\f\u0013\u00e7\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00f5\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0106\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0003"+
		"\"\u011e\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0124\b\"\u0001\""+
		"\u0003\"\u0127\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u012c\b\"\n\"\f\"\u012f"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u0134\b#\u0001$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0003$\u013c\b$\u0001%\u0001%\u0001%\u0000\u0001D&\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0003\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\u0012\u0013\u0002\u0000\u001c\u001c  \u013c\u0000O\u0001\u0000"+
		"\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004j\u0001\u0000\u0000\u0000"+
		"\u0006m\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n}\u0001\u0000"+
		"\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000"+
		"\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000"+
		"\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000"+
		"\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000"+
		"\u0000\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u00a0\u0001\u0000\u0000"+
		"\u0000 \u00ac\u0001\u0000\u0000\u0000\"\u00b0\u0001\u0000\u0000\u0000"+
		"$\u00c6\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00ea"+
		"\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000"+
		"\u0000\u0000.\u00f0\u0001\u0000\u0000\u00000\u00f4\u0001\u0000\u0000\u0000"+
		"2\u00f6\u0001\u0000\u0000\u00004\u0105\u0001\u0000\u0000\u00006\u0107"+
		"\u0001\u0000\u0000\u00008\u0109\u0001\u0000\u0000\u0000:\u010b\u0001\u0000"+
		"\u0000\u0000<\u010f\u0001\u0000\u0000\u0000>\u0113\u0001\u0000\u0000\u0000"+
		"@\u0117\u0001\u0000\u0000\u0000B\u0119\u0001\u0000\u0000\u0000D\u0126"+
		"\u0001\u0000\u0000\u0000F\u0133\u0001\u0000\u0000\u0000H\u013b\u0001\u0000"+
		"\u0000\u0000J\u013d\u0001\u0000\u0000\u0000LN\u0005\u001f\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RV\u0003\u0002\u0001\u0000SU\u0005\u001f\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000Y]\u0003\u0004\u0002\u0000Z\\\u0005\u001f\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`d\u0003\u0006\u0003\u0000ac\u0005\u001f\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u0001\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0001\u0000\u0000hi\u0003&\u0013\u0000i\u0003\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0002\u0000\u0000kl\u0003&\u0013\u0000l\u0005\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0003\u0000\u0000no\u0003$\u0012\u0000o\u0007\u0001"+
		"\u0000\u0000\u0000pv\u0003\n\u0005\u0000qv\u0003\f\u0006\u0000rv\u0003"+
		"\u001c\u000e\u0000sv\u0003\u001e\u000f\u0000tv\u0003\u0016\u000b\u0000"+
		"up\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vz\u0001\u0000"+
		"\u0000\u0000wy\u0005\u001f\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\t\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u0004\u0000"+
		"\u0000~\u007f\u00034\u001a\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0003\u000e\u0007\u0000\u0081\u0082\u00034\u001a\u0000\u0082\r"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u000f"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0087"+
		"\u0003\u0018\f\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088\u0011\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008b\u0003\u0018"+
		"\f\u0000\u008b\u008c\u0003>\u001f\u0000\u008c\u0013\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f\u0003\u0018\f\u0000"+
		"\u008f\u0090\u0003>\u001f\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091"+
		"\u0095\u0003\u0010\b\u0000\u0092\u0095\u0003\u0012\t\u0000\u0093\u0095"+
		"\u0003\u0014\n\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0017\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0003:\u001d\u0000\u0097\u0019\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0003F#\u0000\u0099\u001b\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c\u0005!\u0000\u0000\u009c"+
		"\u009d\u0005\u000b\u0000\u0000\u009d\u009e\u0003<\u001e\u0000\u009e\u009f"+
		"\u0003$\u0012\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\f\u0000\u0000\u00a1\u00a2\u0003 \u0010\u0000\u00a2\u00a6\u0003$\u0012"+
		"\u0000\u00a3\u00a5\u0005\u001f\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\r\u0000\u0000"+
		"\u00aa\u00ab\u0003$\u0012\u0000\u00ab\u001f\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0003D\"\u0000\u00ad\u00ae\u0005\u001d\u0000\u0000\u00ae\u00af"+
		"\u0003D\"\u0000\u00af!\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005\u000e"+
		"\u0000\u0000\u00b1\u00b3\u0005\u001f\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\b\u0004"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u000f\u0000"+
		"\u0000\u00bd#\u0001\u0000\u0000\u0000\u00be\u00c7\u0003\"\u0011\u0000"+
		"\u00bf\u00c1\u0005\u001f\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\b\u0004\u0000\u00c6"+
		"\u00be\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7"+
		"%\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u001f\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d2"+
		"\u0005\u000e\u0000\u0000\u00cf\u00d1\u0005\u001f\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00de"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d9"+
		"\u00032\u0019\u0000\u00d6\u00d8\u0005\u001f\u0000\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dd\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00d5\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e5\u0003"+
		"2\u0019\u0000\u00e2\u00e4\u0005\u001f\u0000\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u000f"+
		"\u0000\u0000\u00e9\'\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005 \u0000"+
		"\u0000\u00eb)\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005!\u0000\u0000\u00ed"+
		"+\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef-\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u001b\u0000\u0000\u00f1/\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0003(\u0014\u0000\u00f3\u00f5\u0003*\u0015\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f51\u0001\u0000\u0000\u0000\u00f6\u00f7\u00030\u0018\u0000\u00f7\u00f8"+
		"\u0005\u001a\u0000\u0000\u00f8\u00f9\u0003H$\u0000\u00f93\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0003F#\u0000\u00fb\u00fc\u0005\u0010\u0000\u0000"+
		"\u00fc\u00fd\u0003F#\u0000\u00fd\u00fe\u0005\u0010\u0000\u0000\u00fe\u00ff"+
		"\u0003F#\u0000\u00ff\u0106\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0010"+
		"\u0000\u0000\u0101\u0102\u0003F#\u0000\u0102\u0103\u0005\u0010\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0106\u0003(\u0014\u0000\u0105"+
		"\u00fa\u0001\u0000\u0000\u0000\u0105\u0100\u0001\u0000\u0000\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u01065\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0003D\"\u0000\u01087\u0001\u0000\u0000\u0000\u0109\u010a\u0003D\"\u0000"+
		"\u010a9\u0001\u0000\u0000\u0000\u010b\u010c\u00036\u001b\u0000\u010c\u010d"+
		"\u0005\u0011\u0000\u0000\u010d\u010e\u00038\u001c\u0000\u010e;\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0007\u0001\u0000\u0000\u0110\u0111\u0003:\u001d"+
		"\u0000\u0111\u0112\u0007\u0001\u0000\u0000\u0112=\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u00036\u001b\u0000\u0114\u0115\u0005\u0014\u0000\u0000\u0115"+
		"\u0116\u00038\u001c\u0000\u0116?\u0001\u0000\u0000\u0000\u0117\u0118\u0003"+
		"F#\u0000\u0118A\u0001\u0000\u0000\u0000\u0119\u011a\u0003F#\u0000\u011a"+
		"C\u0001\u0000\u0000\u0000\u011b\u011d\u0006\"\uffff\uffff\u0000\u011c"+
		"\u011e\u0005\u0015\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0003F#\u0000\u0120\u0121\u0005\u001e\u0000\u0000\u0121\u0123\u0003"+
		"F#\u0000\u0122\u0124\u0005\u0016\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0003F#\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u012d\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\n\u0003\u0000\u0000\u0129\u012a\u0005\u001e\u0000\u0000\u012a\u012c"+
		"\u0003D\"\u0004\u012b\u0128\u0001\u0000\u0000\u0000\u012c\u012f\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012eE\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u0130\u0134\u0003(\u0014\u0000\u0131\u0134\u0003*\u0015\u0000"+
		"\u0132\u0134\u0003,\u0016\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134"+
		"G\u0001\u0000\u0000\u0000\u0135\u013c\u0003D\"\u0000\u0136\u013c\u0003"+
		":\u001d\u0000\u0137\u013c\u0003<\u001e\u0000\u0138\u013c\u0003>\u001f"+
		"\u0000\u0139\u013c\u00034\u001a\u0000\u013a\u013c\u0003.\u0017\u0000\u013b"+
		"\u0135\u0001\u0000\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013b"+
		"\u0137\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c"+
		"I\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0002\u0000\u0000\u013eK\u0001"+
		"\u0000\u0000\u0000\u0019OV]duz\u0094\u00a6\u00b4\u00ba\u00c2\u00c6\u00cb"+
		"\u00d2\u00d9\u00de\u00e5\u00f4\u0105\u011d\u0123\u0126\u012d\u0133\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}