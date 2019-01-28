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

public class SqlQuerySpecificationImpl extends ASTWrapperPsiElement implements SqlQuerySpecification {

  public SqlQuerySpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitQuerySpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlSelectList getSelectList() {
    return findNotNullChildByClass(SqlSelectList.class);
  }

  @Override
  @Nullable
  public SqlSetQuantifier getSetQuantifier() {
    return findChildByClass(SqlSetQuantifier.class);
  }

  @Override
  @NotNull
  public SqlTableExpression getTableExpression() {
    return findNotNullChildByClass(SqlTableExpression.class);
  }

}
