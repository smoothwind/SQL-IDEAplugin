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

public class SqlContextuallyTypedRowValueConstructorImpl extends ASTWrapperPsiElement implements SqlContextuallyTypedRowValueConstructor {

  public SqlContextuallyTypedRowValueConstructorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitContextuallyTypedRowValueConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBooleanValueExpression getBooleanValueExpression() {
    return findChildByClass(SqlBooleanValueExpression.class);
  }

  @Override
  @Nullable
  public SqlComma getComma() {
    return findChildByClass(SqlComma.class);
  }

  @Override
  @Nullable
  public SqlCommonValueExpression getCommonValueExpression() {
    return findChildByClass(SqlCommonValueExpression.class);
  }

  @Override
  @Nullable
  public SqlContextuallyTypedRowValueConstructorElement getContextuallyTypedRowValueConstructorElement() {
    return findChildByClass(SqlContextuallyTypedRowValueConstructorElement.class);
  }

  @Override
  @Nullable
  public SqlContextuallyTypedRowValueConstructorElementList getContextuallyTypedRowValueConstructorElementList() {
    return findChildByClass(SqlContextuallyTypedRowValueConstructorElementList.class);
  }

  @Override
  @Nullable
  public SqlContextuallyTypedValueSpecification getContextuallyTypedValueSpecification() {
    return findChildByClass(SqlContextuallyTypedValueSpecification.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

}
