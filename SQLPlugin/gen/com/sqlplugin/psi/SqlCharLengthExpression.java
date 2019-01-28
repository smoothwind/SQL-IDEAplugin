// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharLengthExpression extends PsiElement {

  @Nullable
  SqlCharLengthUnits getCharLengthUnits();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlStringValueExpression getStringValueExpression();

}
