// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLSchemaManipulationStatement extends PsiElement {

  @Nullable
  SqlAlterDomainStatement getAlterDomainStatement();

  @Nullable
  SqlAlterRoutineStatement getAlterRoutineStatement();

  @Nullable
  SqlAlterSequenceGeneratorStatement getAlterSequenceGeneratorStatement();

  @Nullable
  SqlAlterTableStatement getAlterTableStatement();

  @Nullable
  SqlAlterTransformStatement getAlterTransformStatement();

  @Nullable
  SqlAlterTypeStatement getAlterTypeStatement();

  @Nullable
  SqlDropAssertionStatement getDropAssertionStatement();

  @Nullable
  SqlDropCharacterSetStatement getDropCharacterSetStatement();

  @Nullable
  SqlDropCollationStatement getDropCollationStatement();

  @Nullable
  SqlDropDataTypeStatement getDropDataTypeStatement();

  @Nullable
  SqlDropDomainStatement getDropDomainStatement();

  @Nullable
  SqlDropRoleStatement getDropRoleStatement();

  @Nullable
  SqlDropRoutineStatement getDropRoutineStatement();

  @Nullable
  SqlDropSchemaStatement getDropSchemaStatement();

  @Nullable
  SqlDropSequenceGeneratorStatement getDropSequenceGeneratorStatement();

  @Nullable
  SqlDropTableStatement getDropTableStatement();

  @Nullable
  SqlDropTransformStatement getDropTransformStatement();

  @Nullable
  SqlDropTransliterationStatement getDropTransliterationStatement();

  @Nullable
  SqlDropTriggerStatement getDropTriggerStatement();

  @Nullable
  SqlDropUserDefinedCastStatement getDropUserDefinedCastStatement();

  @Nullable
  SqlDropUserDefinedOrderingStatement getDropUserDefinedOrderingStatement();

  @Nullable
  SqlDropViewStatement getDropViewStatement();

  @Nullable
  SqlRevokeStatement getRevokeStatement();

}
