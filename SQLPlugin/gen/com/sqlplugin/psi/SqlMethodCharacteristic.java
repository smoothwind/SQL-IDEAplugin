// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlMethodCharacteristic extends PsiElement {

  @Nullable
  SqlSQLDataAccessIndication getSQLDataAccessIndication();

  @Nullable
  SqlDeterministicCharacteristic getDeterministicCharacteristic();

  @Nullable
  SqlLanguageClause getLanguageClause();

  @Nullable
  SqlNullCallClause getNullCallClause();

  @Nullable
  SqlParameterStyleClause getParameterStyleClause();

}
