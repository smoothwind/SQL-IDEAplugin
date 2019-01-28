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

public class SqlHypotheticalSetFunctionImpl extends ASTWrapperPsiElement implements SqlHypotheticalSetFunction {

  public SqlHypotheticalSetFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitHypotheticalSetFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlHypotheticalSetFunctionValueExpressionList getHypotheticalSetFunctionValueExpressionList() {
    return findNotNullChildByClass(SqlHypotheticalSetFunctionValueExpressionList.class);
  }

  @Override
  @NotNull
  public SqlLeftParen getLeftParen() {
    return findNotNullChildByClass(SqlLeftParen.class);
  }

  @Override
  @NotNull
  public SqlRankFunctionType getRankFunctionType() {
    return findNotNullChildByClass(SqlRankFunctionType.class);
  }

  @Override
  @NotNull
  public SqlRightParen getRightParen() {
    return findNotNullChildByClass(SqlRightParen.class);
  }

  @Override
  @NotNull
  public SqlWithinGroupSpecification getWithinGroupSpecification() {
    return findNotNullChildByClass(SqlWithinGroupSpecification.class);
  }

}
