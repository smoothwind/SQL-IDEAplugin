// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlNonparenthesizedValueExpressionPrimary extends PsiElement {

  @Nullable
  SqlArrayElementReference getArrayElementReference();

  @Nullable
  SqlAttributeOrMethodReference getAttributeOrMethodReference();

  @Nullable
  SqlCaseExpression getCaseExpression();

  @Nullable
  SqlCastSpecification getCastSpecification();

  @Nullable
  SqlCollectionValueConstructor getCollectionValueConstructor();

  @Nullable
  SqlColumnReference getColumnReference();

  @Nullable
  SqlFieldReference getFieldReference();

  @Nullable
  SqlMethodInvocation getMethodInvocation();

  @Nullable
  SqlMultisetElementReference getMultisetElementReference();

  @Nullable
  SqlNewSpecification getNewSpecification();

  @Nullable
  SqlNextValueExpression getNextValueExpression();

  @Nullable
  SqlReferenceResolution getReferenceResolution();

  @Nullable
  SqlRoutineInvocation getRoutineInvocation();

  @Nullable
  SqlScalarSubquery getScalarSubquery();

  @Nullable
  SqlSetFunctionSpecification getSetFunctionSpecification();

  @Nullable
  SqlStaticMethodInvocation getStaticMethodInvocation();

  @Nullable
  SqlSubtypeTreatment getSubtypeTreatment();

  @Nullable
  SqlUnsignedValueSpecification getUnsignedValueSpecification();

  @Nullable
  SqlWindowFunction getWindowFunction();

}
