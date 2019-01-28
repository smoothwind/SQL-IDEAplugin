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

public class SqlDataTypeImpl extends ASTWrapperPsiElement implements SqlDataType {

  public SqlDataTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDataType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCollectionType getCollectionType() {
    return findChildByClass(SqlCollectionType.class);
  }

  @Override
  @Nullable
  public SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName() {
    return findChildByClass(SqlPathResolvedUserDefinedTypeName.class);
  }

  @Override
  @Nullable
  public SqlPredefinedType getPredefinedType() {
    return findChildByClass(SqlPredefinedType.class);
  }

  @Override
  @Nullable
  public SqlReferenceType getReferenceType() {
    return findChildByClass(SqlReferenceType.class);
  }

  @Override
  @Nullable
  public SqlRowType getRowType() {
    return findChildByClass(SqlRowType.class);
  }

}
