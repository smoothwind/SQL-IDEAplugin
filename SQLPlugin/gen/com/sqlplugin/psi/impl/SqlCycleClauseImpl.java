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

public class SqlCycleClauseImpl extends ASTWrapperPsiElement implements SqlCycleClause {

  public SqlCycleClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCycleClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlCycleColumnList getCycleColumnList() {
    return findNotNullChildByClass(SqlCycleColumnList.class);
  }

  @Override
  @NotNull
  public SqlCycleMarkColumn getCycleMarkColumn() {
    return findNotNullChildByClass(SqlCycleMarkColumn.class);
  }

  @Override
  @NotNull
  public SqlCycleMarkValue getCycleMarkValue() {
    return findNotNullChildByClass(SqlCycleMarkValue.class);
  }

  @Override
  @NotNull
  public SqlNonCycleMarkValue getNonCycleMarkValue() {
    return findNotNullChildByClass(SqlNonCycleMarkValue.class);
  }

  @Override
  @NotNull
  public SqlPathColumn getPathColumn() {
    return findNotNullChildByClass(SqlPathColumn.class);
  }

}
