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

public class SqlSQLTransactionStatementImpl extends ASTWrapperPsiElement implements SqlSQLTransactionStatement {

  public SqlSQLTransactionStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLTransactionStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCommitStatement getCommitStatement() {
    return findChildByClass(SqlCommitStatement.class);
  }

  @Override
  @Nullable
  public SqlReleaseSavepointStatement getReleaseSavepointStatement() {
    return findChildByClass(SqlReleaseSavepointStatement.class);
  }

  @Override
  @Nullable
  public SqlRollbackStatement getRollbackStatement() {
    return findChildByClass(SqlRollbackStatement.class);
  }

  @Override
  @Nullable
  public SqlSavepointStatement getSavepointStatement() {
    return findChildByClass(SqlSavepointStatement.class);
  }

  @Override
  @Nullable
  public SqlSetConstraintsModeStatement getSetConstraintsModeStatement() {
    return findChildByClass(SqlSetConstraintsModeStatement.class);
  }

  @Override
  @Nullable
  public SqlSetTransactionStatement getSetTransactionStatement() {
    return findChildByClass(SqlSetTransactionStatement.class);
  }

  @Override
  @Nullable
  public SqlStartTransactionStatement getStartTransactionStatement() {
    return findChildByClass(SqlStartTransactionStatement.class);
  }

}
