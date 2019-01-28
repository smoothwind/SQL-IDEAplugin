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

public class SqlDatetimeValueFunctionImpl extends ASTWrapperPsiElement implements SqlDatetimeValueFunction {

  public SqlDatetimeValueFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDatetimeValueFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCurrentDateValueFunction getCurrentDateValueFunction() {
    return findChildByClass(SqlCurrentDateValueFunction.class);
  }

  @Override
  @Nullable
  public SqlCurrentLocalTimeValueFunction getCurrentLocalTimeValueFunction() {
    return findChildByClass(SqlCurrentLocalTimeValueFunction.class);
  }

  @Override
  @Nullable
  public SqlCurrentLocalTimestampValueFunction getCurrentLocalTimestampValueFunction() {
    return findChildByClass(SqlCurrentLocalTimestampValueFunction.class);
  }

  @Override
  @Nullable
  public SqlCurrentTimeValueFunction getCurrentTimeValueFunction() {
    return findChildByClass(SqlCurrentTimeValueFunction.class);
  }

  @Override
  @Nullable
  public SqlCurrentTimestampValueFunction getCurrentTimestampValueFunction() {
    return findChildByClass(SqlCurrentTimestampValueFunction.class);
  }

}
