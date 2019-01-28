// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlPreparableStatement extends PsiElement {

  @Nullable
  SqlPreparableSQLControlStatement getPreparableSQLControlStatement();

  @Nullable
  SqlPreparableSQLDataStatement getPreparableSQLDataStatement();

  @Nullable
  SqlPreparableSQLSchemaStatement getPreparableSQLSchemaStatement();

  @Nullable
  SqlPreparableSQLSessionStatement getPreparableSQLSessionStatement();

  @Nullable
  SqlPreparableSQLTransactionStatement getPreparableSQLTransactionStatement();

  @Nullable
  SqlPreparableImplementationDefinedStatement getPreparableImplementationDefinedStatement();

}
