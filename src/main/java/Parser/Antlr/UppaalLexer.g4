
lexer grammar UppaalLexer;

// Default "mode": Everything OUTSIDE of a tag
COMMENT     :   '<!--' .*? '-->' ;
CDATA       :   '<![CDATA[' .*? ']]>' ;
/** Scarf all DTD stuff, Entity Declarations like <!ENTITY ..>,
 *  and Notation Declarations <!NOTATION ...>
 */
DTD         :   '<!' .*? '>'            -> skip ;
EntityRef   :   '&' Name ';' ;
CharRef     :   '&#' DIGIT+ ';'
            |   '&#x' HEXDIGIT+ ';'
            ;
SEA_WS      :   (' '|'\t'|'\r'? '\n')+ ;

OPEN_GUARD  :   '<' [ \t\r\n]*'label'( (LBLKIND '"guard"' LBLCOORD) | (LBLCOORD LBLKIND '"guard"' )) [ \t\r\n]* '>'?          -> pushMode(EXPRESSIONS);

OPEN_SYNC  :   '<' [ \t\r\n]*'label' ( (LBLKIND '"synchronisation"' LBLCOORD) | (LBLCOORD LBLKIND '"synchronisation"' )) [ \t\r\n]* '>'?         -> pushMode(EXPRESSIONS);

OPEN_LBLTR      :   '<' [ \t\r\n]*'label' ((LBLKIND ASSIGNMENT LBLCOORD) | (LBLCOORD LBLKIND ASSIGNMENT))[ \t\r\n]* '>'? -> pushMode(EXPRESSIONS) ;
OPEN_SELECT     :   '<' [ \t\r\n]*'label' ((LBLKIND SELECT LBLCOORD) | (LBLCOORD LBLKIND SELECT) ) [ \t\r\n]* '>'?     -> pushMode(EXPRESSIONS) ;
OPEN_LBLCOM     :   '<' [ \t\r\n]*'label' ((LBLKIND COMMENTS LBLCOORD)|(LBLCOORD COMMENTS QUERY_COMMENT)) [ \t\r\n]* '>'? ;
OPEN_PROB       :   '<' [ \t\r\n]*'label' ((LBLKIND PROBABILITY  LBLCOORD) | (LBLCOORD LBLKIND PROBABILITY) ) [ \t\r\n]* '>'?  -> pushMode(EXPRESSIONS) ;
OPEN_EXPRATE    :  '<' [ \t\r\n]*'label' ((LBLKIND EXPRATE LBLCOORD) | (LBLCOORD LBLKIND EXPRATE) ) [ \t\r\n]* '>'?  -> pushMode(EXPRESSIONS) ;

OPEN_INV        :   '<' [ \t\r\n]*'label' ((LBLKIND (INVARIANT) LBLCOORD) | (LBLCOORD LBLKIND (INVARIANT)) ) [ \t\r\n]* '>'?  -> pushMode(EXPRESSIONS) ;


OPEN_DECLARATION    :   '<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>'?
                                        -> pushMode(EXPRESSIONS);

OPEN_PARAMETER      :   '<' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'
                                        -> pushMode(EXPRESSIONS);

OPEN        :   '<'                     -> pushMode(INSIDE) ;
OPEN_SLASH  :   '</'                    -> pushMode(INSIDE) ;
XMLDeclOpen :   '<?xml' S               -> pushMode(INSIDE) ;
SPECIAL_OPEN:   '<?' Name               -> more, pushMode(PROC_INSTR) ;

