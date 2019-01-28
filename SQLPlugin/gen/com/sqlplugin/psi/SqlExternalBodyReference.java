// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlExternalBodyReference extends PsiElement {

  @Nullable
  SqlExternalRoutineName getExternalRoutineName();

  @Nullable
  SqlExternalSecurityClause getExternalSecurityClause();

  @Nullable
  SqlParameterStyleClause getParameterStyleClause();

  @Nullable
  SqlTransformGroupSpecification getTransformGroupSpecification();

}
