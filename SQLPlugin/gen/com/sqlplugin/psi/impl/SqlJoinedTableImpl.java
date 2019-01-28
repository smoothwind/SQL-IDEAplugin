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

public class SqlJoinedTableImpl extends ASTWrapperPsiElement implements SqlJoinedTable {

  public SqlJoinedTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitJoinedTable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCrossJoin getCrossJoin() {
    return findChildByClass(SqlCrossJoin.class);
  }

  @Override
  @Nullable
  public SqlNaturalJoin getNaturalJoin() {
    return findChildByClass(SqlNaturalJoin.class);
  }

  @Override
  @Nullable
  public SqlQualifiedJoin getQualifiedJoin() {
    return findChildByClass(SqlQualifiedJoin.class);
  }

  @Override
  @Nullable
  public SqlUnionJoin getUnionJoin() {
    return findChildByClass(SqlUnionJoin.class);
  }

}
