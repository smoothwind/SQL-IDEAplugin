// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlGroupingOperation extends PsiElement {

  @NotNull
  List<SqlColumnReference> getColumnReferenceList();

  @Nullable
  SqlComma getComma();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
