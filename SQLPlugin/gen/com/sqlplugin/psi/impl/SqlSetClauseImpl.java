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

public class SqlSetClauseImpl extends ASTWrapperPsiElement implements SqlSetClause {

  public SqlSetClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSetClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlEqualsOperator getEqualsOperator() {
    return findChildByClass(SqlEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlMultipleColumnAssignment getMultipleColumnAssignment() {
    return findChildByClass(SqlMultipleColumnAssignment.class);
  }

  @Override
  @Nullable
  public SqlSetTarget getSetTarget() {
    return findChildByClass(SqlSetTarget.class);
  }

  @Override
  @Nullable
  public SqlUpdateSource getUpdateSource() {
    return findChildByClass(SqlUpdateSource.class);
  }

}
