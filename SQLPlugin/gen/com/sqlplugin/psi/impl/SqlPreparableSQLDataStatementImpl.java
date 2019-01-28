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

public class SqlPreparableSQLDataStatementImpl extends ASTWrapperPsiElement implements SqlPreparableSQLDataStatement {

  public SqlPreparableSQLDataStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitPreparableSQLDataStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlDeleteStatementSearched getDeleteStatementSearched() {
    return findChildByClass(SqlDeleteStatementSearched.class);
  }

  @Override
  @Nullable
  public SqlDynamicSelectStatement getDynamicSelectStatement() {
    return findChildByClass(SqlDynamicSelectStatement.class);
  }

  @Override
  @Nullable
  public SqlDynamicSingleRowSelectStatement getDynamicSingleRowSelectStatement() {
    return findChildByClass(SqlDynamicSingleRowSelectStatement.class);
  }

  @Override
  @Nullable
  public SqlInsertStatement getInsertStatement() {
    return findChildByClass(SqlInsertStatement.class);
  }

  @Override
  @Nullable
  public SqlMergeStatement getMergeStatement() {
    return findChildByClass(SqlMergeStatement.class);
  }

  @Override
  @Nullable
  public SqlPreparableDynamicDeleteStatementPositioned getPreparableDynamicDeleteStatementPositioned() {
    return findChildByClass(SqlPreparableDynamicDeleteStatementPositioned.class);
  }

  @Override
  @Nullable
  public SqlPreparableDynamicUpdateStatementPositioned getPreparableDynamicUpdateStatementPositioned() {
    return findChildByClass(SqlPreparableDynamicUpdateStatementPositioned.class);
  }

  @Override
  @Nullable
  public SqlUpdateStatementSearched getUpdateStatementSearched() {
    return findChildByClass(SqlUpdateStatementSearched.class);
  }

}
