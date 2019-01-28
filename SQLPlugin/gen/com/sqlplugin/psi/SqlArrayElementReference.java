// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlArrayElementReference extends PsiElement {

  @NotNull
  SqlArrayValueExpression getArrayValueExpression();

  @NotNull
  SqlLeftBracketOrTrigraph getLeftBracketOrTrigraph();

  @NotNull
  SqlNumericValueExpression getNumericValueExpression();

  @NotNull
  SqlRightBracketOrTrigraph getRightBracketOrTrigraph();

}
