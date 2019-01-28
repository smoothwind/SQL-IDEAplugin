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

public class SqlWithListElementImpl extends ASTWrapperPsiElement implements SqlWithListElement {

  public SqlWithListElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitWithListElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlLeftParen> getLeftParenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlLeftParen.class);
  }

  @Override
  @NotNull
  public SqlQueryExpression getQueryExpression() {
    return findNotNullChildByClass(SqlQueryExpression.class);
  }

  @Override
  @NotNull
  public SqlQueryName getQueryName() {
    return findNotNullChildByClass(SqlQueryName.class);
  }

  @Override
  @NotNull
  public List<SqlRightParen> getRightParenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlRightParen.class);
  }

  @Override
  @Nullable
  public SqlSearchOrCycleClause getSearchOrCycleClause() {
    return findChildByClass(SqlSearchOrCycleClause.class);
  }

  @Override
  @Nullable
  public SqlWithColumnList getWithColumnList() {
    return findChildByClass(SqlWithColumnList.class);
  }

}
