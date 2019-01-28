// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSortSpecification extends PsiElement {

  @Nullable
  SqlNullOrdering getNullOrdering();

  @Nullable
  SqlOrderingSpecification getOrderingSpecification();

  @NotNull
  SqlSortKey getSortKey();

}
