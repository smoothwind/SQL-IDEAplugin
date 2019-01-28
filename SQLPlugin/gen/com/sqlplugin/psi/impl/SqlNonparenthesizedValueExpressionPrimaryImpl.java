// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sqlplugin.psi.SqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.sqlplugin.psi.*;

public class SqlNonparenthesizedValueExpressionPrimaryImpl extends ASTWrapperPsiElement implements SqlNonparenthesizedValueExpressionPrimary {

  public SqlNonparenthesizedValueExpressionPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitNonparenthesizedValueExpressionPrimary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlArrayElementReference getArrayElementReference() {
    return findChildByClass(SqlArrayElementReference.class);
  }

  @Override
  @Nullable
  public SqlAttributeOrMethodReference getAttributeOrMethodReference() {
    return findChildByClass(SqlAttributeOrMethodReference.class);
  }

  @Override
  @Nullable
  public SqlCaseExpression getCaseExpression() {
    return findChildByClass(SqlCaseExpression.class);
  }

  @Override
  @Nullable
  public SqlCastSpecification getCastSpecification() {
    return findChildByClass(SqlCastSpecification.class);
  }

  @Override
  @Nullable
  public SqlCollectionValueConstructor getCollectionValueConstructor() {
    return findChildByClass(SqlCollectionValueConstructor.class);
  }

  @Override
  @Nullable
  public SqlColumnReference getColumnReference() {
    return findChildByClass(SqlColumnReference.class);
  }

  @Override
  @Nullable
  public SqlFieldReference getFieldReference() {
    return findChildByClass(SqlFieldReference.class);
  }

  @Override
  @Nullable
  public SqlMethodInvocation getMethodInvocation() {
    return findChildByClass(SqlMethodInvocation.class);
  }

  @Override
  @Nullable
  public SqlMultisetElementReference getMultisetElementReference() {
    return findChildByClass(SqlMultisetElementReference.class);
  }

  @Override
  @Nullable
  public SqlNewSpecification getNewSpecification() {
    return findChildByClass(SqlNewSpecification.class);
  }

  @Override
  @Nullable
  public SqlNextValueExpression getNextValueExpression() {
    return findChildByClass(SqlNextValueExpression.class);
  }

  @Override
  @Nullable
  public SqlReferenceResolution getReferenceResolution() {
    return findChildByClass(SqlReferenceResolution.class);
  }

  @Override
  @Nullable
  public SqlRoutineInvocation getRoutineInvocation() {
    return findChildByClass(SqlRoutineInvocation.class);
  }

  @Override
  @Nullable
  public SqlScalarSubquery getScalarSubquery() {
    return findChildByClass(SqlScalarSubquery.class);
  }

  @Override
  @Nullable
  public SqlSetFunctionSpecification getSetFunctionSpecification() {
    return findChildByClass(SqlSetFunctionSpecification.class);
  }

  @Override
  @Nullable
  public SqlStaticMethodInvocation getStaticMethodInvocation() {
    return findChildByClass(SqlStaticMethodInvocation.class);
  }

  @Override
  @Nullable
  public SqlSubtypeTreatment getSubtypeTreatment() {
    return findChildByClass(SqlSubtypeTreatment.class);
  }

  @Override
  @Nullable
  public SqlUnsignedValueSpecification getUnsignedValueSpecification() {
    return findChildByClass(SqlUnsignedValueSpecification.class);
  }

  @Override
  @Nullable
  public SqlWindowFunction getWindowFunction() {
    return findChildByClass(SqlWindowFunction.class);
  }

}
