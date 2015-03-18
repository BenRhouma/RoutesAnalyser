
grammar Component;

exp : (ins)*
    ;
ins : method route invokation;
method : 'GET' | 'POST' ;

route : (SLASH (':'|'*')? segment? )+;
segment : ALPHA (ALPHA|DIGIT)*;

SLASH : '/';

invokation: packageDec '.' classDec '.' methodDec ;

packageDec : 'controllers';
classDec : declarationUnit;
methodDec : declarationUnit ('(' (params | (assign  (','  params)?)* ) ')')?;
assign : declarationUnit '=' '"' path '"';
path : (SLASH segment )+;
params : param (',' param)*;
param : paramName (':' paramType)?;
paramName : declarationUnit;
paramType : declarationUnit;
declarationUnit: ALPHA (ALPHA|DIGIT)*;

ALPHA
   :    '\u0024'           // $
    |    '\u0041'..'\u005a' // A-Z
    |    '\u005f'           // _
    |    '\u0061'..'\u007a' // a-z
    |    '\u00c0'..'\u00d6' // À-Ö
    |    '\u00d8'..'\u00f6' // Ø-ö
    |    '\u00f8'..'\u00ff' // ø-ÿ
    |    '\u0100'..'\u1fff'
    |    '\u3040'..'\u318f'
    |    '\u3300'..'\u337f'
    |    '\u3400'..'\u3d2d'
    |    '\u4e00'..'\u9fff'
    |    '\uf900'..'\ufaff'
    ;


DIGIT
    :    '\u0030'..'\u0039'   // 0-9
    |    '\u0660'..'\u0669'   // Arabic 0-9
    |    '\u06f0'..'\u06f9'   // Arabic-Indic 0-9
    |    '\u0966'..'\u096f'   // Devanagari 0-9
    |    '\u09e6'..'\u09ef'   // Bengali 0-9
    |    '\u0a66'..'\u0a6f'   // Gurmukhi 0-9
    |    '\u0ae6'..'\u0aef'   // Gujarati 0-9
    |    '\u0b66'..'\u0b6f'   // Oriya 0-9
    |    '\u0be7'..'\u0bef'   // Tamil 0-9
    |    '\u0c66'..'\u0c6f'   // Telugu 0-9
    |    '\u0ce6'..'\u0cef'   // Kannada 0-9
    |    '\u0d66'..'\u0d6f'   // Malayalam 0-9
    |    '\u0e50'..'\u0e59'   // Thai 0-9
    |    '\u0ed0'..'\u0ed9'   // Lao 0-9
    |    '\u1040'..'\u1049'   // Myanmar 0-9
    ;

WS  :  [ \t\r\n\u000C] -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;
LINE_COMMENT
    :   ('//' ~[\r\n]* | '#'  ~[\r\n]*) -> skip
    ;



