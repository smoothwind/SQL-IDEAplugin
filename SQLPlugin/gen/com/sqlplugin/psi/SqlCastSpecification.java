// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCastSpecification extends PsiElement {

  @NotNull
  SqlCastOperand getCastOperand();

  @NotNull
  SqlCastTarget getCastTarget();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
