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

public class SqlQuantifiedComparisonPredicatePart2Impl extends ASTWrapperPsiElement implements SqlQuantifiedComparisonPredicatePart2 {

  public SqlQuantifiedComparisonPredicatePart2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitQuantifiedComparisonPredicatePart2(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlCompOp getCompOp() {
    return findNotNullChildByClass(SqlCompOp.class);
  }

  @Override
  @NotNull
  public SqlQuantifier getQuantifier() {
    return findNotNullChildByClass(SqlQuantifier.class);
  }

  @Override
  @NotNull
  public SqlTableSubquery getTableSubquery() {
    return findNotNullChildByClass(SqlTableSubquery.class);
  }

}
