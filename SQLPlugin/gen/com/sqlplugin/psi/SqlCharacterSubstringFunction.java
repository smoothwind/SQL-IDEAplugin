// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharacterSubstringFunction extends PsiElement {

  @Nullable
  SqlCharLengthUnits getCharLengthUnits();

  @NotNull
  SqlCharacterValueExpression getCharacterValueExpression();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlStartPosition getStartPosition();

  @Nullable
  SqlStringLength getStringLength();

}
