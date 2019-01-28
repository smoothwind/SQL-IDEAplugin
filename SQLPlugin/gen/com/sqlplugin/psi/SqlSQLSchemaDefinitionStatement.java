// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLSchemaDefinitionStatement extends PsiElement {

  @Nullable
  SqlSQLInvokedRoutine getSQLInvokedRoutine();

  @Nullable
  SqlAssertionDefinition getAssertionDefinition();

  @Nullable
  SqlCharacterSetDefinition getCharacterSetDefinition();

  @Nullable
  SqlCollationDefinition getCollationDefinition();

  @Nullable
  SqlDomainDefinition getDomainDefinition();

  @Nullable
  SqlGrantStatement getGrantStatement();

  @Nullable
  SqlRoleDefinition getRoleDefinition();

  @Nullable
  SqlSchemaDefinition getSchemaDefinition();

  @Nullable
  SqlSequenceGeneratorDefinition getSequenceGeneratorDefinition();

  @Nullable
  SqlTableDefinition getTableDefinition();

  @Nullable
  SqlTransformDefinition getTransformDefinition();

  @Nullable
  SqlTransliterationDefinition getTransliterationDefinition();

  @Nullable
  SqlTriggerDefinition getTriggerDefinition();

  @Nullable
  SqlUserDefinedCastDefinition getUserDefinedCastDefinition();

  @Nullable
  SqlUserDefinedOrderingDefinition getUserDefinedOrderingDefinition();

  @Nullable
  SqlUserDefinedTypeDefinition getUserDefinedTypeDefinition();

  @Nullable
  SqlViewDefinition getViewDefinition();

}
