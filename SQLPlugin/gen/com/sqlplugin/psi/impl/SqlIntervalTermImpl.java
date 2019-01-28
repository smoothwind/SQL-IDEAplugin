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

public class SqlIntervalTermImpl extends ASTWrapperPsiElement implements SqlIntervalTerm {

  public SqlIntervalTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitIntervalTerm(this);
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
  public SqlFactor getFactor() {
    return findChildByClass(SqlFactor.class);
  }

  @Override
  @Nullable
  public SqlIntervalFactor getIntervalFactor() {
    return findChildByClass(SqlIntervalFactor.class);
  }

  @Override
  @Nullable
  public SqlIntervalTerm2 getIntervalTerm2() {
    return findChildByClass(SqlIntervalTerm2.class);
  }

  @Override
  @Nullable
  public SqlSolidus getSolidus() {
    return findChildByClass(SqlSolidus.class);
  }

  @Override
  @Nullable
  public SqlTerm getTerm() {
    return findChildByClass(SqlTerm.class);
  }

}
