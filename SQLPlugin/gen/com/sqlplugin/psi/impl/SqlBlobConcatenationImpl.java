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

public class SqlBlobConcatenationImpl extends ASTWrapperPsiElement implements SqlBlobConcatenation {

  public SqlBlobConcatenationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitBlobConcatenation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlBlobFactor getBlobFactor() {
    return findNotNullChildByClass(SqlBlobFactor.class);
  }

  @Override
  @NotNull
  public SqlBlobValueExpression getBlobValueExpression() {
    return findNotNullChildByClass(SqlBlobValueExpression.class);
  }

  @Override
  @NotNull
  public SqlConcatenationOperator getConcatenationOperator() {
    return findNotNullChildByClass(SqlConcatenationOperator.class);
  }

}
