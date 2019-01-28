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

public class SqlIntervalValueExpressionImpl extends ASTWrapperPsiElement implements SqlIntervalValueExpression {

  public SqlIntervalValueExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitIntervalValueExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlDatetimeTerm getDatetimeTerm() {
    return findChildByClass(SqlDatetimeTerm.class);
  }

  @Override
  @Nullable
  public SqlDatetimeValueExpression getDatetimeValueExpression() {
    return findChildByClass(SqlDatetimeValueExpression.class);
  }

  @Override
  @Nullable
  public SqlIntervalQualifier getIntervalQualifier() {
    return findChildByClass(SqlIntervalQualifier.class);
  }

  @Override
  @Nullable
  public SqlIntervalTerm getIntervalTerm() {
    return findChildByClass(SqlIntervalTerm.class);
  }

  @Override
  @Nullable
  public SqlIntervalTerm1 getIntervalTerm1() {
    return findChildByClass(SqlIntervalTerm1.class);
  }

  @Override
  @Nullable
  public SqlIntervalValueExpression1 getIntervalValueExpression1() {
    return findChildByClass(SqlIntervalValueExpression1.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlMinusSign getMinusSign() {
    return findChildByClass(SqlMinusSign.class);
  }

  @Override
  @Nullable
  public SqlPlusSign getPlusSign() {
    return findChildByClass(SqlPlusSign.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

}
