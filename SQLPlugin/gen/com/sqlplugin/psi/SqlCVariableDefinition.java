// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCVariableDefinition extends PsiElement {

  @Nullable
  SqlCClassModifier getCClassModifier();

  @Nullable
  SqlCStorageClass getCStorageClass();

  @NotNull
  SqlCVariableSpecification getCVariableSpecification();

  @NotNull
  SqlSemicolon getSemicolon();

}
