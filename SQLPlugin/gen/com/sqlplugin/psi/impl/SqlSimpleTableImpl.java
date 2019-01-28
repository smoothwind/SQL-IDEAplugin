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

public class SqlSimpleTableImpl extends ASTWrapperPsiElement implements SqlSimpleTable {

  public SqlSimpleTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSimpleTable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlExplicitTable getExplicitTable() {
    return findChildByClass(SqlExplicitTable.class);
  }

  @Override
  @Nullable
  public SqlQuerySpecification getQuerySpecification() {
    return findChildByClass(SqlQuerySpecification.class);
  }

  @Override
  @Nullable
  public SqlTableValueConstructor getTableValueConstructor() {
    return findChildByClass(SqlTableValueConstructor.class);
  }

}
