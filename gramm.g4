grammar gramm;

/*if any of subcheck-Validation Failed Authentication SSH login Failed and if within 2 minutes greater than 5 events occur
having different username and having same source ip XML for Failed Login Attempts from the Same Source:
 */
//Parser rules

corrule: 'if' body (LOGICALOPERATOR 'if' complement)*;
body: QUANTITATIVE 'of' mainCondition;
mainCondition: 'subcheck-Validation Failed Authentication SSH login Failed';
complement: RELOP number units events;
number: NUMBER;
units: UNITSOFTIME;
name: NAME;
events: RELOP NUMBER 'events occur' (condition)+ XML 'for' (name)+;
condition: (LOGICALOPERATOR)* 'having' QUANTITATIVE OBJECT;


//Lexer rules

QUANTITATIVE: 'any'|'some'|'one'|'two'|'three'|'all'|'none'|'different'|'same';
OBJECT: 'username'|'ip'|'password'|'id'|'source ip';
RELOP: 'less than'|'greater than'|'equals to'|'within';
UNITSOFTIME: 'seconds'|'minutes'|'hours';
LOGICALOPERATOR: 'and'|'or';
XML: 'xml'|'XML';
NUMBER: [0-9]+;
NAME: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;