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

public class SqlNumericValueFunctionImpl extends ASTWrapperPsiElement implements SqlNumericValueFunction {

  public SqlNumericValueFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitNumericValueFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAbsoluteValueExpression getAbsoluteValueExpression() {
    return findChildByClass(SqlAbsoluteValueExpression.class);
  }

  @Override
  @Nullable
  public SqlCardinalityExpression getCardinalityExpression() {
    return findChildByClass(SqlCardinalityExpression.class);
  }

  @Override
  @Nullable
  public SqlCeilingFunction getCeilingFunction() {
    return findChildByClass(SqlCeilingFunction.class);
  }

  @Override
  @Nullable
  public SqlExponentialFunction getExponentialFunction() {
    return findChildByClass(SqlExponentialFunction.class);
  }

  @Override
  @Nullable
  public SqlExtractExpression getExtractExpression() {
    return findChildByClass(SqlExtractExpression.class);
  }

  @Override
  @Nullable
  public SqlFloorFunction getFloorFunction() {
    return findChildByClass(SqlFloorFunction.class);
  }

  @Override
  @Nullable
  public SqlLengthExpression getLengthExpression() {
    return findChildByClass(SqlLengthExpression.class);
  }

  @Override
  @Nullable
  public SqlModulusExpression getModulusExpression() {
    return findChildByClass(SqlModulusExpression.class);
  }

  @Override
  @Nullable
  public SqlNaturalLogarithm getNaturalLogarithm() {
    return findChildByClass(SqlNaturalLogarithm.class);
  }

  @Override
  @Nullable
  public SqlPositionExpression getPositionExpression() {
    return findChildByClass(SqlPositionExpression.class);
  }

  @Override
  @Nullable
  public SqlPowerFunction getPowerFunction() {
    return findChildByClass(SqlPowerFunction.class);
  }

  @Override
  @Nullable
  public SqlSquareRoot getSquareRoot() {
    return findChildByClass(SqlSquareRoot.class);
  }

  @Override
  @Nullable
  public SqlWidthBucketFunction getWidthBucketFunction() {
    return findChildByClass(SqlWidthBucketFunction.class);
  }

}
