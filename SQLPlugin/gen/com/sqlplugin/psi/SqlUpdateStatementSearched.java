// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlUpdateStatementSearched extends PsiElement {

  @Nullable
  SqlSearchCondition getSearchCondition();

  @NotNull
  SqlSetClauseList getSetClauseList();

  @NotNull
  SqlTargetTable getTargetTable();

}
