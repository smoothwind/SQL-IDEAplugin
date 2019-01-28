// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlReferencedTableAndColumns extends PsiElement {

  @Nullable
  SqlLeftParen getLeftParen();

  @Nullable
  SqlReferenceColumnList getReferenceColumnList();

  @Nullable
  SqlRightParen getRightParen();

  @NotNull
  SqlTableName getTableName();

}
