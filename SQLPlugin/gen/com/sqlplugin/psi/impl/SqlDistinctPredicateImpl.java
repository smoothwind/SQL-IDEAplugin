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

public class SqlDistinctPredicateImpl extends ASTWrapperPsiElement implements SqlDistinctPredicate {

  public SqlDistinctPredicateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDistinctPredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDistinctPredicatePart2 getDistinctPredicatePart2() {
    return findNotNullChildByClass(SqlDistinctPredicatePart2.class);
  }

  @Override
  @NotNull
  public SqlRowValuePredicand3 getRowValuePredicand3() {
    return findNotNullChildByClass(SqlRowValuePredicand3.class);
  }

}
