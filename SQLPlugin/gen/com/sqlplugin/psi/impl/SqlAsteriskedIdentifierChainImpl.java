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

public class SqlAsteriskedIdentifierChainImpl extends ASTWrapperPsiElement implements SqlAsteriskedIdentifierChain {

  public SqlAsteriskedIdentifierChainImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAsteriskedIdentifierChain(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlAsteriskedIdentifier> getAsteriskedIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlAsteriskedIdentifier.class);
  }

  @Override
  @Nullable
  public SqlPeriod getPeriod() {
    return findChildByClass(SqlPeriod.class);
  }

}
