// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlRoutineCharacteristic extends PsiElement {

  @Nullable
  SqlSQLDataAccessIndication getSQLDataAccessIndication();

  @Nullable
  SqlDeterministicCharacteristic getDeterministicCharacteristic();

  @Nullable
  SqlDynamicResultSetsCharacteristic getDynamicResultSetsCharacteristic();

  @Nullable
  SqlLanguageClause getLanguageClause();

  @Nullable
  SqlNullCallClause getNullCallClause();

  @Nullable
  SqlParameterStyleClause getParameterStyleClause();

  @Nullable
  SqlSavepointLevelIndication getSavepointLevelIndication();

  @Nullable
  SqlSpecificName getSpecificName();

}
