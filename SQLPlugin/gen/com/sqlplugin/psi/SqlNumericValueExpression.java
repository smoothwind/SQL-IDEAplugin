// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlNumericValueExpression extends PsiElement {

  @Nullable
  SqlMinusSign getMinusSign();

  @Nullable
  SqlNumericValueExpression getNumericValueExpression();

  @Nullable
  SqlPlusSign getPlusSign();

  @NotNull
  SqlTerm getTerm();

}
