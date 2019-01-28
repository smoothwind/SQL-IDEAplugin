// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharacterEnumeration extends PsiElement {

  @Nullable
  SqlCharacterSpecifier getCharacterSpecifier();

  @NotNull
  List<SqlColon> getColonList();

  @Nullable
  SqlLeftBracket getLeftBracket();

  @Nullable
  SqlMinusSign getMinusSign();

  @Nullable
  SqlRegularCharacterSetIdentifier getRegularCharacterSetIdentifier();

}
