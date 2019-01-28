// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAttributeOrMethodReference extends PsiElement {

  @Nullable
  SqlSQLArgumentList getSQLArgumentList();

  @NotNull
  SqlDereferenceOperator getDereferenceOperator();

  @NotNull
  SqlQualifiedIdentifier getQualifiedIdentifier();

  @NotNull
  SqlValueExpressionPrimary getValueExpressionPrimary();

}
