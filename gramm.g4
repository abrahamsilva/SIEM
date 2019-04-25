grammar gramm;


//Parser rules
corrule: 'if' body (LOGICALOPERATOR 'if' body);
body: 'cuerpo';

//Lexer rules
LOGICALOPERATOR: 'and' | 'or';
NUMBER : [0-9]+;
NEWLINE : [\r\n]+ ;
WS: [ \t\r\n]+ -> skip;