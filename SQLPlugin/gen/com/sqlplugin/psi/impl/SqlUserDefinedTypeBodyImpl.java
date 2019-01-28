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

public class SqlUserDefinedTypeBodyImpl extends ASTWrapperPsiElement implements SqlUserDefinedTypeBody {

  public SqlUserDefinedTypeBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitUserDefinedTypeBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlMethodSpecificationList getMethodSpecificationList() {
    return findChildByClass(SqlMethodSpecificationList.class);
  }

  @Override
  @Nullable
  public SqlRepresentation getRepresentation() {
    return findChildByClass(SqlRepresentation.class);
  }

  @Override
  @NotNull
  public SqlSchemaResolvedUserDefinedTypeName getSchemaResolvedUserDefinedTypeName() {
    return findNotNullChildByClass(SqlSchemaResolvedUserDefinedTypeName.class);
  }

  @Override
  @Nullable
  public SqlSubtypeClause getSubtypeClause() {
    return findChildByClass(SqlSubtypeClause.class);
  }

  @Override
  @Nullable
  public SqlUserDefinedTypeOptionList getUserDefinedTypeOptionList() {
    return findChildByClass(SqlUserDefinedTypeOptionList.class);
  }

}
