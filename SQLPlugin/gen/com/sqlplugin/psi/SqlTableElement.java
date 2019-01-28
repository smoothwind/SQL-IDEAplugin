// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTableElement extends PsiElement {

  @Nullable
  SqlColumnDefinition getColumnDefinition();

  @Nullable
  SqlColumnOptions getColumnOptions();

  @Nullable
  SqlLikeClause getLikeClause();

  @Nullable
  SqlSelfReferencingColumnSpecification getSelfReferencingColumnSpecification();

  @Nullable
  SqlTableConstraintDefinition getTableConstraintDefinition();

}
