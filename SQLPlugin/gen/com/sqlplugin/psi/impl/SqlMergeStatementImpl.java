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

public class SqlMergeStatementImpl extends ASTWrapperPsiElement implements SqlMergeStatement {

  public SqlMergeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitMergeStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlMergeCorrelationName getMergeCorrelationName() {
    return findChildByClass(SqlMergeCorrelationName.class);
  }

  @Override
  @NotNull
  public SqlMergeOperationSpecification getMergeOperationSpecification() {
    return findNotNullChildByClass(SqlMergeOperationSpecification.class);
  }

  @Override
  @NotNull
  public SqlSearchCondition getSearchCondition() {
    return findNotNullChildByClass(SqlSearchCondition.class);
  }

  @Override
  @NotNull
  public SqlTableReference getTableReference() {
    return findNotNullChildByClass(SqlTableReference.class);
  }

  @Override
  @NotNull
  public SqlTargetTable getTargetTable() {
    return findNotNullChildByClass(SqlTargetTable.class);
  }

}
