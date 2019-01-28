// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCUserDefinedTypeVariable extends PsiElement {

  @NotNull
  List<SqlCHostIdentifier> getCHostIdentifierList();

  @NotNull
  List<SqlCInitialValue> getCInitialValueList();

  @Nullable
  SqlComma getComma();

  @NotNull
  SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName();

  @NotNull
  SqlPredefinedType getPredefinedType();

}
