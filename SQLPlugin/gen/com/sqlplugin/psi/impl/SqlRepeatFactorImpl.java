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

public class SqlRepeatFactorImpl extends ASTWrapperPsiElement implements SqlRepeatFactor {

  public SqlRepeatFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitRepeatFactor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlLeftBrace getLeftBrace() {
    return findNotNullChildByClass(SqlLeftBrace.class);
  }

  @Override
  @NotNull
  public SqlLowValue getLowValue() {
    return findNotNullChildByClass(SqlLowValue.class);
  }

  @Override
  @NotNull
  public SqlRightBrace getRightBrace() {
    return findNotNullChildByClass(SqlRightBrace.class);
  }

  @Override
  @Nullable
  public SqlUpperLimit getUpperLimit() {
    return findChildByClass(SqlUpperLimit.class);
  }

}
