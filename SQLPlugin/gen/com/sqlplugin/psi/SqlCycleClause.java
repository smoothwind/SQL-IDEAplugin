// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCycleClause extends PsiElement {

  @NotNull
  SqlCycleColumnList getCycleColumnList();

  @NotNull
  SqlCycleMarkColumn getCycleMarkColumn();

  @NotNull
  SqlCycleMarkValue getCycleMarkValue();

  @NotNull
  SqlNonCycleMarkValue getNonCycleMarkValue();

  @NotNull
  SqlPathColumn getPathColumn();

}
