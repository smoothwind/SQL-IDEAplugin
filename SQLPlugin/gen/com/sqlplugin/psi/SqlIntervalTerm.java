// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlIntervalTerm extends PsiElement {

  @Nullable
  SqlAsterisk getAsterisk();

  @Nullable
  SqlFactor getFactor();

  @Nullable
  SqlIntervalFactor getIntervalFactor();

  @Nullable
  SqlIntervalTerm2 getIntervalTerm2();

  @Nullable
  SqlSolidus getSolidus();

  @Nullable
  SqlTerm getTerm();

}
