// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlWindowSpecificationDetails extends PsiElement {

  @Nullable
  SqlExistingWindowName getExistingWindowName();

  @Nullable
  SqlWindowFrameClause getWindowFrameClause();

  @Nullable
  SqlWindowOrderClause getWindowOrderClause();

  @Nullable
  SqlWindowPartitionClause getWindowPartitionClause();

}
