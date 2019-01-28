// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDatetimeValueExpression extends PsiElement {

  @Nullable
  SqlDatetimeTerm getDatetimeTerm();

  @Nullable
  SqlDatetimeValueExpression getDatetimeValueExpression();

  @Nullable
  SqlIntervalTerm getIntervalTerm();

  @Nullable
  SqlIntervalValueExpression getIntervalValueExpression();

  @Nullable
  SqlMinusSign getMinusSign();

  @Nullable
  SqlPlusSign getPlusSign();

}
