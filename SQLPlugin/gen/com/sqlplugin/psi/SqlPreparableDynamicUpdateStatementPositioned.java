// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlPreparableDynamicUpdateStatementPositioned extends PsiElement {

  @NotNull
  SqlCursorName getCursorName();

  @Nullable
  SqlScopeOption getScopeOption();

  @NotNull
  SqlSetClauseList getSetClauseList();

  @Nullable
  SqlTargetTable getTargetTable();

}
