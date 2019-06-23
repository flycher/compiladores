// Generated from /home/flycher/Dropbox/VScode/compiladores/QPP/src/main/java/br/ufc/quixada/qxd0025/chulapa_compiler/antlr4/QPP.g4 by ANTLR 4.7.2
package br.ufc.quixada.qxd0025.chulapa_compiler.frontend;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QPPLexer extends Lexer {
    public static final int
            INTL = 1, FLOATL = 2, CHARL = 3, STRL = 4, LPAREN = 5, RPAREN = 6, LBRACE = 7, RBRACE = 8,
            ARROW = 9, DOT = 10, INCR = 11, DECR = 12, NOT = 13, AMPER = 14, DIV = 15, TIMES = 16,
            MOD = 17, PLUS = 18, MINUS = 19, LT = 20, GT = 21, LEQ = 22, GEQ = 23, NEQ = 24, EQ = 25,
            AND = 26, OR = 27, ATRIB = 28, IF = 29, ELSE = 30, WHILE = 31, BREAK = 32, RETURN = 33,
            STRUCT = 34, PUBLIC = 35, PROTECTED = 36, PRIVATE = 37, STATIC = 38, THIS = 39, CONST = 40,
            VOID = 41, INT = 42, FLOAT = 43, CHAR = 44, BOOL = 45, TRUE = 46, FALSE = 47, COMMA = 48,
            COLON = 49, SEMI = 50, DBLCOL = 51, LSHIFT = 52, RSHIFT = 53, STDCIN = 54, STDCOUT = 55,
            STDENDL = 56, ID = 57, DIR = 58, COMMENTBLOCK = 59, COMMENTLINE = 60, WHITESPACE = 61;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01b5\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\u008b\n\5\r\5" +
                    "\16\5\u008c\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\3\6\6\6\u0097\n" +
                    "\6\r\6\16\6\u0098\3\7\3\7\5\7\u009d\n\7\3\7\3\7\3\b\3\b\7\b\u00a3\n\b" +
                    "\f\b\16\b\u00a6\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r" +
                    "\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23" +
                    "\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32" +
                    "\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36" +
                    "\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3" +
                    "$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'" +
                    "\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3" +
                    ")\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3" +
                    "-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61" +
                    "\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64" +
                    "\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3" +
                    ":\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3" +
                    "<\3<\3<\3=\3=\5=\u0182\n=\3=\3=\3=\3=\7=\u0188\n=\f=\16=\u018b\13=\3>" +
                    "\3>\7>\u018f\n>\f>\16>\u0192\13>\3>\3>\3?\3?\3?\3?\7?\u019a\n?\f?\16?" +
                    "\u019d\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u01a8\n@\f@\16@\u01ab\13@\3@" +
                    "\3@\3A\6A\u01b0\nA\rA\16A\u01b1\3A\3A\4\u00a4\u019b\2B\3\2\5\2\7\2\t\3" +
                    "\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'" +
                    "\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"" +
                    "I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<" +
                    "}=\177>\u0081?\3\2\7\3\2c|\3\2C\\\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17" +
                    "\"\"\2\u01bf\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3" +
                    "\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2" +
                    "\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2" +
                    "\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2" +
                    "\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2" +
                    "\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2" +
                    "\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y" +
                    "\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2" +
                    "\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2" +
                    "\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177" +
                    "\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u0087\3\2\2" +
                    "\2\t\u008a\3\2\2\2\13\u0091\3\2\2\2\r\u009a\3\2\2\2\17\u00a0\3\2\2\2\21" +
                    "\u00a9\3\2\2\2\23\u00ab\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b1" +
                    "\3\2\2\2\33\u00b4\3\2\2\2\35\u00b6\3\2\2\2\37\u00b9\3\2\2\2!\u00bc\3\2" +
                    "\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c2\3\2\2\2)\u00c4\3\2\2\2+\u00c6" +
                    "\3\2\2\2-\u00c8\3\2\2\2/\u00ca\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2" +
                    "\2\65\u00d1\3\2\2\2\67\u00d4\3\2\2\29\u00d7\3\2\2\2;\u00da\3\2\2\2=\u00dd" +
                    "\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e5\3\2\2\2E\u00ea\3\2\2\2G" +
                    "\u00f0\3\2\2\2I\u00f6\3\2\2\2K\u00fd\3\2\2\2M\u0104\3\2\2\2O\u010b\3\2" +
                    "\2\2Q\u0115\3\2\2\2S\u011d\3\2\2\2U\u0124\3\2\2\2W\u0129\3\2\2\2Y\u012f" +
                    "\3\2\2\2[\u0134\3\2\2\2]\u0138\3\2\2\2_\u013e\3\2\2\2a\u0143\3\2\2\2c" +
                    "\u0148\3\2\2\2e\u014d\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2\2\2k\u0157\3\2" +
                    "\2\2m\u0159\3\2\2\2o\u015c\3\2\2\2q\u015f\3\2\2\2s\u0162\3\2\2\2u\u016b" +
                    "\3\2\2\2w\u0175\3\2\2\2y\u0181\3\2\2\2{\u018c\3\2\2\2}\u0195\3\2\2\2\177" +
                    "\u01a3\3\2\2\2\u0081\u01af\3\2\2\2\u0083\u0084\t\2\2\2\u0084\4\3\2\2\2" +
                    "\u0085\u0086\t\3\2\2\u0086\6\3\2\2\2\u0087\u0088\t\4\2\2\u0088\b\3\2\2" +
                    "\2\u0089\u008b\5\7\4\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a" +
                    "\3\2\2\2\u008c\u008d\3\2\2\2\u008d\n\3\2\2\2\u008e\u0090\5\7\4\2\u008f" +
                    "\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2" +
                    "\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\60\2\2\u0095" +
                    "\u0097\5\7\4\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2" +
                    "\2\2\u0098\u0099\3\2\2\2\u0099\f\3\2\2\2\u009a\u009c\7)\2\2\u009b\u009d" +
                    "\13\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2" +
                    "\u009e\u009f\7)\2\2\u009f\16\3\2\2\2\u00a0\u00a4\7$\2\2\u00a1\u00a3\13" +
                    "\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4" +
                    "\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7$" +
                    "\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\22\3\2\2\2\u00ab\u00ac" +
                    "\7+\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7}\2\2\u00ae\26\3\2\2\2\u00af\u00b0" +
                    "\7\177\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7@\2\2\u00b3" +
                    "\32\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7" +
                    "\u00b8\7-\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bb" +
                    " \3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7(\2\2\u00bf" +
                    "$\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3" +
                    "(\3\2\2\2\u00c4\u00c5\7\'\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7" +
                    ",\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\60" +
                    "\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf" +
                    "\u00d0\7?\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3" +
                    "\66\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d68\3\2\2\2\u00d7" +
                    "\u00d8\7?\2\2\u00d8\u00d9\7?\2\2\u00d9:\3\2\2\2\u00da\u00db\7(\2\2\u00db" +
                    "\u00dc\7(\2\2\u00dc<\3\2\2\2\u00dd\u00de\7~\2\2\u00de\u00df\7~\2\2\u00df" +
                    ">\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4" +
                    "\7h\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8" +
                    "\7u\2\2\u00e8\u00e9\7g\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec" +
                    "\7j\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef" +
                    "F\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3" +
                    "\u00f4\7c\2\2\u00f4\u00f5\7m\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7t\2\2\u00f7" +
                    "\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7t\2\2" +
                    "\u00fb\u00fc\7p\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2" +
                    "\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7e\2\2\u0102\u0103" +
                    "\7v\2\2\u0103L\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106\7w\2\2\u0106\u0107" +
                    "\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7k\2\2\u0109\u010a\7e\2\2\u010a" +
                    "N\3\2\2\2\u010b\u010c\7r\2\2\u010c\u010d\7t\2\2\u010d\u010e\7q\2\2\u010e" +
                    "\u010f\7v\2\2\u010f\u0110\7g\2\2\u0110\u0111\7e\2\2\u0111\u0112\7v\2\2" +
                    "\u0112\u0113\7g\2\2\u0113\u0114\7f\2\2\u0114P\3\2\2\2\u0115\u0116\7r\2" +
                    "\2\u0116\u0117\7t\2\2\u0117\u0118\7k\2\2\u0118\u0119\7x\2\2\u0119\u011a" +
                    "\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011cR\3\2\2\2\u011d\u011e" +
                    "\7u\2\2\u011e\u011f\7v\2\2\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121" +
                    "\u0122\7k\2\2\u0122\u0123\7e\2\2\u0123T\3\2\2\2\u0124\u0125\7v\2\2\u0125" +
                    "\u0126\7j\2\2\u0126\u0127\7k\2\2\u0127\u0128\7u\2\2\u0128V\3\2\2\2\u0129" +
                    "\u012a\7e\2\2\u012a\u012b\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7u\2\2" +
                    "\u012d\u012e\7v\2\2\u012eX\3\2\2\2\u012f\u0130\7x\2\2\u0130\u0131\7q\2" +
                    "\2\u0131\u0132\7k\2\2\u0132\u0133\7f\2\2\u0133Z\3\2\2\2\u0134\u0135\7" +
                    "k\2\2\u0135\u0136\7p\2\2\u0136\u0137\7v\2\2\u0137\\\3\2\2\2\u0138\u0139" +
                    "\7h\2\2\u0139\u013a\7n\2\2\u013a\u013b\7q\2\2\u013b\u013c\7c\2\2\u013c" +
                    "\u013d\7v\2\2\u013d^\3\2\2\2\u013e\u013f\7e\2\2\u013f\u0140\7j\2\2\u0140" +
                    "\u0141\7c\2\2\u0141\u0142\7t\2\2\u0142`\3\2\2\2\u0143\u0144\7d\2\2\u0144" +
                    "\u0145\7q\2\2\u0145\u0146\7q\2\2\u0146\u0147\7n\2\2\u0147b\3\2\2\2\u0148" +
                    "\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b\7w\2\2\u014b\u014c\7g\2\2" +
                    "\u014cd\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f\7c\2\2\u014f\u0150\7n\2" +
                    "\2\u0150\u0151\7u\2\2\u0151\u0152\7g\2\2\u0152f\3\2\2\2\u0153\u0154\7" +
                    ".\2\2\u0154h\3\2\2\2\u0155\u0156\7<\2\2\u0156j\3\2\2\2\u0157\u0158\7=" +
                    "\2\2\u0158l\3\2\2\2\u0159\u015a\7<\2\2\u015a\u015b\7<\2\2\u015bn\3\2\2" +
                    "\2\u015c\u015d\7>\2\2\u015d\u015e\7>\2\2\u015ep\3\2\2\2\u015f\u0160\7" +
                    "@\2\2\u0160\u0161\7@\2\2\u0161r\3\2\2\2\u0162\u0163\7u\2\2\u0163\u0164" +
                    "\7v\2\2\u0164\u0165\7f\2\2\u0165\u0166\7<\2\2\u0166\u0167\7<\2\2\u0167" +
                    "\u0168\7e\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016at\3\2\2\2\u016b" +
                    "\u016c\7u\2\2\u016c\u016d\7v\2\2\u016d\u016e\7f\2\2\u016e\u016f\7<\2\2" +
                    "\u016f\u0170\7<\2\2\u0170\u0171\7e\2\2\u0171\u0172\7q\2\2\u0172\u0173" +
                    "\7w\2\2\u0173\u0174\7v\2\2\u0174v\3\2\2\2\u0175\u0176\7u\2\2\u0176\u0177" +
                    "\7v\2\2\u0177\u0178\7f\2\2\u0178\u0179\7<\2\2\u0179\u017a\7<\2\2\u017a" +
                    "\u017b\7g\2\2\u017b\u017c\7p\2\2\u017c\u017d\7f\2\2\u017d\u017e\7n\2\2" +
                    "\u017ex\3\2\2\2\u017f\u0182\5\3\2\2\u0180\u0182\5\5\3\2\u0181\u017f\3" +
                    "\2\2\2\u0181\u0180\3\2\2\2\u0182\u0189\3\2\2\2\u0183\u0188\5\3\2\2\u0184" +
                    "\u0188\5\5\3\2\u0185\u0188\5\7\4\2\u0186\u0188\7a\2\2\u0187\u0183\3\2" +
                    "\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188" +
                    "\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018az\3\2\2\2" +
                    "\u018b\u0189\3\2\2\2\u018c\u0190\7%\2\2\u018d\u018f\n\5\2\2\u018e\u018d" +
                    "\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191" +
                    "\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\b>\2\2\u0194|\3\2\2\2\u0195" +
                    "\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197\u019b\3\2\2\2\u0198\u019a\13" +
                    "\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019c\3\2\2\2\u019b" +
                    "\u0199\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7," +
                    "\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b?\2\2\u01a2" +
                    "~\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a9\3\2\2" +
                    "\2\u01a6\u01a8\n\5\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7" +
                    "\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac" +
                    "\u01ad\b@\2\2\u01ad\u0080\3\2\2\2\u01ae\u01b0\t\6\2\2\u01af\u01ae\3\2" +
                    "\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2" +
                    "\u01b3\3\2\2\2\u01b3\u01b4\bA\2\2\u01b4\u0082\3\2\2\2\17\2\u008c\u0091" +
                    "\u0098\u009c\u00a4\u0181\u0187\u0189\u0190\u019b\u01a9\u01b1\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public QPPLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "LOWERCASE", "UPPERCASE", "NUMBER", "INTL", "FLOATL", "CHARL", "STRL",
                "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ARROW", "DOT", "INCR", "DECR",
                "NOT", "AMPER", "DIV", "TIMES", "MOD", "PLUS", "MINUS", "LT", "GT", "LEQ",
                "GEQ", "NEQ", "EQ", "AND", "OR", "ATRIB", "IF", "ELSE", "WHILE", "BREAK",
                "RETURN", "STRUCT", "PUBLIC", "PROTECTED", "PRIVATE", "STATIC", "THIS",
                "CONST", "VOID", "INT", "FLOAT", "CHAR", "BOOL", "TRUE", "FALSE", "COMMA",
                "COLON", "SEMI", "DBLCOL", "LSHIFT", "RSHIFT", "STDCIN", "STDCOUT", "STDENDL",
                "ID", "DIR", "COMMENTBLOCK", "COMMENTLINE", "WHITESPACE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'->'", "'.'",
                "'++'", "'--'", "'!'", "'&'", "'/'", "'*'", "'%'", "'+'", "'-'", "'<'",
                "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'='", "'if'",
                "'else'", "'while'", "'break'", "'return'", "'struct'", "'public'", "'protected'",
                "'private'", "'static'", "'this'", "'const'", "'void'", "'int'", "'float'",
                "'char'", "'bool'", "'true'", "'false'", "','", "':'", "';'", "'::'",
                "'<<'", "'>>'", "'std::cin'", "'std::cout'", "'std::endl'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "INTL", "FLOATL", "CHARL", "STRL", "LPAREN", "RPAREN", "LBRACE",
                "RBRACE", "ARROW", "DOT", "INCR", "DECR", "NOT", "AMPER", "DIV", "TIMES",
                "MOD", "PLUS", "MINUS", "LT", "GT", "LEQ", "GEQ", "NEQ", "EQ", "AND",
                "OR", "ATRIB", "IF", "ELSE", "WHILE", "BREAK", "RETURN", "STRUCT", "PUBLIC",
                "PROTECTED", "PRIVATE", "STATIC", "THIS", "CONST", "VOID", "INT", "FLOAT",
                "CHAR", "BOOL", "TRUE", "FALSE", "COMMA", "COLON", "SEMI", "DBLCOL",
                "LSHIFT", "RSHIFT", "STDCIN", "STDCOUT", "STDENDL", "ID", "DIR", "COMMENTBLOCK",
                "COMMENTLINE", "WHITESPACE"
        };
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
    public String getGrammarFileName() {
        return "QPP.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}