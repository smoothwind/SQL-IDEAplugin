// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlFunctionSpecification extends PsiElement {

  @NotNull
  SqlSQLParameterDeclarationList getSQLParameterDeclarationList();

  @Nullable
  SqlDispatchClause getDispatchClause();

  @NotNull
  SqlReturnsClause getReturnsClause();

  @NotNull
  SqlRoutineCharacteristics getRoutineCharacteristics();

  @NotNull
  SqlSchemaQualifiedRoutineName getSchemaQualifiedRoutineName();

}
