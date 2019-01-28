// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCVARCHARVariable extends PsiElement {

  @NotNull
  List<SqlCArraySpecification> getCArraySpecificationList();

  @NotNull
  List<SqlCHostIdentifier> getCHostIdentifierList();

  @NotNull
  List<SqlCInitialValue> getCInitialValueList();

  @Nullable
  SqlCharacterSetSpecification getCharacterSetSpecification();

  @Nullable
  SqlComma getComma();

}
