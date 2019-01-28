// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAlterColumnAction extends PsiElement {

  @Nullable
  SqlAddColumnScopeClause getAddColumnScopeClause();

  @Nullable
  SqlAlterIdentityColumnSpecification getAlterIdentityColumnSpecification();

  @Nullable
  SqlDropColumnDefaultClause getDropColumnDefaultClause();

  @Nullable
  SqlDropColumnScopeClause getDropColumnScopeClause();

  @Nullable
  SqlSetColumnDefaultClause getSetColumnDefaultClause();

}
