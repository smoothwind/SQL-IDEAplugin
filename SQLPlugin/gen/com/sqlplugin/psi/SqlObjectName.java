// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlObjectName extends PsiElement {

  @Nullable
  SqlCharacterSetName getCharacterSetName();

  @Nullable
  SqlCollationName getCollationName();

  @Nullable
  SqlDomainName getDomainName();

  @Nullable
  SqlSchemaResolvedUserDefinedTypeName getSchemaResolvedUserDefinedTypeName();

  @Nullable
  SqlSequenceGeneratorName getSequenceGeneratorName();

  @Nullable
  SqlSpecificRoutineDesignator getSpecificRoutineDesignator();

  @Nullable
  SqlTableName getTableName();

  @Nullable
  SqlTransliterationName getTransliterationName();

}
