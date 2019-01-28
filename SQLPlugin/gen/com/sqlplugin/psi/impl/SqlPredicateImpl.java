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

public class SqlPredicateImpl extends ASTWrapperPsiElement implements SqlPredicate {

  public SqlPredicateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitPredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBetweenPredicate getBetweenPredicate() {
    return findChildByClass(SqlBetweenPredicate.class);
  }

  @Override
  @Nullable
  public SqlComparisonPredicate getComparisonPredicate() {
    return findChildByClass(SqlComparisonPredicate.class);
  }

  @Override
  @Nullable
  public SqlDistinctPredicate getDistinctPredicate() {
    return findChildByClass(SqlDistinctPredicate.class);
  }

  @Override
  @Nullable
  public SqlExistsPredicate getExistsPredicate() {
    return findChildByClass(SqlExistsPredicate.class);
  }

  @Override
  @Nullable
  public SqlInPredicate getInPredicate() {
    return findChildByClass(SqlInPredicate.class);
  }

  @Override
  @Nullable
  public SqlLikePredicate getLikePredicate() {
    return findChildByClass(SqlLikePredicate.class);
  }

  @Override
  @Nullable
  public SqlMatchPredicate getMatchPredicate() {
    return findChildByClass(SqlMatchPredicate.class);
  }

  @Override
  @Nullable
  public SqlMemberPredicate getMemberPredicate() {
    return findChildByClass(SqlMemberPredicate.class);
  }

  @Override
  @Nullable
  public SqlNormalizedPredicate getNormalizedPredicate() {
    return findChildByClass(SqlNormalizedPredicate.class);
  }

  @Override
  @Nullable
  public SqlNullPredicate getNullPredicate() {
    return findChildByClass(SqlNullPredicate.class);
  }

  @Override
  @Nullable
  public SqlOverlapsPredicate getOverlapsPredicate() {
    return findChildByClass(SqlOverlapsPredicate.class);
  }

  @Override
  @Nullable
  public SqlQuantifiedComparisonPredicate getQuantifiedComparisonPredicate() {
    return findChildByClass(SqlQuantifiedComparisonPredicate.class);
  }

  @Override
  @Nullable
  public SqlSetPredicate getSetPredicate() {
    return findChildByClass(SqlSetPredicate.class);
  }

  @Override
  @Nullable
  public SqlSimilarPredicate getSimilarPredicate() {
    return findChildByClass(SqlSimilarPredicate.class);
  }

  @Override
  @Nullable
  public SqlSubmultisetPredicate getSubmultisetPredicate() {
    return findChildByClass(SqlSubmultisetPredicate.class);
  }

  @Override
  @Nullable
  public SqlTypePredicate getTypePredicate() {
    return findChildByClass(SqlTypePredicate.class);
  }

  @Override
  @Nullable
  public SqlUniquePredicate getUniquePredicate() {
    return findChildByClass(SqlUniquePredicate.class);
  }

}
