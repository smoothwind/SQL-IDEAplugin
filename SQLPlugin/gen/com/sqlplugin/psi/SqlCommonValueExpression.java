// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCommonValueExpression extends PsiElement {

  @Nullable
  SqlCollectionValueExpression getCollectionValueExpression();

  @Nullable
  SqlDatetimeValueExpression getDatetimeValueExpression();

  @Nullable
  SqlIntervalValueExpression getIntervalValueExpression();

  @Nullable
  SqlNumericValueExpression getNumericValueExpression();

  @Nullable
  SqlReferenceValueExpression getReferenceValueExpression();

  @Nullable
  SqlStringValueExpression getStringValueExpression();

  @Nullable
  SqlUserDefinedTypeValueExpression getUserDefinedTypeValueExpression();

}
