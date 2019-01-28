// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlColumnReference extends PsiElement {

  @Nullable
  SqlBasicIdentifierChain getBasicIdentifierChain();

  @Nullable
  SqlColumnName getColumnName();

  @NotNull
  List<SqlPeriod> getPeriodList();

  @Nullable
  SqlQualifiedIdentifier getQualifiedIdentifier();

}
