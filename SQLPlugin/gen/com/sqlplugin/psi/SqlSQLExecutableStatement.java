// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLExecutableStatement extends PsiElement {

  @Nullable
  SqlSQLConnectionStatement getSQLConnectionStatement();

  @Nullable
  SqlSQLControlStatement getSQLControlStatement();

  @Nullable
  SqlSQLDataStatement getSQLDataStatement();

  @Nullable
  SqlSQLDiagnosticsStatement getSQLDiagnosticsStatement();

  @Nullable
  SqlSQLDynamicStatement getSQLDynamicStatement();

  @Nullable
  SqlSQLSchemaStatement getSQLSchemaStatement();

  @Nullable
  SqlSQLSessionStatement getSQLSessionStatement();

  @Nullable
  SqlSQLTransactionStatement getSQLTransactionStatement();

}
