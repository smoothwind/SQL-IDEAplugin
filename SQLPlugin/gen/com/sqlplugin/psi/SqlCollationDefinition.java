// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCollationDefinition extends PsiElement {

  @NotNull
  SqlCharacterSetSpecification getCharacterSetSpecification();

  @NotNull
  SqlCollationName getCollationName();

  @NotNull
  SqlExistingCollationName getExistingCollationName();

  @Nullable
  SqlPadCharacteristic getPadCharacteristic();

}
