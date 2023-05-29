grammar DrawScriptGrammar;

script: (NEWLINE)*(consts (NEWLINE)*)(props (NEWLINE)*)(logic (NEWLINE)*);

consts: 'consts' assignment_block;
props: 'props' assignment_block;
logic: 'logic' instruction_block;

instruction: (set_color | set_draw_mode | forLoop | ifStatement | shape) NEWLINE*;

set_color: 'color' color;
set_draw_mode: draw_mode color;

draw_mode
        : 'line'
        | 'fill';

square: 'square' position size;
rectangle: 'rectangle' position dimension;
ellipse: 'ellipse' position dimension;

shape
    : square
    | rectangle
    | ellipse;

position: point;
size: expression;

forLoop
    : 'for' ID 'in' interval instruction_block;

ifStatement
    : 'if' condition instruction_block (NEWLINE)*
      'else' instruction_block;

condition: binary_expression COMPARATOR binary_expression;

ml_instruction_block: '{' (NEWLINE)* instruction+ '}';

instruction_block
        : ml_instruction_block
        | (NEWLINE)* instruction;

assignment_block: (NEWLINE)* '{' (NEWLINE)*
                    (assignment (NEWLINE)* )* assignment (NEWLINE)*
                    '}';

constant: CONST;
id: ID;
num: NUM;
bool: BOOL;

data_item
        : constant
        | id;

assignment
        : data_item ASSIGN value;

color
    : expression '|' expression '|' expression
    | '|' expression '|'
    | constant;

x: binary_expression;
y: binary_expression;

point: x ',' y;
interval: ('['|']') point ('['|']');
dimension: x '~' y;

l_expression: expression;
r_expression: expression;

/*expression
        : '(' l_expression ')' (OPERATOR r_expression)?
        | arithmetic OPERATOR r_expression
        | arithmetic;*/

binary_expression
    : binary_expression OPERATOR binary_expression
    | '('? expression OPERATOR expression ')'?
    | expression;

expression
    : constant
    | id
    | num;

value
    : binary_expression
    | point
    | interval
    | dimension
    | color
    | bool;

arithmetic
    : CONST
    | NUM;

// Lexer
SPACE: ' '+ -> skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
COMMENT_LINE: '//' .*? NEWLINE -> skip;
ASSIGN: ':';
BOOL: 'true'|'false';
NUM: [0-9]+ ;
COMPARATOR: ('=='|'<='|'>='|'!='|'<'|'>');
OPERATOR: [+-/*%];
NEWLINE: '\r\n'|'\n';
CONST: [A-Z]+;
ID: [a-zA-Z]+;