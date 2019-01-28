// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlExternallyInvokedProcedure extends PsiElement {

  @NotNull
  SqlSQLProcedureStatement getSQLProcedureStatement();

  @NotNull
  SqlHostParameterDeclarationList getHostParameterDeclarationList();

  @NotNull
  SqlProcedureName getProcedureName();

  @NotNull
  List<SqlSemicolon> getSemicolonList();

}
