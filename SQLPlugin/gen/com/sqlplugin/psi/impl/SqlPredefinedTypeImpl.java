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

public class SqlPredefinedTypeImpl extends ASTWrapperPsiElement implements SqlPredefinedType {

  public SqlPredefinedTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitPredefinedType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBinaryLargeObjectStringType getBinaryLargeObjectStringType() {
    return findChildByClass(SqlBinaryLargeObjectStringType.class);
  }

  @Override
  @Nullable
  public SqlBooleanType getBooleanType() {
    return findChildByClass(SqlBooleanType.class);
  }

  @Override
  @Nullable
  public SqlCharacterSetSpecification getCharacterSetSpecification() {
    return findChildByClass(SqlCharacterSetSpecification.class);
  }

  @Override
  @Nullable
  public SqlCharacterStringType getCharacterStringType() {
    return findChildByClass(SqlCharacterStringType.class);
  }

  @Override
  @Nullable
  public SqlCollateClause getCollateClause() {
    return findChildByClass(SqlCollateClause.class);
  }

  @Override
  @Nullable
  public SqlDatetimeType getDatetimeType() {
    return findChildByClass(SqlDatetimeType.class);
  }

  @Override
  @Nullable
  public SqlIntervalType getIntervalType() {
    return findChildByClass(SqlIntervalType.class);
  }

  @Override
  @Nullable
  public SqlNationalCharacterStringType getNationalCharacterStringType() {
    return findChildByClass(SqlNationalCharacterStringType.class);
  }

  @Override
  @Nullable
  public SqlNumericType getNumericType() {
    return findChildByClass(SqlNumericType.class);
  }

}
