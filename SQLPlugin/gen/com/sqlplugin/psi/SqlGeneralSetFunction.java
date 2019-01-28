// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlGeneralSetFunction extends PsiElement {

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlSetFunctionType getSetFunctionType();

  @Nullable
  SqlSetQuantifier getSetQuantifier();

  @NotNull
  SqlValueExpression getValueExpression();

}
