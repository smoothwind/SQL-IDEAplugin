// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlMergeInsertValueList extends PsiElement {

  @Nullable
  SqlComma getComma();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  List<SqlMergeInsertValueElement> getMergeInsertValueElementList();

  @NotNull
  SqlRightParen getRightParen();

}
