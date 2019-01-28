// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlUserDefinedTypeBody extends PsiElement {

  @Nullable
  SqlMethodSpecificationList getMethodSpecificationList();

  @Nullable
  SqlRepresentation getRepresentation();

  @NotNull
  SqlSchemaResolvedUserDefinedTypeName getSchemaResolvedUserDefinedTypeName();

  @Nullable
  SqlSubtypeClause getSubtypeClause();

  @Nullable
  SqlUserDefinedTypeOptionList getUserDefinedTypeOptionList();

}
