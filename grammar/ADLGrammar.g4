grammar ADLGrammar;

code
    : (interfaceDefinition | behaviorDefinition)* EOF;

behaviorDefinition
    : 'behavior' behaviorBody;

behaviorBody
    : '{' executionStatement+ '}';

executionStatement
    : (variableDefinition | methodCall) ';';

variableDefinition
    : typeName variableName ('=' methodCall)?;

methodCall
    : variableName '.' methodName '(' argumentsList? ')' behaviorBody?;

argumentsList
    : variableName (',' variableName)*;


interfaceDefinition
    : 'interface' IDENTIFIER '{' methodDeclaration* '}';

methodDeclaration
    : typeName methodName '(' argumentsDefinitionList? ')' ';';

argumentsDefinitionList
    : argumentDefinition (',' argumentDefinition)*;

argumentDefinition
    : typeName variableName;

methodName
    : IDENTIFIER;

variableName
    : IDENTIFIER;

typeName
    : IDENTIFIER;


INTERFACE: 'interface';
BEHAVIOR: 'behavior';

LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
SEMI: ';';
COMA: ',';
DOT: '.';
EQ: '=';
WS : [ \t\r\n]+ -> skip ;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;