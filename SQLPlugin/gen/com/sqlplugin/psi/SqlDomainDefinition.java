// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDomainDefinition extends PsiElement {

  @Nullable
  SqlCollateClause getCollateClause();

  @NotNull
  SqlDataType getDataType();

  @Nullable
  SqlDefaultClause getDefaultClause();

  @Nullable
  SqlDomainConstraint getDomainConstraint();

  @NotNull
  SqlDomainName getDomainName();

}
