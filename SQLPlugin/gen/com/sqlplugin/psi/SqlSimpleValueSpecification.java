// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSimpleValueSpecification extends PsiElement {

  @Nullable
  SqlSQLParameterReference getSQLParameterReference();

  @Nullable
  SqlEmbeddedVariableName getEmbeddedVariableName();

  @Nullable
  SqlHostParameterName getHostParameterName();

  @Nullable
  SqlLiteral getLiteral();

}
