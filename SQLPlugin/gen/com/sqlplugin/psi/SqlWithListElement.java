// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlWithListElement extends PsiElement {

  @NotNull
  List<SqlLeftParen> getLeftParenList();

  @NotNull
  SqlQueryExpression getQueryExpression();

  @NotNull
  SqlQueryName getQueryName();

  @NotNull
  List<SqlRightParen> getRightParenList();

  @Nullable
  SqlSearchOrCycleClause getSearchOrCycleClause();

  @Nullable
  SqlWithColumnList getWithColumnList();

}
