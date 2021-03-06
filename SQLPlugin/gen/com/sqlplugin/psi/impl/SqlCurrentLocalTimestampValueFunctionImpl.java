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

public class SqlCurrentLocalTimestampValueFunctionImpl extends ASTWrapperPsiElement implements SqlCurrentLocalTimestampValueFunction {

  public SqlCurrentLocalTimestampValueFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCurrentLocalTimestampValueFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

  @Override
  @Nullable
  public SqlTimestampPrecision getTimestampPrecision() {
    return findChildByClass(SqlTimestampPrecision.class);
  }

}
