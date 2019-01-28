// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlMutatedSetClause extends PsiElement {

  @NotNull
  SqlMethodName getMethodName();

  @NotNull
  SqlMutatedTarget getMutatedTarget();

  @NotNull
  SqlPeriod getPeriod();

}
