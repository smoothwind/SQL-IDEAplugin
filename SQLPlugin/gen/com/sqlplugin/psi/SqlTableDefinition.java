// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTableDefinition extends PsiElement {

  @Nullable
  SqlTableCommitAction getTableCommitAction();

  @NotNull
  SqlTableContentsSource getTableContentsSource();

  @NotNull
  SqlTableName getTableName();

  @Nullable
  SqlTableScope getTableScope();

}
