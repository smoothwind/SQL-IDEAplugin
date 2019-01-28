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

public class SqlCaseExpressionImpl extends ASTWrapperPsiElement implements SqlCaseExpression {

  public SqlCaseExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCaseExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCaseAbbreviation getCaseAbbreviation() {
    return findChildByClass(SqlCaseAbbreviation.class);
  }

  @Override
  @Nullable
  public SqlCaseSpecification getCaseSpecification() {
    return findChildByClass(SqlCaseSpecification.class);
  }

}
