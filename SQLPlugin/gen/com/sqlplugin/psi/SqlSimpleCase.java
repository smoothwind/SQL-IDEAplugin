// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSimpleCase extends PsiElement {

  @NotNull
  SqlCaseOperand getCaseOperand();

  @Nullable
  SqlElseClause getElseClause();

  @NotNull
  SqlSimpleWhenClause getSimpleWhenClause();

}
