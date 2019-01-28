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

public class SqlAlterTypeActionImpl extends ASTWrapperPsiElement implements SqlAlterTypeAction {

  public SqlAlterTypeActionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterTypeAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAddAttributeDefinition getAddAttributeDefinition() {
    return findChildByClass(SqlAddAttributeDefinition.class);
  }

  @Override
  @Nullable
  public SqlAddOriginalMethodSpecification getAddOriginalMethodSpecification() {
    return findChildByClass(SqlAddOriginalMethodSpecification.class);
  }

  @Override
  @Nullable
  public SqlAddOverridingMethodSpecification getAddOverridingMethodSpecification() {
    return findChildByClass(SqlAddOverridingMethodSpecification.class);
  }

  @Override
  @Nullable
  public SqlDropAttributeDefinition getDropAttributeDefinition() {
    return findChildByClass(SqlDropAttributeDefinition.class);
  }

  @Override
  @Nullable
  public SqlDropMethodSpecification getDropMethodSpecification() {
    return findChildByClass(SqlDropMethodSpecification.class);
  }

}
