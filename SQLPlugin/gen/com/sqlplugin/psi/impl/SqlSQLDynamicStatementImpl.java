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

public class SqlSQLDynamicStatementImpl extends ASTWrapperPsiElement implements SqlSQLDynamicStatement {

  public SqlSQLDynamicStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLDynamicStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLDynamicDataStatement getSQLDynamicDataStatement() {
    return findChildByClass(SqlSQLDynamicDataStatement.class);
  }

  @Override
  @Nullable
  public SqlDeallocatePreparedStatement getDeallocatePreparedStatement() {
    return findChildByClass(SqlDeallocatePreparedStatement.class);
  }

  @Override
  @Nullable
  public SqlDescribeStatement getDescribeStatement() {
    return findChildByClass(SqlDescribeStatement.class);
  }

  @Override
  @Nullable
  public SqlExecuteImmediateStatement getExecuteImmediateStatement() {
    return findChildByClass(SqlExecuteImmediateStatement.class);
  }

  @Override
  @Nullable
  public SqlExecuteStatement getExecuteStatement() {
    return findChildByClass(SqlExecuteStatement.class);
  }

  @Override
  @Nullable
  public SqlPrepareStatement getPrepareStatement() {
    return findChildByClass(SqlPrepareStatement.class);
  }

  @Override
  @Nullable
  public SqlSystemDescriptorStatement getSystemDescriptorStatement() {
    return findChildByClass(SqlSystemDescriptorStatement.class);
  }

}
