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

public class SqlMergeInsertSpecificationImpl extends ASTWrapperPsiElement implements SqlMergeInsertSpecification {

  public SqlMergeInsertSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitMergeInsertSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
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
  @NotNull
  public SqlMergeInsertValueList getMergeInsertValueList() {
    return findNotNullChildByClass(SqlMergeInsertValueList.class);
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
