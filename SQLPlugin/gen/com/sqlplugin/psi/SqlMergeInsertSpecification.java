// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlMergeInsertSpecification extends PsiElement {

  @Nullable
  SqlInsertColumnList getInsertColumnList();

  @Nullable
  SqlLeftParen getLeftParen();

  @NotNull
  SqlMergeInsertValueList getMergeInsertValueList();

  @Nullable
  SqlOverrideClause getOverrideClause();

  @Nullable
  SqlRightParen getRightParen();

}
