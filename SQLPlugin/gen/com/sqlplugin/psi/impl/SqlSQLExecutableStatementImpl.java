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

public class SqlSQLExecutableStatementImpl extends ASTWrapperPsiElement implements SqlSQLExecutableStatement {

  public SqlSQLExecutableStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLExecutableStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLConnectionStatement getSQLConnectionStatement() {
    return findChildByClass(SqlSQLConnectionStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLControlStatement getSQLControlStatement() {
    return findChildByClass(SqlSQLControlStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLDataStatement getSQLDataStatement() {
    return findChildByClass(SqlSQLDataStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLDiagnosticsStatement getSQLDiagnosticsStatement() {
    return findChildByClass(SqlSQLDiagnosticsStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLDynamicStatement getSQLDynamicStatement() {
    return findChildByClass(SqlSQLDynamicStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLSchemaStatement getSQLSchemaStatement() {
    return findChildByClass(SqlSQLSchemaStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLSessionStatement getSQLSessionStatement() {
    return findChildByClass(SqlSQLSessionStatement.class);
  }

  @Override
  @Nullable
  public SqlSQLTransactionStatement getSQLTransactionStatement() {
    return findChildByClass(SqlSQLTransactionStatement.class);
  }

}
