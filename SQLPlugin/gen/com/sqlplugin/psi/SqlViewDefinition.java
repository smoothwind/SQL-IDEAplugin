// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlViewDefinition extends PsiElement {

  @Nullable
  SqlLevelsClause getLevelsClause();

  @NotNull
  SqlQueryExpression getQueryExpression();

  @NotNull
  SqlTableName getTableName();

  @NotNull
  SqlViewSpecification getViewSpecification();

}
