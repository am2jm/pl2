/* The following code was generated by JFlex 1.6.1 */

/*
 * Simple Caclulater Lexer
 * Lexer.flex
 */

// section 1: user code copied verbatim


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int Comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\76\1\7\1\10\1\10\1\10\22\0\1\76\1\0\1\5"+
    "\5\0\1\11\1\13\1\12\1\71\1\30\1\14\1\32\1\31\12\3"+
    "\1\27\1\63\1\57\1\34\1\61\1\0\1\15\1\25\1\4\1\22"+
    "\1\56\1\33\1\36\1\4\1\44\1\40\2\4\1\24\1\73\1\42"+
    "\1\54\1\66\1\4\1\46\1\26\1\50\1\75\1\52\1\70\3\4"+
    "\1\0\1\6\2\0\1\2\1\0\1\17\1\1\1\16\1\55\1\21"+
    "\1\35\1\1\1\43\1\37\2\1\1\23\1\72\1\41\1\53\1\65"+
    "\1\1\1\45\1\20\1\47\1\74\1\51\1\67\3\1\1\60\1\0"+
    "\1\62\1\64\6\0\1\10\u1fa2\0\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\0\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\3\2\1\4\1\2\2\4"+
    "\1\13\1\14\1\15\1\16\1\4\1\17\1\2\1\4"+
    "\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4"+
    "\1\20\1\21\1\22\1\23\1\24\1\2\1\4\1\2"+
    "\1\4\1\25\1\1\1\26\1\27\1\26\1\30\1\0"+
    "\1\31\1\5\5\2\1\4\2\2\4\4\1\32\1\2"+
    "\1\33\1\4\1\33\1\2\1\34\1\35\1\4\1\34"+
    "\1\35\2\2\2\4\2\2\2\4\2\36\1\37\1\40"+
    "\1\2\1\4\1\2\1\4\1\1\1\27\1\41\2\0"+
    "\5\2\1\4\1\42\1\2\4\4\1\2\1\4\2\2"+
    "\2\4\1\43\1\44\1\43\1\44\2\2\2\4\1\2"+
    "\1\4\1\2\1\4\1\41\1\45\1\46\1\2\1\23"+
    "\1\47\1\50\1\4\2\51\1\23\1\47\1\50\1\2"+
    "\1\4\2\2\2\4\1\52\1\53\1\52\1\53\2\54"+
    "\1\2\1\4\2\55\2\56\2\2\2\4\2\57\1\60"+
    "\1\2\1\60\1\4\1\2\1\4\2\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[172];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u017a\0\u017a\0\u01f8\0\u017a\0\u0237\0\u0276\0\u02b5\0\u02f4"+
    "\0\u0333\0\u0372\0\u03b1\0\u017a\0\u017a\0\u017a\0\u017a\0\u03f0"+
    "\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u056a\0\u05a9\0\u05e8"+
    "\0\u0627\0\u0666\0\u06a5\0\u06e4\0\u017a\0\u017a\0\u017a\0\u017a"+
    "\0\u0723\0\u0762\0\u07a1\0\u07e0\0\u017a\0\u081f\0\u017a\0\u085e"+
    "\0\u081f\0\u017a\0\u089d\0\u08dc\0\u091b\0\u095a\0\u0999\0\u09d8"+
    "\0\u0a17\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u0b52\0\u0b91\0\u0bd0"+
    "\0\u0c0f\0\u017a\0\u0c4e\0\176\0\u0c8d\0\374\0\u0ccc\0\176"+
    "\0\u0d0b\0\u0d4a\0\374\0\u0d89\0\u0dc8\0\u0e07\0\u0e46\0\u0e85"+
    "\0\u0ec4\0\u0f03\0\u0f42\0\u0f81\0\176\0\374\0\u017a\0\u017a"+
    "\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc\0\u10fb\0\u10fb\0\u08dc"+
    "\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u1236\0\u1275\0\u12b4\0\176"+
    "\0\u12f3\0\u1332\0\u1371\0\u13b0\0\u13ef\0\u142e\0\u146d\0\u14ac"+
    "\0\u14eb\0\u152a\0\u1569\0\176\0\176\0\374\0\374\0\u15a8"+
    "\0\u15e7\0\u1626\0\u1665\0\u16a4\0\u16e3\0\u1722\0\u1761\0\u081f"+
    "\0\u08dc\0\176\0\u17a0\0\176\0\176\0\176\0\u17df\0\176"+
    "\0\374\0\374\0\374\0\374\0\u181e\0\u185d\0\u189c\0\u18db"+
    "\0\u191a\0\u1959\0\176\0\176\0\374\0\374\0\176\0\374"+
    "\0\u1998\0\u19d7\0\176\0\374\0\176\0\374\0\u1a16\0\u1a55"+
    "\0\u1a94\0\u1ad3\0\176\0\374\0\176\0\u1b12\0\374\0\u1b51"+
    "\0\u1b90\0\u1bcf\0\176\0\374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[172];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\1\0\1\4\1\5\1\6\1\0\1\7"+
    "\1\0\1\10\1\11\1\12\1\13\1\14\1\15\1\3"+
    "\1\16\1\17\1\20\1\21\1\22\1\5\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\3\1\5\1\3\1\5\1\40"+
    "\1\41\1\3\1\5\1\42\1\43\1\3\1\5\1\44"+
    "\1\45\1\0\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\3\1\5\1\3\1\5\1\7\7\56"+
    "\1\57\1\0\1\56\1\60\63\56\1\61\1\0\4\3"+
    "\11\0\11\3\4\0\1\3\1\0\22\3\6\0\4\3"+
    "\1\0\4\3\4\0\1\4\74\0\4\5\11\0\11\5"+
    "\4\0\1\5\1\0\22\5\6\0\4\5\1\0\4\5"+
    "\1\0\5\6\1\62\1\63\70\6\111\0\1\64\100\0"+
    "\1\65\63\0\4\3\11\0\1\3\1\66\3\3\2\67"+
    "\2\3\4\0\1\3\1\0\22\3\6\0\4\3\1\0"+
    "\4\3\2\0\4\3\11\0\3\3\1\70\5\3\4\0"+
    "\1\70\1\0\22\3\6\0\4\3\1\0\4\3\2\0"+
    "\4\3\11\0\2\3\1\71\2\3\2\72\1\3\1\71"+
    "\4\0\1\3\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\5\5\2\73\2\5\4\0\1\5"+
    "\1\0\22\5\6\0\4\5\1\0\4\5\2\0\4\3"+
    "\11\0\3\3\1\74\5\3\4\0\1\3\1\0\16\3"+
    "\2\75\2\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\16\5\2\76\2\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\5\11\0\3\5"+
    "\1\77\5\5\4\0\1\77\1\0\22\5\6\0\4\5"+
    "\1\0\4\5\2\0\4\5\11\0\2\5\1\100\2\5"+
    "\2\101\1\5\1\100\4\0\1\5\1\0\22\5\6\0"+
    "\4\5\1\0\4\5\62\0\1\102\16\0\4\3\11\0"+
    "\1\3\1\103\5\3\1\103\1\3\4\0\1\3\1\0"+
    "\2\3\2\104\16\3\6\0\4\3\1\0\4\3\2\0"+
    "\4\5\11\0\1\5\1\105\5\5\1\105\1\5\4\0"+
    "\1\5\1\0\2\5\2\106\16\5\6\0\4\5\1\0"+
    "\4\5\2\0\4\3\11\0\2\3\1\107\5\3\1\107"+
    "\4\0\1\3\1\0\2\110\2\3\2\111\14\3\6\0"+
    "\4\3\1\0\4\3\2\0\4\5\11\0\2\5\1\112"+
    "\5\5\1\112\4\0\1\5\1\0\2\113\2\5\2\114"+
    "\14\5\6\0\4\5\1\0\4\5\2\0\4\3\11\0"+
    "\3\3\1\115\5\3\4\0\1\115\1\0\16\3\2\116"+
    "\2\3\6\0\4\3\1\0\4\3\2\0\4\5\11\0"+
    "\3\5\1\117\5\5\4\0\1\117\1\0\16\5\2\120"+
    "\2\5\6\0\4\5\1\0\4\5\2\0\4\3\11\0"+
    "\11\3\4\0\1\3\1\0\6\3\2\121\2\122\10\3"+
    "\6\0\4\3\1\0\4\3\2\0\4\5\11\0\11\5"+
    "\4\0\1\5\1\0\6\5\2\123\2\124\10\5\6\0"+
    "\4\5\1\0\4\5\2\0\4\3\11\0\11\3\4\0"+
    "\1\3\1\0\2\125\20\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\11\5\4\0\1\5\1\0\2\126"+
    "\20\5\6\0\4\5\1\0\4\5\15\0\1\127\17\0"+
    "\1\130\43\0\4\3\11\0\11\3\4\0\1\3\1\0"+
    "\16\3\2\131\2\3\6\0\4\3\1\0\4\3\2\0"+
    "\4\5\11\0\11\5\4\0\1\5\1\0\16\5\2\132"+
    "\2\5\6\0\4\5\1\0\4\5\2\0\4\3\11\0"+
    "\11\3\4\0\1\3\1\0\6\3\2\133\12\3\6\0"+
    "\4\3\1\0\4\3\2\0\4\5\11\0\11\5\4\0"+
    "\1\5\1\0\6\5\2\134\12\5\6\0\4\5\1\0"+
    "\4\5\1\0\7\56\2\0\1\56\1\135\64\56\7\136"+
    "\2\0\1\136\1\60\1\137\63\136\7\6\2\0\66\6"+
    "\7\140\2\0\1\140\1\141\64\140\7\65\2\0\66\65"+
    "\1\0\4\3\11\0\2\3\1\142\6\3\4\0\1\3"+
    "\1\0\22\3\6\0\4\3\1\0\4\3\2\0\4\3"+
    "\11\0\1\3\1\143\5\3\1\143\1\3\4\0\1\3"+
    "\1\0\22\3\6\0\4\3\1\0\4\3\2\0\4\3"+
    "\11\0\11\3\4\0\1\3\1\0\22\3\6\0\4\3"+
    "\1\0\2\144\2\3\2\0\4\3\11\0\1\3\1\145"+
    "\5\3\1\145\1\3\4\0\1\3\1\0\22\3\6\0"+
    "\4\3\1\0\4\3\2\0\4\3\11\0\2\3\1\146"+
    "\5\3\1\146\4\0\1\3\1\0\22\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\5\11\0\1\5\1\147\5\5"+
    "\1\147\1\5\4\0\1\5\1\0\22\5\6\0\4\5"+
    "\1\0\4\5\2\0\4\3\11\0\11\3\4\0\1\3"+
    "\1\0\12\3\1\150\7\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\3\11\0\11\3\4\0\1\3\1\0\16\3"+
    "\2\151\2\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\16\5\2\152\2\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\5\11\0\11\5"+
    "\4\0\1\5\1\0\22\5\6\0\4\5\1\0\2\153"+
    "\2\5\2\0\4\5\11\0\1\5\1\154\5\5\1\154"+
    "\1\5\4\0\1\5\1\0\22\5\6\0\4\5\1\0"+
    "\4\5\2\0\4\5\11\0\2\5\1\155\5\5\1\155"+
    "\4\0\1\5\1\0\22\5\6\0\4\5\1\0\4\5"+
    "\2\0\4\3\11\0\5\3\2\156\2\3\4\0\1\3"+
    "\1\0\22\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\5\5\2\157\2\5\4\0\1\5\1\0\22\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\14\3\2\160\4\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\3\11\0\11\3\4\0\1\3"+
    "\1\0\6\3\2\161\12\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\11\5\4\0\1\5\1\0\14\5"+
    "\2\162\4\5\6\0\4\5\1\0\4\5\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\6\5\2\163\12\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\22\3\6\0\2\3\2\164\1\0"+
    "\4\3\2\0\4\3\11\0\11\3\4\0\1\3\1\0"+
    "\12\3\2\165\6\3\6\0\4\3\1\0\4\3\2\0"+
    "\4\5\11\0\11\5\4\0\1\5\1\0\22\5\6\0"+
    "\2\5\2\166\1\0\4\5\2\0\4\5\11\0\11\5"+
    "\4\0\1\5\1\0\12\5\2\167\6\5\6\0\4\5"+
    "\1\0\4\5\2\0\4\3\11\0\3\3\1\170\5\3"+
    "\4\0\1\170\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\3\11\0\11\3\4\0\1\3\1\0\22\3"+
    "\6\0\4\3\1\0\2\3\2\171\2\0\4\5\11\0"+
    "\3\5\1\172\5\5\4\0\1\172\1\0\22\5\6\0"+
    "\4\5\1\0\4\5\2\0\4\5\11\0\11\5\4\0"+
    "\1\5\1\0\22\5\6\0\4\5\1\0\2\5\2\173"+
    "\2\0\4\3\11\0\11\3\4\0\1\3\1\0\16\3"+
    "\2\174\2\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\16\5\2\175\2\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\2\3\2\176\16\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\5\11\0\11\5\4\0\1\5"+
    "\1\0\2\5\2\177\16\5\6\0\4\5\1\0\4\5"+
    "\1\0\7\56\2\0\1\56\1\135\1\200\63\56\7\136"+
    "\2\0\1\136\1\60\64\136\7\140\2\0\1\140\1\141"+
    "\1\201\63\140\1\0\4\3\11\0\3\3\1\202\5\3"+
    "\4\0\1\3\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\3\11\0\2\3\1\203\5\3\1\203\4\0"+
    "\1\3\1\0\22\3\6\0\4\3\1\0\4\3\2\0"+
    "\4\3\11\0\11\3\4\0\1\3\1\0\2\3\2\204"+
    "\16\3\6\0\4\3\1\0\4\3\2\0\4\3\11\0"+
    "\1\205\3\3\1\205\4\3\4\0\1\3\1\0\22\3"+
    "\6\0\4\3\1\0\4\3\2\0\4\3\11\0\3\3"+
    "\1\206\5\3\4\0\1\206\1\0\22\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\5\11\0\2\5\1\207\5\5"+
    "\1\207\4\0\1\5\1\0\22\5\6\0\4\5\1\0"+
    "\4\5\2\0\4\3\11\0\11\3\4\0\1\3\1\0"+
    "\22\3\6\0\2\210\2\3\1\0\4\3\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\22\5\6\0\2\211"+
    "\2\5\1\0\4\5\2\0\4\5\11\0\11\5\4\0"+
    "\1\5\1\0\2\5\2\212\16\5\6\0\4\5\1\0"+
    "\4\5\2\0\4\5\11\0\1\213\3\5\1\213\4\5"+
    "\4\0\1\5\1\0\22\5\6\0\4\5\1\0\4\5"+
    "\2\0\4\5\11\0\3\5\1\214\5\5\4\0\1\214"+
    "\1\0\22\5\6\0\4\5\1\0\4\5\2\0\4\3"+
    "\11\0\2\3\1\215\5\3\1\215\4\0\1\3\1\0"+
    "\22\3\6\0\4\3\1\0\4\3\2\0\4\5\11\0"+
    "\2\5\1\216\5\5\1\216\4\0\1\5\1\0\22\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\16\3\2\217\2\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\3\11\0\3\3\1\220\5\3"+
    "\4\0\1\220\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\11\5\4\0\1\5\1\0\16\5"+
    "\2\221\2\5\6\0\4\5\1\0\4\5\2\0\4\5"+
    "\11\0\3\5\1\222\5\5\4\0\1\222\1\0\22\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\4\3\2\223\14\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\3\11\0\3\3\1\224\5\3"+
    "\4\0\1\224\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\11\5\4\0\1\5\1\0\4\5"+
    "\2\225\14\5\6\0\4\5\1\0\4\5\2\0\4\5"+
    "\11\0\3\5\1\226\5\5\4\0\1\226\1\0\22\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\5\3"+
    "\2\227\2\3\4\0\1\3\1\0\22\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\5\11\0\5\5\2\230\2\5"+
    "\4\0\1\5\1\0\22\5\6\0\4\5\1\0\4\5"+
    "\2\0\4\3\11\0\5\3\2\231\2\3\4\0\1\3"+
    "\1\0\22\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\5\5\2\232\2\5\4\0\1\5\1\0\22\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\2\3"+
    "\1\233\5\3\1\233\4\0\1\3\1\0\22\3\6\0"+
    "\4\3\1\0\4\3\2\0\4\5\11\0\2\5\1\234"+
    "\5\5\1\234\4\0\1\5\1\0\22\5\6\0\4\5"+
    "\1\0\4\5\2\0\4\3\11\0\3\3\1\235\5\3"+
    "\4\0\1\235\1\0\22\3\6\0\4\3\1\0\4\3"+
    "\2\0\4\5\11\0\3\5\1\236\5\5\4\0\1\236"+
    "\1\0\22\5\6\0\4\5\1\0\4\5\2\0\4\3"+
    "\11\0\11\3\4\0\1\3\1\0\2\3\2\237\16\3"+
    "\6\0\4\3\1\0\4\3\2\0\4\3\11\0\11\3"+
    "\4\0\1\3\1\0\10\3\2\240\10\3\6\0\4\3"+
    "\1\0\4\3\2\0\4\5\11\0\11\5\4\0\1\5"+
    "\1\0\2\5\2\241\16\5\6\0\4\5\1\0\4\5"+
    "\2\0\4\5\11\0\11\5\4\0\1\5\1\0\10\5"+
    "\2\242\10\5\6\0\4\5\1\0\4\5\2\0\4\3"+
    "\11\0\3\3\1\243\5\3\4\0\1\243\1\0\22\3"+
    "\6\0\4\3\1\0\4\3\2\0\4\5\11\0\3\5"+
    "\1\244\5\5\4\0\1\244\1\0\22\5\6\0\4\5"+
    "\1\0\4\5\2\0\4\3\11\0\11\3\4\0\1\3"+
    "\1\0\20\3\2\245\6\0\4\3\1\0\4\3\2\0"+
    "\4\3\11\0\11\3\4\0\1\3\1\0\2\3\2\246"+
    "\16\3\6\0\4\3\1\0\4\3\2\0\4\5\11\0"+
    "\11\5\4\0\1\5\1\0\20\5\2\247\6\0\4\5"+
    "\1\0\4\5\2\0\4\5\11\0\11\5\4\0\1\5"+
    "\1\0\2\5\2\250\16\5\6\0\4\5\1\0\4\5"+
    "\2\0\4\3\11\0\11\3\4\0\1\3\1\0\12\3"+
    "\2\251\6\3\6\0\4\3\1\0\4\3\2\0\4\5"+
    "\11\0\11\5\4\0\1\5\1\0\12\5\2\252\6\5"+
    "\6\0\4\5\1\0\4\5\2\0\4\3\11\0\2\3"+
    "\1\253\5\3\1\253\4\0\1\3\1\0\22\3\6\0"+
    "\4\3\1\0\4\3\2\0\4\5\11\0\2\5\1\254"+
    "\5\5\1\254\4\0\1\5\1\0\22\5\6\0\4\5"+
    "\1\0\4\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7182];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\1\1\0\1\11\1\1\2\11\1\1\1\11"+
    "\7\1\4\11\15\1\4\11\4\1\1\11\1\1\1\11"+
    "\2\1\1\11\1\0\16\1\1\11\24\1\2\11\7\1"+
    "\2\0\113\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[172];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
   // Code in here is copied verbatim into the Lexer class

 	private Token token(tok type) {
 		return new Token(type, yyline+1, yycolumn+1, null);
 	}

 	private Token token(tok type, Object lexeme) {
    	return new Token(type, yyline+1, yycolumn+1, lexeme);
 	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 208) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //System.out.println("My text text:" + yytext() + ":end");
            }
          case 50: break;
          case 2: 
            { return token(tok.IDENT, yytext());
            }
          case 51: break;
          case 3: 
            { return token(tok.INT, yytext());
            }
          case 52: break;
          case 4: 
            { return token(tok.TYPE, yytext());
            }
          case 53: break;
          case 5: 
            { /* ignore */
            }
          case 54: break;
          case 6: 
            { return token(tok.LPAREN);
            }
          case 55: break;
          case 7: 
            { return token(tok.TIMES);
            }
          case 56: break;
          case 8: 
            { return token(tok.RPAREN);
            }
          case 57: break;
          case 9: 
            { return token(tok.MINUS);
            }
          case 58: break;
          case 10: 
            { return token(tok.AT);
            }
          case 59: break;
          case 11: 
            { return token(tok.COLON);
            }
          case 60: break;
          case 12: 
            { return token(tok.COMMA);
            }
          case 61: break;
          case 13: 
            { return token(tok.DIVIDE);
            }
          case 62: break;
          case 14: 
            { return token(tok.DOT);
            }
          case 63: break;
          case 15: 
            { return token(tok.EQUALS);
            }
          case 64: break;
          case 16: 
            { return token(tok.LT);
            }
          case 65: break;
          case 17: 
            { return token(tok.LBRACE);
            }
          case 66: break;
          case 18: 
            { return token(tok.RBRACE);
            }
          case 67: break;
          case 19: 
            { return token(tok.SEMI);
            }
          case 68: break;
          case 20: 
            { return token(tok.TILDE);
            }
          case 69: break;
          case 21: 
            { return token(tok.PLUS);
            }
          case 70: break;
          case 22: 
            { //System.out.println("My text whitespace:" + yytext());
            }
          case 71: break;
          case 23: 
            { //System.out.println("My text star:" + yytext() + ":end");
            }
          case 72: break;
          case 24: 
            { String temp = yytext();
		temp = temp.substring(1, temp.length()-1);
		return token(tok.STRING, temp);
            }
          case 73: break;
          case 25: 
            { //if( !(yytext().contains("*)")) ){
			//System.out.println("Does not have *)");
			//System.out.println(yytext()+ ": was it:" + yyline+1);
		yybegin(Comment);
		//}
    //else
      //System.out.println("begin:"+yytext()+":end");
            }
          case 74: break;
          case 26: 
            { return token(tok.RARROW);
            }
          case 75: break;
          case 27: 
            { return token(tok.FI);
            }
          case 76: break;
          case 28: 
            { return token(tok.IF);
            }
          case 77: break;
          case 29: 
            { return token(tok.IN);
            }
          case 78: break;
          case 30: 
            { return token(tok.OF);
            }
          case 79: break;
          case 31: 
            { return token(tok.LARROW);
            }
          case 80: break;
          case 32: 
            { return token(tok.LE);
            }
          case 81: break;
          case 33: 
            { //System.out.println("My text return:" + yytext());
		yybegin(YYINITIAL);
            }
          case 82: break;
          case 34: 
            { return token(tok.LET);
            }
          case 83: break;
          case 35: 
            { return token(tok.NEW);
            }
          case 84: break;
          case 36: 
            { return token(tok.NOT);
            }
          case 85: break;
          case 37: 
            { //	System.out.println("Why not!");
            }
          case 86: break;
          case 38: 
            { return token(tok.CASE);
            }
          case 87: break;
          case 39: 
            { return token(tok.ESAC);
            }
          case 88: break;
          case 40: 
            { return token(tok.ELSE);
            }
          case 89: break;
          case 41: 
            { return token(tok.LOOP);
            }
          case 90: break;
          case 42: 
            { return token(tok.THEN);
            }
          case 91: break;
          case 43: 
            { return token(tok.TRUE);
            }
          case 92: break;
          case 44: 
            { return token(tok.POOL);
            }
          case 93: break;
          case 45: 
            { return token(tok.CLASS);
            }
          case 94: break;
          case 46: 
            { return token(tok.FALSE);
            }
          case 95: break;
          case 47: 
            { return token(tok.WHILE);
            }
          case 96: break;
          case 48: 
            { return token(tok.ISVOID);
            }
          case 97: break;
          case 49: 
            { return token(tok.INHERITS);
            }
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
