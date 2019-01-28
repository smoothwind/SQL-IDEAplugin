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

public class SqlRegularFactorImpl extends ASTWrapperPsiElement implements SqlRegularFactor {

  public SqlRegularFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitRegularFactor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAsterisk getAsterisk() {
    return findChildByClass(SqlAsterisk.class);
  }

  @Override
  @Nullable
  public SqlPlusSign getPlusSign() {
    return findChildByClass(SqlPlusSign.class);
  }

  @Override
  @Nullable
  public SqlQuestionMark getQuestionMark() {
    return findChildByClass(SqlQuestionMark.class);
  }

  @Override
  @NotNull
  public SqlRegularPrimary getRegularPrimary() {
    return findNotNullChildByClass(SqlRegularPrimary.class);
  }

  @Override
  @Nullable
  public SqlRepeatFactor getRepeatFactor() {
    return findChildByClass(SqlRepeatFactor.class);
  }

}
