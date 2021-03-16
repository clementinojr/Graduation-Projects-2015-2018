
grammar Pascalzinho;

@header{
package basicintast.parser;
import basicintast.util.*;
}
@members{
String tr ="";
String aux="";
char open=123;
char close=125;     
}

program returns [String nome]: p=PROGRAM {tr+="#include<iostream>\n#include<string>\n\nusing namespace std; \n\n"; $nome = $STR.text;} STR EOL var? procedure*        #programStmtBegin
        | PROGRAM STR EOL start                       #programStmt
        ;
var     : VAR   var2    ;
var2    :  VARNAME  {aux+=$VARNAME.text;} varn* ':' type   EOL  var2  #varNameFirst  | start #startL ;
 
varn : ',' VARNAME   {aux+=", "+$VARNAME.text;}#varName ;
   


type    : INT  {tr+="int "+aux+"; \n"; aux="";}
        | FLOAT {tr+="float "+aux+"; \n";aux="";}
        | BOOLEAN {tr+="bool "+aux+"; \n";aux="";}
        | STRING {tr+="string "+aux+"; \n";aux="";}
        | arraytype {tr+=$arraytype.value+" "+aux+"["+$arraytype.n+"];\n";}
        ;

arraytype   returns [String value, String n]:   ARRAY '['n1=NUM'..'n2=NUM']' OF t=INT   {$value = "int "; $n = $n2.text+"-"+$n1.text;}
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=FLOAT                       {$value = "float "; $n = $n2.text+"-"+$n1.text;}
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=STRING                      {$value = "string "; $n = $n2.text+"-"+$n1.text;}
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=BOOLEAN                     {$value = "bool "; $n = $n2.text+"-"+$n1.text;}
            ;

procedure   : PROCEDURE VARNAME '('')' EOL start END
            ;

start   : BEGIN {tr+="\nint main()"+open+"\n";}(stmt)+ ENDP{tr+="return 0;\n"+close;} {Escrever.get(tr);}
        | (stmt)+ 
        ;

stmt    : write EOL             #stmtPrint
        | readln  EOL           #stmtRead
        | attr  EOL             #stmtAttr
        | expr  EOL             #stmtExpr
        | cond                  #stmtCond
        ;

cond    : IF '('condExpr')' THEN {tr+="if("+$condExpr.text+")"+open+"\n";}   b1=block  END {tr+=close+"\n";} EOL             #ifStmt
        | IF '('condExpr')' THEN {tr+="if("+$condExpr.text+")"+open+"\n";}   b1=block {tr+=close;} ELSE {tr+="else"+open+"\n";}b2=block END {tr+=close+"\n";} EOL  #ifElseStmt
        | WHILE '('condExpr')' DO BEGIN{tr+="while("+$condExpr.text+")"+open+"\n";} b1=block END {tr+=close+"\n";} EOL   #whileStmt
        | FOR attr TO n=NUM DO BEGIN {String at = $attr.text; at= at.replace(":","");tr+="for("+at+";"+$attr.nome+"<"+$n.text+";"+$attr.nome+"++)"+open+"\n";} b1=block END {tr+=close+"\n";} EOL #forStmt
        ;


condExpr: expr                                              #condExpresion
        | expr relop=('>'|'<'|'=='|'>='|'<='|'!=') expr     #condRelOp
        ;

block   : start     #blockStmt
        ;

write   : WRITE STR {tr+="cout <<"+ $STR.text+";\n";}        #printStr
        | WRITE expr  {tr+="cout <<"+$expr.text+";\n";}      #printExpr
        | WRITELN STR   {tr+="cout <<"+$STR.text+" << endl;\n";}    #printStrLn
        | WRITELN expr    {tr+="cout <<"+$expr.text+" << endl;\n";}  #printExprLn
        ;

readln    : READLN VARNAME {tr+="cin >> "+$VARNAME.text+";\n";}          #readVar
        ;

attr    returns [String nome]: VARNAME ':=' expr {tr+=$VARNAME.text+" = "+$expr.text+";\n"; $nome=$VARNAME.text;}         #attrExpr
        | VARNAME ':=' STR  {tr+=$VARNAME.text+" = "+$STR.text+";\n"; $nome=$VARNAME.text;}     #attrString  
        | VARNAME ':=' truefalse {tr+=$VARNAME.text+" = "+$truefalse.text+";\n"; $nome=$VARNAME.text;} #attrBool
        | VARNAME '['v=(NUM|VARNAME)']'':='expr {tr+=$VARNAME.text+"["+$v.text+"] = "+$expr.text+";\n"; $nome=$VARNAME.text;}   #attrArrExpr
        | VARNAME '['v=(NUM|VARNAME)']'':='STR  {tr+=$VARNAME.text+"["+$v.text+"] = "+$STR.text+";\n"; $nome=$VARNAME.text;}   #attrArrStr
        | VARNAME '['v=(NUM|VARNAME)']'':='truefalse   {tr+=$VARNAME.text+"["+$v.text+"] = "+$truefalse.text+";\n"; $nome=$VARNAME.text;}  #attrArrTrueFalse
        ;

truefalse: TRUE | FALSE;

expr    : expr1 '+' expr    #exprPlus
        | expr1 '-' expr    #exprMinus
        | expr1             #expr1Empty
        ;

expr1   : expr2 '*' expr    #expr1Mult
        | expr2 '/' expr    #expr1Div
        | expr2             #expr2Empty
        ;

expr2   : '(' expr ')'     #expr2Par
        | NUM              #expr2Num
        | VARNAME              #expr2Var
        | VARNAME '['v=(NUM|VARNAME)']' #exprArr
        ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


//TOKENS
TO      : T O;
IF      : I F ;
BEGIN   : B E G I N ;
END     : E N D ;
ENDP    : E N D '.' ;
ELSE    : E L S E ;
THEN    : T H E N ;
WRITE   : W R I T E ;
WRITELN : W R I T E L N ;
READLN  : R E A D L N ;
INT     : I N T E G E R ;
FLOAT   : F L O A T ;
BOOLEAN : B O O L E A N ;
STRING  : S T R I N G ;
FOR     : F O R ;
WHILE   : W H I L E ;
ARRAY   : A R R A Y ;
VAR     : V A R ;
PROCEDURE: P R O C E D U R E;
PROGRAM : P R O G R A M ;
TRUE    : T R U E;
FALSE   : F A L S E;
OF      : O F;
DO      : D O;

GT      : '>' ;
LT      : '<' ;
EQ      : '==';
GE      : '>=';
LE      : '<=';
NE      : '!=';
PLUS    : '+' ;
MINUS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
OPEN    : '(' ;
CLOSE   : ')' ;
OPEN_BL : '{' ;
CLOSE_BL: '}' ;
IS      : '=' ;
EOL     : ';' ;
NUM     : [0-9]+('.'[0-9])* ;
VARNAME     : [a-zA-Z][a-zA-Z0-9_]*;
STR     : '"' ('\\' ["\\] | ~["\\\r\n])* '"';
WS      : [\n\r \t]+ -> skip;

//('['([0-9]+|([a-zA-Z][a-zA-Z0-9_]*))']')?
