// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDoublequoteSymbol extends PsiElement {

  @Nullable
  SqlSQLSpecialCharacter getSQLSpecialCharacter();

  @Nullable
  SqlCharacterStringLiteral getCharacterStringLiteral();

  @Nullable
  SqlConcatenationOperator getConcatenationOperator();

  @Nullable
  SqlDateString getDateString();

  @Nullable
  SqlDelimitedIdentifier getDelimitedIdentifier();

  @Nullable
  SqlDoubleColon getDoubleColon();

  @Nullable
  SqlDoublePeriod getDoublePeriod();

  @NotNull
  List<SqlDoubleQuote> getDoubleQuoteList();

  @Nullable
  SqlGreaterThanOrEqualsOperator getGreaterThanOrEqualsOperator();

  @Nullable
  SqlIntervalString getIntervalString();

  @Nullable
  SqlLeftBracketTrigraph getLeftBracketTrigraph();

  @Nullable
  SqlLessThanOrEqualsOperator getLessThanOrEqualsOperator();

  @Nullable
  SqlNotEqualsOperator getNotEqualsOperator();

  @Nullable
  SqlRightArrow getRightArrow();

  @Nullable
  SqlTimeString getTimeString();

  @Nullable
  SqlTimestampString getTimestampString();

}
