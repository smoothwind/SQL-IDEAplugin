// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlBinarySetFunction extends PsiElement {

  @NotNull
  SqlBinarySetFunctionType getBinarySetFunctionType();

  @NotNull
  SqlComma getComma();

  @NotNull
  SqlDependentVariableExpression getDependentVariableExpression();

  @NotNull
  SqlIndependentVariableExpression getIndependentVariableExpression();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
