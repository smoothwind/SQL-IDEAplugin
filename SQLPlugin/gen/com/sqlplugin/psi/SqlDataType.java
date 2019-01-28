// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDataType extends PsiElement {

  @Nullable
  SqlCollectionType getCollectionType();

  @Nullable
  SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName();

  @Nullable
  SqlPredefinedType getPredefinedType();

  @Nullable
  SqlReferenceType getReferenceType();

  @Nullable
  SqlRowType getRowType();

}
