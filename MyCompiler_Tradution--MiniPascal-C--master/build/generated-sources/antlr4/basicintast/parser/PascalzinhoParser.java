// Generated from /home/andre/Área de Trabalho/TEU/InterpreTraduto/grammar/basicintast/parser/Pascalzinho.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalzinhoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TO=7, IF=8, BEGIN=9, END=10, 
		ENDP=11, ELSE=12, THEN=13, WRITE=14, WRITELN=15, READLN=16, INT=17, FLOAT=18, 
		BOOLEAN=19, STRING=20, FOR=21, WHILE=22, ARRAY=23, VAR=24, PROCEDURE=25, 
		PROGRAM=26, TRUE=27, FALSE=28, OF=29, DO=30, GT=31, LT=32, EQ=33, GE=34, 
		LE=35, NE=36, PLUS=37, MINUS=38, MULT=39, DIV=40, OPEN=41, CLOSE=42, OPEN_BL=43, 
		CLOSE_BL=44, IS=45, EOL=46, NUM=47, VARNAME=48, STR=49, WS=50;
	public static final int
		RULE_program = 0, RULE_var = 1, RULE_var2 = 2, RULE_varn = 3, RULE_type = 4, 
		RULE_arraytype = 5, RULE_procedure = 6, RULE_start = 7, RULE_stmt = 8, 
		RULE_cond = 9, RULE_condExpr = 10, RULE_block = 11, RULE_write = 12, RULE_readln = 13, 
		RULE_attr = 14, RULE_truefalse = 15, RULE_expr = 16, RULE_expr1 = 17, 
		RULE_expr2 = 18;
	public static final String[] ruleNames = {
		"program", "var", "var2", "varn", "type", "arraytype", "procedure", "start", 
		"stmt", "cond", "condExpr", "block", "write", "readln", "attr", "truefalse", 
		"expr", "expr1", "expr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'['", "'..'", "']'", "':='", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'>'", "'<'", "'=='", 
		"'>='", "'<='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
		"'}'", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TO", "IF", "BEGIN", "END", 
		"ENDP", "ELSE", "THEN", "WRITE", "WRITELN", "READLN", "INT", "FLOAT", 
		"BOOLEAN", "STRING", "FOR", "WHILE", "ARRAY", "VAR", "PROCEDURE", "PROGRAM", 
		"TRUE", "FALSE", "OF", "DO", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", 
		"MINUS", "MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", 
		"EOL", "NUM", "VARNAME", "STR", "WS"
	};
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
	public String getGrammarFileName() { return "Pascalzinho.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	String tr ="";
	String aux="";
	char open=123;
	char close=125;     

	public PascalzinhoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public String nome;
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
			this.nome = ctx.nome;
		}
	}
	public static class ProgramStmtContext extends ProgramContext {
		public TerminalNode PROGRAM() { return getToken(PascalzinhoParser.PROGRAM, 0); }
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgramStmtContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitProgramStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramStmtBeginContext extends ProgramContext {
		public Token p;
		public Token STR;
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public TerminalNode PROGRAM() { return getToken(PascalzinhoParser.PROGRAM, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProgramStmtBeginContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitProgramStmtBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ProgramStmtBeginContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((ProgramStmtBeginContext)_localctx).p = match(PROGRAM);
				tr+="#include<iostream>\n#include<string>\n\nusing namespace std; \n\n"; ((ProgramStmtBeginContext)_localctx).nome =  (((ProgramStmtBeginContext)_localctx).STR!=null?((ProgramStmtBeginContext)_localctx).STR.getText():null);
				setState(40);
				((ProgramStmtBeginContext)_localctx).STR = match(STR);
				setState(41);
				match(EOL);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(42);
					var();
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROCEDURE) {
					{
					{
					setState(45);
					procedure();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ProgramStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(PROGRAM);
				setState(52);
				match(STR);
				setState(53);
				match(EOL);
				setState(54);
				start();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalzinhoParser.VAR, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VAR);
			setState(58);
			var2();
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

	public static class Var2Context extends ParserRuleContext {
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
	 
		public Var2Context() { }
		public void copyFrom(Var2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartLContext extends Var2Context {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public StartLContext(Var2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStartL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNameFirstContext extends Var2Context {
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public List<VarnContext> varn() {
			return getRuleContexts(VarnContext.class);
		}
		public VarnContext varn(int i) {
			return getRuleContext(VarnContext.class,i);
		}
		public VarNameFirstContext(Var2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitVarNameFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_var2);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VarNameFirstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((VarNameFirstContext)_localctx).VARNAME = match(VARNAME);
				aux+=(((VarNameFirstContext)_localctx).VARNAME!=null?((VarNameFirstContext)_localctx).VARNAME.getText():null);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(62);
					varn();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(T__0);
				setState(69);
				type();
				setState(70);
				match(EOL);
				setState(71);
				var2();
				}
				break;
			case 2:
				_localctx = new StartLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				start();
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

	public static class VarnContext extends ParserRuleContext {
		public VarnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varn; }
	 
		public VarnContext() { }
		public void copyFrom(VarnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarNameContext extends VarnContext {
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public VarNameContext(VarnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnContext varn() throws RecognitionException {
		VarnContext _localctx = new VarnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varn);
		try {
			_localctx = new VarNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
			setState(77);
			((VarNameContext)_localctx).VARNAME = match(VARNAME);
			aux+=", "+(((VarNameContext)_localctx).VARNAME!=null?((VarNameContext)_localctx).VARNAME.getText():null);
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
		public ArraytypeContext arraytype;
		public TerminalNode INT() { return getToken(PascalzinhoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PascalzinhoParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalzinhoParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(PascalzinhoParser.STRING, 0); }
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(INT);
				tr+="int "+aux+"; \n"; aux="";
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(FLOAT);
				tr+="float "+aux+"; \n";aux="";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(BOOLEAN);
				tr+="bool "+aux+"; \n";aux="";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(STRING);
				tr+="string "+aux+"; \n";aux="";
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				((TypeContext)_localctx).arraytype = arraytype();
				tr+=((TypeContext)_localctx).arraytype.value+" "+aux+"["+((TypeContext)_localctx).arraytype.n+"];\n";
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

	public static class ArraytypeContext extends ParserRuleContext {
		public String value;
		public String n;
		public Token n1;
		public Token n2;
		public Token t;
		public TerminalNode ARRAY() { return getToken(PascalzinhoParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(PascalzinhoParser.OF, 0); }
		public List<TerminalNode> NUM() { return getTokens(PascalzinhoParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PascalzinhoParser.NUM, i);
		}
		public TerminalNode INT() { return getToken(PascalzinhoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PascalzinhoParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PascalzinhoParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalzinhoParser.BOOLEAN, 0); }
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arraytype);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(ARRAY);
				setState(94);
				match(T__2);
				setState(95);
				((ArraytypeContext)_localctx).n1 = match(NUM);
				setState(96);
				match(T__3);
				setState(97);
				((ArraytypeContext)_localctx).n2 = match(NUM);
				setState(98);
				match(T__4);
				setState(99);
				match(OF);
				setState(100);
				((ArraytypeContext)_localctx).t = match(INT);
				((ArraytypeContext)_localctx).value =  "int "; ((ArraytypeContext)_localctx).n =  (((ArraytypeContext)_localctx).n2!=null?((ArraytypeContext)_localctx).n2.getText():null)+"-"+(((ArraytypeContext)_localctx).n1!=null?((ArraytypeContext)_localctx).n1.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(ARRAY);
				setState(103);
				match(T__2);
				setState(104);
				((ArraytypeContext)_localctx).n1 = match(NUM);
				setState(105);
				match(T__3);
				setState(106);
				((ArraytypeContext)_localctx).n2 = match(NUM);
				setState(107);
				match(T__4);
				setState(108);
				match(OF);
				setState(109);
				((ArraytypeContext)_localctx).t = match(FLOAT);
				((ArraytypeContext)_localctx).value =  "float "; ((ArraytypeContext)_localctx).n =  (((ArraytypeContext)_localctx).n2!=null?((ArraytypeContext)_localctx).n2.getText():null)+"-"+(((ArraytypeContext)_localctx).n1!=null?((ArraytypeContext)_localctx).n1.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(ARRAY);
				setState(112);
				match(T__2);
				setState(113);
				((ArraytypeContext)_localctx).n1 = match(NUM);
				setState(114);
				match(T__3);
				setState(115);
				((ArraytypeContext)_localctx).n2 = match(NUM);
				setState(116);
				match(T__4);
				setState(117);
				match(OF);
				setState(118);
				((ArraytypeContext)_localctx).t = match(STRING);
				((ArraytypeContext)_localctx).value =  "string "; ((ArraytypeContext)_localctx).n =  (((ArraytypeContext)_localctx).n2!=null?((ArraytypeContext)_localctx).n2.getText():null)+"-"+(((ArraytypeContext)_localctx).n1!=null?((ArraytypeContext)_localctx).n1.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(ARRAY);
				setState(121);
				match(T__2);
				setState(122);
				((ArraytypeContext)_localctx).n1 = match(NUM);
				setState(123);
				match(T__3);
				setState(124);
				((ArraytypeContext)_localctx).n2 = match(NUM);
				setState(125);
				match(T__4);
				setState(126);
				match(OF);
				setState(127);
				((ArraytypeContext)_localctx).t = match(BOOLEAN);
				((ArraytypeContext)_localctx).value =  "bool "; ((ArraytypeContext)_localctx).n =  (((ArraytypeContext)_localctx).n2!=null?((ArraytypeContext)_localctx).n2.getText():null)+"-"+(((ArraytypeContext)_localctx).n1!=null?((ArraytypeContext)_localctx).n1.getText():null);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalzinhoParser.PROCEDURE, 0); }
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalzinhoParser.END, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PROCEDURE);
			setState(132);
			match(VARNAME);
			setState(133);
			match(OPEN);
			setState(134);
			match(CLOSE);
			setState(135);
			match(EOL);
			setState(136);
			start();
			setState(137);
			match(END);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalzinhoParser.BEGIN, 0); }
		public TerminalNode ENDP() { return getToken(PascalzinhoParser.ENDP, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_start);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(BEGIN);
				tr+="\nint main()"+open+"\n";
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					stmt();
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << READLN) | (1L << FOR) | (1L << WHILE) | (1L << OPEN) | (1L << NUM) | (1L << VARNAME))) != 0) );
				setState(146);
				match(ENDP);
				tr+="return 0;\n"+close;
				Escrever.get(tr);
				}
				break;
			case IF:
			case WRITE:
			case WRITELN:
			case READLN:
			case FOR:
			case WHILE:
			case OPEN:
			case NUM:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					stmt();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << READLN) | (1L << FOR) | (1L << WHILE) | (1L << OPEN) | (1L << NUM) | (1L << VARNAME))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StmtExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAttrContext extends StmtContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StmtAttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStmtAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCondContext extends StmtContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StmtCondContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStmtCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrintContext extends StmtContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReadContext extends StmtContext {
		public ReadlnContext readln() {
			return getRuleContext(ReadlnContext.class,0);
		}
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public StmtReadContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitStmtRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				write();
				setState(158);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new StmtReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				readln();
				setState(161);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new StmtAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				attr();
				setState(164);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				expr();
				setState(167);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new StmtCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				cond();
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtContext extends CondContext {
		public AttrContext attr;
		public Token n;
		public BlockContext b1;
		public TerminalNode FOR() { return getToken(PascalzinhoParser.FOR, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalzinhoParser.TO, 0); }
		public TerminalNode DO() { return getToken(PascalzinhoParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(PascalzinhoParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalzinhoParser.END, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends CondContext {
		public CondExprContext condExpr;
		public BlockContext b1;
		public TerminalNode WHILE() { return getToken(PascalzinhoParser.WHILE, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalzinhoParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(PascalzinhoParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalzinhoParser.END, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends CondContext {
		public CondExprContext condExpr;
		public BlockContext b1;
		public TerminalNode IF() { return getToken(PascalzinhoParser.IF, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalzinhoParser.THEN, 0); }
		public TerminalNode END() { return getToken(PascalzinhoParser.END, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends CondContext {
		public CondExprContext condExpr;
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(PascalzinhoParser.IF, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalzinhoParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(PascalzinhoParser.ELSE, 0); }
		public TerminalNode END() { return getToken(PascalzinhoParser.END, 0); }
		public TerminalNode EOL() { return getToken(PascalzinhoParser.EOL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfElseStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IF);
				setState(173);
				match(OPEN);
				setState(174);
				((IfStmtContext)_localctx).condExpr = condExpr();
				setState(175);
				match(CLOSE);
				setState(176);
				match(THEN);
				tr+="if("+(((IfStmtContext)_localctx).condExpr!=null?_input.getText(((IfStmtContext)_localctx).condExpr.start,((IfStmtContext)_localctx).condExpr.stop):null)+")"+open+"\n";
				setState(178);
				((IfStmtContext)_localctx).b1 = block();
				setState(179);
				match(END);
				tr+=close+"\n";
				setState(181);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(IF);
				setState(184);
				match(OPEN);
				setState(185);
				((IfElseStmtContext)_localctx).condExpr = condExpr();
				setState(186);
				match(CLOSE);
				setState(187);
				match(THEN);
				tr+="if("+(((IfElseStmtContext)_localctx).condExpr!=null?_input.getText(((IfElseStmtContext)_localctx).condExpr.start,((IfElseStmtContext)_localctx).condExpr.stop):null)+")"+open+"\n";
				setState(189);
				((IfElseStmtContext)_localctx).b1 = block();
				tr+=close;
				setState(191);
				match(ELSE);
				tr+="else"+open+"\n";
				setState(193);
				((IfElseStmtContext)_localctx).b2 = block();
				setState(194);
				match(END);
				tr+=close+"\n";
				setState(196);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(WHILE);
				setState(199);
				match(OPEN);
				setState(200);
				((WhileStmtContext)_localctx).condExpr = condExpr();
				setState(201);
				match(CLOSE);
				setState(202);
				match(DO);
				setState(203);
				match(BEGIN);
				tr+="while("+(((WhileStmtContext)_localctx).condExpr!=null?_input.getText(((WhileStmtContext)_localctx).condExpr.start,((WhileStmtContext)_localctx).condExpr.stop):null)+")"+open+"\n";
				setState(205);
				((WhileStmtContext)_localctx).b1 = block();
				setState(206);
				match(END);
				tr+=close+"\n";
				setState(208);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(FOR);
				setState(211);
				((ForStmtContext)_localctx).attr = attr();
				setState(212);
				match(TO);
				setState(213);
				((ForStmtContext)_localctx).n = match(NUM);
				setState(214);
				match(DO);
				setState(215);
				match(BEGIN);
				String at = (((ForStmtContext)_localctx).attr!=null?_input.getText(((ForStmtContext)_localctx).attr.start,((ForStmtContext)_localctx).attr.stop):null); at= at.replace(":","");tr+="for("+at+";"+((ForStmtContext)_localctx).attr.nome+"<"+(((ForStmtContext)_localctx).n!=null?((ForStmtContext)_localctx).n.getText():null)+";"+((ForStmtContext)_localctx).attr.nome+"++)"+open+"\n";
				setState(217);
				((ForStmtContext)_localctx).b1 = block();
				setState(218);
				match(END);
				tr+=close+"\n";
				setState(220);
				match(EOL);
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

	public static class CondExprContext extends ParserRuleContext {
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	 
		public CondExprContext() { }
		public void copyFrom(CondExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondRelOpContext extends CondExprContext {
		public Token relop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondRelOpContext(CondExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitCondRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExpresionContext extends CondExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExpresionContext(CondExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitCondExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condExpr);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CondExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				expr();
				}
				break;
			case 2:
				_localctx = new CondRelOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				expr();
				setState(226);
				((CondRelOpContext)_localctx).relop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << GE) | (1L << LE) | (1L << NE))) != 0)) ) {
					((CondRelOpContext)_localctx).relop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				expr();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStmtContext extends BlockContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BlockStmtContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		try {
			_localctx = new BlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			start();
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

	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExprLnContext extends WriteContext {
		public ExprContext expr;
		public TerminalNode WRITELN() { return getToken(PascalzinhoParser.WRITELN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprLnContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitPrintExprLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStrLnContext extends WriteContext {
		public Token STR;
		public TerminalNode WRITELN() { return getToken(PascalzinhoParser.WRITELN, 0); }
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public PrintStrLnContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitPrintStrLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStrContext extends WriteContext {
		public Token STR;
		public TerminalNode WRITE() { return getToken(PascalzinhoParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public PrintStrContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends WriteContext {
		public ExprContext expr;
		public TerminalNode WRITE() { return getToken(PascalzinhoParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(WRITE);
				setState(234);
				((PrintStrContext)_localctx).STR = match(STR);
				tr+="cout <<"+ (((PrintStrContext)_localctx).STR!=null?((PrintStrContext)_localctx).STR.getText():null)+";\n";
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(WRITE);
				setState(237);
				((PrintExprContext)_localctx).expr = expr();
				tr+="cout <<"+(((PrintExprContext)_localctx).expr!=null?_input.getText(((PrintExprContext)_localctx).expr.start,((PrintExprContext)_localctx).expr.stop):null)+";\n";
				}
				break;
			case 3:
				_localctx = new PrintStrLnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(WRITELN);
				setState(241);
				((PrintStrLnContext)_localctx).STR = match(STR);
				tr+="cout <<"+(((PrintStrLnContext)_localctx).STR!=null?((PrintStrLnContext)_localctx).STR.getText():null)+" << endl;\n";
				}
				break;
			case 4:
				_localctx = new PrintExprLnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(WRITELN);
				setState(244);
				((PrintExprLnContext)_localctx).expr = expr();
				tr+="cout <<"+(((PrintExprLnContext)_localctx).expr!=null?_input.getText(((PrintExprLnContext)_localctx).expr.start,((PrintExprLnContext)_localctx).expr.stop):null)+" << endl;\n";
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

	public static class ReadlnContext extends ParserRuleContext {
		public ReadlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readln; }
	 
		public ReadlnContext() { }
		public void copyFrom(ReadlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadVarContext extends ReadlnContext {
		public Token VARNAME;
		public TerminalNode READLN() { return getToken(PascalzinhoParser.READLN, 0); }
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public ReadVarContext(ReadlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadlnContext readln() throws RecognitionException {
		ReadlnContext _localctx = new ReadlnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readln);
		try {
			_localctx = new ReadVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(READLN);
			setState(250);
			((ReadVarContext)_localctx).VARNAME = match(VARNAME);
			tr+="cin >> "+(((ReadVarContext)_localctx).VARNAME!=null?((ReadVarContext)_localctx).VARNAME.getText():null)+";\n";
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

	public static class AttrContext extends ParserRuleContext {
		public String nome;
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
			this.nome = ctx.nome;
		}
	}
	public static class AttrArrTrueFalseContext extends AttrContext {
		public Token VARNAME;
		public Token v;
		public TruefalseContext truefalse;
		public List<TerminalNode> VARNAME() { return getTokens(PascalzinhoParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PascalzinhoParser.VARNAME, i);
		}
		public TruefalseContext truefalse() {
			return getRuleContext(TruefalseContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public AttrArrTrueFalseContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrArrTrueFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrBoolContext extends AttrContext {
		public Token VARNAME;
		public TruefalseContext truefalse;
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public TruefalseContext truefalse() {
			return getRuleContext(TruefalseContext.class,0);
		}
		public AttrBoolContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrExprContext extends AttrContext {
		public Token VARNAME;
		public ExprContext expr;
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrExprContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrArrExprContext extends AttrContext {
		public Token VARNAME;
		public Token v;
		public ExprContext expr;
		public List<TerminalNode> VARNAME() { return getTokens(PascalzinhoParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PascalzinhoParser.VARNAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public AttrArrExprContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrArrStrContext extends AttrContext {
		public Token VARNAME;
		public Token v;
		public Token STR;
		public List<TerminalNode> VARNAME() { return getTokens(PascalzinhoParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PascalzinhoParser.VARNAME, i);
		}
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public AttrArrStrContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrArrStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrStringContext extends AttrContext {
		public Token VARNAME;
		public Token STR;
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public TerminalNode STR() { return getToken(PascalzinhoParser.STR, 0); }
		public AttrStringContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitAttrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attr);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AttrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((AttrExprContext)_localctx).VARNAME = match(VARNAME);
				setState(254);
				match(T__5);
				setState(255);
				((AttrExprContext)_localctx).expr = expr();
				tr+=(((AttrExprContext)_localctx).VARNAME!=null?((AttrExprContext)_localctx).VARNAME.getText():null)+" = "+(((AttrExprContext)_localctx).expr!=null?_input.getText(((AttrExprContext)_localctx).expr.start,((AttrExprContext)_localctx).expr.stop):null)+";\n"; ((AttrExprContext)_localctx).nome = (((AttrExprContext)_localctx).VARNAME!=null?((AttrExprContext)_localctx).VARNAME.getText():null);
				}
				break;
			case 2:
				_localctx = new AttrStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((AttrStringContext)_localctx).VARNAME = match(VARNAME);
				setState(259);
				match(T__5);
				setState(260);
				((AttrStringContext)_localctx).STR = match(STR);
				tr+=(((AttrStringContext)_localctx).VARNAME!=null?((AttrStringContext)_localctx).VARNAME.getText():null)+" = "+(((AttrStringContext)_localctx).STR!=null?((AttrStringContext)_localctx).STR.getText():null)+";\n"; ((AttrStringContext)_localctx).nome = (((AttrStringContext)_localctx).VARNAME!=null?((AttrStringContext)_localctx).VARNAME.getText():null);
				}
				break;
			case 3:
				_localctx = new AttrBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				((AttrBoolContext)_localctx).VARNAME = match(VARNAME);
				setState(263);
				match(T__5);
				setState(264);
				((AttrBoolContext)_localctx).truefalse = truefalse();
				tr+=(((AttrBoolContext)_localctx).VARNAME!=null?((AttrBoolContext)_localctx).VARNAME.getText():null)+" = "+(((AttrBoolContext)_localctx).truefalse!=null?_input.getText(((AttrBoolContext)_localctx).truefalse.start,((AttrBoolContext)_localctx).truefalse.stop):null)+";\n"; ((AttrBoolContext)_localctx).nome = (((AttrBoolContext)_localctx).VARNAME!=null?((AttrBoolContext)_localctx).VARNAME.getText():null);
				}
				break;
			case 4:
				_localctx = new AttrArrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				((AttrArrExprContext)_localctx).VARNAME = match(VARNAME);
				setState(268);
				match(T__2);
				setState(269);
				((AttrArrExprContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VARNAME) ) {
					((AttrArrExprContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(T__4);
				setState(271);
				match(T__5);
				setState(272);
				((AttrArrExprContext)_localctx).expr = expr();
				tr+=(((AttrArrExprContext)_localctx).VARNAME!=null?((AttrArrExprContext)_localctx).VARNAME.getText():null)+"["+(((AttrArrExprContext)_localctx).v!=null?((AttrArrExprContext)_localctx).v.getText():null)+"] = "+(((AttrArrExprContext)_localctx).expr!=null?_input.getText(((AttrArrExprContext)_localctx).expr.start,((AttrArrExprContext)_localctx).expr.stop):null)+";\n"; ((AttrArrExprContext)_localctx).nome = (((AttrArrExprContext)_localctx).VARNAME!=null?((AttrArrExprContext)_localctx).VARNAME.getText():null);
				}
				break;
			case 5:
				_localctx = new AttrArrStrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				((AttrArrStrContext)_localctx).VARNAME = match(VARNAME);
				setState(276);
				match(T__2);
				setState(277);
				((AttrArrStrContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VARNAME) ) {
					((AttrArrStrContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				match(T__4);
				setState(279);
				match(T__5);
				setState(280);
				((AttrArrStrContext)_localctx).STR = match(STR);
				tr+=(((AttrArrStrContext)_localctx).VARNAME!=null?((AttrArrStrContext)_localctx).VARNAME.getText():null)+"["+(((AttrArrStrContext)_localctx).v!=null?((AttrArrStrContext)_localctx).v.getText():null)+"] = "+(((AttrArrStrContext)_localctx).STR!=null?((AttrArrStrContext)_localctx).STR.getText():null)+";\n"; ((AttrArrStrContext)_localctx).nome = (((AttrArrStrContext)_localctx).VARNAME!=null?((AttrArrStrContext)_localctx).VARNAME.getText():null);
				}
				break;
			case 6:
				_localctx = new AttrArrTrueFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				((AttrArrTrueFalseContext)_localctx).VARNAME = match(VARNAME);
				setState(283);
				match(T__2);
				setState(284);
				((AttrArrTrueFalseContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VARNAME) ) {
					((AttrArrTrueFalseContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				match(T__4);
				setState(286);
				match(T__5);
				setState(287);
				((AttrArrTrueFalseContext)_localctx).truefalse = truefalse();
				tr+=(((AttrArrTrueFalseContext)_localctx).VARNAME!=null?((AttrArrTrueFalseContext)_localctx).VARNAME.getText():null)+"["+(((AttrArrTrueFalseContext)_localctx).v!=null?((AttrArrTrueFalseContext)_localctx).v.getText():null)+"] = "+(((AttrArrTrueFalseContext)_localctx).truefalse!=null?_input.getText(((AttrArrTrueFalseContext)_localctx).truefalse.start,((AttrArrTrueFalseContext)_localctx).truefalse.stop):null)+";\n"; ((AttrArrTrueFalseContext)_localctx).nome = (((AttrArrTrueFalseContext)_localctx).VARNAME!=null?((AttrArrTrueFalseContext)_localctx).VARNAME.getText():null);
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

	public static class TruefalseContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PascalzinhoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalzinhoParser.FALSE, 0); }
		public TruefalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truefalse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitTruefalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruefalseContext truefalse() throws RecognitionException {
		TruefalseContext _localctx = new TruefalseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_truefalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class ExprPlusContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1EmptyContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1EmptyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr1Empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				expr1();
				setState(295);
				match(PLUS);
				setState(296);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				expr1();
				setState(299);
				match(MINUS);
				setState(300);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr1EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr2EmptyContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2EmptyContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr2Empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1MultContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr1Mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1DivContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1DivContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr1Div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr1);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Expr1MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				expr2();
				setState(306);
				match(MULT);
				setState(307);
				expr();
				}
				break;
			case 2:
				_localctx = new Expr1DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				expr2();
				setState(310);
				match(DIV);
				setState(311);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr2EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr2VarContext extends Expr2Context {
		public TerminalNode VARNAME() { return getToken(PascalzinhoParser.VARNAME, 0); }
		public Expr2VarContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr2Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2NumContext extends Expr2Context {
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public Expr2NumContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr2Num(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrContext extends Expr2Context {
		public Token v;
		public List<TerminalNode> VARNAME() { return getTokens(PascalzinhoParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PascalzinhoParser.VARNAME, i);
		}
		public TerminalNode NUM() { return getToken(PascalzinhoParser.NUM, 0); }
		public ExprArrContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExprArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2ParContext extends Expr2Context {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalzinhoVisitor ) return ((PascalzinhoVisitor<? extends T>)visitor).visitExpr2Par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr2);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Expr2ParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(OPEN);
				setState(317);
				expr();
				setState(318);
				match(CLOSE);
				}
				break;
			case 2:
				_localctx = new Expr2NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new Expr2VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(VARNAME);
				}
				break;
			case 4:
				_localctx = new ExprArrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(VARNAME);
				setState(323);
				match(T__2);
				setState(324);
				((ExprArrContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VARNAME) ) {
					((ExprArrContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				match(T__4);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u014b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\7\2\61\n\2\f\2\16"+
		"\2\64\13\2\3\2\3\2\3\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4B\n\4\f"+
		"\4\16\4E\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\t\u0091\n\t\r\t\16\t\u0092\3"+
		"\t\3\t\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16\t\u009b\5\t\u009e\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e8"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00fa\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0125\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0132\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0149\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\5\3\2!&\3\2\61\62\3\2\35\36\u015d\29\3\2\2\2\4;\3\2\2\2"+
		"\6L\3\2\2\2\bN\3\2\2\2\n]\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3\2\2\2\20"+
		"\u009d\3\2\2\2\22\u00ac\3\2\2\2\24\u00e0\3\2\2\2\26\u00e7\3\2\2\2\30\u00e9"+
		"\3\2\2\2\32\u00f9\3\2\2\2\34\u00fb\3\2\2\2\36\u0124\3\2\2\2 \u0126\3\2"+
		"\2\2\"\u0131\3\2\2\2$\u013c\3\2\2\2&\u0148\3\2\2\2()\7\34\2\2)*\b\2\1"+
		"\2*+\7\63\2\2+-\7\60\2\2,.\5\4\3\2-,\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/\61"+
		"\5\16\b\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63:\3"+
		"\2\2\2\64\62\3\2\2\2\65\66\7\34\2\2\66\67\7\63\2\2\678\7\60\2\28:\5\20"+
		"\t\29(\3\2\2\29\65\3\2\2\2:\3\3\2\2\2;<\7\32\2\2<=\5\6\4\2=\5\3\2\2\2"+
		">?\7\62\2\2?C\b\4\1\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DF\3\2\2\2EC\3\2\2\2FG\7\3\2\2GH\5\n\6\2HI\7\60\2\2IJ\5\6\4\2JM\3\2"+
		"\2\2KM\5\20\t\2L>\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\7\4\2\2OP\7\62\2\2PQ"+
		"\b\5\1\2Q\t\3\2\2\2RS\7\23\2\2S^\b\6\1\2TU\7\24\2\2U^\b\6\1\2VW\7\25\2"+
		"\2W^\b\6\1\2XY\7\26\2\2Y^\b\6\1\2Z[\5\f\7\2[\\\b\6\1\2\\^\3\2\2\2]R\3"+
		"\2\2\2]T\3\2\2\2]V\3\2\2\2]X\3\2\2\2]Z\3\2\2\2^\13\3\2\2\2_`\7\31\2\2"+
		"`a\7\5\2\2ab\7\61\2\2bc\7\6\2\2cd\7\61\2\2de\7\7\2\2ef\7\37\2\2fg\7\23"+
		"\2\2g\u0084\b\7\1\2hi\7\31\2\2ij\7\5\2\2jk\7\61\2\2kl\7\6\2\2lm\7\61\2"+
		"\2mn\7\7\2\2no\7\37\2\2op\7\24\2\2p\u0084\b\7\1\2qr\7\31\2\2rs\7\5\2\2"+
		"st\7\61\2\2tu\7\6\2\2uv\7\61\2\2vw\7\7\2\2wx\7\37\2\2xy\7\26\2\2y\u0084"+
		"\b\7\1\2z{\7\31\2\2{|\7\5\2\2|}\7\61\2\2}~\7\6\2\2~\177\7\61\2\2\177\u0080"+
		"\7\7\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7\25\2\2\u0082\u0084\b\7\1\2"+
		"\u0083_\3\2\2\2\u0083h\3\2\2\2\u0083q\3\2\2\2\u0083z\3\2\2\2\u0084\r\3"+
		"\2\2\2\u0085\u0086\7\33\2\2\u0086\u0087\7\62\2\2\u0087\u0088\7+\2\2\u0088"+
		"\u0089\7,\2\2\u0089\u008a\7\60\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7"+
		"\f\2\2\u008c\17\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u0090\b\t\1\2\u008f"+
		"\u0091\5\22\n\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\r\2\2\u0095"+
		"\u0096\b\t\1\2\u0096\u0097\b\t\1\2\u0097\u009e\3\2\2\2\u0098\u009a\5\22"+
		"\n\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009e\21\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7\60\2\2\u00a1"+
		"\u00ad\3\2\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\60\2\2\u00a4\u00ad"+
		"\3\2\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\7\60\2\2\u00a7\u00ad\3\2\2"+
		"\2\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7\60\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00ad\5\24\13\2\u00ac\u009f\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a5\3"+
		"\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\23\3\2\2\2\u00ae"+
		"\u00af\7\n\2\2\u00af\u00b0\7+\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7,"+
		"\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\b\13\1\2\u00b4\u00b5\5\30\r\2\u00b5"+
		"\u00b6\7\f\2\2\u00b6\u00b7\b\13\1\2\u00b7\u00b8\7\60\2\2\u00b8\u00e1\3"+
		"\2\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\7+\2\2\u00bb\u00bc\5\26\f\2\u00bc"+
		"\u00bd\7,\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\b\13\1\2\u00bf\u00c0\5"+
		"\30\r\2\u00c0\u00c1\b\13\1\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\b\13\1\2"+
		"\u00c3\u00c4\5\30\r\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\b\13\1\2\u00c6\u00c7"+
		"\7\60\2\2\u00c7\u00e1\3\2\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\7+\2\2"+
		"\u00ca\u00cb\5\26\f\2\u00cb\u00cc\7,\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce"+
		"\7\13\2\2\u00ce\u00cf\b\13\1\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7\f\2"+
		"\2\u00d1\u00d2\b\13\1\2\u00d2\u00d3\7\60\2\2\u00d3\u00e1\3\2\2\2\u00d4"+
		"\u00d5\7\27\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8"+
		"\7\61\2\2\u00d8\u00d9\7 \2\2\u00d9\u00da\7\13\2\2\u00da\u00db\b\13\1\2"+
		"\u00db\u00dc\5\30\r\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\b\13\1\2\u00de\u00df"+
		"\7\60\2\2\u00df\u00e1\3\2\2\2\u00e0\u00ae\3\2\2\2\u00e0\u00b9\3\2\2\2"+
		"\u00e0\u00c8\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e8"+
		"\5\"\22\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\t\2\2\2\u00e5\u00e6\5\"\22"+
		"\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\27"+
		"\3\2\2\2\u00e9\u00ea\5\20\t\2\u00ea\31\3\2\2\2\u00eb\u00ec\7\20\2\2\u00ec"+
		"\u00ed\7\63\2\2\u00ed\u00fa\b\16\1\2\u00ee\u00ef\7\20\2\2\u00ef\u00f0"+
		"\5\"\22\2\u00f0\u00f1\b\16\1\2\u00f1\u00fa\3\2\2\2\u00f2\u00f3\7\21\2"+
		"\2\u00f3\u00f4\7\63\2\2\u00f4\u00fa\b\16\1\2\u00f5\u00f6\7\21\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u00f8\b\16\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00eb\3"+
		"\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa"+
		"\33\3\2\2\2\u00fb\u00fc\7\22\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\b\17"+
		"\1\2\u00fe\35\3\2\2\2\u00ff\u0100\7\62\2\2\u0100\u0101\7\b\2\2\u0101\u0102"+
		"\5\"\22\2\u0102\u0103\b\20\1\2\u0103\u0125\3\2\2\2\u0104\u0105\7\62\2"+
		"\2\u0105\u0106\7\b\2\2\u0106\u0107\7\63\2\2\u0107\u0125\b\20\1\2\u0108"+
		"\u0109\7\62\2\2\u0109\u010a\7\b\2\2\u010a\u010b\5 \21\2\u010b\u010c\b"+
		"\20\1\2\u010c\u0125\3\2\2\2\u010d\u010e\7\62\2\2\u010e\u010f\7\5\2\2\u010f"+
		"\u0110\t\3\2\2\u0110\u0111\7\7\2\2\u0111\u0112\7\b\2\2\u0112\u0113\5\""+
		"\22\2\u0113\u0114\b\20\1\2\u0114\u0125\3\2\2\2\u0115\u0116\7\62\2\2\u0116"+
		"\u0117\7\5\2\2\u0117\u0118\t\3\2\2\u0118\u0119\7\7\2\2\u0119\u011a\7\b"+
		"\2\2\u011a\u011b\7\63\2\2\u011b\u0125\b\20\1\2\u011c\u011d\7\62\2\2\u011d"+
		"\u011e\7\5\2\2\u011e\u011f\t\3\2\2\u011f\u0120\7\7\2\2\u0120\u0121\7\b"+
		"\2\2\u0121\u0122\5 \21\2\u0122\u0123\b\20\1\2\u0123\u0125\3\2\2\2\u0124"+
		"\u00ff\3\2\2\2\u0124\u0104\3\2\2\2\u0124\u0108\3\2\2\2\u0124\u010d\3\2"+
		"\2\2\u0124\u0115\3\2\2\2\u0124\u011c\3\2\2\2\u0125\37\3\2\2\2\u0126\u0127"+
		"\t\4\2\2\u0127!\3\2\2\2\u0128\u0129\5$\23\2\u0129\u012a\7\'\2\2\u012a"+
		"\u012b\5\"\22\2\u012b\u0132\3\2\2\2\u012c\u012d\5$\23\2\u012d\u012e\7"+
		"(\2\2\u012e\u012f\5\"\22\2\u012f\u0132\3\2\2\2\u0130\u0132\5$\23\2\u0131"+
		"\u0128\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132#\3\2\2\2"+
		"\u0133\u0134\5&\24\2\u0134\u0135\7)\2\2\u0135\u0136\5\"\22\2\u0136\u013d"+
		"\3\2\2\2\u0137\u0138\5&\24\2\u0138\u0139\7*\2\2\u0139\u013a\5\"\22\2\u013a"+
		"\u013d\3\2\2\2\u013b\u013d\5&\24\2\u013c\u0133\3\2\2\2\u013c\u0137\3\2"+
		"\2\2\u013c\u013b\3\2\2\2\u013d%\3\2\2\2\u013e\u013f\7+\2\2\u013f\u0140"+
		"\5\"\22\2\u0140\u0141\7,\2\2\u0141\u0149\3\2\2\2\u0142\u0149\7\61\2\2"+
		"\u0143\u0149\7\62\2\2\u0144\u0145\7\62\2\2\u0145\u0146\7\5\2\2\u0146\u0147"+
		"\t\3\2\2\u0147\u0149\7\7\2\2\u0148\u013e\3\2\2\2\u0148\u0142\3\2\2\2\u0148"+
		"\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0149\'\3\2\2\2\24-\629CL]\u0083\u0092"+
		"\u009b\u009d\u00ac\u00e0\u00e7\u00f9\u0124\u0131\u013c\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}