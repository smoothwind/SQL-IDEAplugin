// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTransliterationDefinition extends PsiElement {

  @NotNull
  SqlSourceCharacterSetSpecification getSourceCharacterSetSpecification();

  @NotNull
  SqlTargetCharacterSetSpecification getTargetCharacterSetSpecification();

  @NotNull
  SqlTransliterationName getTransliterationName();

  @NotNull
  SqlTransliterationSource getTransliterationSource();

}
