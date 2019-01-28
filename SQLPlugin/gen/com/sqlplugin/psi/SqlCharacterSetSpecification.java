// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharacterSetSpecification extends PsiElement {

  @Nullable
  SqlImplementationDefinedCharacterSetName getImplementationDefinedCharacterSetName();

  @Nullable
  SqlStandardCharacterSetName getStandardCharacterSetName();

  @Nullable
  SqlUserDefinedCharacterSetName getUserDefinedCharacterSetName();

}
