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

public class SqlSQLArgumentImpl extends ASTWrapperPsiElement implements SqlSQLArgument {

  public SqlSQLArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLArgument(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlGeneralizedExpression getGeneralizedExpression() {
    return findChildByClass(SqlGeneralizedExpression.class);
  }

  @Override
  @Nullable
  public SqlTargetSpecification getTargetSpecification() {
    return findChildByClass(SqlTargetSpecification.class);
  }

  @Override
  @Nullable
  public SqlValueExpression getValueExpression() {
    return findChildByClass(SqlValueExpression.class);
  }

}
