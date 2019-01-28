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

public class SqlSingleDatetimeFieldImpl extends ASTWrapperPsiElement implements SqlSingleDatetimeField {

  public SqlSingleDatetimeFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSingleDatetimeField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlComma getComma() {
    return findChildByClass(SqlComma.class);
  }

  @Override
  @Nullable
  public SqlIntervalFractionalSecondsPrecision getIntervalFractionalSecondsPrecision() {
    return findChildByClass(SqlIntervalFractionalSecondsPrecision.class);
  }

  @Override
  @Nullable
  public SqlIntervalLeadingFieldPrecision getIntervalLeadingFieldPrecision() {
    return findChildByClass(SqlIntervalLeadingFieldPrecision.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlNonSecondPrimaryDatetimeField getNonSecondPrimaryDatetimeField() {
    return findChildByClass(SqlNonSecondPrimaryDatetimeField.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

}
