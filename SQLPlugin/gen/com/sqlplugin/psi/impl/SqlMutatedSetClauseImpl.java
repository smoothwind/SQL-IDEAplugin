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

public class SqlMutatedSetClauseImpl extends ASTWrapperPsiElement implements SqlMutatedSetClause {

  public SqlMutatedSetClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitMutatedSetClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlMethodName getMethodName() {
    return findNotNullChildByClass(SqlMethodName.class);
  }

  @Override
  @NotNull
  public SqlMutatedTarget getMutatedTarget() {
    return findNotNullChildByClass(SqlMutatedTarget.class);
  }

  @Override
  @NotNull
  public SqlPeriod getPeriod() {
    return findNotNullChildByClass(SqlPeriod.class);
  }

}
