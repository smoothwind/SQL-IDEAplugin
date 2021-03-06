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

public class SqlNonJoinQueryExpressionImpl extends ASTWrapperPsiElement implements SqlNonJoinQueryExpression {

  public SqlNonJoinQueryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitNonJoinQueryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCorrespondingSpec getCorrespondingSpec() {
    return findChildByClass(SqlCorrespondingSpec.class);
  }

  @Override
  @Nullable
  public SqlNonJoinQueryTerm getNonJoinQueryTerm() {
    return findChildByClass(SqlNonJoinQueryTerm.class);
  }

  @Override
  @Nullable
  public SqlQueryExpressionBody getQueryExpressionBody() {
    return findChildByClass(SqlQueryExpressionBody.class);
  }

  @Override
  @Nullable
  public SqlQueryTerm getQueryTerm() {
    return findChildByClass(SqlQueryTerm.class);
  }

}
