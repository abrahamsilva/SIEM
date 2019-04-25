grammar gramm;


//Parser rules
prog:  NEWLINE;

//Lexer rules
NUMBER : [0-9]+;
NEWLINE : [\r\n]+ ;
