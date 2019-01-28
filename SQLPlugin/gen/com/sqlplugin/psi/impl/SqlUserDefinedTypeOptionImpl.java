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

public class SqlUserDefinedTypeOptionImpl extends ASTWrapperPsiElement implements SqlUserDefinedTypeOption {

  public SqlUserDefinedTypeOptionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitUserDefinedTypeOption(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCastOption getCastOption() {
    return findChildByClass(SqlCastOption.class);
  }

  @Override
  @Nullable
  public SqlFinality getFinality() {
    return findChildByClass(SqlFinality.class);
  }

  @Override
  @Nullable
  public SqlInstantiableClause getInstantiableClause() {
    return findChildByClass(SqlInstantiableClause.class);
  }

  @Override
  @Nullable
  public SqlRefCastOption getRefCastOption() {
    return findChildByClass(SqlRefCastOption.class);
  }

  @Override
  @Nullable
  public SqlReferenceTypeSpecification getReferenceTypeSpecification() {
    return findChildByClass(SqlReferenceTypeSpecification.class);
  }

}
