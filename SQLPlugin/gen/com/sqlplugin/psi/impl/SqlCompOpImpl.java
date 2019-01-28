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

public class SqlCompOpImpl extends ASTWrapperPsiElement implements SqlCompOp {

  public SqlCompOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCompOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlEqualsOperator getEqualsOperator() {
    return findChildByClass(SqlEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlGreaterThanOperator getGreaterThanOperator() {
    return findChildByClass(SqlGreaterThanOperator.class);
  }

  @Override
  @Nullable
  public SqlGreaterThanOrEqualsOperator getGreaterThanOrEqualsOperator() {
    return findChildByClass(SqlGreaterThanOrEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlLessThanOperator getLessThanOperator() {
    return findChildByClass(SqlLessThanOperator.class);
  }

  @Override
  @Nullable
  public SqlLessThanOrEqualsOperator getLessThanOrEqualsOperator() {
    return findChildByClass(SqlLessThanOrEqualsOperator.class);
  }

  @Override
  @Nullable
  public SqlNotEqualsOperator getNotEqualsOperator() {
    return findChildByClass(SqlNotEqualsOperator.class);
  }

}
