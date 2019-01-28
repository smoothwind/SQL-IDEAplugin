// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlStatementOrDeclaration extends PsiElement {

  @Nullable
  SqlSQLProcedureStatement getSQLProcedureStatement();

  @Nullable
  SqlDeclareCursor getDeclareCursor();

  @Nullable
  SqlDynamicDeclareCursor getDynamicDeclareCursor();

  @Nullable
  SqlEmbeddedAuthorizationDeclaration getEmbeddedAuthorizationDeclaration();

  @Nullable
  SqlEmbeddedCollationSpecification getEmbeddedCollationSpecification();

  @Nullable
  SqlEmbeddedExceptionDeclaration getEmbeddedExceptionDeclaration();

  @Nullable
  SqlEmbeddedPathSpecification getEmbeddedPathSpecification();

  @Nullable
  SqlEmbeddedTransformGroupSpecification getEmbeddedTransformGroupSpecification();

  @Nullable
  SqlTemporaryTableDeclaration getTemporaryTableDeclaration();

}
