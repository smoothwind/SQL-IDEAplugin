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

public class SqlWidthBucketFunctionImpl extends ASTWrapperPsiElement implements SqlWidthBucketFunction {

  public SqlWidthBucketFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitWidthBucketFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlComma> getCommaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlComma.class);
  }

  @Override
  @NotNull
  public SqlLeftParen getLeftParen() {
    return findNotNullChildByClass(SqlLeftParen.class);
  }

  @Override
  @NotNull
  public SqlRightParen getRightParen() {
    return findNotNullChildByClass(SqlRightParen.class);
  }

  @Override
  @NotNull
  public SqlWidthBucketBound1 getWidthBucketBound1() {
    return findNotNullChildByClass(SqlWidthBucketBound1.class);
  }

  @Override
  @NotNull
  public SqlWidthBucketBound2 getWidthBucketBound2() {
    return findNotNullChildByClass(SqlWidthBucketBound2.class);
  }

  @Override
  @NotNull
  public SqlWidthBucketCount getWidthBucketCount() {
    return findNotNullChildByClass(SqlWidthBucketCount.class);
  }

  @Override
  @NotNull
  public SqlWidthBucketOperand getWidthBucketOperand() {
    return findNotNullChildByClass(SqlWidthBucketOperand.class);
  }

}
