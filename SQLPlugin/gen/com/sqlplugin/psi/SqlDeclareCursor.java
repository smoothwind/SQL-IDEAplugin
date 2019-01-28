// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDeclareCursor extends PsiElement {

  @Nullable
  SqlCursorHoldability getCursorHoldability();

  @NotNull
  SqlCursorName getCursorName();

  @Nullable
  SqlCursorReturnability getCursorReturnability();

  @Nullable
  SqlCursorScrollability getCursorScrollability();

  @Nullable
  SqlCursorSensitivity getCursorSensitivity();

  @NotNull
  SqlCursorSpecification getCursorSpecification();

}
