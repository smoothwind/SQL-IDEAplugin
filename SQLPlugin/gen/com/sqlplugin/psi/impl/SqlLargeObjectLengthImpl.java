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

public class SqlLargeObjectLengthImpl extends ASTWrapperPsiElement implements SqlLargeObjectLength {

  public SqlLargeObjectLengthImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitLargeObjectLength(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharLengthUnits getCharLengthUnits() {
    return findChildByClass(SqlCharLengthUnits.class);
  }

  @Override
  @Nullable
  public SqlLargeObjectLengthToken getLargeObjectLengthToken() {
    return findChildByClass(SqlLargeObjectLengthToken.class);
  }

  @Override
  @Nullable
  public SqlMultiplier getMultiplier() {
    return findChildByClass(SqlMultiplier.class);
  }

  @Override
  @Nullable
  public SqlUnsignedInteger getUnsignedInteger() {
    return findChildByClass(SqlUnsignedInteger.class);
  }

}
