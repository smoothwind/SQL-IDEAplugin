// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlNaturalJoin extends PsiElement {

  @Nullable
  SqlJoinType getJoinType();

  @NotNull
  SqlTablePrimary getTablePrimary();

  @NotNull
  SqlTableReference getTableReference();

}
