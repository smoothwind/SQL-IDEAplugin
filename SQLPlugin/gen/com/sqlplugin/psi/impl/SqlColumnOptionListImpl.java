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

public class SqlColumnOptionListImpl extends ASTWrapperPsiElement implements SqlColumnOptionList {

  public SqlColumnOptionListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitColumnOptionList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlColumnConstraintDefinition getColumnConstraintDefinition() {
    return findChildByClass(SqlColumnConstraintDefinition.class);
  }

  @Override
  @Nullable
  public SqlDefaultClause getDefaultClause() {
    return findChildByClass(SqlDefaultClause.class);
  }

  @Override
  @Nullable
  public SqlScopeClause getScopeClause() {
    return findChildByClass(SqlScopeClause.class);
  }

}
