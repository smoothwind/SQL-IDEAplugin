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

public class SqlTableExpressionImpl extends ASTWrapperPsiElement implements SqlTableExpression {

  public SqlTableExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTableExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlFromClause getFromClause() {
    return findNotNullChildByClass(SqlFromClause.class);
  }

  @Override
  @Nullable
  public SqlGroupByClause getGroupByClause() {
    return findChildByClass(SqlGroupByClause.class);
  }

  @Override
  @Nullable
  public SqlHavingClause getHavingClause() {
    return findChildByClass(SqlHavingClause.class);
  }

  @Override
  @Nullable
  public SqlWhereClause getWhereClause() {
    return findChildByClass(SqlWhereClause.class);
  }

  @Override
  @Nullable
  public SqlWindowClause getWindowClause() {
    return findChildByClass(SqlWindowClause.class);
  }

}
