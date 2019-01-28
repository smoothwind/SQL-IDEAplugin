// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlIdentifierChain extends PsiElement {

  @NotNull
  List<SqlIdentifier> getIdentifierList();

  @Nullable
  SqlPeriod getPeriod();

}
