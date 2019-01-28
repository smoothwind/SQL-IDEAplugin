// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCursorSpecification extends PsiElement {

  @Nullable
  SqlOrderByClause getOrderByClause();

  @NotNull
  SqlQueryExpression getQueryExpression();

  @Nullable
  SqlUpdatabilityClause getUpdatabilityClause();

}
