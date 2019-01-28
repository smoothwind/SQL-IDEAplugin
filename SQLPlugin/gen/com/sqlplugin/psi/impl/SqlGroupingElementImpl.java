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

public class SqlGroupingElementImpl extends ASTWrapperPsiElement implements SqlGroupingElement {

  public SqlGroupingElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitGroupingElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCubeList getCubeList() {
    return findChildByClass(SqlCubeList.class);
  }

  @Override
  @Nullable
  public SqlEmptyGroupingSet getEmptyGroupingSet() {
    return findChildByClass(SqlEmptyGroupingSet.class);
  }

  @Override
  @Nullable
  public SqlGroupingSetsSpecification getGroupingSetsSpecification() {
    return findChildByClass(SqlGroupingSetsSpecification.class);
  }

  @Override
  @Nullable
  public SqlOrdinaryGroupingSet getOrdinaryGroupingSet() {
    return findChildByClass(SqlOrdinaryGroupingSet.class);
  }

  @Override
  @Nullable
  public SqlRollupList getRollupList() {
    return findChildByClass(SqlRollupList.class);
  }

}
