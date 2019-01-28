// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTriggeredAction extends PsiElement {

  @Nullable
  SqlLeftParen getLeftParen();

  @Nullable
  SqlRightParen getRightParen();

  @Nullable
  SqlSearchCondition getSearchCondition();

  @NotNull
  SqlTriggeredSQLStatement getTriggeredSQLStatement();

}