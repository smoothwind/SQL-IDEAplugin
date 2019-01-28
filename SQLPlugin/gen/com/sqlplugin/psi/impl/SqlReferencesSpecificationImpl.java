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

public class SqlReferencesSpecificationImpl extends ASTWrapperPsiElement implements SqlReferencesSpecification {

  public SqlReferencesSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitReferencesSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlMatchType getMatchType() {
    return findChildByClass(SqlMatchType.class);
  }

  @Override
  @NotNull
  public SqlReferencedTableAndColumns getReferencedTableAndColumns() {
    return findNotNullChildByClass(SqlReferencedTableAndColumns.class);
  }

  @Override
  @Nullable
  public SqlReferentialTriggeredAction getReferentialTriggeredAction() {
    return findChildByClass(SqlReferentialTriggeredAction.class);
  }

}
