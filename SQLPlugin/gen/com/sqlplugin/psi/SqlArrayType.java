// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlArrayType extends PsiElement {

  @NotNull
  SqlDataType getDataType();

  @Nullable
  SqlLeftBracketOrTrigraph getLeftBracketOrTrigraph();

  @Nullable
  SqlRightBracketOrTrigraph getRightBracketOrTrigraph();

  @Nullable
  SqlUnsignedInteger getUnsignedInteger();

}
