// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLClientModuleDefinition extends PsiElement {

  @NotNull
  SqlLanguageClause getLanguageClause();

  @NotNull
  SqlModuleAuthorizationClause getModuleAuthorizationClause();

  @NotNull
  SqlModuleContents getModuleContents();

  @NotNull
  SqlModuleNameClause getModuleNameClause();

  @Nullable
  SqlModulePathSpecification getModulePathSpecification();

  @Nullable
  SqlModuleTransformGroupSpecification getModuleTransformGroupSpecification();

  @Nullable
  SqlTemporaryTableDeclaration getTemporaryTableDeclaration();

}
