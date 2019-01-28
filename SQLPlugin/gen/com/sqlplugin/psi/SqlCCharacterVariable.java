// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCCharacterVariable extends PsiElement {

  @NotNull
  List<SqlCArraySpecification> getCArraySpecificationList();

  @NotNull
  SqlCCharacterType getCCharacterType();

  @NotNull
  List<SqlCHostIdentifier> getCHostIdentifierList();

  @NotNull
  List<SqlCInitialValue> getCInitialValueList();

  @Nullable
  SqlCharacterSetSpecification getCharacterSetSpecification();

  @Nullable
  SqlComma getComma();

}
