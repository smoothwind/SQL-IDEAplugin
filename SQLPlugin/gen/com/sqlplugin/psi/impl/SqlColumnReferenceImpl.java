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

public class SqlColumnReferenceImpl extends ASTWrapperPsiElement implements SqlColumnReference {

  public SqlColumnReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitColumnReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBasicIdentifierChain getBasicIdentifierChain() {
    return findChildByClass(SqlBasicIdentifierChain.class);
  }

  @Override
  @Nullable
  public SqlColumnName getColumnName() {
    return findChildByClass(SqlColumnName.class);
  }

  @Override
  @NotNull
  public List<SqlPeriod> getPeriodList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlPeriod.class);
  }

  @Override
  @Nullable
  public SqlQualifiedIdentifier getQualifiedIdentifier() {
    return findChildByClass(SqlQualifiedIdentifier.class);
  }

}
