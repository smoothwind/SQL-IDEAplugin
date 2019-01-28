// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlMergeStatement extends PsiElement {

  @Nullable
  SqlMergeCorrelationName getMergeCorrelationName();

  @NotNull
  SqlMergeOperationSpecification getMergeOperationSpecification();

  @NotNull
  SqlSearchCondition getSearchCondition();

  @NotNull
  SqlTableReference getTableReference();

  @NotNull
  SqlTargetTable getTargetTable();

}
