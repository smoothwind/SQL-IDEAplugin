// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharacterSetDefinition extends PsiElement {

  @NotNull
  SqlCharacterSetName getCharacterSetName();

  @NotNull
  SqlCharacterSetSource getCharacterSetSource();

  @Nullable
  SqlCollateClause getCollateClause();

}
