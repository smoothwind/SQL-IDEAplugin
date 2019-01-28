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

public class SqlTableElementImpl extends ASTWrapperPsiElement implements SqlTableElement {

  public SqlTableElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTableElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlColumnDefinition getColumnDefinition() {
    return findChildByClass(SqlColumnDefinition.class);
  }

  @Override
  @Nullable
  public SqlColumnOptions getColumnOptions() {
    return findChildByClass(SqlColumnOptions.class);
  }

  @Override
  @Nullable
  public SqlLikeClause getLikeClause() {
    return findChildByClass(SqlLikeClause.class);
  }

  @Override
  @Nullable
  public SqlSelfReferencingColumnSpecification getSelfReferencingColumnSpecification() {
    return findChildByClass(SqlSelfReferencingColumnSpecification.class);
  }

  @Override
  @Nullable
  public SqlTableConstraintDefinition getTableConstraintDefinition() {
    return findChildByClass(SqlTableConstraintDefinition.class);
  }

}