fragment
LBLCOORD        :   ( [ \t\r\n]* 'x' [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"' [ \t\r\n]* Y [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"')?
                ;
fragment
LBLKIND         : [ \t\r\n]+ 'kind' [ \t\r\n]* '=' [ \t\r\n]*
                ;

//IDENTIFIER  :   [a-zA-Z_] [a-zA-Z0-9_]* ;
TEXT        :   ~[<&]+ ;        // match any 16 bit char other than < and &
/*
fragment
LBLSTART        :   '<' [ \t\r\n]*'label' [ \t\r\n]+ 'kind' [ \t\r\n]* '=' [ \t\r\n]* ;
fragment
LBLCOORD        :   ( [ \t\r\n]* 'x' [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"' [ \t\r\n]* Y [ \t\r\n]* '=' [ \t\r\n]* '"' ('-')? DIGIT+ '"')?
                ;
*/

// ----------------- Everything INSIDE of a tag ---------------------
mode INSIDE;




NTA         :   'nta' ;
DECLARATION :   'declaration' ;
TEMPLATE    :   'template' ;
BRANCHPOINT :   'branchpoint' ;
LOCATION    :   'location' ;
COLOR       :   'color' ;
NAME        :   'name' ;
PARAMETER   :   'parameter' ;
INIT        :   'init' ;
REF         :   'ref' ;
ID          :   'id' ;
X           :   'x' ;
Y           :   'y' ;
URGENT_LOC  :   'urgent' ;
COMMITTED   :   'committed' ;
LABEL       :   'label' ;
KIND        :   'kind' ;
TRANSITION  :   'transition' ;
SOURCE      :   'source' ;
TARGET      :   'target' ;
NAIL        :   'nail' ;
SYSTEM      :   'system' ;
QUERIES     :   'queries' ;
QUERY       :   'query' ;
FORMULA     :   'formula' ;
QUERY_COMMENT:   'comment' ;
ASSIGNMENT             :       '"assignment"' ;
SELECT                 :       '"select"' ;
INVARIANT              :       '"invariant"' ;
EXPRATE                :        '"exponentialrate"';
PROBABILITY             :       '"probability"';
COMMENTS                :       '"comments"';

//GUARD       :   '"guard"' ;






CLOSE       :   '>'                     -> popMode ;
SPECIAL_CLOSE:  '?>'                    -> popMode ; // close <?xml...?>
SLASH_CLOSE :   '/>'                    -> popMode ;
//SLASH       :   '/' ;
EQUALS      :   '=' ;
STRING      :   '"' ~[<"]* '"'
            |   '\'' ~[<']* '\''
            ;
Name        :   NameStartChar NameChar* ;
S           :   [ \t\r\n]               -> skip ;

fragment
HEXDIGIT    :   [a-fA-F0-9] ;

fragment
DIGIT       :   [0-9] ;

fragment
NameChar    :   NameStartChar
            |   '-' | '_' | '.' | DIGIT
            |   '\u00B7'
            |   '\u0300'..'\u036F'
            |   '\u203F'..'\u2040'
            ;

fragment
NameStartChar
            :   [:a-zA-Z]
            |   '\u2070'..'\u218F'
            |   '\u2C00'..'\u2FEF'
            |   '\u3001'..'\uD7FF'
            |   '\uF900'..'\uFDCF'
            |   '\uFDF0'..'\uFFFD'
            ;

// ----------------- Handle <? ... ?> ---------------------
mode PROC_INSTR;

PI          :   '?>'                    -> popMode ; // close <?...?>
IGNORE      :   .                       -> more ;


// ----------------- Handle <EXPRESSIONS> ---------------------
mode EXPRESSIONS;


SLASH_COMMENT       :   '/*' .*? '*/'           -> skip ;
LINE_COMMENT        :   '//' ~( '<'|'\n' )*         -> skip ;

CLOSE_LABEL         :   '</' [ \t\r\n]* 'label' [ \t\r\n]* '>'      -> popMode ;
CLOSE_EMPTY_LABEL   :   '/>'                                        -> popMode ;

CLOSE_DECLARATION   :   '</' [ \t\r\n]* 'declaration' [ \t\r\n]* '>'  -> popMode ;

CLOSE_PARAMETER     :   '</' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'  -> popMode ;

GUARD_S             :   [ \t\r\n]               -> skip ;


NAT                 :   [0-9]+ ;

POINT               :   ([0-9]+) '.' [0-9]+ ;
SCI                 :   [0-9]+ '.'[0-9]+'e'('-'|'+')[0-9]+ ;

//functions

FOR                 :   'for' ;
WHILE               :   'while' ;
DO                  :   'do' ;
IF                  :   'if' ;
ELSE                :   'else' ;
RETURN              :   'return' ;

//priority
PRIORITY            :   'priority' ;
DEFAULT             :   'default' ;

//expressions
APOSTROPHE          :   '\'' ;

LEFT_PARENTHESIS    :   '(' ;

RIGHT_PARENTHESIS   :   ')' ;

LEFT_BRACKET        :   '[' ;

RIGHT_BRACKET       :   ']' ;

LEFT_BRACE          :   '{' ;

RIGHT_BRACE         :   '}' ;

COMMA               :   ',' ;

SEMICOLON           :   ';' ;

INCREMENT           :   '++' ;

DECREMENT           :   '--' ;

ASSIGN              :   '=' ;

ASSIGN_COLON        :   ':=' ;

ASSIGN_ADD          :   '+=' ;

ASSIGN_SUB          :   '-=' ;

ASSIGN_MUL          :   '*=' ;

ASSIGN_DIV          :   '/=' ;

ASSIGN_PERCENT      :   '%=' ;

ASSIGN_OR           :   '|=' ;

ASSIGN_AND          :   '&amp;=' ;

ASSIGN_XOR          :   '^=' ;

ASSIGN_LSHIFT       :   '&lt;&lt;=' ;

ASSIGN_RSHIFT       :   '&gt;&gt;=' ;


//Unary

ADD                 :   '+' ; //binary too

SUB                 :   '-' ; //binary too

EXCLAMATION         :   '!' ;

NOT                 :   'not' ;

//Binary

LESS                :   '&lt;' ;
LESSEQ              :   '&lt;=' ;
COMPARE             :   '==' ;
DIFFERENT           :   '!=' ;
GREATEREQ           :   '&gt;=' ;
GREATER             :   '&gt;' ;
MUL                 :   '*' ;
DIV                 :   '/' ;
PERCENT             :   '%' ;
BITAND              :   '&amp;' ;
BITOR               :   '|' ;
BITXOR              :   '^' ;
LSHIFT              :   '&lt;&lt;' ;
RSHIFT              :   '&gt;&gt;' ;
AND_SYMBOL          :   '&amp;&amp;' ;
OR_SYMBOL           :   '||' ;
MINIMUM             :   '&lt;?' ;
MAXIMUM             :   '&gt;?' ;
OR                  :   'or' ;
AND                 :   'and' ;
IMPLY               :   'imply' ;


//IF THEN ELSE

QUESTION            :   '?' ;
COLON               :   ':' ;

//Infix lookup operator to access process or structure type scope

LOOKUP_OP           :   '.' ;

//Quantifiers

FORALL              :   'forall' ;
EXISTS              :   'exists' ;

//SUMMATION

SUM                 :   'sum' ;

//---TYPES---

//prefix
URGENT              :   'urgent' ;
BROADCAST           :   'broadcast' ;
META                :   'meta' ;
CONST               :   'const' ;

//typeDef
TYPEDEF             :   'typedef' ;

//typeId
INT                 :   'int' ;
DOUBLE              :   'double' ;
CLOCK               :   'clock' ;
CHAN                :   'chan' ;
BOOL                :   'bool' ;
SCALAR              :   'scalar' ;
STRUCT              :   'struct' ;

//Boolean
TRUE                :   'true' ;
FALSE               :   'false' ;

IDENTIFIER  :   [a-zA-Z_]([a-zA-Z0-9_])*;


