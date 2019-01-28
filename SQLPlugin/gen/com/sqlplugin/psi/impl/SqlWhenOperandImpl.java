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

public class SqlWhenOperandImpl extends ASTWrapperPsiElement implements SqlWhenOperand {

  public SqlWhenOperandImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitWhenOperand(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBetweenPredicatePart2 getBetweenPredicatePart2() {
    return findChildByClass(SqlBetweenPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlCharacterLikePredicatePart2 getCharacterLikePredicatePart2() {
    return findChildByClass(SqlCharacterLikePredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlComparisonPredicatePart2 getComparisonPredicatePart2() {
    return findChildByClass(SqlComparisonPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlDistinctPredicatePart2 getDistinctPredicatePart2() {
    return findChildByClass(SqlDistinctPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlInPredicatePart2 getInPredicatePart2() {
    return findChildByClass(SqlInPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlMatchPredicatePart2 getMatchPredicatePart2() {
    return findChildByClass(SqlMatchPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlMemberPredicatePart2 getMemberPredicatePart2() {
    return findChildByClass(SqlMemberPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlNullPredicatePart2 getNullPredicatePart2() {
    return findChildByClass(SqlNullPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlOctetLikePredicatePart2 getOctetLikePredicatePart2() {
    return findChildByClass(SqlOctetLikePredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlOverlapsPredicatePart2 getOverlapsPredicatePart2() {
    return findChildByClass(SqlOverlapsPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlQuantifiedComparisonPredicatePart2 getQuantifiedComparisonPredicatePart2() {
    return findChildByClass(SqlQuantifiedComparisonPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlRowValuePredicand getRowValuePredicand() {
    return findChildByClass(SqlRowValuePredicand.class);
  }

  @Override
  @Nullable
  public SqlSetPredicatePart2 getSetPredicatePart2() {
    return findChildByClass(SqlSetPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlSimilarPredicatePart2 getSimilarPredicatePart2() {
    return findChildByClass(SqlSimilarPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlSubmultisetPredicatePart2 getSubmultisetPredicatePart2() {
    return findChildByClass(SqlSubmultisetPredicatePart2.class);
  }

  @Override
  @Nullable
  public SqlTypePredicatePart2 getTypePredicatePart2() {
    return findChildByClass(SqlTypePredicatePart2.class);
  }

}
