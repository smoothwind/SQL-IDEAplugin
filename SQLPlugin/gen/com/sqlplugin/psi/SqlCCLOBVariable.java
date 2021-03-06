// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCCLOBVariable extends PsiElement {

  @NotNull
  List<SqlCHostIdentifier> getCHostIdentifierList();

  @NotNull
  List<SqlCInitialValue> getCInitialValueList();

  @Nullable
  SqlCharacterSetSpecification getCharacterSetSpecification();

  @Nullable
  SqlComma getComma();

  @NotNull
  SqlLargeObjectLength getLargeObjectLength();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
