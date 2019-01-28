// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlGeneralValueSpecification extends PsiElement {

  @Nullable
  SqlSQLParameterReference getSQLParameterReference();

  @Nullable
  SqlCurrentCollationSpecification getCurrentCollationSpecification();

  @Nullable
  SqlDynamicParameterSpecification getDynamicParameterSpecification();

  @Nullable
  SqlEmbeddedVariableSpecification getEmbeddedVariableSpecification();

  @Nullable
  SqlHostParameterSpecification getHostParameterSpecification();

  @Nullable
  SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName();

}
