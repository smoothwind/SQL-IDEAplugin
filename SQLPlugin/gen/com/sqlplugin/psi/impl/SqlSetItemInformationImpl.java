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

public class SqlSetItemInformationImpl extends ASTWrapperPsiElement implements SqlSetItemInformation {

  public SqlSetItemInformationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSetItemInformation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDescriptorItemName getDescriptorItemName() {
    return findNotNullChildByClass(SqlDescriptorItemName.class);
  }

  @Override
  @NotNull
  public SqlEqualsOperator getEqualsOperator() {
    return findNotNullChildByClass(SqlEqualsOperator.class);
  }

  @Override
  @NotNull
  public SqlSimpleValueSpecification2 getSimpleValueSpecification2() {
    return findNotNullChildByClass(SqlSimpleValueSpecification2.class);
  }

}
