// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTerm extends PsiElement {

  @Nullable
  SqlAsterisk getAsterisk();

  @NotNull
  SqlFactor getFactor();

  @Nullable
  SqlSolidus getSolidus();

  @Nullable
  SqlTerm getTerm();

}
