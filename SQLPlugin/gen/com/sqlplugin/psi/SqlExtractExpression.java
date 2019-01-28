// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlExtractExpression extends PsiElement {

  @NotNull
  SqlExtractField getExtractField();

  @NotNull
  SqlExtractSource getExtractSource();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
