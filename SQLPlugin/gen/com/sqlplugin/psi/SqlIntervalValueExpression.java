// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlIntervalValueExpression extends PsiElement {

  @Nullable
  SqlDatetimeTerm getDatetimeTerm();

  @Nullable
  SqlDatetimeValueExpression getDatetimeValueExpression();

  @Nullable
  SqlIntervalQualifier getIntervalQualifier();

  @Nullable
  SqlIntervalTerm getIntervalTerm();

  @Nullable
  SqlIntervalTerm1 getIntervalTerm1();

  @Nullable
  SqlIntervalValueExpression1 getIntervalValueExpression1();

  @Nullable
  SqlLeftParen getLeftParen();

  @Nullable
  SqlMinusSign getMinusSign();

  @Nullable
  SqlPlusSign getPlusSign();

  @Nullable
  SqlRightParen getRightParen();

}
