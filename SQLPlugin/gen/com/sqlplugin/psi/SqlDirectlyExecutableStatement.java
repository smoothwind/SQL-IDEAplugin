// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDirectlyExecutableStatement extends PsiElement {

  @Nullable
  SqlSQLConnectionStatement getSQLConnectionStatement();

  @Nullable
  SqlSQLSchemaStatement getSQLSchemaStatement();

  @Nullable
  SqlSQLSessionStatement getSQLSessionStatement();

  @Nullable
  SqlSQLTransactionStatement getSQLTransactionStatement();

  @Nullable
  SqlDirectSQLDataStatement getDirectSQLDataStatement();

  @Nullable
  SqlDirectImplementationDefinedStatement getDirectImplementationDefinedStatement();

}
