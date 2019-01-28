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

public class SqlSQLDynamicDataStatementImpl extends ASTWrapperPsiElement implements SqlSQLDynamicDataStatement {

  public SqlSQLDynamicDataStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLDynamicDataStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAllocateCursorStatement getAllocateCursorStatement() {
    return findChildByClass(SqlAllocateCursorStatement.class);
  }

  @Override
  @Nullable
  public SqlDynamicCloseStatement getDynamicCloseStatement() {
    return findChildByClass(SqlDynamicCloseStatement.class);
  }

  @Override
  @Nullable
  public SqlDynamicDeleteStatementPositioned getDynamicDeleteStatementPositioned() {
    return findChildByClass(SqlDynamicDeleteStatementPositioned.class);
  }

  @Override
  @Nullable
  public SqlDynamicFetchStatement getDynamicFetchStatement() {
    return findChildByClass(SqlDynamicFetchStatement.class);
  }

  @Override
  @Nullable
  public SqlDynamicOpenStatement getDynamicOpenStatement() {
    return findChildByClass(SqlDynamicOpenStatement.class);
  }

  @Override
  @Nullable
  public SqlDynamicUpdateStatementPositioned getDynamicUpdateStatementPositioned() {
    return findChildByClass(SqlDynamicUpdateStatementPositioned.class);
  }

}
