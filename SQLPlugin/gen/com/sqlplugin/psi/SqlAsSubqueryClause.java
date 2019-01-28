// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAsSubqueryClause extends PsiElement {

  @Nullable
  SqlColumnNameList getColumnNameList();

  @Nullable
  SqlLeftParen getLeftParen();

  @Nullable
  SqlRightParen getRightParen();

  @NotNull
  SqlSubquery getSubquery();

  @NotNull
  SqlWithOrWithoutData getWithOrWithoutData();

}
