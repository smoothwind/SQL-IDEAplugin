// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlConcatenation extends PsiElement {

  @NotNull
  SqlCharacterFactor getCharacterFactor();

  @NotNull
  SqlCharacterValueExpression getCharacterValueExpression();

  @NotNull
  SqlConcatenationOperator getConcatenationOperator();

}
