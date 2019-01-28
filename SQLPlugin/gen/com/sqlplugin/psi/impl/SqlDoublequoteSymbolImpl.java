// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sqlplugin.psi.SqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.sqlplugin.psi.*;

public class SqlDoublequoteSymbolImpl extends ASTWrapperPsiElement implements SqlDoublequoteSymbol {

  public SqlDoublequoteSymbolImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDoublequoteSymbol(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLSpecialCharacter getSQLSpecialCharacter() {
    return findChildByClass(SqlSQLSpecialCharacter.class);
  }

  @Override
  @Nullable
  public SqlCharacterStringLiteral getCharacterStringLiteral() {
    return findChildByClass(SqlCharacterStringLiteral.class);
  }

  @Override
  @Nullable
  public SqlConcatenationOperator getConcatenationOperator() {
    return findChildByClass(SqlConcatenationOperator.class);
  }

  @Override
  @Nullable
  public SqlDateString getDateString() {
    return findChildByClass(SqlDateString.class);
  }

  @Override
  @Nullable
  public SqlDelimitedIdentifier getDelimitedIdentifier() {
    return findChildByClass(SqlDelimitedIdentifier.class);
  }

  @Override
  @Nullable
  public SqlDoubleColon getDoubleColon() {
    return findChildByClass(SqlDoubleColon.class);
  }

  @Override
  @Nullable
  public SqlDoublePeriod getDoublePeriod() {
    return findChildByClass(SqlDoublePeriod.class);
  }

  @Override
  @NotNull
  public List<SqlDoubleQuote> getDoubleQuoteList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlDoubleQuote.class);
  }

  @Override
  @Nullable
  public SqlGreaterThanOrEqualsOperator getGreaterThanOrEqualsOperator() {
    return findChildByClass(SqlGreaterThanOrEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlIntervalString getIntervalString() {
    return findChildByClass(SqlIntervalString.class);
  }

  @Override
  @Nullable
  public SqlLeftBracketTrigraph getLeftBracketTrigraph() {
    return findChildByClass(SqlLeftBracketTrigraph.class);
  }

  @Override
  @Nullable
  public SqlLessThanOrEqualsOperator getLessThanOrEqualsOperator() {
    return findChildByClass(SqlLessThanOrEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlNotEqualsOperator getNotEqualsOperator() {
    return findChildByClass(SqlNotEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlRightArrow getRightArrow() {
    return findChildByClass(SqlRightArrow.class);
  }

  @Override
  @Nullable
  public SqlTimeString getTimeString() {
    return findChildByClass(SqlTimeString.class);
  }

  @Override
  @Nullable
  public SqlTimestampString getTimestampString() {
    return findChildByClass(SqlTimestampString.class);
  }

}
