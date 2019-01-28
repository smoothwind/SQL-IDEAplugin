// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTableExpression extends PsiElement {

  @NotNull
  SqlFromClause getFromClause();

  @Nullable
  SqlGroupByClause getGroupByClause();

  @Nullable
  SqlHavingClause getHavingClause();

  @Nullable
  SqlWhereClause getWhereClause();

  @Nullable
  SqlWindowClause getWindowClause();

}
