// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlRegularFactor extends PsiElement {

  @Nullable
  SqlAsterisk getAsterisk();

  @Nullable
  SqlPlusSign getPlusSign();

  @Nullable
  SqlQuestionMark getQuestionMark();

  @NotNull
  SqlRegularPrimary getRegularPrimary();

  @Nullable
  SqlRepeatFactor getRepeatFactor();

}
