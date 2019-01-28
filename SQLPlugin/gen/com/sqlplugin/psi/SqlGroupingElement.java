// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlGroupingElement extends PsiElement {

  @Nullable
  SqlCubeList getCubeList();

  @Nullable
  SqlEmptyGroupingSet getEmptyGroupingSet();

  @Nullable
  SqlGroupingSetsSpecification getGroupingSetsSpecification();

  @Nullable
  SqlOrdinaryGroupingSet getOrdinaryGroupingSet();

  @Nullable
  SqlRollupList getRollupList();

}
