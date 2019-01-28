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

public class SqlSQLDataStatementImpl extends ASTWrapperPsiElement implements SqlSQLDataStatement {

  public SqlSQLDataStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLDataStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLDataChangeStatement getSQLDataChangeStatement() {
    return findChildByClass(SqlSQLDataChangeStatement.class);
  }

  @Override
  @Nullable
  public SqlCloseStatement getCloseStatement() {
    return findChildByClass(SqlCloseStatement.class);
  }

  @Override
  @Nullable
  public SqlFetchStatement getFetchStatement() {
    return findChildByClass(SqlFetchStatement.class);
  }

  @Override
  @Nullable
  public SqlFreeLocatorStatement getFreeLocatorStatement() {
    return findChildByClass(SqlFreeLocatorStatement.class);
  }

  @Override
  @Nullable
  public SqlHoldLocatorStatement getHoldLocatorStatement() {
    return findChildByClass(SqlHoldLocatorStatement.class);
  }

  @Override
  @Nullable
  public SqlOpenStatement getOpenStatement() {
    return findChildByClass(SqlOpenStatement.class);
  }

  @Override
  @Nullable
  public SqlSelectStatementSingleRow getSelectStatementSingleRow() {
    return findChildByClass(SqlSelectStatementSingleRow.class);
  }

}
