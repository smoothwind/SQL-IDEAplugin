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

public class SqlNumericValueExpressionImpl extends ASTWrapperPsiElement implements SqlNumericValueExpression {

  public SqlNumericValueExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitNumericValueExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlMinusSign getMinusSign() {
    return findChildByClass(SqlMinusSign.class);
  }

  @Override
  @Nullable
  public SqlNumericValueExpression getNumericValueExpression() {
    return findChildByClass(SqlNumericValueExpression.class);
  }

  @Override
  @Nullable
  public SqlPlusSign getPlusSign() {
    return findChildByClass(SqlPlusSign.class);
  }

  @Override
  @NotNull
  public SqlTerm getTerm() {
    return findNotNullChildByClass(SqlTerm.class);
  }

}
