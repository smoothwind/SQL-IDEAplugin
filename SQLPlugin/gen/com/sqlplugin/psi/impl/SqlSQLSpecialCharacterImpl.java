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

public class SqlSQLSpecialCharacterImpl extends ASTWrapperPsiElement implements SqlSQLSpecialCharacter {

  public SqlSQLSpecialCharacterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLSpecialCharacter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAmpersand getAmpersand() {
    return findChildByClass(SqlAmpersand.class);
  }

  @Override
  @Nullable
  public SqlAsterisk getAsterisk() {
    return findChildByClass(SqlAsterisk.class);
  }

  @Override
  @Nullable
  public SqlCircumflex getCircumflex() {
    return findChildByClass(SqlCircumflex.class);
  }

  @Override
  @Nullable
  public SqlColon getColon() {
    return findChildByClass(SqlColon.class);
  }

  @Override
  @Nullable
  public SqlComma getComma() {
    return findChildByClass(SqlComma.class);
  }

  @Override
  @Nullable
  public SqlDoubleQuote getDoubleQuote() {
    return findChildByClass(SqlDoubleQuote.class);
  }

  @Override
  @Nullable
  public SqlEqualsOperator getEqualsOperator() {
    return findChildByClass(SqlEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlGreaterThanOperator getGreaterThanOperator() {
    return findChildByClass(SqlGreaterThanOperator.class);
  }

  @Override
  @Nullable
  public SqlLeftBrace getLeftBrace() {
    return findChildByClass(SqlLeftBrace.class);
  }

  @Override
  @Nullable
  public SqlLeftBracket getLeftBracket() {
    return findChildByClass(SqlLeftBracket.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlLessThanOperator getLessThanOperator() {
    return findChildByClass(SqlLessThanOperator.class);
  }

  @Override
  @Nullable
  public SqlMinusSign getMinusSign() {
    return findChildByClass(SqlMinusSign.class);
  }

  @Override
  @Nullable
  public SqlPercent getPercent() {
    return findChildByClass(SqlPercent.class);
  }

  @Override
  @Nullable
  public SqlPeriod getPeriod() {
    return findChildByClass(SqlPeriod.class);
  }

  @Override
  @Nullable
  public SqlPlusSign getPlusSign() {
    return findChildByClass(SqlPlusSign.class);
  }

  @Override
  @Nullable
  public SqlQuestionMark getQuestionMark() {
    return findChildByClass(SqlQuestionMark.class);
  }

  @Override
  @Nullable
  public SqlQuote getQuote() {
    return findChildByClass(SqlQuote.class);
  }

  @Override
  @Nullable
  public SqlRightBrace getRightBrace() {
    return findChildByClass(SqlRightBrace.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

  @Override
  @Nullable
  public SqlSemicolon getSemicolon() {
    return findChildByClass(SqlSemicolon.class);
  }

  @Override
  @Nullable
  public SqlSolidus getSolidus() {
    return findChildByClass(SqlSolidus.class);
  }

  @Override
  @Nullable
  public SqlSpace getSpace() {
    return findChildByClass(SqlSpace.class);
  }

  @Override
  @Nullable
  public SqlUnderscore getUnderscore() {
    return findChildByClass(SqlUnderscore.class);
  }

  @Override
  @Nullable
  public SqlVerticalBar getVerticalBar() {
    return findChildByClass(SqlVerticalBar.class);
  }

}
