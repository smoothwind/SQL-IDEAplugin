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

public class SqlSimpleCaseImpl extends ASTWrapperPsiElement implements SqlSimpleCase {

  public SqlSimpleCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSimpleCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlCaseOperand getCaseOperand() {
    return findNotNullChildByClass(SqlCaseOperand.class);
  }

  @Override
  @Nullable
  public SqlElseClause getElseClause() {
    return findChildByClass(SqlElseClause.class);
  }

  @Override
  @NotNull
  public SqlSimpleWhenClause getSimpleWhenClause() {
    return findNotNullChildByClass(SqlSimpleWhenClause.class);
  }

}
