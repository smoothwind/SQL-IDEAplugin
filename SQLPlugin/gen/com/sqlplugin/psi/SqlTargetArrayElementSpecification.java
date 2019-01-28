// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTargetArrayElementSpecification extends PsiElement {

  @NotNull
  SqlLeftBracketOrTrigraph getLeftBracketOrTrigraph();

  @NotNull
  SqlRightBracketOrTrigraph getRightBracketOrTrigraph();

  @NotNull
  SqlSimpleValueSpecification getSimpleValueSpecification();

  @NotNull
  SqlTargetArrayReference getTargetArrayReference();

}
