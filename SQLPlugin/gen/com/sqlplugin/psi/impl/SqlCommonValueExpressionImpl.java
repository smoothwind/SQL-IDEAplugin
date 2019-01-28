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

public class SqlCommonValueExpressionImpl extends ASTWrapperPsiElement implements SqlCommonValueExpression {

  public SqlCommonValueExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCommonValueExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCollectionValueExpression getCollectionValueExpression() {
    return findChildByClass(SqlCollectionValueExpression.class);
  }

  @Override
  @Nullable
  public SqlDatetimeValueExpression getDatetimeValueExpression() {
    return findChildByClass(SqlDatetimeValueExpression.class);
  }

  @Override
  @Nullable
  public SqlIntervalValueExpression getIntervalValueExpression() {
    return findChildByClass(SqlIntervalValueExpression.class);
  }

  @Override
  @Nullable
  public SqlNumericValueExpression getNumericValueExpression() {
    return findChildByClass(SqlNumericValueExpression.class);
  }

  @Override
  @Nullable
  public SqlReferenceValueExpression getReferenceValueExpression() {
    return findChildByClass(SqlReferenceValueExpression.class);
  }

  @Override
  @Nullable
  public SqlStringValueExpression getStringValueExpression() {
    return findChildByClass(SqlStringValueExpression.class);
  }

  @Override
  @Nullable
  public SqlUserDefinedTypeValueExpression getUserDefinedTypeValueExpression() {
    return findChildByClass(SqlUserDefinedTypeValueExpression.class);
  }

}
