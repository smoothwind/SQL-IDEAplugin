// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlPredicate extends PsiElement {

  @Nullable
  SqlBetweenPredicate getBetweenPredicate();

  @Nullable
  SqlComparisonPredicate getComparisonPredicate();

  @Nullable
  SqlDistinctPredicate getDistinctPredicate();

  @Nullable
  SqlExistsPredicate getExistsPredicate();

  @Nullable
  SqlInPredicate getInPredicate();

  @Nullable
  SqlLikePredicate getLikePredicate();

  @Nullable
  SqlMatchPredicate getMatchPredicate();

  @Nullable
  SqlMemberPredicate getMemberPredicate();

  @Nullable
  SqlNormalizedPredicate getNormalizedPredicate();

  @Nullable
  SqlNullPredicate getNullPredicate();

  @Nullable
  SqlOverlapsPredicate getOverlapsPredicate();

  @Nullable
  SqlQuantifiedComparisonPredicate getQuantifiedComparisonPredicate();

  @Nullable
  SqlSetPredicate getSetPredicate();

  @Nullable
  SqlSimilarPredicate getSimilarPredicate();

  @Nullable
  SqlSubmultisetPredicate getSubmultisetPredicate();

  @Nullable
  SqlTypePredicate getTypePredicate();

  @Nullable
  SqlUniquePredicate getUniquePredicate();

}
