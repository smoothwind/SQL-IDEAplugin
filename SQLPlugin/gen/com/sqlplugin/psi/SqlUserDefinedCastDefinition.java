// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlUserDefinedCastDefinition extends PsiElement {

  @NotNull
  SqlCastFunction getCastFunction();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlSourceDataType getSourceDataType();

  @NotNull
  SqlTargetDataType getTargetDataType();

}
