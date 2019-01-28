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

public class SqlBooleanValueExpressionImpl extends ASTWrapperPsiElement implements SqlBooleanValueExpression {

  public SqlBooleanValueExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitBooleanValueExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlBooleanTerm getBooleanTerm() {
    return findNotNullChildByClass(SqlBooleanTerm.class);
  }

  @Override
  @Nullable
  public SqlBooleanValueExpression getBooleanValueExpression() {
    return findChildByClass(SqlBooleanValueExpression.class);
  }

}
