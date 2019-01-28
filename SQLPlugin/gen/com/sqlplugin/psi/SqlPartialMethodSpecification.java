// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlPartialMethodSpecification extends PsiElement {

  @NotNull
  SqlSQLParameterDeclarationList getSQLParameterDeclarationList();

  @NotNull
  SqlMethodName getMethodName();

  @NotNull
  SqlReturnsClause getReturnsClause();

  @Nullable
  SqlSpecificMethodName getSpecificMethodName();

}
