// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAssertionDefinition extends PsiElement {

  @Nullable
  SqlConstraintCharacteristics getConstraintCharacteristics();

  @NotNull
  SqlConstraintName getConstraintName();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlSearchCondition getSearchCondition();

}
