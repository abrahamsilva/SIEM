grammar gramm;

/*if any of subcheck-Validation Failed Authentication SSH login Failed and if within 2 minutes greater than 5 events occur having different username and having same source ip XML for Failed Login Attempts from the Same Source:
 */
//Parser rules
corrule: 'if' body;
body: QUANTITATIVE 'of' mainCondition (LOGICALOPERATOR 'if' RELATIONALOPERATOR NUMBER UNITSOFTIME RELATIONALOPERATOR NUMBER EVENTS CONDITION xml NAME);
xml: XML;
mainCondition: 'subcheck-Validation Failed Authentication SSH login Failed';

//Lexer rules
LOGICALOPERATOR: 'and' | 'or';
XML: 'XML';
NAME: [a-zA-Z0-9]+;
EVENTS: RELATIONALOPERATOR NUMBER 'events occur' CONDITION;
CONDITION: 'having' QUANTITATIVE OBJECT (LOGICALOPERATOR CONDITION)* ;
OBJECT: 'username'|'ip'|'password'|'id'|'source ip';
TIME: RELATIONALOPERATOR NUMBER UNITSOFTIME;
UNITSOFTIME: 'seconds'|'minutes'|'hours';
RELATIONALOPERATOR: 'lessthan'|'greaterthan'|'equalsto'|'within' ;
QUANTITATIVE: 'any' | 'some' | 'one' |'two'|'three'|'all'|'none'|'different'|'same';
NUMBER : [0-9]+;
NEWLINE : [\r\n]+ ;
WS: [ \t\r\n]+ -> skip;