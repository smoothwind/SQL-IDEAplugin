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

public class SqlPreparableStatementImpl extends ASTWrapperPsiElement implements SqlPreparableStatement {

  public SqlPreparableStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitPreparableStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlPreparableSQLControlStatement getPreparableSQLControlStatement() {
    return findChildByClass(SqlPreparableSQLControlStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableSQLDataStatement getPreparableSQLDataStatement() {
    return findChildByClass(SqlPreparableSQLDataStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableSQLSchemaStatement getPreparableSQLSchemaStatement() {
    return findChildByClass(SqlPreparableSQLSchemaStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableSQLSessionStatement getPreparableSQLSessionStatement() {
    return findChildByClass(SqlPreparableSQLSessionStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableSQLTransactionStatement getPreparableSQLTransactionStatement() {
    return findChildByClass(SqlPreparableSQLTransactionStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableImplementationDefinedStatement getPreparableImplementationDefinedStatement() {
    return findChildByClass(SqlPreparableImplementationDefinedStatement.class);
  }

}
