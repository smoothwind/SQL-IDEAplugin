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

public class SqlTablePrimaryImpl extends ASTWrapperPsiElement implements SqlTablePrimary {

  public SqlTablePrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTablePrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCollectionDerivedTable getCollectionDerivedTable() {
    return findChildByClass(SqlCollectionDerivedTable.class);
  }

  @Override
  @Nullable
  public SqlCorrelationName getCorrelationName() {
    return findChildByClass(SqlCorrelationName.class);
  }

  @Override
  @Nullable
  public SqlDerivedColumnList getDerivedColumnList() {
    return findChildByClass(SqlDerivedColumnList.class);
  }

  @Override
  @Nullable
  public SqlDerivedTable getDerivedTable() {
    return findChildByClass(SqlDerivedTable.class);
  }

  @Override
  @Nullable
  public SqlJoinedTable getJoinedTable() {
    return findChildByClass(SqlJoinedTable.class);
  }

  @Override
  @Nullable
  public SqlLateralDerivedTable getLateralDerivedTable() {
    return findChildByClass(SqlLateralDerivedTable.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlOnlySpec getOnlySpec() {
    return findChildByClass(SqlOnlySpec.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

  @Override
  @Nullable
  public SqlTableFunctionDerivedTable getTableFunctionDerivedTable() {
    return findChildByClass(SqlTableFunctionDerivedTable.class);
  }

  @Override
  @Nullable
  public SqlTableOrQueryName getTableOrQueryName() {
    return findChildByClass(SqlTableOrQueryName.class);
  }

}
