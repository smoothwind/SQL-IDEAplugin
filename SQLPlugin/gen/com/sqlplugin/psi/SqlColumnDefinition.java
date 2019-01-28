// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlColumnDefinition extends PsiElement {

  @Nullable
  SqlCollateClause getCollateClause();

  @Nullable
  SqlColumnConstraintDefinition getColumnConstraintDefinition();

  @NotNull
  SqlColumnName getColumnName();

  @Nullable
  SqlDataType getDataType();

  @Nullable
  SqlDefaultClause getDefaultClause();

  @Nullable
  SqlDomainName getDomainName();

  @Nullable
  SqlGenerationClause getGenerationClause();

  @Nullable
  SqlIdentityColumnSpecification getIdentityColumnSpecification();

  @Nullable
  SqlReferenceScopeCheck getReferenceScopeCheck();

}
