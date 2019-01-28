// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlStringPositionExpression extends PsiElement {

  @Nullable
  SqlCharLengthUnits getCharLengthUnits();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  List<SqlStringValueExpression> getStringValueExpressionList();

}
