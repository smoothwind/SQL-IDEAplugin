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

public class SqlFromConstructorImpl extends ASTWrapperPsiElement implements SqlFromConstructor {

  public SqlFromConstructorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitFromConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlContextuallyTypedTableValueConstructor getContextuallyTypedTableValueConstructor() {
    return findNotNullChildByClass(SqlContextuallyTypedTableValueConstructor.class);
  }

  @Override
  @Nullable
  public SqlInsertColumnList getInsertColumnList() {
    return findChildByClass(SqlInsertColumnList.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlOverrideClause getOverrideClause() {
    return findChildByClass(SqlOverrideClause.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

}
