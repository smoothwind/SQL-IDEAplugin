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

public class SqlArrayTypeImpl extends ASTWrapperPsiElement implements SqlArrayType {

  public SqlArrayTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitArrayType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDataType getDataType() {
    return findNotNullChildByClass(SqlDataType.class);
  }

  @Override
  @Nullable
  public SqlLeftBracketOrTrigraph getLeftBracketOrTrigraph() {
    return findChildByClass(SqlLeftBracketOrTrigraph.class);
  }

  @Override
  @Nullable
  public SqlRightBracketOrTrigraph getRightBracketOrTrigraph() {
    return findChildByClass(SqlRightBracketOrTrigraph.class);
  }

  @Override
  @Nullable
  public SqlUnsignedInteger getUnsignedInteger() {
    return findChildByClass(SqlUnsignedInteger.class);
  }

}
