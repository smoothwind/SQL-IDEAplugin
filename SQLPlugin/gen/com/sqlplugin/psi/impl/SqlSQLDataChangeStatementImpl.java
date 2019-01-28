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

public class SqlSQLDataChangeStatementImpl extends ASTWrapperPsiElement implements SqlSQLDataChangeStatement {

  public SqlSQLDataChangeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLDataChangeStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlDeleteStatementPositioned getDeleteStatementPositioned() {
    return findChildByClass(SqlDeleteStatementPositioned.class);
  }

  @Override
  @Nullable
  public SqlDeleteStatementSearched getDeleteStatementSearched() {
    return findChildByClass(SqlDeleteStatementSearched.class);
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
  public SqlUpdateStatementPositioned getUpdateStatementPositioned() {
    return findChildByClass(SqlUpdateStatementPositioned.class);
  }

  @Override
  @Nullable
  public SqlUpdateStatementSearched getUpdateStatementSearched() {
    return findChildByClass(SqlUpdateStatementSearched.class);
  }

}
