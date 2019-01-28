// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTemporaryTableDeclaration extends PsiElement {

  @Nullable
  SqlTableCommitAction getTableCommitAction();

  @NotNull
  SqlTableElementList getTableElementList();

  @NotNull
  SqlTableName getTableName();

}
