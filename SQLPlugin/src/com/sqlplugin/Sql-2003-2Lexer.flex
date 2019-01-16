package com.sqlplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.sqlplugin.psi.SqlTypes.*;

%%

%{
  public Sql20032Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class Sql20032Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}                                                { return WHITE_SPACE; }

  "<SQL language character>"                                   { return <SQL LANGUAGE CHARACTER>; }
  "<simple Latin letter>"                                      { return <SIMPLE LATIN LETTER>; }
  "<digit>"                                                    { return <DIGIT>; }
  "<SQL special character>"                                    { return <SQL SPECIAL CHARACTER>; }
  "<simple Latin upper case letter>"                           { return <SIMPLE LATIN UPPER CASE LETTER>; }
  "<simple Latin lower case letter>"                           { return <SIMPLE LATIN LOWER CASE LETTER>; }
  "A"                                                          { return A; }
  "B"                                                          { return B; }
  "C"                                                          { return C; }
  "D"                                                          { return D; }
  "E"                                                          { return E; }
  "F"                                                          { return F; }
  "G"                                                          { return G; }
  "H"                                                          { return H; }
  "I"                                                          { return I; }
  "J"                                                          { return J; }
  "K"                                                          { return K; }
  "L"                                                          { return L; }
  "M"                                                          { return M; }
  "N"                                                          { return N; }
  "O"                                                          { return O; }
  "P"                                                          { return P; }
  "Q"                                                          { return Q; }
  "R"                                                          { return R; }
  "S"                                                          { return S; }
  "T"                                                          { return T; }
  "U"                                                          { return U; }
  "V"                                                          { return V; }
  "W"                                                          { return W; }
  "X"                                                          { return X; }
  "Y"                                                          { return Y; }
  "Z"                                                          { return Z; }
  "<space>"                                                    { return <SPACE>; }
  "<double quote>"                                             { return <DOUBLE QUOTE>; }
  "<percent>"                                                  { return <PERCENT>; }
  "<ampersand>"                                                { return <AMPERSAND>; }
  "<quote>"                                                    { return <QUOTE>; }
  "<left paren>"                                               { return <LEFT PAREN>; }
  "<right paren>"                                              { return <RIGHT PAREN>; }
  "<asterisk>"                                                 { return <ASTERISK>; }
  "<plus sign>"                                                { return <PLUS SIGN>; }
  "<comma>"                                                    { return <COMMA>; }
  "<minus sign>"                                               { return <MINUS SIGN>; }
  "<period>"                                                   { return <PERIOD>; }
  "<solidus>"                                                  { return <SOLIDUS>; }
  "<colon>"                                                    { return <COLON>; }
  "<semicolon>"                                                { return <SEMICOLON>; }
  "<less than operator>"                                       { return <LESS THAN OPERATOR>; }
  "<equals operator>"                                          { return <EQUALS OPERATOR>; }
  "<greater than operator>"                                    { return <GREATER THAN OPERATOR>; }
  "<question mark>"                                            { return <QUESTION MARK>; }
  "<left bracket>"                                             { return <LEFT BRACKET>; }
  "<right bracket>"                                            { return <RIGHT BRACKET>; }
  "<circumflex>"                                               { return <CIRCUMFLEX>; }
  "<underscore>"                                               { return <UNDERSCORE>; }
  "<vertical bar>"                                             { return <VERTICAL BAR>; }
  "<left brace>"                                               { return <LEFT BRACE>; }
  "<right brace>"                                              { return <RIGHT BRACE>; }
  "<left bracket trigraph>"                                    { return <LEFT BRACKET TRIGRAPH>; }
  "<right bracket trigraph>"                                   { return <RIGHT BRACKET TRIGRAPH>; }
  "<nondelimiter token>"                                       { return <NONDELIMITER TOKEN>; }
  "<delimiter token>"                                          { return <DELIMITER TOKEN>; }
  "<regular identifier>"                                       { return <REGULAR IDENTIFIER>; }
  "<key word>"                                                 { return <KEY WORD>; }
  "<unsigned numeric literal>"                                 { return <UNSIGNED NUMERIC LITERAL>; }
  "<national character string literal>"                        { return <NATIONAL CHARACTER STRING LITERAL>; }
  "<bit string literal>"                                       { return <BIT STRING LITERAL>; }
  "<hex string literal>"                                       { return <HEX STRING LITERAL>; }
  "<large object length token>"                                { return <LARGE OBJECT LENGTH TOKEN>; }
  "<multiplier>"                                               { return <MULTIPLIER>; }
  "<identifier body>"                                          { return <IDENTIFIER BODY>; }
  "<identifier start>"                                         { return <IDENTIFIER START>; }
  "<identifier part>..."                                       { return <IDENTIFIER PART>...; }
  "<identifier extend>"                                        { return <IDENTIFIER EXTEND>; }
  "<initial alphabetic character>"                             { return <INITIAL ALPHABETIC CHARACTER>; }
  "<ideographic character>"                                    { return <IDEOGRAPHIC CHARACTER>; }
  "<digit>... <multiplier>"                                    { return <DIGIT>... <MULTIPLIER>; }
  "<delimited identifier body>"                                { return <DELIMITED IDENTIFIER BODY>; }
  "<delimited identifier part>..."                             { return <DELIMITED IDENTIFIER PART>...; }
  "<nondoublequote character>"                                 { return <NONDOUBLEQUOTE CHARACTER>; }
  "<doublequote symbol>"                                       { return <DOUBLEQUOTE SYMBOL>; }
  "<Unicode delimiter body>"                                   { return <UNICODE DELIMITER BODY>; }
  "<Unicode escape specifier>"                                 { return <UNICODE ESCAPE SPECIFIER>; }
  "UESCAPE"                                                    { return UESCAPE; }
  "<Unicode escape character>"                                 { return <UNICODE ESCAPE CHARACTER>; }
  "<Unicode identifier part>..."                               { return <UNICODE IDENTIFIER PART>...; }
  "<delimited identifier part>"                                { return <DELIMITED IDENTIFIER PART>; }
  "<Unicode escape value>"                                     { return <UNICODE ESCAPE VALUE>; }
  "<Unicode 4 digit escape value>"                             { return <UNICODE 4 DIGIT ESCAPE VALUE>; }
  "<Unicode 6 digit escape value>"                             { return <UNICODE 6 DIGIT ESCAPE VALUE>; }
  "<Unicode character escape value>"                           { return <UNICODE CHARACTER ESCAPE VALUE>; }
  "<hexit>"                                                    { return <HEXIT>; }
  "<character string literal>"                                 { return <CHARACTER STRING LITERAL>; }
  "<date string>"                                              { return <DATE STRING>; }
  "<time string>"                                              { return <TIME STRING>; }
  "<timestamp string>"                                         { return <TIMESTAMP STRING>; }
  "<interval string>"                                          { return <INTERVAL STRING>; }
  "<delimited identifier>"                                     { return <DELIMITED IDENTIFIER>; }
  "<Unicode delimited identifier>"                             { return <UNICODE DELIMITED IDENTIFIER>; }
  "<not equals operator>"                                      { return <NOT EQUALS OPERATOR>; }
  "<greater than or equals operator>"                          { return <GREATER THAN OR EQUALS OPERATOR>; }
  "<less than or equals operator>"                             { return <LESS THAN OR EQUALS OPERATOR>; }
  "<concatenation operator>"                                   { return <CONCATENATION OPERATOR>; }
  "<right arrow>"                                              { return <RIGHT ARROW>; }
  "<double colon>"                                             { return <DOUBLE COLON>; }
  "<double period>"                                            { return <DOUBLE PERIOD>; }
  "<comment>"                                                  { return <COMMENT>; }
  "<white space>"                                              { return <WHITE SPACE>; }
  "<simple comment>"                                           { return <SIMPLE COMMENT>; }
  "<bracketed comment>"                                        { return <BRACKETED COMMENT>; }
  "<simple comment introducer>"                                { return <SIMPLE COMMENT INTRODUCER>; }
  "<comment character>..."                                     { return <COMMENT CHARACTER>...; }
  "<newline>"                                                  { return <NEWLINE>; }
  "<minus sign>..."                                            { return <MINUS SIGN>...; }
  "<bracketed comment introducer>"                             { return <BRACKETED COMMENT INTRODUCER>; }
  "<bracketed comment contents>"                               { return <BRACKETED COMMENT CONTENTS>; }
  "<bracketed comment terminator>"                             { return <BRACKETED COMMENT TERMINATOR>; }
  "<slash>"                                                    { return <SLASH>; }
  "<comment character>"                                        { return <COMMENT CHARACTER>; }
  "<separator>"                                                { return <SEPARATOR>; }
  "<nonquote character>"                                       { return <NONQUOTE CHARACTER>; }
  "<reserved word>"                                            { return <RESERVED WORD>; }
  "<non-reserved word>"                                        { return <NON-RESERVED WORD>; }
  "ABS"                                                        { return ABS; }
  "ABSOLUTE"                                                   { return ABSOLUTE; }
  "ACTION"                                                     { return ACTION; }
  "ADA"                                                        { return ADA; }
  "ADMIN"                                                      { return ADMIN; }
  "AFTER"                                                      { return AFTER; }
  "ALWAYS"                                                     { return ALWAYS; }
  "ASC"                                                        { return ASC; }
  "ASSERTION"                                                  { return ASSERTION; }
  "ASSIGNMENT"                                                 { return ASSIGNMENT; }
  "ATTRIBUTE"                                                  { return ATTRIBUTE; }
  "ATTRIBUTES"                                                 { return ATTRIBUTES; }
  "AVG"                                                        { return AVG; }
  "BEFORE"                                                     { return BEFORE; }
  "BERNOULLI"                                                  { return BERNOULLI; }
  "BREADTH"                                                    { return BREADTH; }
  "CARDINALITY"                                                { return CARDINALITY; }
  "CASCADE"                                                    { return CASCADE; }
  "CATALOG"                                                    { return CATALOG; }
  "CATALOG_NAME"                                               { return CATALOG_NAME; }
  "CEIL"                                                       { return CEIL; }
  "CEILING"                                                    { return CEILING; }
  "CHAIN"                                                      { return CHAIN; }
  "CHARACTERISTICS"                                            { return CHARACTERISTICS; }
  "CHARACTERS"                                                 { return CHARACTERS; }
  "CHARACTER_LENGTH"                                           { return CHARACTER_LENGTH; }
  "CHARACTER_SET_CATALOG"                                      { return CHARACTER_SET_CATALOG; }
  "CHARACTER_SET_NAME"                                         { return CHARACTER_SET_NAME; }
  "CHARACTER_SET_SCHEMA"                                       { return CHARACTER_SET_SCHEMA; }
  "CHAR_LENGTH"                                                { return CHAR_LENGTH; }
  "CHECKED"                                                    { return CHECKED; }
  "CLASS_ORIGIN"                                               { return CLASS_ORIGIN; }
  "COALESCE"                                                   { return COALESCE; }
  "COBOL"                                                      { return COBOL; }
  "CODE_UNITS"                                                 { return CODE_UNITS; }
  "COLLATION"                                                  { return COLLATION; }
  "COLLATION_CATALOG"                                          { return COLLATION_CATALOG; }
  "COLLATION_NAME"                                             { return COLLATION_NAME; }
  "COLLATION_SCHEMA"                                           { return COLLATION_SCHEMA; }
  "COLLECT"                                                    { return COLLECT; }
  "COLUMN_NAME"                                                { return COLUMN_NAME; }
  "COMMAND_FUNCTION"                                           { return COMMAND_FUNCTION; }
  "COMMAND_FUNCTION_CODE"                                      { return COMMAND_FUNCTION_CODE; }
  "COMMITTED"                                                  { return COMMITTED; }
  "CONDITION"                                                  { return CONDITION; }
  "CONDITION_NUMBER"                                           { return CONDITION_NUMBER; }
  "CONNECTION_NAME"                                            { return CONNECTION_NAME; }
  "CONSTRAINTS"                                                { return CONSTRAINTS; }
  "CONSTRAINT_CATALOG"                                         { return CONSTRAINT_CATALOG; }
  "CONSTRAINT_NAME"                                            { return CONSTRAINT_NAME; }
  "CONSTRAINT_SCHEMA"                                          { return CONSTRAINT_SCHEMA; }
  "CONSTRUCTORS"                                               { return CONSTRUCTORS; }
  "CONTAINS"                                                   { return CONTAINS; }
  "CONVERT"                                                    { return CONVERT; }
  "CORR"                                                       { return CORR; }
  "COUNT"                                                      { return COUNT; }
  "COVAR_POP"                                                  { return COVAR_POP; }
  "COVAR_SAMP"                                                 { return COVAR_SAMP; }
  "CUME_DIST"                                                  { return CUME_DIST; }
  "CURRENT_COLLATION"                                          { return CURRENT_COLLATION; }
  "CURSOR_NAME"                                                { return CURSOR_NAME; }
  "DATA"                                                       { return DATA; }
  "DATETIME_INTERVAL_CODE"                                     { return DATETIME_INTERVAL_CODE; }
  "DATETIME_INTERVAL_PRECISION"                                { return DATETIME_INTERVAL_PRECISION; }
  "DEFAULTS"                                                   { return DEFAULTS; }
  "DEFERRABLE"                                                 { return DEFERRABLE; }
  "DEFERRED"                                                   { return DEFERRED; }
  "DEFINED"                                                    { return DEFINED; }
  "DEFINER"                                                    { return DEFINER; }
  "DEGREE"                                                     { return DEGREE; }
  "DENSE_RANK"                                                 { return DENSE_RANK; }
  "DEPTH"                                                      { return DEPTH; }
  "DERIVED"                                                    { return DERIVED; }
  "DESC"                                                       { return DESC; }
  "DESCRIPTOR"                                                 { return DESCRIPTOR; }
  "DIAGNOSTICS"                                                { return DIAGNOSTICS; }
  "DISPATCH"                                                   { return DISPATCH; }
  "DOMAIN"                                                     { return DOMAIN; }
  "DYNAMIC_FUNCTION"                                           { return DYNAMIC_FUNCTION; }
  "DYNAMIC_FUNCTION_CODE"                                      { return DYNAMIC_FUNCTION_CODE; }
  "EQUALS"                                                     { return EQUALS; }
  "EVERY"                                                      { return EVERY; }
  "EXCEPTION"                                                  { return EXCEPTION; }
  "EXCLUDE"                                                    { return EXCLUDE; }
  "EXCLUDING"                                                  { return EXCLUDING; }
  "EXP"                                                        { return EXP; }
  "EXTRACT"                                                    { return EXTRACT; }
  "FINAL"                                                      { return FINAL; }
  "FIRST"                                                      { return FIRST; }
  "FLOOR"                                                      { return FLOOR; }
  "FOLLOWING"                                                  { return FOLLOWING; }
  "FORTRAN"                                                    { return FORTRAN; }
  "FOUND"                                                      { return FOUND; }
  "FUSION"                                                     { return FUSION; }
  "GENERAL"                                                    { return GENERAL; }
  "GO"                                                         { return GO; }
  "GOTO"                                                       { return GOTO; }
  "GRANTED"                                                    { return GRANTED; }
  "HIERARCHY"                                                  { return HIERARCHY; }
  "IMPLEMENTATION"                                             { return IMPLEMENTATION; }
  "INCLUDING"                                                  { return INCLUDING; }
  "INCREMENT"                                                  { return INCREMENT; }
  "INITIALLY"                                                  { return INITIALLY; }
  "INSTANCE"                                                   { return INSTANCE; }
  "INSTANTIABLE"                                               { return INSTANTIABLE; }
  "INTERSECTION"                                               { return INTERSECTION; }
  "INVOKER"                                                    { return INVOKER; }
  "ISOLATION"                                                  { return ISOLATION; }
  "KEY"                                                        { return KEY; }
  "KEY_MEMBER"                                                 { return KEY_MEMBER; }
  "KEY_TYPE"                                                   { return KEY_TYPE; }
  "LAST"                                                       { return LAST; }
  "LENGTH"                                                     { return LENGTH; }
  "LEVEL"                                                      { return LEVEL; }
  "LN"                                                         { return LN; }
  "LOCATOR"                                                    { return LOCATOR; }
  "LOWER"                                                      { return LOWER; }
  "MAP"                                                        { return MAP; }
  "MATCHED"                                                    { return MATCHED; }
  "MAX"                                                        { return MAX; }
  "MAXVALUE"                                                   { return MAXVALUE; }
  "MESSAGE_LENGTH"                                             { return MESSAGE_LENGTH; }
  "MESSAGE_OCTET_LENGTH"                                       { return MESSAGE_OCTET_LENGTH; }
  "MESSAGE_TEXT"                                               { return MESSAGE_TEXT; }
  "MIN"                                                        { return MIN; }
  "MINVALUE"                                                   { return MINVALUE; }
  "MOD"                                                        { return MOD; }
  "MORE"                                                       { return MORE; }
  "MUMPS"                                                      { return MUMPS; }
  "NAME"                                                       { return NAME; }
  "NAMES"                                                      { return NAMES; }
  "NESTING"                                                    { return NESTING; }
  "NEXT"                                                       { return NEXT; }
  "NORMALIZE"                                                  { return NORMALIZE; }
  "NORMALIZED"                                                 { return NORMALIZED; }
  "NULLABLE"                                                   { return NULLABLE; }
  "NULLIF"                                                     { return NULLIF; }
  "NULLS"                                                      { return NULLS; }
  "NUMBER"                                                     { return NUMBER; }
  "OBJECT"                                                     { return OBJECT; }
  "OCTETS"                                                     { return OCTETS; }
  "OCTET_LENGTH"                                               { return OCTET_LENGTH; }
  "OPTION"                                                     { return OPTION; }
  "OPTIONS"                                                    { return OPTIONS; }
  "ORDERING"                                                   { return ORDERING; }
  "ORDINALITY"                                                 { return ORDINALITY; }
  "OTHERS"                                                     { return OTHERS; }
  "OVERLAY"                                                    { return OVERLAY; }
  "OVERRIDING"                                                 { return OVERRIDING; }
  "PAD"                                                        { return PAD; }
  "PARAMETER_MODE"                                             { return PARAMETER_MODE; }
  "PARAMETER_NAME"                                             { return PARAMETER_NAME; }
  "PARAMETER_ORDINAL_POSITION"                                 { return PARAMETER_ORDINAL_POSITION; }
  "PARAMETER_SPECIFIC_CATALOG"                                 { return PARAMETER_SPECIFIC_CATALOG; }
  "PARAMETER_SPECIFIC_NAME"                                    { return PARAMETER_SPECIFIC_NAME; }
  "PARAMETER_SPECIFIC_SCHEMA"                                  { return PARAMETER_SPECIFIC_SCHEMA; }
  "PARTIAL"                                                    { return PARTIAL; }
  "PASCAL"                                                     { return PASCAL; }
  "PATH"                                                       { return PATH; }
  "PERCENTILE_CONT"                                            { return PERCENTILE_CONT; }
  "PERCENTILE_DISC"                                            { return PERCENTILE_DISC; }
  "PERCENT_RANK"                                               { return PERCENT_RANK; }
  "PLACING"                                                    { return PLACING; }
  "PLI"                                                        { return PLI; }
  "POSITION"                                                   { return POSITION; }
  "POWER"                                                      { return POWER; }
  "PRECEDING"                                                  { return PRECEDING; }
  "PRESERVE"                                                   { return PRESERVE; }
  "PRIOR"                                                      { return PRIOR; }
  "PRIVILEGES"                                                 { return PRIVILEGES; }
  "PUBLIC"                                                     { return PUBLIC; }
  "RANK"                                                       { return RANK; }
  "READ"                                                       { return READ; }
  "RELATIVE"                                                   { return RELATIVE; }
  "REPEATABLE"                                                 { return REPEATABLE; }
  "RESTART"                                                    { return RESTART; }
  "RETURNED_CARDINALITY"                                       { return RETURNED_CARDINALITY; }
  "RETURNED_LENGTH"                                            { return RETURNED_LENGTH; }
  "RETURNED_OCTET_LENGTH"                                      { return RETURNED_OCTET_LENGTH; }
  "RETURNED_SQLSTATE"                                          { return RETURNED_SQLSTATE; }
  "ROLE"                                                       { return ROLE; }
  "ROUTINE"                                                    { return ROUTINE; }
  "ROUTINE_CATALOG"                                            { return ROUTINE_CATALOG; }
  "ROUTINE_NAME"                                               { return ROUTINE_NAME; }
  "ROUTINE_SCHEMA"                                             { return ROUTINE_SCHEMA; }
  "ROW_COUNT"                                                  { return ROW_COUNT; }
  "ROW_NUMBER"                                                 { return ROW_NUMBER; }
  "SCALE"                                                      { return SCALE; }
  "SCHEMA"                                                     { return SCHEMA; }
  "SCHEMA_NAME"                                                { return SCHEMA_NAME; }
  "SCOPE_CATALOG"                                              { return SCOPE_CATALOG; }
  "SCOPE_NAME"                                                 { return SCOPE_NAME; }
  "SCOPE_SCHEMA"                                               { return SCOPE_SCHEMA; }
  "SECTION"                                                    { return SECTION; }
  "SECURITY"                                                   { return SECURITY; }
  "SELF"                                                       { return SELF; }
  "SEQUENCE"                                                   { return SEQUENCE; }
  "SERIALIZABLE"                                               { return SERIALIZABLE; }
  "SERVER_NAME"                                                { return SERVER_NAME; }
  "SESSION"                                                    { return SESSION; }
  "SETS"                                                       { return SETS; }
  "SIMPLE"                                                     { return SIMPLE; }
  "SIZE"                                                       { return SIZE; }
  "SOURCE"                                                     { return SOURCE; }
  "SPACE"                                                      { return SPACE; }
  "SPECIFIC_NAME"                                              { return SPECIFIC_NAME; }
  "SQRT"                                                       { return SQRT; }
  "STATE"                                                      { return STATE; }
  "STATEMENT"                                                  { return STATEMENT; }
  "STDDEV_POP"                                                 { return STDDEV_POP; }
  "STDDEV_SAMP"                                                { return STDDEV_SAMP; }
  "STRUCTURE"                                                  { return STRUCTURE; }
  "STYLE"                                                      { return STYLE; }
  "SUBCLASS_ORIGIN"                                            { return SUBCLASS_ORIGIN; }
  "SUBSTRING"                                                  { return SUBSTRING; }
  "SUM"                                                        { return SUM; }
  "TABLESAMPLE"                                                { return TABLESAMPLE; }
  "TABLE_NAME"                                                 { return TABLE_NAME; }
  "TEMPORARY"                                                  { return TEMPORARY; }
  "TIES"                                                       { return TIES; }
  "TOP_LEVEL_COUNT"                                            { return TOP_LEVEL_COUNT; }
  "TRANSACTION"                                                { return TRANSACTION; }
  "TRANSACTIONS_COMMITTED"                                     { return TRANSACTIONS_COMMITTED; }
  "TRANSACTIONS_ROLLED_BACK"                                   { return TRANSACTIONS_ROLLED_BACK; }
  "TRANSACTION_ACTIVE"                                         { return TRANSACTION_ACTIVE; }
  "TRANSFORM"                                                  { return TRANSFORM; }
  "TRANSFORMS"                                                 { return TRANSFORMS; }
  "TRANSLATE"                                                  { return TRANSLATE; }
  "TRIGGER_CATALOG"                                            { return TRIGGER_CATALOG; }
  "TRIGGER_NAME"                                               { return TRIGGER_NAME; }
  "TRIGGER_SCHEMA"                                             { return TRIGGER_SCHEMA; }
  "TRIM"                                                       { return TRIM; }
  "TYPE"                                                       { return TYPE; }
  "UNBOUNDED"                                                  { return UNBOUNDED; }
  "UNCOMMITTED"                                                { return UNCOMMITTED; }
  "UNDER"                                                      { return UNDER; }
  "UNNAMED"                                                    { return UNNAMED; }
  "USAGE"                                                      { return USAGE; }
  "USER_DEFINED_TYPE_CATALOG"                                  { return USER_DEFINED_TYPE_CATALOG; }
  "USER_DEFINED_TYPE_CODE"                                     { return USER_DEFINED_TYPE_CODE; }
  "USER_DEFINED_TYPE_NAME"                                     { return USER_DEFINED_TYPE_NAME; }
  "USER_DEFINED_TYPE_SCHEMA"                                   { return USER_DEFINED_TYPE_SCHEMA; }
  "VIEW"                                                       { return VIEW; }
  "WORK"                                                       { return WORK; }
  "WRITE"                                                      { return WRITE; }
  "ZONE"                                                       { return ZONE; }
  "ADD"                                                        { return ADD; }
  "ALL"                                                        { return ALL; }
  "ALLOCATE"                                                   { return ALLOCATE; }
  "ALTER"                                                      { return ALTER; }
  "AND"                                                        { return AND; }
  "ANY"                                                        { return ANY; }
  "ARE"                                                        { return ARE; }
  "ARRAY"                                                      { return ARRAY; }
  "AS"                                                         { return AS; }
  "ASENSITIVE"                                                 { return ASENSITIVE; }
  "ASYMMETRIC"                                                 { return ASYMMETRIC; }
  "AT"                                                         { return AT; }
  "ATOMIC"                                                     { return ATOMIC; }
  "AUTHORIZATION"                                              { return AUTHORIZATION; }
  "BEGIN"                                                      { return BEGIN; }
  "BETWEEN"                                                    { return BETWEEN; }
  "BIGINT"                                                     { return BIGINT; }
  "BINARY"                                                     { return BINARY; }
  "BLOB"                                                       { return BLOB; }
  "BOOLEAN"                                                    { return BOOLEAN; }
  "BOTH"                                                       { return BOTH; }
  "BY"                                                         { return BY; }
  "CALL"                                                       { return CALL; }
  "CALLED"                                                     { return CALLED; }
  "CASCADED"                                                   { return CASCADED; }
  "CASE"                                                       { return CASE; }
  "CAST"                                                       { return CAST; }
  "CHAR"                                                       { return CHAR; }
  "CHARACTER"                                                  { return CHARACTER; }
  "CHECK"                                                      { return CHECK; }
  "CLOB"                                                       { return CLOB; }
  "CLOSE"                                                      { return CLOSE; }
  "COLLATE"                                                    { return COLLATE; }
  "COLUMN"                                                     { return COLUMN; }
  "COMMIT"                                                     { return COMMIT; }
  "CONNECT"                                                    { return CONNECT; }
  "CONSTRAINT"                                                 { return CONSTRAINT; }
  "CONTINUE"                                                   { return CONTINUE; }
  "CORRESPONDING"                                              { return CORRESPONDING; }
  "CREATE"                                                     { return CREATE; }
  "CROSS"                                                      { return CROSS; }
  "CUBE"                                                       { return CUBE; }
  "CURRENT"                                                    { return CURRENT; }
  "CURRENT_DATE"                                               { return CURRENT_DATE; }
  "CURRENT_DEFAULT_TRANSFORM_GROUP"                            { return CURRENT_DEFAULT_TRANSFORM_GROUP; }
  "CURRENT_PATH"                                               { return CURRENT_PATH; }
  "CURRENT_ROLE"                                               { return CURRENT_ROLE; }
  "CURRENT_TIME"                                               { return CURRENT_TIME; }
  "CURRENT_TIMESTAMP"                                          { return CURRENT_TIMESTAMP; }
  "CURRENT_TRANSFORM_GROUP_FOR_TYPE"                           { return CURRENT_TRANSFORM_GROUP_FOR_TYPE; }
  "CURRENT_USER"                                               { return CURRENT_USER; }
  "CURSOR"                                                     { return CURSOR; }
  "CYCLE"                                                      { return CYCLE; }
  "DATE"                                                       { return DATE; }
  "DAY"                                                        { return DAY; }
  "DEALLOCATE"                                                 { return DEALLOCATE; }
  "DEC"                                                        { return DEC; }
  "DECIMAL"                                                    { return DECIMAL; }
  "DECLARE"                                                    { return DECLARE; }
  "DEFAULT"                                                    { return DEFAULT; }
  "DELETE"                                                     { return DELETE; }
  "DEREF"                                                      { return DEREF; }
  "DESCRIBE"                                                   { return DESCRIBE; }
  "DETERMINISTIC"                                              { return DETERMINISTIC; }
  "DISCONNECT"                                                 { return DISCONNECT; }
  "DISTINCT"                                                   { return DISTINCT; }
  "DOUBLE"                                                     { return DOUBLE; }
  "DROP"                                                       { return DROP; }
  "DYNAMIC"                                                    { return DYNAMIC; }
  "EACH"                                                       { return EACH; }
  "ELEMENT"                                                    { return ELEMENT; }
  "ELSE"                                                       { return ELSE; }
  "END"                                                        { return END; }
  "END-EXEC"                                                   { return END-EXEC; }
  "ESCAPE"                                                     { return ESCAPE; }
  "EXCEPT"                                                     { return EXCEPT; }
  "EXEC"                                                       { return EXEC; }
  "EXECUTE"                                                    { return EXECUTE; }
  "EXISTS"                                                     { return EXISTS; }
  "EXTERNAL"                                                   { return EXTERNAL; }
  "FALSE"                                                      { return FALSE; }
  "FETCH"                                                      { return FETCH; }
  "FILTER"                                                     { return FILTER; }
  "FLOAT"                                                      { return FLOAT; }
  "FOR"                                                        { return FOR; }
  "FOREIGN"                                                    { return FOREIGN; }
  "FREE"                                                       { return FREE; }
  "FROM"                                                       { return FROM; }
  "FULL"                                                       { return FULL; }
  "FUNCTION"                                                   { return FUNCTION; }
  "GET"                                                        { return GET; }
  "GLOBAL"                                                     { return GLOBAL; }
  "GRANT"                                                      { return GRANT; }
  "GROUP"                                                      { return GROUP; }
  "GROUPING"                                                   { return GROUPING; }
  "HAVING"                                                     { return HAVING; }
  "HOLD"                                                       { return HOLD; }
  "HOUR"                                                       { return HOUR; }
  "IDENTITY"                                                   { return IDENTITY; }
  "IMMEDIATE"                                                  { return IMMEDIATE; }
  "IN"                                                         { return IN; }
  "INDICATOR"                                                  { return INDICATOR; }
  "INNER"                                                      { return INNER; }
  "INOUT"                                                      { return INOUT; }
  "INPUT"                                                      { return INPUT; }
  "INSENSITIVE"                                                { return INSENSITIVE; }
  "INSERT"                                                     { return INSERT; }
  "INT"                                                        { return INT; }
  "INTEGER"                                                    { return INTEGER; }
  "INTERSECT"                                                  { return INTERSECT; }
  "INTERVAL"                                                   { return INTERVAL; }
  "INTO"                                                       { return INTO; }
  "IS"                                                         { return IS; }
  "JOIN"                                                       { return JOIN; }
  "LANGUAGE"                                                   { return LANGUAGE; }
  "LARGE"                                                      { return LARGE; }
  "LATERAL"                                                    { return LATERAL; }
  "LEADING"                                                    { return LEADING; }
  "LEFT"                                                       { return LEFT; }
  "LIKE"                                                       { return LIKE; }
  "LOCAL"                                                      { return LOCAL; }
  "LOCALTIME"                                                  { return LOCALTIME; }
  "LOCALTIMESTAMP"                                             { return LOCALTIMESTAMP; }
  "MATCH"                                                      { return MATCH; }
  "MEMBER"                                                     { return MEMBER; }
  "MERGE"                                                      { return MERGE; }
  "METHOD"                                                     { return METHOD; }
  "MINUTE"                                                     { return MINUTE; }
  "MODIFIES"                                                   { return MODIFIES; }
  "MODULE"                                                     { return MODULE; }
  "MONTH"                                                      { return MONTH; }
  "MULTISET"                                                   { return MULTISET; }
  "NATIONAL"                                                   { return NATIONAL; }
  "NATURAL"                                                    { return NATURAL; }
  "NCHAR"                                                      { return NCHAR; }
  "NCLOB"                                                      { return NCLOB; }
  "NEW"                                                        { return NEW; }
  "NO"                                                         { return NO; }
  "NONE"                                                       { return NONE; }
  "NOT"                                                        { return NOT; }
  "NULL"                                                       { return NULL; }
  "NUMERIC"                                                    { return NUMERIC; }
  "OF"                                                         { return OF; }
  "OLD"                                                        { return OLD; }
  "ON"                                                         { return ON; }
  "ONLY"                                                       { return ONLY; }
  "OPEN"                                                       { return OPEN; }
  "OR"                                                         { return OR; }
  "ORDER"                                                      { return ORDER; }
  "OUT"                                                        { return OUT; }
  "OUTER"                                                      { return OUTER; }
  "OUTPUT"                                                     { return OUTPUT; }
  "OVER"                                                       { return OVER; }
  "OVERLAPS"                                                   { return OVERLAPS; }
  "PARAMETER"                                                  { return PARAMETER; }
  "PARTITION"                                                  { return PARTITION; }
  "PRECISION"                                                  { return PRECISION; }
  "PREPARE"                                                    { return PREPARE; }
  "PRIMARY"                                                    { return PRIMARY; }
  "PROCEDURE"                                                  { return PROCEDURE; }
  "RANGE"                                                      { return RANGE; }
  "READS"                                                      { return READS; }
  "REAL"                                                       { return REAL; }
  "RECURSIVE"                                                  { return RECURSIVE; }
  "REF"                                                        { return REF; }
  "REFERENCES"                                                 { return REFERENCES; }
  "REFERENCING"                                                { return REFERENCING; }
  "REGR_AVGX"                                                  { return REGR_AVGX; }
  "REGR_AVGY"                                                  { return REGR_AVGY; }
  "REGR_COUNT"                                                 { return REGR_COUNT; }
  "REGR_INTERCEPT"                                             { return REGR_INTERCEPT; }
  "REGR_R2"                                                    { return REGR_R2; }
  "REGR_SLOPE"                                                 { return REGR_SLOPE; }
  "REGR_SXX"                                                   { return REGR_SXX; }
  "REGR_SXY"                                                   { return REGR_SXY; }
  "REGR_SYY"                                                   { return REGR_SYY; }
  "RELEASE"                                                    { return RELEASE; }
  "RESULT"                                                     { return RESULT; }
  "RETURN"                                                     { return RETURN; }
  "RETURNS"                                                    { return RETURNS; }
  "REVOKE"                                                     { return REVOKE; }
  "RIGHT"                                                      { return RIGHT; }
  "ROLLBACK"                                                   { return ROLLBACK; }
  "ROLLUP"                                                     { return ROLLUP; }
  "ROW"                                                        { return ROW; }
  "ROWS"                                                       { return ROWS; }
  "SAVEPOINT"                                                  { return SAVEPOINT; }
  "SCROLL"                                                     { return SCROLL; }
  "SEARCH"                                                     { return SEARCH; }
  "SECOND"                                                     { return SECOND; }
  "SELECT"                                                     { return SELECT; }
  "SENSITIVE"                                                  { return SENSITIVE; }
  "SESSION_USER"                                               { return SESSION_USER; }
  "SET"                                                        { return SET; }
  "SIMILAR"                                                    { return SIMILAR; }
  "SMALLINT"                                                   { return SMALLINT; }
  "SOME"                                                       { return SOME; }
  "SPECIFIC"                                                   { return SPECIFIC; }
  "SPECIFICTYPE"                                               { return SPECIFICTYPE; }
  "SQL"                                                        { return SQL; }
  "SQLEXCEPTION"                                               { return SQLEXCEPTION; }
  "SQLSTATE"                                                   { return SQLSTATE; }
  "SQLWARNING"                                                 { return SQLWARNING; }
  "START"                                                      { return START; }
  "STATIC"                                                     { return STATIC; }
  "SUBMULTISET"                                                { return SUBMULTISET; }
  "SYMMETRIC"                                                  { return SYMMETRIC; }
  "SYSTEM"                                                     { return SYSTEM; }
  "SYSTEM_USER"                                                { return SYSTEM_USER; }
  "TABLE"                                                      { return TABLE; }
  "THEN"                                                       { return THEN; }
  "TIME"                                                       { return TIME; }
  "TIMESTAMP"                                                  { return TIMESTAMP; }
  "TIMEZONE_HOUR"                                              { return TIMEZONE_HOUR; }
  "TIMEZONE_MINUTE"                                            { return TIMEZONE_MINUTE; }
  "TO"                                                         { return TO; }
  "TRAILING"                                                   { return TRAILING; }
  "TRANSLATION"                                                { return TRANSLATION; }
  "TREAT"                                                      { return TREAT; }
  "TRIGGER"                                                    { return TRIGGER; }
  "TRUE"                                                       { return TRUE; }
  "UNION"                                                      { return UNION; }
  "UNIQUE"                                                     { return UNIQUE; }
  "UNKNOWN"                                                    { return UNKNOWN; }
  "UNNEST"                                                     { return UNNEST; }
  "UPDATE"                                                     { return UPDATE; }
  "UPPER"                                                      { return UPPER; }
  "USER"                                                       { return USER; }
  "USING"                                                      { return USING; }
  "VALUE"                                                      { return VALUE; }
  "VALUES"                                                     { return VALUES; }
  "VAR_POP"                                                    { return VAR_POP; }
  "VAR_SAMP"                                                   { return VAR_SAMP; }
  "VARCHAR"                                                    { return VARCHAR; }
  "VARYING"                                                    { return VARYING; }
  "WHEN"                                                       { return WHEN; }
  "WHENEVER"                                                   { return WHENEVER; }
  "WHERE"                                                      { return WHERE; }
  "WIDTH_BUCKET"                                               { return WIDTH_BUCKET; }
  "WINDOW"                                                     { return WINDOW; }
  "WITH"                                                       { return WITH; }
  "WITHIN"                                                     { return WITHIN; }
  "WITHOUT"                                                    { return WITHOUT; }
  "YEAR"                                                       { return YEAR; }
  "<signed numeric literal>"                                   { return <SIGNED NUMERIC LITERAL>; }
  "<general literal>"                                          { return <GENERAL LITERAL>; }
  "<Unicode character string literal>"                         { return <UNICODE CHARACTER STRING LITERAL>; }
  "<binary string literal>"                                    { return <BINARY STRING LITERAL>; }
  "<datetime literal>"                                         { return <DATETIME LITERAL>; }
  "<interval literal>"                                         { return <INTERVAL LITERAL>; }
  "<boolean literal>"                                          { return <BOOLEAN LITERAL>; }
  "<introducer>"                                               { return <INTRODUCER>; }
  "<character set specification>"                              { return <CHARACTER SET SPECIFICATION>; }
  "<character representation>..."                              { return <CHARACTER REPRESENTATION>...; }
  "<quote symbol>"                                             { return <QUOTE SYMBOL>; }
  "<Unicode representation>..."                                { return <UNICODE REPRESENTATION>...; }
  "<escape character>"                                         { return <ESCAPE CHARACTER>; }
  "<character representation>"                                 { return <CHARACTER REPRESENTATION>; }
  "<sign>"                                                     { return <SIGN>; }
  "<exact numeric literal>"                                    { return <EXACT NUMERIC LITERAL>; }
  "<approximate numeric literal>"                              { return <APPROXIMATE NUMERIC LITERAL>; }
  "<unsigned integer>"                                         { return <UNSIGNED INTEGER>; }
  "<mantissa>"                                                 { return <MANTISSA>; }
  "<exponent>"                                                 { return <EXPONENT>; }
  "<signed integer>"                                           { return <SIGNED INTEGER>; }
  "<digit>..."                                                 { return <DIGIT>...; }
  "<date literal>"                                             { return <DATE LITERAL>; }
  "<time literal>"                                             { return <TIME LITERAL>; }
  "<timestamp literal>"                                        { return <TIMESTAMP LITERAL>; }
  "<unquoted date string>"                                     { return <UNQUOTED DATE STRING>; }
  "<unquoted time string>"                                     { return <UNQUOTED TIME STRING>; }
  "<unquoted timestamp string>"                                { return <UNQUOTED TIMESTAMP STRING>; }
  "<hours value>"                                              { return <HOURS VALUE>; }
  "<minutes value>"                                            { return <MINUTES VALUE>; }
  "<years value>"                                              { return <YEARS VALUE>; }
  "<months value>"                                             { return <MONTHS VALUE>; }
  "<days value>"                                               { return <DAYS VALUE>; }
  "<seconds value>"                                            { return <SECONDS VALUE>; }
  "<interval qualifier>"                                       { return <INTERVAL QUALIFIER>; }
  "<unquoted interval string>"                                 { return <UNQUOTED INTERVAL STRING>; }
  "<date value>"                                               { return <DATE VALUE>; }
  "<time value>"                                               { return <TIME VALUE>; }
  "<time zone interval>"                                       { return <TIME ZONE INTERVAL>; }
  "<year-month literal>"                                       { return <YEAR-MONTH LITERAL>; }
  "<day-time literal>"                                         { return <DAY-TIME LITERAL>; }
  "<day-time interval>"                                        { return <DAY-TIME INTERVAL>; }
  "<time interval>"                                            { return <TIME INTERVAL>; }
  "<datetime value>"                                           { return <DATETIME VALUE>; }
  "<seconds integer value>"                                    { return <SECONDS INTEGER VALUE>; }
  "<seconds fraction>"                                         { return <SECONDS FRACTION>; }
  "<actual identifier>"                                        { return <ACTUAL IDENTIFIER>; }
  "<SQL language identifier start>"                            { return <SQL LANGUAGE IDENTIFIER START>; }
  "<SQL language identifier part>"                             { return <SQL LANGUAGE IDENTIFIER PART>; }
  "<role name>"                                                { return <ROLE NAME>; }
  "<user identifier>"                                          { return <USER IDENTIFIER>; }
  "<local or schema qualified name>"                           { return <LOCAL OR SCHEMA QUALIFIED NAME>; }
  "<schema qualified name>"                                    { return <SCHEMA QUALIFIED NAME>; }
  "<catalog name>"                                             { return <CATALOG NAME>; }
  "<unqualified schema name>"                                  { return <UNQUALIFIED SCHEMA NAME>; }
  "<identifier>"                                               { return <IDENTIFIER>; }
  "<schema name>"                                              { return <SCHEMA NAME>; }
  "<qualified identifier>"                                     { return <QUALIFIED IDENTIFIER>; }
  "<local or schema qualifier>"                                { return <LOCAL OR SCHEMA QUALIFIER>; }
  "<local qualified name>"                                     { return <LOCAL QUALIFIED NAME>; }
  "<local qualifier>"                                          { return <LOCAL QUALIFIER>; }
  "<SQL language identifier>"                                  { return <SQL LANGUAGE IDENTIFIER>; }
  "<schema qualified type name>"                               { return <SCHEMA QUALIFIED TYPE NAME>; }
  "<user-defined type name>"                                   { return <USER-DEFINED TYPE NAME>; }
  "<simple value specification>"                               { return <SIMPLE VALUE SPECIFICATION>; }
  "<statement name>"                                           { return <STATEMENT NAME>; }
  "<extended statement name>"                                  { return <EXTENDED STATEMENT NAME>; }
  "<scope option>"                                             { return <SCOPE OPTION>; }
  "<cursor name>"                                              { return <CURSOR NAME>; }
  "<extended cursor name>"                                     { return <EXTENDED CURSOR NAME>; }
  "<predefined type>"                                          { return <PREDEFINED TYPE>; }
  "<row type>"                                                 { return <ROW TYPE>; }
  "<path-resolved user-defined type name>"                     { return <PATH-RESOLVED USER-DEFINED TYPE NAME>; }
  "<reference type>"                                           { return <REFERENCE TYPE>; }
  "<collection type>"                                          { return <COLLECTION TYPE>; }
  "<character string type>"                                    { return <CHARACTER STRING TYPE>; }
  "<collate clause>"                                           { return <COLLATE CLAUSE>; }
  "<national character string type>"                           { return <NATIONAL CHARACTER STRING TYPE>; }
  "<binary large object string type>"                          { return <BINARY LARGE OBJECT STRING TYPE>; }
  "<numeric type>"                                             { return <NUMERIC TYPE>; }
  "<boolean type>"                                             { return <BOOLEAN TYPE>; }
  "<datetime type>"                                            { return <DATETIME TYPE>; }
  "<interval type>"                                            { return <INTERVAL TYPE>; }
  "<length>"                                                   { return <LENGTH>; }
  "<large object length>"                                      { return <LARGE OBJECT LENGTH>; }
  "<exact numeric type>"                                       { return <EXACT NUMERIC TYPE>; }
  "<approximate numeric type>"                                 { return <APPROXIMATE NUMERIC TYPE>; }
  "<precision>"                                                { return <PRECISION>; }
  "<scale>"                                                    { return <SCALE>; }
  "<char length units>"                                        { return <CHAR LENGTH UNITS>; }
  "<time precision>"                                           { return <TIME PRECISION>; }
  "<with or without time zone>"                                { return <WITH OR WITHOUT TIME ZONE>; }
  "<timestamp precision>"                                      { return <TIMESTAMP PRECISION>; }
  "<time fractional seconds precision>"                        { return <TIME FRACTIONAL SECONDS PRECISION>; }
  "<row type body>"                                            { return <ROW TYPE BODY>; }
  "<field definition>"                                         { return <FIELD DEFINITION>; }
  "<referenced type>"                                          { return <REFERENCED TYPE>; }
  "<scope clause>"                                             { return <SCOPE CLAUSE>; }
  "SCOPE"                                                      { return SCOPE; }
  "<table name>"                                               { return <TABLE NAME>; }
  "<array type>"                                               { return <ARRAY TYPE>; }
  "<multiset type>"                                            { return <MULTISET TYPE>; }
  "<data type>"                                                { return <DATA TYPE>; }
  "<left bracket or trigraph>"                                 { return <LEFT BRACKET OR TRIGRAPH>; }
  "<right bracket or trigraph>"                                { return <RIGHT BRACKET OR TRIGRAPH>; }
  "<field name>"                                               { return <FIELD NAME>; }
  "<reference scope check>"                                    { return <REFERENCE SCOPE CHECK>; }
  "<parenthesized value expression>"                           { return <PARENTHESIZED VALUE EXPRESSION>; }
  "<nonparenthesized value expression primary>"                { return <NONPARENTHESIZED VALUE EXPRESSION PRIMARY>; }
  "<value expression>"                                         { return <VALUE EXPRESSION>; }
  "<unsigned value specification>"                             { return <UNSIGNED VALUE SPECIFICATION>; }
  "<column reference>"                                         { return <COLUMN REFERENCE>; }
  "<set function specification>"                               { return <SET FUNCTION SPECIFICATION>; }
  "<window function>"                                          { return <WINDOW FUNCTION>; }
  "<scalar subquery>"                                          { return <SCALAR SUBQUERY>; }
  "<case expression>"                                          { return <CASE EXPRESSION>; }
  "<cast specification>"                                       { return <CAST SPECIFICATION>; }
  "<field reference>"                                          { return <FIELD REFERENCE>; }
  "<subtype treatment>"                                        { return <SUBTYPE TREATMENT>; }
  "<method invocation>"                                        { return <METHOD INVOCATION>; }
  "<static method invocation>"                                 { return <STATIC METHOD INVOCATION>; }
  "<new specification>"                                        { return <NEW SPECIFICATION>; }
  "<attribute or method reference>"                            { return <ATTRIBUTE OR METHOD REFERENCE>; }
  "<reference resolution>"                                     { return <REFERENCE RESOLUTION>; }
  "<collection value constructor>"                             { return <COLLECTION VALUE CONSTRUCTOR>; }
  "<array element reference>"                                  { return <ARRAY ELEMENT REFERENCE>; }
  "<multiset element reference>"                               { return <MULTISET ELEMENT REFERENCE>; }
  "<routine invocation>"                                       { return <ROUTINE INVOCATION>; }
  "<next value expression>"                                    { return <NEXT VALUE EXPRESSION>; }
  "<literal>"                                                  { return <LITERAL>; }
  "<general value specification>"                              { return <GENERAL VALUE SPECIFICATION>; }
  "<unsigned literal>"                                         { return <UNSIGNED LITERAL>; }
  "<host parameter specification>"                             { return <HOST PARAMETER SPECIFICATION>; }
  "<SQL parameter reference>"                                  { return <SQL PARAMETER REFERENCE>; }
  "<dynamic parameter specification>"                          { return <DYNAMIC PARAMETER SPECIFICATION>; }
  "<embedded variable specification>"                          { return <EMBEDDED VARIABLE SPECIFICATION>; }
  "<current collation specification>"                          { return <CURRENT COLLATION SPECIFICATION>; }
  "<host parameter name>"                                      { return <HOST PARAMETER NAME>; }
  "<embedded variable name>"                                   { return <EMBEDDED VARIABLE NAME>; }
  "<target array element specification>"                       { return <TARGET ARRAY ELEMENT SPECIFICATION>; }
  "<indicator parameter>"                                      { return <INDICATOR PARAMETER>; }
  "<indicator variable>"                                       { return <INDICATOR VARIABLE>; }
  "<target array reference>"                                   { return <TARGET ARRAY REFERENCE>; }
  "<string value expression>"                                  { return <STRING VALUE EXPRESSION>; }
  "<implicitly typed value specification>"                     { return <IMPLICITLY TYPED VALUE SPECIFICATION>; }
  "<default specification>"                                    { return <DEFAULT SPECIFICATION>; }
  "<null specification>"                                       { return <NULL SPECIFICATION>; }
  "<empty specification>"                                      { return <EMPTY SPECIFICATION>; }
  "<identifier chain>"                                         { return <IDENTIFIER CHAIN>; }
  "<basic identifier chain>"                                   { return <BASIC IDENTIFIER CHAIN>; }
  "<column name>"                                              { return <COLUMN NAME>; }
  "<aggregate function>"                                       { return <AGGREGATE FUNCTION>; }
  "<grouping operation>"                                       { return <GROUPING OPERATION>; }
  "<window function type>"                                     { return <WINDOW FUNCTION TYPE>; }
  "<window name or specification>"                             { return <WINDOW NAME OR SPECIFICATION>; }
  "<rank function type>"                                       { return <RANK FUNCTION TYPE>; }
  "<window name>"                                              { return <WINDOW NAME>; }
  "<in-line window specification>"                             { return <IN-LINE WINDOW SPECIFICATION>; }
  "<window specification>"                                     { return <WINDOW SPECIFICATION>; }
  "<case abbreviation>"                                        { return <CASE ABBREVIATION>; }
  "<case specification>"                                       { return <CASE SPECIFICATION>; }
  "<simple case>"                                              { return <SIMPLE CASE>; }
  "<searched case>"                                            { return <SEARCHED CASE>; }
  "<case operand>"                                             { return <CASE OPERAND>; }
  "<simple when clause>"                                       { return <SIMPLE WHEN CLAUSE>; }
  "<searched when clause>"                                     { return <SEARCHED WHEN CLAUSE>; }
  "<when operand>"                                             { return <WHEN OPERAND>; }
  "<result>"                                                   { return <RESULT>; }
  "<search condition>"                                         { return <SEARCH CONDITION>; }
  "<row value predicand>"                                      { return <ROW VALUE PREDICAND>; }
  "<overlaps predicate part>"                                  { return <OVERLAPS PREDICATE PART>; }
  "<comparison predicate part 2>"                              { return <COMPARISON PREDICATE PART 2>; }
  "<between predicate part 2>"                                 { return <BETWEEN PREDICATE PART 2>; }
  "<in predicate part 2>"                                      { return <IN PREDICATE PART 2>; }
  "<character like predicate part 2>"                          { return <CHARACTER LIKE PREDICATE PART 2>; }
  "<octet like predicate part 2>"                              { return <OCTET LIKE PREDICATE PART 2>; }
  "<similar predicate part 2>"                                 { return <SIMILAR PREDICATE PART 2>; }
  "<null predicate part 2>"                                    { return <NULL PREDICATE PART 2>; }
  "<quantified comparison predicate part 2>"                   { return <QUANTIFIED COMPARISON PREDICATE PART 2>; }
  "<match predicate part 2>"                                   { return <MATCH PREDICATE PART 2>; }
  "<overlaps predicate part 2>"                                { return <OVERLAPS PREDICATE PART 2>; }
  "<distinct predicate part 2>"                                { return <DISTINCT PREDICATE PART 2>; }
  "<member predicate part 2>"                                  { return <MEMBER PREDICATE PART 2>; }
  "<submultiset predicate part 2>"                             { return <SUBMULTISET PREDICATE PART 2>; }
  "<set predicate part 2>"                                     { return <SET PREDICATE PART 2>; }
  "<type predicate part 2>"                                    { return <TYPE PREDICATE PART 2>; }
  "<result expression>"                                        { return <RESULT EXPRESSION>; }
  "<cast operand>"                                             { return <CAST OPERAND>; }
  "<cast target>"                                              { return <CAST TARGET>; }
  "<domain name>"                                              { return <DOMAIN NAME>; }
  "<sequence generator name>"                                  { return <SEQUENCE GENERATOR NAME>; }
  "<value expression primary>"                                 { return <VALUE EXPRESSION PRIMARY>; }
  "<subtype operand>"                                          { return <SUBTYPE OPERAND>; }
  "<target subtype>"                                           { return <TARGET SUBTYPE>; }
  "<direct invocation>"                                        { return <DIRECT INVOCATION>; }
  "<generalized invocation>"                                   { return <GENERALIZED INVOCATION>; }
  "<method name>"                                              { return <METHOD NAME>; }
  "<SQL argument list>"                                        { return <SQL ARGUMENT LIST>; }
  "<dereference operator>"                                     { return <DEREFERENCE OPERATOR>; }
  "<reference value expression>"                               { return <REFERENCE VALUE EXPRESSION>; }
  "<attribute name>"                                           { return <ATTRIBUTE NAME>; }
  "<array value expression>"                                   { return <ARRAY VALUE EXPRESSION>; }
  "<numeric value expression>"                                 { return <NUMERIC VALUE EXPRESSION>; }
  "<multset value expression>"                                 { return <MULTSET VALUE EXPRESSION>; }
  "<common value expression>"                                  { return <COMMON VALUE EXPRESSION>; }
  "<boolean value expression>"                                 { return <BOOLEAN VALUE EXPRESSION>; }
  "<row value expression>"                                     { return <ROW VALUE EXPRESSION>; }
  "<datetime value expression>"                                { return <DATETIME VALUE EXPRESSION>; }
  "<interval value expression>"                                { return <INTERVAL VALUE EXPRESSION>; }
  "<user-defined type value expression>"                       { return <USER-DEFINED TYPE VALUE EXPRESSION>; }
  "<collection value expression>"                              { return <COLLECTION VALUE EXPRESSION>; }
  "<multiset value expression>"                                { return <MULTISET VALUE EXPRESSION>; }
  "<array value constructor>"                                  { return <ARRAY VALUE CONSTRUCTOR>; }
  "<multiset value constructor>"                               { return <MULTISET VALUE CONSTRUCTOR>; }
  "<term>"                                                     { return <TERM>; }
  "<factor>"                                                   { return <FACTOR>; }
  "<numeric primary>"                                          { return <NUMERIC PRIMARY>; }
  "<numeric value function>"                                   { return <NUMERIC VALUE FUNCTION>; }
  "<position expression>"                                      { return <POSITION EXPRESSION>; }
  "<extract expression>"                                       { return <EXTRACT EXPRESSION>; }
  "<length expression>"                                        { return <LENGTH EXPRESSION>; }
  "<cardinality expression>"                                   { return <CARDINALITY EXPRESSION>; }
  "<absolute value expression>"                                { return <ABSOLUTE VALUE EXPRESSION>; }
  "<modulus expression>"                                       { return <MODULUS EXPRESSION>; }
  "<natural logarithm>"                                        { return <NATURAL LOGARITHM>; }
  "<exponential function>"                                     { return <EXPONENTIAL FUNCTION>; }
  "<power function>"                                           { return <POWER FUNCTION>; }
  "<square root>"                                              { return <SQUARE ROOT>; }
  "<floor function>"                                           { return <FLOOR FUNCTION>; }
  "<ceiling function>"                                         { return <CEILING FUNCTION>; }
  "<width bucket function>"                                    { return <WIDTH BUCKET FUNCTION>; }
  "<string position expression>"                               { return <STRING POSITION EXPRESSION>; }
  "<blob position expression>"                                 { return <BLOB POSITION EXPRESSION>; }
  "<blob value expression>"                                    { return <BLOB VALUE EXPRESSION>; }
  "<char length expression>"                                   { return <CHAR LENGTH EXPRESSION>; }
  "<octet length expression>"                                  { return <OCTET LENGTH EXPRESSION>; }
  "<extract field>"                                            { return <EXTRACT FIELD>; }
  "<extract source>"                                           { return <EXTRACT SOURCE>; }
  "<primary datetime field>"                                   { return <PRIMARY DATETIME FIELD>; }
  "<time zone field>"                                          { return <TIME ZONE FIELD>; }
  "<numeric value expression dividend>"                        { return <NUMERIC VALUE EXPRESSION DIVIDEND>; }
  "<numeric value expression divisor>"                         { return <NUMERIC VALUE EXPRESSION DIVISOR>; }
  "<numeric value expression base>"                            { return <NUMERIC VALUE EXPRESSION BASE>; }
  "<numeric value expression exponent>"                        { return <NUMERIC VALUE EXPRESSION EXPONENT>; }
  "<width bucket operand>"                                     { return <WIDTH BUCKET OPERAND>; }
  "<width bucket bound 1>"                                     { return <WIDTH BUCKET BOUND 1>; }
  "<width bucket bound 2>"                                     { return <WIDTH BUCKET BOUND 2>; }
  "<width bucket count>"                                       { return <WIDTH BUCKET COUNT>; }
  "<character value expression>"                               { return <CHARACTER VALUE EXPRESSION>; }
  "<concatenation>"                                            { return <CONCATENATION>; }
  "<character factor>"                                         { return <CHARACTER FACTOR>; }
  "<character primary>"                                        { return <CHARACTER PRIMARY>; }
  "<string value function>"                                    { return <STRING VALUE FUNCTION>; }
  "<blob concatenation>"                                       { return <BLOB CONCATENATION>; }
  "<blob factor>"                                              { return <BLOB FACTOR>; }
  "<blob primary>"                                             { return <BLOB PRIMARY>; }
  "<character value function>"                                 { return <CHARACTER VALUE FUNCTION>; }
  "<blob value function>"                                      { return <BLOB VALUE FUNCTION>; }
  "<character substring function>"                             { return <CHARACTER SUBSTRING FUNCTION>; }
  "<regular expression substring function>"                    { return <REGULAR EXPRESSION SUBSTRING FUNCTION>; }
  "<fold>"                                                     { return <FOLD>; }
  "<transcoding>"                                              { return <TRANSCODING>; }
  "<character transliteration>"                                { return <CHARACTER TRANSLITERATION>; }
  "<trim function>"                                            { return <TRIM FUNCTION>; }
  "<character overlay function>"                               { return <CHARACTER OVERLAY FUNCTION>; }
  "<normalize function>"                                       { return <NORMALIZE FUNCTION>; }
  "<specific type method>"                                     { return <SPECIFIC TYPE METHOD>; }
  "<start position>"                                           { return <START POSITION>; }
  "<string length>"                                            { return <STRING LENGTH>; }
  "<transcoding name>"                                         { return <TRANSCODING NAME>; }
  "<transliteration name>"                                     { return <TRANSLITERATION NAME>; }
  "<trim operands>"                                            { return <TRIM OPERANDS>; }
  "<trim specification>"                                       { return <TRIM SPECIFICATION>; }
  "<trim character>"                                           { return <TRIM CHARACTER>; }
  "<trim source>"                                              { return <TRIM SOURCE>; }
  "<blob substring function>"                                  { return <BLOB SUBSTRING FUNCTION>; }
  "<blob trim function>"                                       { return <BLOB TRIM FUNCTION>; }
  "<blob overlay function>"                                    { return <BLOB OVERLAY FUNCTION>; }
  "<blob trim operands>"                                       { return <BLOB TRIM OPERANDS>; }
  "<trim octet>"                                               { return <TRIM OCTET>; }
  "<blob trim source>"                                         { return <BLOB TRIM SOURCE>; }
  "<datetime term>"                                            { return <DATETIME TERM>; }
  "<interval term>"                                            { return <INTERVAL TERM>; }
  "<datetime factor>"                                          { return <DATETIME FACTOR>; }
  "<datetime primary>"                                         { return <DATETIME PRIMARY>; }
  "<time zone>"                                                { return <TIME ZONE>; }
  "<datetime value function>"                                  { return <DATETIME VALUE FUNCTION>; }
  "<time zone specifier>"                                      { return <TIME ZONE SPECIFIER>; }
  "<interval primary>"                                         { return <INTERVAL PRIMARY>; }
  "<current date value function>"                              { return <CURRENT DATE VALUE FUNCTION>; }
  "<current time value function>"                              { return <CURRENT TIME VALUE FUNCTION>; }
  "<current timestamp value function>"                         { return <CURRENT TIMESTAMP VALUE FUNCTION>; }
  "<current local time value function>"                        { return <CURRENT LOCAL TIME VALUE FUNCTION>; }
  "<current local timestamp value function>"                   { return <CURRENT LOCAL TIMESTAMP VALUE FUNCTION>; }
  "<interval value expression 1>"                              { return <INTERVAL VALUE EXPRESSION 1>; }
  "<interval term 1>"                                          { return <INTERVAL TERM 1>; }
  "<interval factor>"                                          { return <INTERVAL FACTOR>; }
  "<interval term 2>"                                          { return <INTERVAL TERM 2>; }
  "<interval value function>"                                  { return <INTERVAL VALUE FUNCTION>; }
  "<interval absolute value function>"                         { return <INTERVAL ABSOLUTE VALUE FUNCTION>; }
  "<boolean term>"                                             { return <BOOLEAN TERM>; }
  "<boolean factor>"                                           { return <BOOLEAN FACTOR>; }
  "<boolean test>"                                             { return <BOOLEAN TEST>; }
  "<boolean primary>"                                          { return <BOOLEAN PRIMARY>; }
  "<truth value>"                                              { return <TRUTH VALUE>; }
  "<predicate>"                                                { return <PREDICATE>; }
  "<boolean predicand>"                                        { return <BOOLEAN PREDICAND>; }
  "<parenthesized boolean value expression>"                   { return <PARENTHESIZED BOOLEAN VALUE EXPRESSION>; }
  "<array concatenation>"                                      { return <ARRAY CONCATENATION>; }
  "<array factor>"                                             { return <ARRAY FACTOR>; }
  "<array value expression 1>"                                 { return <ARRAY VALUE EXPRESSION 1>; }
  "<array value constructor by enumeration>"                   { return <ARRAY VALUE CONSTRUCTOR BY ENUMERATION>; }
  "<array value constructor by query>"                         { return <ARRAY VALUE CONSTRUCTOR BY QUERY>; }
  "<array element list>"                                       { return <ARRAY ELEMENT LIST>; }
  "<array element>"                                            { return <ARRAY ELEMENT>; }
  "<query expression>"                                         { return <QUERY EXPRESSION>; }
  "<order by clause>"                                          { return <ORDER BY CLAUSE>; }
  "<multiset term>"                                            { return <MULTISET TERM>; }
  "<multiset primary>"                                         { return <MULTISET PRIMARY>; }
  "<multiset value function>"                                  { return <MULTISET VALUE FUNCTION>; }
  "<multiset set function>"                                    { return <MULTISET SET FUNCTION>; }
  "<multiset value constructor by enumeration>"                { return <MULTISET VALUE CONSTRUCTOR BY ENUMERATION>; }
  "<multiset value constructor by query>"                      { return <MULTISET VALUE CONSTRUCTOR BY QUERY>; }
  "<table value constructor by query>"                         { return <TABLE VALUE CONSTRUCTOR BY QUERY>; }
  "<multiset element list>"                                    { return <MULTISET ELEMENT LIST>; }
  "<multiset element>"                                         { return <MULTISET ELEMENT>; }
  "<explicit row value constructor>"                           { return <EXPLICIT ROW VALUE CONSTRUCTOR>; }
  "<row value constructor element>"                            { return <ROW VALUE CONSTRUCTOR ELEMENT>; }
  "<row value constructor element list>"                       { return <ROW VALUE CONSTRUCTOR ELEMENT LIST>; }
  "<row subquery>"                                             { return <ROW SUBQUERY>; }
  "<contextually typed value specification>"                   { return <CONTEXTUALLY TYPED VALUE SPECIFICATION>; }
  "<contextually typed row value constructor element>"         { return <CONTEXTUALLY TYPED ROW VALUE CONSTRUCTOR ELEMENT>; }
  "<contextually typed row value constructor element list>"    { return <CONTEXTUALLY TYPED ROW VALUE CONSTRUCTOR ELEMENT LIST>; }
  "<row value special case>"                                   { return <ROW VALUE SPECIAL CASE>; }
  "<row value constructor>"                                    { return <ROW VALUE CONSTRUCTOR>; }
  "<contextually typed row value constructor>"                 { return <CONTEXTUALLY TYPED ROW VALUE CONSTRUCTOR>; }
  "<row value constructor predicand>"                          { return <ROW VALUE CONSTRUCTOR PREDICAND>; }
  "<row value expression list>"                                { return <ROW VALUE EXPRESSION LIST>; }
  "<table row value expression>"                               { return <TABLE ROW VALUE EXPRESSION>; }
  "<contextually typed row value expression list>"             { return <CONTEXTUALLY TYPED ROW VALUE EXPRESSION LIST>; }
  "<contextually typed row value expression>"                  { return <CONTEXTUALLY TYPED ROW VALUE EXPRESSION>; }
  "<from clause>"                                              { return <FROM CLAUSE>; }
  "<where clause>"                                             { return <WHERE CLAUSE>; }
  "<group by clause>"                                          { return <GROUP BY CLAUSE>; }
  "<having clause>"                                            { return <HAVING CLAUSE>; }
  "<window clause>"                                            { return <WINDOW CLAUSE>; }
  "<table reference list>"                                     { return <TABLE REFERENCE LIST>; }
  "<table reference>"                                          { return <TABLE REFERENCE>; }
  "<table primary or joined table>"                            { return <TABLE PRIMARY OR JOINED TABLE>; }
  "<sample clause>"                                            { return <SAMPLE CLAUSE>; }
  "<table primary>"                                            { return <TABLE PRIMARY>; }
  "<joined table>"                                             { return <JOINED TABLE>; }
  "<sample method>"                                            { return <SAMPLE METHOD>; }
  "<sample percentage>"                                        { return <SAMPLE PERCENTAGE>; }
  "<repeatable clause>"                                        { return <REPEATABLE CLAUSE>; }
  "<repeat argument>"                                          { return <REPEAT ARGUMENT>; }
  "<table or query name>"                                      { return <TABLE OR QUERY NAME>; }
  "<correlation name>"                                         { return <CORRELATION NAME>; }
  "<derived column list>"                                      { return <DERIVED COLUMN LIST>; }
  "<derived table>"                                            { return <DERIVED TABLE>; }
  "<lateral derived table>"                                    { return <LATERAL DERIVED TABLE>; }
  "<collection derived table>"                                 { return <COLLECTION DERIVED TABLE>; }
  "<table function derived table>"                             { return <TABLE FUNCTION DERIVED TABLE>; }
  "<only spec>"                                                { return <ONLY SPEC>; }
  "<table subquery>"                                           { return <TABLE SUBQUERY>; }
  "<query name>"                                               { return <QUERY NAME>; }
  "<column name list>"                                         { return <COLUMN NAME LIST>; }
  "<cross join>"                                               { return <CROSS JOIN>; }
  "<qualified join>"                                           { return <QUALIFIED JOIN>; }
  "<natural join>"                                             { return <NATURAL JOIN>; }
  "<union join>"                                               { return <UNION JOIN>; }
  "<join type>"                                                { return <JOIN TYPE>; }
  "<join specification>"                                       { return <JOIN SPECIFICATION>; }
  "<join condition>"                                           { return <JOIN CONDITION>; }
  "<named columns join>"                                       { return <NAMED COLUMNS JOIN>; }
  "<join column list>"                                         { return <JOIN COLUMN LIST>; }
  "<outer join type>"                                          { return <OUTER JOIN TYPE>; }
  "<set quantifier>"                                           { return <SET QUANTIFIER>; }
  "<grouping element list>"                                    { return <GROUPING ELEMENT LIST>; }
  "<grouping element>"                                         { return <GROUPING ELEMENT>; }
  "<ordinary grouping set>"                                    { return <ORDINARY GROUPING SET>; }
  "<rollup list>"                                              { return <ROLLUP LIST>; }
  "<cube list>"                                                { return <CUBE LIST>; }
  "<grouping sets specification>"                              { return <GROUPING SETS SPECIFICATION>; }
  "<empty grouping set>"                                       { return <EMPTY GROUPING SET>; }
  "<grouping column reference>"                                { return <GROUPING COLUMN REFERENCE>; }
  "<grouping column reference list>"                           { return <GROUPING COLUMN REFERENCE LIST>; }
  "<ordinary grouping set list>"                               { return <ORDINARY GROUPING SET LIST>; }
  "<grouping set list>"                                        { return <GROUPING SET LIST>; }
  "<grouping set>"                                             { return <GROUPING SET>; }
  "<window definition list>"                                   { return <WINDOW DEFINITION LIST>; }
  "<window definition>"                                        { return <WINDOW DEFINITION>; }
  "<new window name>"                                          { return <NEW WINDOW NAME>; }
  "<window specification details>"                             { return <WINDOW SPECIFICATION DETAILS>; }
  "<existing window name>"                                     { return <EXISTING WINDOW NAME>; }
  "<window partition clause>"                                  { return <WINDOW PARTITION CLAUSE>; }
  "<window order clause>"                                      { return <WINDOW ORDER CLAUSE>; }
  "<window frame clause>"                                      { return <WINDOW FRAME CLAUSE>; }
  "<window partition column reference list>"                   { return <WINDOW PARTITION COLUMN REFERENCE LIST>; }
  "<window partition column reference>"                        { return <WINDOW PARTITION COLUMN REFERENCE>; }
  "<sort specification list>"                                  { return <SORT SPECIFICATION LIST>; }
  "<window frame units>"                                       { return <WINDOW FRAME UNITS>; }
  "<window frame extent>"                                      { return <WINDOW FRAME EXTENT>; }
  "<window frame exclusion>"                                   { return <WINDOW FRAME EXCLUSION>; }
  "<window frame start>"                                       { return <WINDOW FRAME START>; }
  "<window frame between>"                                     { return <WINDOW FRAME BETWEEN>; }
  "<window frame preceding>"                                   { return <WINDOW FRAME PRECEDING>; }
  "<window frame bound 1>"                                     { return <WINDOW FRAME BOUND 1>; }
  "<window frame bound 2>"                                     { return <WINDOW FRAME BOUND 2>; }
  "<window frame bound>"                                       { return <WINDOW FRAME BOUND>; }
  "<window frame following>"                                   { return <WINDOW FRAME FOLLOWING>; }
  "<select list>"                                              { return <SELECT LIST>; }
  "<table expression>"                                         { return <TABLE EXPRESSION>; }
  "<select sublist>"                                           { return <SELECT SUBLIST>; }
  "<derived column>"                                           { return <DERIVED COLUMN>; }
  "<qualified asterisk>"                                       { return <QUALIFIED ASTERISK>; }
  "<asterisked identifier chain>"                              { return <ASTERISKED IDENTIFIER CHAIN>; }
  "<all fields reference>"                                     { return <ALL FIELDS REFERENCE>; }
  "<asterisked identifier>"                                    { return <ASTERISKED IDENTIFIER>; }
  "<as clause>"                                                { return <AS CLAUSE>; }
  "<all fields column name list>"                              { return <ALL FIELDS COLUMN NAME LIST>; }
  "<with clause>"                                              { return <WITH CLAUSE>; }
  "<query expression body>"                                    { return <QUERY EXPRESSION BODY>; }
  "<with list>"                                                { return <WITH LIST>; }
  "<with list element>"                                        { return <WITH LIST ELEMENT>; }
  "<with column list>"                                         { return <WITH COLUMN LIST>; }
  "<search or cycle clause>"                                   { return <SEARCH OR CYCLE CLAUSE>; }
  "<non-join query expression>"                                { return <NON-JOIN QUERY EXPRESSION>; }
  "<non-join query term>"                                      { return <NON-JOIN QUERY TERM>; }
  "<corresponding spec>"                                       { return <CORRESPONDING SPEC>; }
  "<query term>"                                               { return <QUERY TERM>; }
  "<non-join query primary>"                                   { return <NON-JOIN QUERY PRIMARY>; }
  "<query primary>"                                            { return <QUERY PRIMARY>; }
  "<simple table>"                                             { return <SIMPLE TABLE>; }
  "<query specification>"                                      { return <QUERY SPECIFICATION>; }
  "<table value constructor>"                                  { return <TABLE VALUE CONSTRUCTOR>; }
  "<explicit table>"                                           { return <EXPLICIT TABLE>; }
  "<corresponding column list>"                                { return <CORRESPONDING COLUMN LIST>; }
  "<search clause>"                                            { return <SEARCH CLAUSE>; }
  "<cycle clause>"                                             { return <CYCLE CLAUSE>; }
  "<recursive search order>"                                   { return <RECURSIVE SEARCH ORDER>; }
  "<sequence column>"                                          { return <SEQUENCE COLUMN>; }
  "<cycle column list>"                                        { return <CYCLE COLUMN LIST>; }
  "<cycle mark column>"                                        { return <CYCLE MARK COLUMN>; }
  "<cycle mark value>"                                         { return <CYCLE MARK VALUE>; }
  "<non-cycle mark value>"                                     { return <NON-CYCLE MARK VALUE>; }
  "<path column>"                                              { return <PATH COLUMN>; }
  "<cycle column>"                                             { return <CYCLE COLUMN>; }
  "<subquery>"                                                 { return <SUBQUERY>; }
  "<comparison predicate>"                                     { return <COMPARISON PREDICATE>; }
  "<between predicate>"                                        { return <BETWEEN PREDICATE>; }
  "<in predicate>"                                             { return <IN PREDICATE>; }
  "<like predicate>"                                           { return <LIKE PREDICATE>; }
  "<similar predicate>"                                        { return <SIMILAR PREDICATE>; }
  "<null predicate>"                                           { return <NULL PREDICATE>; }
  "<quantified comparison predicate>"                          { return <QUANTIFIED COMPARISON PREDICATE>; }
  "<exists predicate>"                                         { return <EXISTS PREDICATE>; }
  "<unique predicate>"                                         { return <UNIQUE PREDICATE>; }
  "<normalized predicate>"                                     { return <NORMALIZED PREDICATE>; }
  "<match predicate>"                                          { return <MATCH PREDICATE>; }
  "<overlaps predicate>"                                       { return <OVERLAPS PREDICATE>; }
  "<distinct predicate>"                                       { return <DISTINCT PREDICATE>; }
  "<member predicate>"                                         { return <MEMBER PREDICATE>; }
  "<submultiset predicate>"                                    { return <SUBMULTISET PREDICATE>; }
  "<set predicate>"                                            { return <SET PREDICATE>; }
  "<type predicate>"                                           { return <TYPE PREDICATE>; }
  "<comp op>"                                                  { return <COMP OP>; }
  "<in predicate value>"                                       { return <IN PREDICATE VALUE>; }
  "<in value list>"                                            { return <IN VALUE LIST>; }
  "<character like predicate>"                                 { return <CHARACTER LIKE PREDICATE>; }
  "<octet like predicate>"                                     { return <OCTET LIKE PREDICATE>; }
  "<character pattern>"                                        { return <CHARACTER PATTERN>; }
  "<octet pattern>"                                            { return <OCTET PATTERN>; }
  "<escape octet>"                                             { return <ESCAPE OCTET>; }
  "<similar pattern>"                                          { return <SIMILAR PATTERN>; }
  "<regular term>"                                             { return <REGULAR TERM>; }
  "<regular expression>"                                       { return <REGULAR EXPRESSION>; }
  "<regular factor>"                                           { return <REGULAR FACTOR>; }
  "<regular primary>"                                          { return <REGULAR PRIMARY>; }
  "<repeat factor>"                                            { return <REPEAT FACTOR>; }
  "<low value>"                                                { return <LOW VALUE>; }
  "<upper limit>"                                              { return <UPPER LIMIT>; }
  "<high value>"                                               { return <HIGH VALUE>; }
  "<character specifier>"                                      { return <CHARACTER SPECIFIER>; }
  "<regular character set>"                                    { return <REGULAR CHARACTER SET>; }
  "<non-escaped character>"                                    { return <NON-ESCAPED CHARACTER>; }
  "<escaped character>"                                        { return <ESCAPED CHARACTER>; }
  "<character enumeration>"                                    { return <CHARACTER ENUMERATION>; }
  "<character enumeration include>"                            { return <CHARACTER ENUMERATION INCLUDE>; }
  "<regular character set identifier>"                         { return <REGULAR CHARACTER SET IDENTIFIER>; }
  "<quantifier>"                                               { return <QUANTIFIER>; }
  "<all>"                                                      { return <ALL>; }
  "<some>"                                                     { return <SOME>; }
  "<overlaps predicate part 1>"                                { return <OVERLAPS PREDICATE PART 1>; }
  "<row value predicand 1>"                                    { return <ROW VALUE PREDICAND 1>; }
  "<row value predicand 2>"                                    { return <ROW VALUE PREDICAND 2>; }
  "<row value predicand 3>"                                    { return <ROW VALUE PREDICAND 3>; }
  "<row value predicand 4>"                                    { return <ROW VALUE PREDICAND 4>; }
  "<type list>"                                                { return <TYPE LIST>; }
  "<user-defined type specification>"                          { return <USER-DEFINED TYPE SPECIFICATION>; }
  "<inclusive user-defined type specification>"                { return <INCLUSIVE USER-DEFINED TYPE SPECIFICATION>; }
  "<exclusive user-defined type specification>"                { return <EXCLUSIVE USER-DEFINED TYPE SPECIFICATION>; }
  "<start field>"                                              { return <START FIELD>; }
  "<end field>"                                                { return <END FIELD>; }
  "<single datetime field>"                                    { return <SINGLE DATETIME FIELD>; }
  "<non-second primary datetime field>"                        { return <NON-SECOND PRIMARY DATETIME FIELD>; }
  "<interval leading field precision>"                         { return <INTERVAL LEADING FIELD PRECISION>; }
  "<interval fractional seconds precision>"                    { return <INTERVAL FRACTIONAL SECONDS PRECISION>; }
  "<language name>"                                            { return <LANGUAGE NAME>; }
  "<schema name list>"                                         { return <SCHEMA NAME LIST>; }
  "<routine name>"                                             { return <ROUTINE NAME>; }
  "<SQL argument>"                                             { return <SQL ARGUMENT>; }
  "<generalized expression>"                                   { return <GENERALIZED EXPRESSION>; }
  "<target specification>"                                     { return <TARGET SPECIFICATION>; }
  "<standard character set name>"                              { return <STANDARD CHARACTER SET NAME>; }
  "<implementation-defined character set name>"                { return <IMPLEMENTATION-DEFINED CHARACTER SET NAME>; }
  "<user-defined character set name>"                          { return <USER-DEFINED CHARACTER SET NAME>; }
  "<character set name>"                                       { return <CHARACTER SET NAME>; }
  "<routine type>"                                             { return <ROUTINE TYPE>; }
  "<specific name>"                                            { return <SPECIFIC NAME>; }
  "<member name>"                                              { return <MEMBER NAME>; }
  "<schema-resolved user-defined type name>"                   { return <SCHEMA-RESOLVED USER-DEFINED TYPE NAME>; }
  "CONSTRUCTOR"                                                { return CONSTRUCTOR; }
  "<member name alternatives>"                                 { return <MEMBER NAME ALTERNATIVES>; }
  "<data type list>"                                           { return <DATA TYPE LIST>; }
  "<schema qualified routine name>"                            { return <SCHEMA QUALIFIED ROUTINE NAME>; }
  "<collation name>"                                           { return <COLLATION NAME>; }
  "<constraint name>"                                          { return <CONSTRAINT NAME>; }
  "<constraint check time>"                                    { return <CONSTRAINT CHECK TIME>; }
  "<filter clause>"                                            { return <FILTER CLAUSE>; }
  "<general set function>"                                     { return <GENERAL SET FUNCTION>; }
  "<binary set function>"                                      { return <BINARY SET FUNCTION>; }
  "<ordered set function>"                                     { return <ORDERED SET FUNCTION>; }
  "<set function type>"                                        { return <SET FUNCTION TYPE>; }
  "<computational operation>"                                  { return <COMPUTATIONAL OPERATION>; }
  "<binary set function type>"                                 { return <BINARY SET FUNCTION TYPE>; }
  "<dependent variable expression>"                            { return <DEPENDENT VARIABLE EXPRESSION>; }
  "<independent variable expression>"                          { return <INDEPENDENT VARIABLE EXPRESSION>; }
  "<hypothetical set function>"                                { return <HYPOTHETICAL SET FUNCTION>; }
  "<inverse distribution function>"                            { return <INVERSE DISTRIBUTION FUNCTION>; }
  "<hypothetical set function value expression list>"          { return <HYPOTHETICAL SET FUNCTION VALUE EXPRESSION LIST>; }
  "<within group specification>"                               { return <WITHIN GROUP SPECIFICATION>; }
  "<inverse distribution function type>"                       { return <INVERSE DISTRIBUTION FUNCTION TYPE>; }
  "<inverse distribution function argument>"                   { return <INVERSE DISTRIBUTION FUNCTION ARGUMENT>; }
  "<sort specification>"                                       { return <SORT SPECIFICATION>; }
  "<sort key>"                                                 { return <SORT KEY>; }
  "<ordering specification>"                                   { return <ORDERING SPECIFICATION>; }
  "<null ordering>"                                            { return <NULL ORDERING>; }
  "<schema name clause>"                                       { return <SCHEMA NAME CLAUSE>; }
  "<schema character set or path>"                             { return <SCHEMA CHARACTER SET OR PATH>; }
  "<schema element>..."                                        { return <SCHEMA ELEMENT>...; }
  "<schema character set specification>"                       { return <SCHEMA CHARACTER SET SPECIFICATION>; }
  "<schema path specification>"                                { return <SCHEMA PATH SPECIFICATION>; }
  "<schema authorization identifier>"                          { return <SCHEMA AUTHORIZATION IDENTIFIER>; }
  "<authorization identifier>"                                 { return <AUTHORIZATION IDENTIFIER>; }
  "<path specification>"                                       { return <PATH SPECIFICATION>; }
  "<table definition>"                                         { return <TABLE DEFINITION>; }
  "<view definition>"                                          { return <VIEW DEFINITION>; }
  "<domain definition>"                                        { return <DOMAIN DEFINITION>; }
  "<character set definition>"                                 { return <CHARACTER SET DEFINITION>; }
  "<collation definition>"                                     { return <COLLATION DEFINITION>; }
  "<transliteration definition>"                               { return <TRANSLITERATION DEFINITION>; }
  "<assertion definition>"                                     { return <ASSERTION DEFINITION>; }
  "<trigger definition>"                                       { return <TRIGGER DEFINITION>; }
  "<user-defined type definition>"                             { return <USER-DEFINED TYPE DEFINITION>; }
  "<user-defined cast definition>"                             { return <USER-DEFINED CAST DEFINITION>; }
  "<user-defined ordering definition>"                         { return <USER-DEFINED ORDERING DEFINITION>; }
  "<transform definition>"                                     { return <TRANSFORM DEFINITION>; }
  "<schema routine>"                                           { return <SCHEMA ROUTINE>; }
  "<sequence generator definition>"                            { return <SEQUENCE GENERATOR DEFINITION>; }
  "<grant statement>"                                          { return <GRANT STATEMENT>; }
  "<role definition>"                                          { return <ROLE DEFINITION>; }
  "<drop behavior>"                                            { return <DROP BEHAVIOR>; }
  "RESTRICT"                                                   { return RESTRICT; }
  "<table scope>"                                              { return <TABLE SCOPE>; }
  "<table contents source>"                                    { return <TABLE CONTENTS SOURCE>; }
  "<table commit action>"                                      { return <TABLE COMMIT ACTION>; }
  "<table element list>"                                       { return <TABLE ELEMENT LIST>; }
  "<subtable clause>"                                          { return <SUBTABLE CLAUSE>; }
  "<as subquery clause>"                                       { return <AS SUBQUERY CLAUSE>; }
  "<global or local>"                                          { return <GLOBAL OR LOCAL>; }
  "<table element>"                                            { return <TABLE ELEMENT>; }
  "<column definition>"                                        { return <COLUMN DEFINITION>; }
  "<table constraint definition>"                              { return <TABLE CONSTRAINT DEFINITION>; }
  "<like clause>"                                              { return <LIKE CLAUSE>; }
  "<self-referencing column specification>"                    { return <SELF-REFERENCING COLUMN SPECIFICATION>; }
  "<column options>"                                           { return <COLUMN OPTIONS>; }
  "<self-referencing column name>"                             { return <SELF-REFERENCING COLUMN NAME>; }
  "<reference generation>"                                     { return <REFERENCE GENERATION>; }
  "GENERATED"                                                  { return GENERATED; }
  "<column option list>"                                       { return <COLUMN OPTION LIST>; }
  "<default clause>"                                           { return <DEFAULT CLAUSE>; }
  "<column constraint definition>..."                          { return <COLUMN CONSTRAINT DEFINITION>...; }
  "<supertable clause>"                                        { return <SUPERTABLE CLAUSE>; }
  "<supertable name>"                                          { return <SUPERTABLE NAME>; }
  "<like options>"                                             { return <LIKE OPTIONS>; }
  "<identity option>"                                          { return <IDENTITY OPTION>; }
  "<column default option>"                                    { return <COLUMN DEFAULT OPTION>; }
  "<with or without data>"                                     { return <WITH OR WITHOUT DATA>; }
  "<identity column specification>"                            { return <IDENTITY COLUMN SPECIFICATION>; }
  "<generation clause>"                                        { return <GENERATION CLAUSE>; }
  "<constraint name definition>"                               { return <CONSTRAINT NAME DEFINITION>; }
  "<column constraint>"                                        { return <COLUMN CONSTRAINT>; }
  "<constraint characteristics>"                               { return <CONSTRAINT CHARACTERISTICS>; }
  "<unique specification>"                                     { return <UNIQUE SPECIFICATION>; }
  "<references specification>"                                 { return <REFERENCES SPECIFICATION>; }
  "<check constraint definition>"                              { return <CHECK CONSTRAINT DEFINITION>; }
  "<reference scope check action>"                             { return <REFERENCE SCOPE CHECK ACTION>; }
  "<referential action>"                                       { return <REFERENTIAL ACTION>; }
  "<common sequence generator options>"                        { return <COMMON SEQUENCE GENERATOR OPTIONS>; }
  "<generation rule>"                                          { return <GENERATION RULE>; }
  "<generation expression>"                                    { return <GENERATION EXPRESSION>; }
  "<default option>"                                           { return <DEFAULT OPTION>; }
  "<table constraint>"                                         { return <TABLE CONSTRAINT>; }
  "<unique constraint definition>"                             { return <UNIQUE CONSTRAINT DEFINITION>; }
  "<referential constraint definition>"                        { return <REFERENTIAL CONSTRAINT DEFINITION>; }
  "<unique column list>"                                       { return <UNIQUE COLUMN LIST>; }
  "<referencing columns>"                                      { return <REFERENCING COLUMNS>; }
  "<referenced table and columns>"                             { return <REFERENCED TABLE AND COLUMNS>; }
  "<match type>"                                               { return <MATCH TYPE>; }
  "<referential triggered action>"                             { return <REFERENTIAL TRIGGERED ACTION>; }
  "<reference column list>"                                    { return <REFERENCE COLUMN LIST>; }
  "<update rule>"                                              { return <UPDATE RULE>; }
  "<delete rule>"                                              { return <DELETE RULE>; }
  "<alter table action>"                                       { return <ALTER TABLE ACTION>; }
  "<add column definition>"                                    { return <ADD COLUMN DEFINITION>; }
  "<alter column definition>"                                  { return <ALTER COLUMN DEFINITION>; }
  "<drop column definition>"                                   { return <DROP COLUMN DEFINITION>; }
  "<add table constraint definition>"                          { return <ADD TABLE CONSTRAINT DEFINITION>; }
  "<drop table constraint definition>"                         { return <DROP TABLE CONSTRAINT DEFINITION>; }
  "<alter column action>"                                      { return <ALTER COLUMN ACTION>; }
  "<set column default clause>"                                { return <SET COLUMN DEFAULT CLAUSE>; }
  "<drop column default clause>"                               { return <DROP COLUMN DEFAULT CLAUSE>; }
  "<add column scope clause>"                                  { return <ADD COLUMN SCOPE CLAUSE>; }
  "<drop column scope clause>"                                 { return <DROP COLUMN SCOPE CLAUSE>; }
  "<alter identity column specification>"                      { return <ALTER IDENTITY COLUMN SPECIFICATION>; }
  "<alter identity column option>..."                          { return <ALTER IDENTITY COLUMN OPTION>...; }
  "<alter sequence generator restart option>"                  { return <ALTER SEQUENCE GENERATOR RESTART OPTION>; }
  "<basic sequence generator option>"                          { return <BASIC SEQUENCE GENERATOR OPTION>; }
  "<view specification>"                                       { return <VIEW SPECIFICATION>; }
  "<levels clause>"                                            { return <LEVELS CLAUSE>; }
  "<regular view specification>"                               { return <REGULAR VIEW SPECIFICATION>; }
  "<referenceable view specification>"                         { return <REFERENCEABLE VIEW SPECIFICATION>; }
  "<view column list>"                                         { return <VIEW COLUMN LIST>; }
  "<subview clause>"                                           { return <SUBVIEW CLAUSE>; }
  "<view element list>"                                        { return <VIEW ELEMENT LIST>; }
  "<view element>"                                             { return <VIEW ELEMENT>; }
  "<view column option>"                                       { return <VIEW COLUMN OPTION>; }
  "<domain constraint>..."                                     { return <DOMAIN CONSTRAINT>...; }
  "<alter domain action>"                                      { return <ALTER DOMAIN ACTION>; }
  "<set domain default clause>"                                { return <SET DOMAIN DEFAULT CLAUSE>; }
  "<drop domain default clause>"                               { return <DROP DOMAIN DEFAULT CLAUSE>; }
  "<add domain constraint definition>"                         { return <ADD DOMAIN CONSTRAINT DEFINITION>; }
  "<drop domain constraint definition>"                        { return <DROP DOMAIN CONSTRAINT DEFINITION>; }
  "<domain constraint>"                                        { return <DOMAIN CONSTRAINT>; }
  "<character set source>"                                     { return <CHARACTER SET SOURCE>; }
  "<existing collation name>"                                  { return <EXISTING COLLATION NAME>; }
  "<pad characteristic>"                                       { return <PAD CHARACTERISTIC>; }
  "<source character set specification>"                       { return <SOURCE CHARACTER SET SPECIFICATION>; }
  "<target character set specification>"                       { return <TARGET CHARACTER SET SPECIFICATION>; }
  "<transliteration source>"                                   { return <TRANSLITERATION SOURCE>; }
  "<existing transliteration name>"                            { return <EXISTING TRANSLITERATION NAME>; }
  "<transliteration routine>"                                  { return <TRANSLITERATION ROUTINE>; }
  "<specific routine designator>"                              { return <SPECIFIC ROUTINE DESIGNATOR>; }
  "<trigger name>"                                             { return <TRIGGER NAME>; }
  "<trigger action time>"                                      { return <TRIGGER ACTION TIME>; }
  "<trigger event>"                                            { return <TRIGGER EVENT>; }
  "<old or new values alias list>"                             { return <OLD OR NEW VALUES ALIAS LIST>; }
  "<triggered action>"                                         { return <TRIGGERED ACTION>; }
  "<trigger column list>"                                      { return <TRIGGER COLUMN LIST>; }
  "<triggered SQL statement>"                                  { return <TRIGGERED SQL STATEMENT>; }
  "<SQL procedure statement>"                                  { return <SQL PROCEDURE STATEMENT>; }
  "<old or new values alias>..."                               { return <OLD OR NEW VALUES ALIAS>...; }
  "<old values correlation name>"                              { return <OLD VALUES CORRELATION NAME>; }
  "<new values correlation name>"                              { return <NEW VALUES CORRELATION NAME>; }
  "<old values table alias>"                                   { return <OLD VALUES TABLE ALIAS>; }
  "<new values table alias>"                                   { return <NEW VALUES TABLE ALIAS>; }
  "<user-defined type body>"                                   { return <USER-DEFINED TYPE BODY>; }
  "<subtype clause>"                                           { return <SUBTYPE CLAUSE>; }
  "<representation>"                                           { return <REPRESENTATION>; }
  "<user-defined type option list>"                            { return <USER-DEFINED TYPE OPTION LIST>; }
  "<method specification list>"                                { return <METHOD SPECIFICATION LIST>; }
  "<user-defined type option>"                                 { return <USER-DEFINED TYPE OPTION>; }
  "<user-defined type option>..."                              { return <USER-DEFINED TYPE OPTION>...; }
  "<instantiable clause>"                                      { return <INSTANTIABLE CLAUSE>; }
  "<finality>"                                                 { return <FINALITY>; }
  "<reference type specification>"                             { return <REFERENCE TYPE SPECIFICATION>; }
  "<ref cast option>"                                          { return <REF CAST OPTION>; }
  "<cast option>"                                              { return <CAST OPTION>; }
  "<supertype name>"                                           { return <SUPERTYPE NAME>; }
  "<member list>"                                              { return <MEMBER LIST>; }
  "<member>"                                                   { return <MEMBER>; }
  "<attribute definition>"                                     { return <ATTRIBUTE DEFINITION>; }
  "<user-defined representation>"                              { return <USER-DEFINED REPRESENTATION>; }
  "<derived representation>"                                   { return <DERIVED REPRESENTATION>; }
  "<system-generated representation>"                          { return <SYSTEM-GENERATED REPRESENTATION>; }
  "<list of attributes>"                                       { return <LIST OF ATTRIBUTES>; }
  "<cast to ref>"                                              { return <CAST TO REF>; }
  "<cast to type>"                                             { return <CAST TO TYPE>; }
  "<cast to ref identifier>"                                   { return <CAST TO REF IDENTIFIER>; }
  "<cast to type identifier>"                                  { return <CAST TO TYPE IDENTIFIER>; }
  "<cast to distinct>"                                         { return <CAST TO DISTINCT>; }
  "<cast to source>"                                           { return <CAST TO SOURCE>; }
  "<cast to distinct identifier>"                              { return <CAST TO DISTINCT IDENTIFIER>; }
  "<cast to source identifier>"                                { return <CAST TO SOURCE IDENTIFIER>; }
  "<method specification>"                                     { return <METHOD SPECIFICATION>; }
  "<original method specification>"                            { return <ORIGINAL METHOD SPECIFICATION>; }
  "<overriding method specification>"                          { return <OVERRIDING METHOD SPECIFICATION>; }
  "<partial method specification>"                             { return <PARTIAL METHOD SPECIFICATION>; }
  "<method characteristics>"                                   { return <METHOD CHARACTERISTICS>; }
  "<SQL parameter declaration list>"                           { return <SQL PARAMETER DECLARATION LIST>; }
  "<returns clause>"                                           { return <RETURNS CLAUSE>; }
  "<specific method name>"                                     { return <SPECIFIC METHOD NAME>; }
  "<method characteristic>..."                                 { return <METHOD CHARACTERISTIC>...; }
  "<language clause>"                                          { return <LANGUAGE CLAUSE>; }
  "<parameter style clause>"                                   { return <PARAMETER STYLE CLAUSE>; }
  "<deterministic characteristic>"                             { return <DETERMINISTIC CHARACTERISTIC>; }
  "<SQL-data access indication>"                               { return <SQL-DATA ACCESS INDICATION>; }
  "<null-call clause>"                                         { return <NULL-CALL CLAUSE>; }
  "<attribute default>"                                        { return <ATTRIBUTE DEFAULT>; }
  "<alter type action>"                                        { return <ALTER TYPE ACTION>; }
  "<add attribute definition>"                                 { return <ADD ATTRIBUTE DEFINITION>; }
  "<drop attribute definition>"                                { return <DROP ATTRIBUTE DEFINITION>; }
  "<add original method specification>"                        { return <ADD ORIGINAL METHOD SPECIFICATION>; }
  "<add overriding method specification>"                      { return <ADD OVERRIDING METHOD SPECIFICATION>; }
  "<drop method specification>"                                { return <DROP METHOD SPECIFICATION>; }
  "<specific method specification designator>"                 { return <SPECIFIC METHOD SPECIFICATION DESIGNATOR>; }
  "<schema procedure>"                                         { return <SCHEMA PROCEDURE>; }
  "<schema function>"                                          { return <SCHEMA FUNCTION>; }
  "<SQL-invoked procedure>"                                    { return <SQL-INVOKED PROCEDURE>; }
  "<SQL-invoked function>"                                     { return <SQL-INVOKED FUNCTION>; }
  "<routine characteristics>"                                  { return <ROUTINE CHARACTERISTICS>; }
  "<routine body>"                                             { return <ROUTINE BODY>; }
  "<function specification>"                                   { return <FUNCTION SPECIFICATION>; }
  "<method specification designator>"                          { return <METHOD SPECIFICATION DESIGNATOR>; }
  "<SQL parameter declaration>"                                { return <SQL PARAMETER DECLARATION>; }
  "<parameter mode>"                                           { return <PARAMETER MODE>; }
  "<SQL parameter name>"                                       { return <SQL PARAMETER NAME>; }
  "<parameter type>"                                           { return <PARAMETER TYPE>; }
  "<locator indication>"                                       { return <LOCATOR INDICATION>; }
  "<dispatch clause>"                                          { return <DISPATCH CLAUSE>; }
  "<routine characteristic>..."                                { return <ROUTINE CHARACTERISTIC>...; }
  "<dynamic result sets characteristic>"                       { return <DYNAMIC RESULT SETS CHARACTERISTIC>; }
  "<savepoint level indication>"                               { return <SAVEPOINT LEVEL INDICATION>; }
  "<maximum dynamic result sets>"                              { return <MAXIMUM DYNAMIC RESULT SETS>; }
  "<parameter style>"                                          { return <PARAMETER STYLE>; }
  "<returns type>"                                             { return <RETURNS TYPE>; }
  "<returns data type>"                                        { return <RETURNS DATA TYPE>; }
  "<result cast>"                                              { return <RESULT CAST>; }
  "<returns table type>"                                       { return <RETURNS TABLE TYPE>; }
  "<table function column list>"                               { return <TABLE FUNCTION COLUMN LIST>; }
  "<table function column list element>"                       { return <TABLE FUNCTION COLUMN LIST ELEMENT>; }
  "<result cast from type>"                                    { return <RESULT CAST FROM TYPE>; }
  "<SQL routine spec>"                                         { return <SQL ROUTINE SPEC>; }
  "<external body reference>"                                  { return <EXTERNAL BODY REFERENCE>; }
  "<rights clause>"                                            { return <RIGHTS CLAUSE>; }
  "<SQL routine body>"                                         { return <SQL ROUTINE BODY>; }
  "<external routine name>"                                    { return <EXTERNAL ROUTINE NAME>; }
  "<transform group specification>"                            { return <TRANSFORM GROUP SPECIFICATION>; }
  "<external security clause>"                                 { return <EXTERNAL SECURITY CLAUSE>; }
  "<single group specification>"                               { return <SINGLE GROUP SPECIFICATION>; }
  "<multiple group specification>"                             { return <MULTIPLE GROUP SPECIFICATION>; }
  "<group name>"                                               { return <GROUP NAME>; }
  "<group specification>"                                      { return <GROUP SPECIFICATION>; }
  "<alter routine characteristics>"                            { return <ALTER ROUTINE CHARACTERISTICS>; }
  "<alter routine behavior>"                                   { return <ALTER ROUTINE BEHAVIOR>; }
  "<alter routine characteristic>..."                          { return <ALTER ROUTINE CHARACTERISTIC>...; }
  "<source data type>"                                         { return <SOURCE DATA TYPE>; }
  "<target data type>"                                         { return <TARGET DATA TYPE>; }
  "<cast function>"                                            { return <CAST FUNCTION>; }
  "<ordering form>"                                            { return <ORDERING FORM>; }
  "<equals ordering form>"                                     { return <EQUALS ORDERING FORM>; }
  "<full ordering form>"                                       { return <FULL ORDERING FORM>; }
  "<ordering category>"                                        { return <ORDERING CATEGORY>; }
  "<relative category>"                                        { return <RELATIVE CATEGORY>; }
  "<map category>"                                             { return <MAP CATEGORY>; }
  "<state category>"                                           { return <STATE CATEGORY>; }
  "<relative function specification>"                          { return <RELATIVE FUNCTION SPECIFICATION>; }
  "<map function specification>"                               { return <MAP FUNCTION SPECIFICATION>; }
  "<transform group>"                                          { return <TRANSFORM GROUP>; }
  "<transform element list>"                                   { return <TRANSFORM ELEMENT LIST>; }
  "<transform element>"                                        { return <TRANSFORM ELEMENT>; }
  "<to sql>"                                                   { return <TO SQL>; }
  "<from sql>"                                                 { return <FROM SQL>; }
  "<to sql function>"                                          { return <TO SQL FUNCTION>; }
  "<from sql function>"                                        { return <FROM SQL FUNCTION>; }
  "<alter group>"                                              { return <ALTER GROUP>; }
  "<alter transform action list>"                              { return <ALTER TRANSFORM ACTION LIST>; }
  "<alter transform action>"                                   { return <ALTER TRANSFORM ACTION>; }
  "<add transform element list>"                               { return <ADD TRANSFORM ELEMENT LIST>; }
  "<drop transform element list>"                              { return <DROP TRANSFORM ELEMENT LIST>; }
  "<transform kind>"                                           { return <TRANSFORM KIND>; }
  "<transforms to be dropped>"                                 { return <TRANSFORMS TO BE DROPPED>; }
  "<transform group element>"                                  { return <TRANSFORM GROUP ELEMENT>; }
  "<sequence generator options>"                               { return <SEQUENCE GENERATOR OPTIONS>; }
  "<sequence generator option> ..."                            { return <SEQUENCE GENERATOR OPTION> ...; }
  "<sequence generator data type option>"                      { return <SEQUENCE GENERATOR DATA TYPE OPTION>; }
  "<common sequence generator option> ..."                     { return <COMMON SEQUENCE GENERATOR OPTION> ...; }
  "<sequence generator start with option>"                     { return <SEQUENCE GENERATOR START WITH OPTION>; }
  "<sequence generator increment by option>"                   { return <SEQUENCE GENERATOR INCREMENT BY OPTION>; }
  "<sequence generator maxvalue option>"                       { return <SEQUENCE GENERATOR MAXVALUE OPTION>; }
  "<sequence generator minvalue option>"                       { return <SEQUENCE GENERATOR MINVALUE OPTION>; }
  "<sequence generator cycle option>"                          { return <SEQUENCE GENERATOR CYCLE OPTION>; }
  "<sequence generator start value>"                           { return <SEQUENCE GENERATOR START VALUE>; }
  "<sequence generator increment>"                             { return <SEQUENCE GENERATOR INCREMENT>; }
  "<sequence generator max value>"                             { return <SEQUENCE GENERATOR MAX VALUE>; }
  "<sequence generator min value>"                             { return <SEQUENCE GENERATOR MIN VALUE>; }
  "<alter sequence generator options>"                         { return <ALTER SEQUENCE GENERATOR OPTIONS>; }
  "<alter sequence generator option>..."                       { return <ALTER SEQUENCE GENERATOR OPTION>...; }
  "<sequence generator restart value>"                         { return <SEQUENCE GENERATOR RESTART VALUE>; }
  "<grant privilege statement>"                                { return <GRANT PRIVILEGE STATEMENT>; }
  "<grant role statement>"                                     { return <GRANT ROLE STATEMENT>; }
  "<privileges>"                                               { return <PRIVILEGES>; }
  "<grantee>"                                                  { return <GRANTEE>; }
  "<grantor>"                                                  { return <GRANTOR>; }
  "<object privileges>"                                        { return <OBJECT PRIVILEGES>; }
  "<object name>"                                              { return <OBJECT NAME>; }
  "<action>"                                                   { return <ACTION>; }
  "<privilege column list>"                                    { return <PRIVILEGE COLUMN LIST>; }
  "<privilege method list>"                                    { return <PRIVILEGE METHOD LIST>; }
  "<role granted>"                                             { return <ROLE GRANTED>; }
  "<revoke privilege statement>"                               { return <REVOKE PRIVILEGE STATEMENT>; }
  "<revoke role statement>"                                    { return <REVOKE ROLE STATEMENT>; }
  "<revoke option extension>"                                  { return <REVOKE OPTION EXTENSION>; }
  "<role revoked>"                                             { return <ROLE REVOKED>; }
  "<module name clause>"                                       { return <MODULE NAME CLAUSE>; }
  "<module authorization clause>"                              { return <MODULE AUTHORIZATION CLAUSE>; }
  "<module path specification>"                                { return <MODULE PATH SPECIFICATION>; }
  "<module transform group specification>"                     { return <MODULE TRANSFORM GROUP SPECIFICATION>; }
  "<module collation>"                                         { return <MODULE COLLATION>; }
  "<temporary table declaration>..."                           { return <TEMPORARY TABLE DECLARATION>...; }
  "<module contents>"                                          { return <MODULE CONTENTS>; }
  "<module authorization identifier>"                          { return <MODULE AUTHORIZATION IDENTIFIER>; }
  "<module collation specification>..."                        { return <MODULE COLLATION SPECIFICATION>...; }
  "<character set specification list>"                         { return <CHARACTER SET SPECIFICATION LIST>; }
  "<declare cursor>"                                           { return <DECLARE CURSOR>; }
  "<dynamic declare cursor>"                                   { return <DYNAMIC DECLARE CURSOR>; }
  "<externally-invoked procedure>"                             { return <EXTERNALLY-INVOKED PROCEDURE>; }
  "<SQL-client module name>"                                   { return <SQL-CLIENT MODULE NAME>; }
  "<module character set specification>"                       { return <MODULE CHARACTER SET SPECIFICATION>; }
  "<procedure name>"                                           { return <PROCEDURE NAME>; }
  "<host parameter declaration list>"                          { return <HOST PARAMETER DECLARATION LIST>; }
  "<host parameter declaration>"                               { return <HOST PARAMETER DECLARATION>; }
  "<host parameter data type>"                                 { return <HOST PARAMETER DATA TYPE>; }
  "<status parameter>"                                         { return <STATUS PARAMETER>; }
  "<SQL executable statement>"                                 { return <SQL EXECUTABLE STATEMENT>; }
  "<SQL schema statement>"                                     { return <SQL SCHEMA STATEMENT>; }
  "<SQL data statement>"                                       { return <SQL DATA STATEMENT>; }
  "<SQL control statement>"                                    { return <SQL CONTROL STATEMENT>; }
  "<SQL transaction statement>"                                { return <SQL TRANSACTION STATEMENT>; }
  "<SQL connection statement>"                                 { return <SQL CONNECTION STATEMENT>; }
  "<SQL session statement>"                                    { return <SQL SESSION STATEMENT>; }
  "<SQL diagnostics statement>"                                { return <SQL DIAGNOSTICS STATEMENT>; }
  "<SQL dynamic statement>"                                    { return <SQL DYNAMIC STATEMENT>; }
  "<SQL schema definition statement>"                          { return <SQL SCHEMA DEFINITION STATEMENT>; }
  "<SQL schema manipulation statement>"                        { return <SQL SCHEMA MANIPULATION STATEMENT>; }
  "<schema definition>"                                        { return <SCHEMA DEFINITION>; }
  "<SQL-invoked routine>"                                      { return <SQL-INVOKED ROUTINE>; }
  "<drop schema statement>"                                    { return <DROP SCHEMA STATEMENT>; }
  "<alter table statement>"                                    { return <ALTER TABLE STATEMENT>; }
  "<drop table statement>"                                     { return <DROP TABLE STATEMENT>; }
  "<drop view statement>"                                      { return <DROP VIEW STATEMENT>; }
  "<alter routine statement>"                                  { return <ALTER ROUTINE STATEMENT>; }
  "<drop routine statement>"                                   { return <DROP ROUTINE STATEMENT>; }
  "<drop user-defined cast statement>"                         { return <DROP USER-DEFINED CAST STATEMENT>; }
  "<revoke statement>"                                         { return <REVOKE STATEMENT>; }
  "<drop role statement>"                                      { return <DROP ROLE STATEMENT>; }
  "<alter domain statement>"                                   { return <ALTER DOMAIN STATEMENT>; }
  "<drop domain statement>"                                    { return <DROP DOMAIN STATEMENT>; }
  "<drop character set statement>"                             { return <DROP CHARACTER SET STATEMENT>; }
  "<drop collation statement>"                                 { return <DROP COLLATION STATEMENT>; }
  "<drop transliteration statement>"                           { return <DROP TRANSLITERATION STATEMENT>; }
  "<drop assertion statement>"                                 { return <DROP ASSERTION STATEMENT>; }
  "<drop trigger statement>"                                   { return <DROP TRIGGER STATEMENT>; }
  "<alter type statement>"                                     { return <ALTER TYPE STATEMENT>; }
  "<drop data type statement>"                                 { return <DROP DATA TYPE STATEMENT>; }
  "<drop user-defined ordering statement>"                     { return <DROP USER-DEFINED ORDERING STATEMENT>; }
  "<alter transform statement>"                                { return <ALTER TRANSFORM STATEMENT>; }
  "<drop transform statement>"                                 { return <DROP TRANSFORM STATEMENT>; }
  "<alter sequence generator statement>"                       { return <ALTER SEQUENCE GENERATOR STATEMENT>; }
  "<drop sequence generator statement>"                        { return <DROP SEQUENCE GENERATOR STATEMENT>; }
  "<open statement>"                                           { return <OPEN STATEMENT>; }
  "<fetch statement>"                                          { return <FETCH STATEMENT>; }
  "<close statement>"                                          { return <CLOSE STATEMENT>; }
  "<select statement single row>"                              { return <SELECT STATEMENT SINGLE ROW>; }
  "<free locator statement>"                                   { return <FREE LOCATOR STATEMENT>; }
  "<hold locator statement>"                                   { return <HOLD LOCATOR STATEMENT>; }
  "<SQL data change statement>"                                { return <SQL DATA CHANGE STATEMENT>; }
  "<delete statement positioned>"                              { return <DELETE STATEMENT POSITIONED>; }
  "<delete statement searched>"                                { return <DELETE STATEMENT SEARCHED>; }
  "<insert statement>"                                         { return <INSERT STATEMENT>; }
  "<update statement positioned>"                              { return <UPDATE STATEMENT POSITIONED>; }
  "<update statement searched>"                                { return <UPDATE STATEMENT SEARCHED>; }
  "<merge statement>"                                          { return <MERGE STATEMENT>; }
  "<call statement>"                                           { return <CALL STATEMENT>; }
  "<return statement>"                                         { return <RETURN STATEMENT>; }
  "<start transaction statement>"                              { return <START TRANSACTION STATEMENT>; }
  "<set transaction statement>"                                { return <SET TRANSACTION STATEMENT>; }
  "<set constraints mode statement>"                           { return <SET CONSTRAINTS MODE STATEMENT>; }
  "<savepoint statement>"                                      { return <SAVEPOINT STATEMENT>; }
  "<release savepoint statement>"                              { return <RELEASE SAVEPOINT STATEMENT>; }
  "<commit statement>"                                         { return <COMMIT STATEMENT>; }
  "<rollback statement>"                                       { return <ROLLBACK STATEMENT>; }
  "<connect statement>"                                        { return <CONNECT STATEMENT>; }
  "<set connection statement>"                                 { return <SET CONNECTION STATEMENT>; }
  "<disconnect statement>"                                     { return <DISCONNECT STATEMENT>; }
  "<set session user identifier statement>"                    { return <SET SESSION USER IDENTIFIER STATEMENT>; }
  "<set role statement>"                                       { return <SET ROLE STATEMENT>; }
  "<set local time zone statement>"                            { return <SET LOCAL TIME ZONE STATEMENT>; }
  "<set session characteristics statement>"                    { return <SET SESSION CHARACTERISTICS STATEMENT>; }
  "<set catalog statement>"                                    { return <SET CATALOG STATEMENT>; }
  "<set schema statement>"                                     { return <SET SCHEMA STATEMENT>; }
  "<set names statement>"                                      { return <SET NAMES STATEMENT>; }
  "<set path statement>"                                       { return <SET PATH STATEMENT>; }
  "<set transform group statement>"                            { return <SET TRANSFORM GROUP STATEMENT>; }
  "<set session collation statement>"                          { return <SET SESSION COLLATION STATEMENT>; }
  "<get diagnostics statement>"                                { return <GET DIAGNOSTICS STATEMENT>; }
  "<system descriptor statement>"                              { return <SYSTEM DESCRIPTOR STATEMENT>; }
  "<prepare statement>"                                        { return <PREPARE STATEMENT>; }
  "<deallocate prepared statement>"                            { return <DEALLOCATE PREPARED STATEMENT>; }
  "<describe statement>"                                       { return <DESCRIBE STATEMENT>; }
  "<execute statement>"                                        { return <EXECUTE STATEMENT>; }
  "<execute immediate statement>"                              { return <EXECUTE IMMEDIATE STATEMENT>; }
  "<SQL dynamic data statement>"                               { return <SQL DYNAMIC DATA STATEMENT>; }
  "<allocate cursor statement>"                                { return <ALLOCATE CURSOR STATEMENT>; }
  "<dynamic open statement>"                                   { return <DYNAMIC OPEN STATEMENT>; }
  "<dynamic fetch statement>"                                  { return <DYNAMIC FETCH STATEMENT>; }
  "<dynamic close statement>"                                  { return <DYNAMIC CLOSE STATEMENT>; }
  "<dynamic delete statement positioned>"                      { return <DYNAMIC DELETE STATEMENT POSITIONED>; }
  "<dynamic update statement positioned>"                      { return <DYNAMIC UPDATE STATEMENT POSITIONED>; }
  "<allocate descriptor statement>"                            { return <ALLOCATE DESCRIPTOR STATEMENT>; }
  "<deallocate descriptor statement>"                          { return <DEALLOCATE DESCRIPTOR STATEMENT>; }
  "<set descriptor statement>"                                 { return <SET DESCRIPTOR STATEMENT>; }
  "<get descriptor statement>"                                 { return <GET DESCRIPTOR STATEMENT>; }
  "<cursor sensitivity>"                                       { return <CURSOR SENSITIVITY>; }
  "<cursor scrollability>"                                     { return <CURSOR SCROLLABILITY>; }
  "<cursor holdability>"                                       { return <CURSOR HOLDABILITY>; }
  "<cursor returnability>"                                     { return <CURSOR RETURNABILITY>; }
  "<cursor specification>"                                     { return <CURSOR SPECIFICATION>; }
  "<updatability clause>"                                      { return <UPDATABILITY CLAUSE>; }
  "<fetch orientation>"                                        { return <FETCH ORIENTATION>; }
  "<fetch target list>"                                        { return <FETCH TARGET LIST>; }
  "<select target list>"                                       { return <SELECT TARGET LIST>; }
  "<target table>"                                             { return <TARGET TABLE>; }
  "<insertion target>"                                         { return <INSERTION TARGET>; }
  "<insert columns and source>"                                { return <INSERT COLUMNS AND SOURCE>; }
  "<from subquery>"                                            { return <FROM SUBQUERY>; }
  "<from constructor>"                                         { return <FROM CONSTRUCTOR>; }
  "<from default>"                                             { return <FROM DEFAULT>; }
  "<insert column list>"                                       { return <INSERT COLUMN LIST>; }
  "<override clause>"                                          { return <OVERRIDE CLAUSE>; }
  "<contextually typed table value constructor>"               { return <CONTEXTUALLY TYPED TABLE VALUE CONSTRUCTOR>; }
  "<merge correlation name>"                                   { return <MERGE CORRELATION NAME>; }
  "<merge operation specification>"                            { return <MERGE OPERATION SPECIFICATION>; }
  "<merge when clause>..."                                     { return <MERGE WHEN CLAUSE>...; }
  "<merge when matched clause>"                                { return <MERGE WHEN MATCHED CLAUSE>; }
  "<merge when not matched clause>"                            { return <MERGE WHEN NOT MATCHED CLAUSE>; }
  "<merge update specification>"                               { return <MERGE UPDATE SPECIFICATION>; }
  "<merge insert specification>"                               { return <MERGE INSERT SPECIFICATION>; }
  "<set clause list>"                                          { return <SET CLAUSE LIST>; }
  "<merge insert value list>"                                  { return <MERGE INSERT VALUE LIST>; }
  "<merge insert value element>"                               { return <MERGE INSERT VALUE ELEMENT>; }
  "<set clause>"                                               { return <SET CLAUSE>; }
  "<multiple column assignment>"                               { return <MULTIPLE COLUMN ASSIGNMENT>; }
  "<set target>"                                               { return <SET TARGET>; }
  "<update source>"                                            { return <UPDATE SOURCE>; }
  "<update target>"                                            { return <UPDATE TARGET>; }
  "<mutated set clause>"                                       { return <MUTATED SET CLAUSE>; }
  "<set target list>"                                          { return <SET TARGET LIST>; }
  "<assigned row>"                                             { return <ASSIGNED ROW>; }
  "<object column>"                                            { return <OBJECT COLUMN>; }
  "<mutated target>"                                           { return <MUTATED TARGET>; }
  "<locator reference>"                                        { return <LOCATOR REFERENCE>; }
  "<return value>"                                             { return <RETURN VALUE>; }
  "<transaction mode>"                                         { return <TRANSACTION MODE>; }
  "<isolation level>"                                          { return <ISOLATION LEVEL>; }
  "<transaction access mode>"                                  { return <TRANSACTION ACCESS MODE>; }
  "<diagnostics size>"                                         { return <DIAGNOSTICS SIZE>; }
  "<level of isolation>"                                       { return <LEVEL OF ISOLATION>; }
  "<number of conditions>"                                     { return <NUMBER OF CONDITIONS>; }
  "<transaction characteristics>"                              { return <TRANSACTION CHARACTERISTICS>; }
  "<constraint name list>"                                     { return <CONSTRAINT NAME LIST>; }
  "<savepoint specifier>"                                      { return <SAVEPOINT SPECIFIER>; }
  "<savepoint name>"                                           { return <SAVEPOINT NAME>; }
  "<savepoint clause>"                                         { return <SAVEPOINT CLAUSE>; }
  "<connection target>"                                        { return <CONNECTION TARGET>; }
  "<SQL-server name>"                                          { return <SQL-SERVER NAME>; }
  "<connection name>"                                          { return <CONNECTION NAME>; }
  "<connection user name>"                                     { return <CONNECTION USER NAME>; }
  "CONNECTION"                                                 { return CONNECTION; }
  "<connection object>"                                        { return <CONNECTION OBJECT>; }
  "<disconnect object>"                                        { return <DISCONNECT OBJECT>; }
  "<session characteristic list>"                              { return <SESSION CHARACTERISTIC LIST>; }
  "<session characteristic>"                                   { return <SESSION CHARACTERISTIC>; }
  "<value specification>"                                      { return <VALUE SPECIFICATION>; }
  "<role specification>"                                       { return <ROLE SPECIFICATION>; }
  "<set time zone value>"                                      { return <SET TIME ZONE VALUE>; }
  "<catalog name characteristic>"                              { return <CATALOG NAME CHARACTERISTIC>; }
  "<schema name characteristic>"                               { return <SCHEMA NAME CHARACTERISTIC>; }
  "<character set name characteristic>"                        { return <CHARACTER SET NAME CHARACTERISTIC>; }
  "<SQL-path characteristic>"                                  { return <SQL-PATH CHARACTERISTIC>; }
  "<transform group characteristic>"                           { return <TRANSFORM GROUP CHARACTERISTIC>; }
  "<collation specification>"                                  { return <COLLATION SPECIFICATION>; }
  "<descriptor name>"                                          { return <DESCRIPTOR NAME>; }
  "<occurrences>"                                              { return <OCCURRENCES>; }
  "<get header information>"                                   { return <GET HEADER INFORMATION>; }
  "<item number>"                                              { return <ITEM NUMBER>; }
  "<get item information>"                                     { return <GET ITEM INFORMATION>; }
  "<simple target specification 1>"                            { return <SIMPLE TARGET SPECIFICATION 1>; }
  "<header item name>"                                         { return <HEADER ITEM NAME>; }
  "<simple target specification 2>"                            { return <SIMPLE TARGET SPECIFICATION 2>; }
  "<descriptor item name>"                                     { return <DESCRIPTOR ITEM NAME>; }
  "<simple target specification>"                              { return <SIMPLE TARGET SPECIFICATION>; }
  "<set header information>"                                   { return <SET HEADER INFORMATION>; }
  "<set item information>"                                     { return <SET ITEM INFORMATION>; }
  "<simple value specification 1>"                             { return <SIMPLE VALUE SPECIFICATION 1>; }
  "<simple value specification 2>"                             { return <SIMPLE VALUE SPECIFICATION 2>; }
  "<SQL statement name>"                                       { return <SQL STATEMENT NAME>; }
  "<attributes specification>"                                 { return <ATTRIBUTES SPECIFICATION>; }
  "<SQL statement variable>"                                   { return <SQL STATEMENT VARIABLE>; }
  "<attributes variable>"                                      { return <ATTRIBUTES VARIABLE>; }
  "<preparable SQL data statement>"                            { return <PREPARABLE SQL DATA STATEMENT>; }
  "<preparable SQL schema statement>"                          { return <PREPARABLE SQL SCHEMA STATEMENT>; }
  "<preparable SQL transaction statement>"                     { return <PREPARABLE SQL TRANSACTION STATEMENT>; }
  "<preparable SQL control statement>"                         { return <PREPARABLE SQL CONTROL STATEMENT>; }
  "<preparable SQL session statement>"                         { return <PREPARABLE SQL SESSION STATEMENT>; }
  "<preparable implementation-defined statement>"              { return <PREPARABLE IMPLEMENTATION-DEFINED STATEMENT>; }
  "<dynamic single row select statement>"                      { return <DYNAMIC SINGLE ROW SELECT STATEMENT>; }
  "<dynamic select statement>"                                 { return <DYNAMIC SELECT STATEMENT>; }
  "<preparable dynamic delete statement positioned>"           { return <PREPARABLE DYNAMIC DELETE STATEMENT POSITIONED>; }
  "<preparable dynamic update statement positioned>"           { return <PREPARABLE DYNAMIC UPDATE STATEMENT POSITIONED>; }
  "<cursor attribute>..."                                      { return <CURSOR ATTRIBUTE>...; }
  "<describe input statement>"                                 { return <DESCRIBE INPUT STATEMENT>; }
  "<describe output statement>"                                { return <DESCRIBE OUTPUT STATEMENT>; }
  "<using descriptor>"                                         { return <USING DESCRIPTOR>; }
  "<nesting option>"                                           { return <NESTING OPTION>; }
  "<described object>"                                         { return <DESCRIBED OBJECT>; }
  "<using arguments>"                                          { return <USING ARGUMENTS>; }
  "<using input descriptor>"                                   { return <USING INPUT DESCRIPTOR>; }
  "<using argument>"                                           { return <USING ARGUMENT>; }
  "<into arguments>"                                           { return <INTO ARGUMENTS>; }
  "<into descriptor>"                                          { return <INTO DESCRIPTOR>; }
  "<into argument>"                                            { return <INTO ARGUMENT>; }
  "<result using clause>"                                      { return <RESULT USING CLAUSE>; }
  "<parameter using clause>"                                   { return <PARAMETER USING CLAUSE>; }
  "<output using clause>"                                      { return <OUTPUT USING CLAUSE>; }
  "<input using clause>"                                       { return <INPUT USING CLAUSE>; }
  "<cursor intent>"                                            { return <CURSOR INTENT>; }
  "<statement cursor>"                                         { return <STATEMENT CURSOR>; }
  "<result set cursor>"                                        { return <RESULT SET CURSOR>; }
  "<dynamic cursor name>"                                      { return <DYNAMIC CURSOR NAME>; }
  "<embedded SQL Ada program>"                                 { return <EMBEDDED SQL ADA PROGRAM>; }
  "<embedded SQL C program>"                                   { return <EMBEDDED SQL C PROGRAM>; }
  "<embedded SQL COBOL program>"                               { return <EMBEDDED SQL COBOL PROGRAM>; }
  "<embedded SQL Fortran program>"                             { return <EMBEDDED SQL FORTRAN PROGRAM>; }
  "<embedded SQL MUMPS program>"                               { return <EMBEDDED SQL MUMPS PROGRAM>; }
  "<embedded SQL Pascal program>"                              { return <EMBEDDED SQL PASCAL PROGRAM>; }
  "<embedded SQL PL/I program>"                                { return <EMBEDDED SQL PL/I PROGRAM>; }
  "<SQL prefix>"                                               { return <SQL PREFIX>; }
  "<statement or declaration>"                                 { return <STATEMENT OR DECLARATION>; }
  "<SQL terminator>"                                           { return <SQL TERMINATOR>; }
  "<temporary table declaration>"                              { return <TEMPORARY TABLE DECLARATION>; }
  "<embedded authorization declaration>"                       { return <EMBEDDED AUTHORIZATION DECLARATION>; }
  "<embedded path specification>"                              { return <EMBEDDED PATH SPECIFICATION>; }
  "<embedded transform group specification>"                   { return <EMBEDDED TRANSFORM GROUP SPECIFICATION>; }
  "<embedded collation specification>"                         { return <EMBEDDED COLLATION SPECIFICATION>; }
  "<embedded exception declaration>"                           { return <EMBEDDED EXCEPTION DECLARATION>; }
  "<handler declaration>"                                      { return <HANDLER DECLARATION>; }
  "<embedded authorization clause>"                            { return <EMBEDDED AUTHORIZATION CLAUSE>; }
  "<embedded authorization identifier>"                        { return <EMBEDDED AUTHORIZATION IDENTIFIER>; }
  "<module collations>"                                        { return <MODULE COLLATIONS>; }
  "<embedded SQL begin declare>"                               { return <EMBEDDED SQL BEGIN DECLARE>; }
  "<embedded character set declaration>"                       { return <EMBEDDED CHARACTER SET DECLARATION>; }
  "<host variable definition>..."                              { return <HOST VARIABLE DEFINITION>...; }
  "<embedded SQL end declare>"                                 { return <EMBEDDED SQL END DECLARE>; }
  "<embedded SQL MUMPS declare>"                               { return <EMBEDDED SQL MUMPS DECLARE>; }
  "<Ada variable definition>"                                  { return <ADA VARIABLE DEFINITION>; }
  "<C variable definition>"                                    { return <C VARIABLE DEFINITION>; }
  "<COBOL variable definition>"                                { return <COBOL VARIABLE DEFINITION>; }
  "<Fortran variable definition>"                              { return <FORTRAN VARIABLE DEFINITION>; }
  "<MUMPS variable definition>"                                { return <MUMPS VARIABLE DEFINITION>; }
  "<Pascal variable definition>"                               { return <PASCAL VARIABLE DEFINITION>; }
  "<PL/I variable definition>"                                 { return <PL/I VARIABLE DEFINITION>; }
  "<host identifier>"                                          { return <HOST IDENTIFIER>; }
  "<Ada host identifier>"                                      { return <ADA HOST IDENTIFIER>; }
  "<C host identifier>"                                        { return <C HOST IDENTIFIER>; }
  "<COBOL host identifier>"                                    { return <COBOL HOST IDENTIFIER>; }
  "<Fortran host identifier>"                                  { return <FORTRAN HOST IDENTIFIER>; }
  "<MUMPS host identifier>"                                    { return <MUMPS HOST IDENTIFIER>; }
  "<Pascal host identifier>"                                   { return <PASCAL HOST IDENTIFIER>; }
  "<PL/I host identifier>"                                     { return <PL/I HOST IDENTIFIER>; }
  "<condition>"                                                { return <CONDITION>; }
  "<condition action>"                                         { return <CONDITION ACTION>; }
  "<SQL condition>"                                            { return <SQL CONDITION>; }
  "<major category>"                                           { return <MAJOR CATEGORY>; }
  "<SQLSTATE class value>"                                     { return <SQLSTATE CLASS VALUE>; }
  "<SQLSTATE char>"                                            { return <SQLSTATE CHAR>; }
  "<go to>"                                                    { return <GO TO>; }
  "<goto target>"                                              { return <GOTO TARGET>; }
  "<host label identifier>"                                    { return <HOST LABEL IDENTIFIER>; }
  "<host PL/I label variable>"                                 { return <HOST PL/I LABEL VARIABLE>; }
  "<Ada type specification>"                                   { return <ADA TYPE SPECIFICATION>; }
  "<Ada initial value>"                                        { return <ADA INITIAL VALUE>; }
  "<Ada assignment operator>"                                  { return <ADA ASSIGNMENT OPERATOR>; }
  "<Ada qualified type specification>"                         { return <ADA QUALIFIED TYPE SPECIFICATION>; }
  "<Ada unqualified type specification>"                       { return <ADA UNQUALIFIED TYPE SPECIFICATION>; }
  "<Ada derived type specification>"                           { return <ADA DERIVED TYPE SPECIFICATION>; }
  "Interfaces.SQL <period> CHAR"                               { return INTERFACES.SQL <PERIOD> CHAR; }
  "DOUBLE_PRECISION"                                           { return DOUBLE_PRECISION; }
  "SQLSTATE_TYPE"                                              { return SQLSTATE_TYPE; }
  "INDICATOR_TYPE"                                             { return INDICATOR_TYPE; }
  "<Ada CLOB variable>"                                        { return <ADA CLOB VARIABLE>; }
  "<Ada CLOB locator variable>"                                { return <ADA CLOB LOCATOR VARIABLE>; }
  "<Ada BLOB variable>"                                        { return <ADA BLOB VARIABLE>; }
  "<Ada BLOB locator variable>"                                { return <ADA BLOB LOCATOR VARIABLE>; }
  "<Ada user-defined type variable>"                           { return <ADA USER-DEFINED TYPE VARIABLE>; }
  "<Ada user-defined type locator variable>"                   { return <ADA USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<Ada REF variable>"                                         { return <ADA REF VARIABLE>; }
  "<Ada array locator variable>"                               { return <ADA ARRAY LOCATOR VARIABLE>; }
  "<Ada multiset locator variable>"                            { return <ADA MULTISET LOCATOR VARIABLE>; }
  "<C storage class>"                                          { return <C STORAGE CLASS>; }
  "<C class modifier>"                                         { return <C CLASS MODIFIER>; }
  "<C variable specification>"                                 { return <C VARIABLE SPECIFICATION>; }
  "<C numeric variable>"                                       { return <C NUMERIC VARIABLE>; }
  "<C character variable>"                                     { return <C CHARACTER VARIABLE>; }
  "<C derived variable>"                                       { return <C DERIVED VARIABLE>; }
  "auto"                                                       { return AUTO; }
  "extern"                                                     { return EXTERN; }
  "const"                                                      { return CONST; }
  "volatile"                                                   { return VOLATILE; }
  "long"                                                       { return LONG; }
  "short"                                                      { return SHORT; }
  "<C initial value>"                                          { return <C INITIAL VALUE>; }
  "<C character type>"                                         { return <C CHARACTER TYPE>; }
  "<C array specification>"                                    { return <C ARRAY SPECIFICATION>; }
  "unsigned"                                                   { return UNSIGNED; }
  "<C VARCHAR variable>"                                       { return <C VARCHAR VARIABLE>; }
  "<C NCHAR variable>"                                         { return <C NCHAR VARIABLE>; }
  "<C NCHAR VARYING variable>"                                 { return <C NCHAR VARYING VARIABLE>; }
  "<C CLOB variable>"                                          { return <C CLOB VARIABLE>; }
  "<C NCLOB variable>"                                         { return <C NCLOB VARIABLE>; }
  "<C BLOB variable>"                                          { return <C BLOB VARIABLE>; }
  "<C user-defined type variable>"                             { return <C USER-DEFINED TYPE VARIABLE>; }
  "<C CLOB locator variable>"                                  { return <C CLOB LOCATOR VARIABLE>; }
  "<C BLOB locator variable>"                                  { return <C BLOB LOCATOR VARIABLE>; }
  "<C array locator variable>"                                 { return <C ARRAY LOCATOR VARIABLE>; }
  "<C multiset locator variable>"                              { return <C MULTISET LOCATOR VARIABLE>; }
  "<C user-defined type locator variable>"                     { return <C USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<C REF variable>"                                           { return <C REF VARIABLE>; }
  "<COBOL type specification>"                                 { return <COBOL TYPE SPECIFICATION>; }
  "<COBOL character type>"                                     { return <COBOL CHARACTER TYPE>; }
  "<COBOL national character type>"                            { return <COBOL NATIONAL CHARACTER TYPE>; }
  "<COBOL numeric type>"                                       { return <COBOL NUMERIC TYPE>; }
  "<COBOL integer type>"                                       { return <COBOL INTEGER TYPE>; }
  "<COBOL derived type specification>"                         { return <COBOL DERIVED TYPE SPECIFICATION>; }
  "<COBOL CLOB variable>"                                      { return <COBOL CLOB VARIABLE>; }
  "<COBOL NCLOB variable>"                                     { return <COBOL NCLOB VARIABLE>; }
  "<COBOL BLOB variable>"                                      { return <COBOL BLOB VARIABLE>; }
  "<COBOL user-defined type variable>"                         { return <COBOL USER-DEFINED TYPE VARIABLE>; }
  "<COBOL CLOB locator variable>"                              { return <COBOL CLOB LOCATOR VARIABLE>; }
  "<COBOL BLOB locator variable>"                              { return <COBOL BLOB LOCATOR VARIABLE>; }
  "<COBOL array locator variable>"                             { return <COBOL ARRAY LOCATOR VARIABLE>; }
  "<COBOL multiset locator variable>"                          { return <COBOL MULTISET LOCATOR VARIABLE>; }
  "<COBOL user-defined type locator variable>"                 { return <COBOL USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<COBOL REF variable>"                                       { return <COBOL REF VARIABLE>; }
  "PIC"                                                        { return PIC; }
  "PICTURE"                                                    { return PICTURE; }
  "<COBOL nines specification>"                                { return <COBOL NINES SPECIFICATION>; }
  "DISPLAY"                                                    { return DISPLAY; }
  "SIGN"                                                       { return SIGN; }
  "SEPARATE"                                                   { return SEPARATE; }
  "<COBOL nines>"                                              { return <COBOL NINES>; }
  "<COBOL binary integer>"                                     { return <COBOL BINARY INTEGER>; }
  "<Fortran type specification>"                               { return <FORTRAN TYPE SPECIFICATION>; }
  "KIND"                                                       { return KIND; }
  "<Fortran CLOB variable>"                                    { return <FORTRAN CLOB VARIABLE>; }
  "<Fortran BLOB variable>"                                    { return <FORTRAN BLOB VARIABLE>; }
  "<Fortran user-defined type variable>"                       { return <FORTRAN USER-DEFINED TYPE VARIABLE>; }
  "<Fortran CLOB locator variable>"                            { return <FORTRAN CLOB LOCATOR VARIABLE>; }
  "<Fortran BLOB locator variable>"                            { return <FORTRAN BLOB LOCATOR VARIABLE>; }
  "<Fortran user-defined type locator variable>"               { return <FORTRAN USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<Fortran array locator variable>"                           { return <FORTRAN ARRAY LOCATOR VARIABLE>; }
  "<Fortran multiset locator variable>"                        { return <FORTRAN MULTISET LOCATOR VARIABLE>; }
  "<Fortran REF variable>"                                     { return <FORTRAN REF VARIABLE>; }
  "<MUMPS numeric variable>"                                   { return <MUMPS NUMERIC VARIABLE>; }
  "<MUMPS character variable>"                                 { return <MUMPS CHARACTER VARIABLE>; }
  "<MUMPS derived type specification>"                         { return <MUMPS DERIVED TYPE SPECIFICATION>; }
  "<MUMPS length specification>"                               { return <MUMPS LENGTH SPECIFICATION>; }
  "<MUMPS type specification>"                                 { return <MUMPS TYPE SPECIFICATION>; }
  "<MUMPS CLOB variable>"                                      { return <MUMPS CLOB VARIABLE>; }
  "<MUMPS BLOB variable>"                                      { return <MUMPS BLOB VARIABLE>; }
  "<MUMPS user-defined type variable>"                         { return <MUMPS USER-DEFINED TYPE VARIABLE>; }
  "<MUMPS CLOB locator variable>"                              { return <MUMPS CLOB LOCATOR VARIABLE>; }
  "<MUMPS BLOB locator variable>"                              { return <MUMPS BLOB LOCATOR VARIABLE>; }
  "<MUMPS user-defined type locator variable>"                 { return <MUMPS USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<MUMPS array locator variable>"                             { return <MUMPS ARRAY LOCATOR VARIABLE>; }
  "<MUMPS multiset locator variable>"                          { return <MUMPS MULTISET LOCATOR VARIABLE>; }
  "<MUMPS REF variable>"                                       { return <MUMPS REF VARIABLE>; }
  "<Pascal type specification>"                                { return <PASCAL TYPE SPECIFICATION>; }
  "PACKED"                                                     { return PACKED; }
  "<Pascal derived type specification>"                        { return <PASCAL DERIVED TYPE SPECIFICATION>; }
  "<Pascal CLOB variable>"                                     { return <PASCAL CLOB VARIABLE>; }
  "<Pascal BLOB variable>"                                     { return <PASCAL BLOB VARIABLE>; }
  "<Pascal user-defined type variable>"                        { return <PASCAL USER-DEFINED TYPE VARIABLE>; }
  "<Pascal CLOB locator variable>"                             { return <PASCAL CLOB LOCATOR VARIABLE>; }
  "<Pascal BLOB locator variable>"                             { return <PASCAL BLOB LOCATOR VARIABLE>; }
  "<Pascal user-defined type locator variable>"                { return <PASCAL USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<Pascal array locator variable>"                            { return <PASCAL ARRAY LOCATOR VARIABLE>; }
  "<Pascal multiset locator variable>"                         { return <PASCAL MULTISET LOCATOR VARIABLE>; }
  "<Pascal REF variable>"                                      { return <PASCAL REF VARIABLE>; }
  "DCL"                                                        { return DCL; }
  "<PL/I type specification>"                                  { return <PL/I TYPE SPECIFICATION>; }
  "<PL/I type fixed decimal>"                                  { return <PL/I TYPE FIXED DECIMAL>; }
  "<PL/I type fixed binary>"                                   { return <PL/I TYPE FIXED BINARY>; }
  "<PL/I type float binary>"                                   { return <PL/I TYPE FLOAT BINARY>; }
  "<PL/I derived type specification>"                          { return <PL/I DERIVED TYPE SPECIFICATION>; }
  "<PL/I CLOB variable>"                                       { return <PL/I CLOB VARIABLE>; }
  "<PL/I BLOB variable>"                                       { return <PL/I BLOB VARIABLE>; }
  "<PL/I user-defined type variable>"                          { return <PL/I USER-DEFINED TYPE VARIABLE>; }
  "<PL/I CLOB locator variable>"                               { return <PL/I CLOB LOCATOR VARIABLE>; }
  "<PL/I BLOB locator variable>"                               { return <PL/I BLOB LOCATOR VARIABLE>; }
  "<PL/I user-defined type locator variable>"                  { return <PL/I USER-DEFINED TYPE LOCATOR VARIABLE>; }
  "<PL/I array locator variable>"                              { return <PL/I ARRAY LOCATOR VARIABLE>; }
  "<PL/I multiset locator variable>"                           { return <PL/I MULTISET LOCATOR VARIABLE>; }
  "<PL/I REF variable>"                                        { return <PL/I REF VARIABLE>; }
  "FIXED"                                                      { return FIXED; }
  "BIN"                                                        { return BIN; }
  "<directly executable statement>"                            { return <DIRECTLY EXECUTABLE STATEMENT>; }
  "<direct SQL data statement>"                                { return <DIRECT SQL DATA STATEMENT>; }
  "<direct implementation-defined statement>"                  { return <DIRECT IMPLEMENTATION-DEFINED STATEMENT>; }
  "<direct select statement multiple rows>"                    { return <DIRECT SELECT STATEMENT MULTIPLE ROWS>; }
  "<SQL diagnostics information>"                              { return <SQL DIAGNOSTICS INFORMATION>; }
  "<statement information>"                                    { return <STATEMENT INFORMATION>; }
  "<condition information>"                                    { return <CONDITION INFORMATION>; }
  "<statement information item>"                               { return <STATEMENT INFORMATION ITEM>; }
  "<statement information item name>"                          { return <STATEMENT INFORMATION ITEM NAME>; }
  "<condition number>"                                         { return <CONDITION NUMBER>; }
  "<condition information item>"                               { return <CONDITION INFORMATION ITEM>; }
  "<condition information item name>"                          { return <CONDITION INFORMATION ITEM NAME>; }


}

[^] { return BAD_CHARACTER; }
