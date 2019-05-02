grammar gramm;

/*
if any of subcheck-Validation Failed Authentication SSH login Failed and if within 2 minutes greater than 5 events occur
having different username and having same source ip XML for Failed Login Attempts from the Same Source
 */
//Parser rules

corrule: 'if' body (mainBodyOperator 'if' complement)*;
body: qualifier 'of' mainCondition;
mainCondition: mainConditionName statusAux 'Authentication SSH login Failed';
mainConditionName: 'subcheck-Validation';
mainBodyOperator: LOGICALOPERATOR;
status: STATUS;
qualifier: QUANTITATIVE;
statusAux: STATUS;
complement: relopTime number units events;
relopTime: RELOP;
number: NUMBER;
units: UNITSOFTIME;
name: NAME;
propertiesOperator: LOGICALOPERATOR;
object: OBJECT;
value: QUANTITATIVE;
relop: RELOP;
numberRelop: NUMBER;
events: relop numberRelop 'events occur' (condition)+ XML 'for' status (name)+;
condition: (propertiesOperator)* 'having' value object;


//Lexer rules

QUANTITATIVE: 'any'|'some'|'one'|'two'|'three'|'all'|'none'|'different'|'same';
OBJECT: 'username'|'ip'|'password'|'id'|'source ip';
RELOP: 'less than'|'greater than'|'equals to'|'within';
STATUS: 'Failed' | 'Accepted' | 'Succeeded';
UNITSOFTIME: 'seconds'|'minutes'|'hours';
LOGICALOPERATOR: 'and'|'or';
XML: 'xml'|'XML';
NUMBER: [0-9]+;
NAME: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;