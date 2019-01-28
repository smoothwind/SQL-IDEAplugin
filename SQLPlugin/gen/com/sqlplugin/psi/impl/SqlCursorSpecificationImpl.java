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

public class SqlCursorSpecificationImpl extends ASTWrapperPsiElement implements SqlCursorSpecification {

  public SqlCursorSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCursorSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlOrderByClause getOrderByClause() {
    return findChildByClass(SqlOrderByClause.class);
  }

  @Override
  @NotNull
  public SqlQueryExpression getQueryExpression() {
    return findNotNullChildByClass(SqlQueryExpression.class);
  }

  @Override
  @Nullable
  public SqlUpdatabilityClause getUpdatabilityClause() {
    return findChildByClass(SqlUpdatabilityClause.class);
  }

}
