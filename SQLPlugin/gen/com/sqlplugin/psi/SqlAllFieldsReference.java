// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAllFieldsReference extends PsiElement {

  @Nullable
  SqlAllFieldsColumnNameList getAllFieldsColumnNameList();

  @NotNull
  SqlAsterisk getAsterisk();

  @Nullable
  SqlLeftParen getLeftParen();

  @NotNull
  SqlPeriod getPeriod();

  @Nullable
  SqlRightParen getRightParen();

  @NotNull
  SqlValueExpressionPrimary getValueExpressionPrimary();

}
