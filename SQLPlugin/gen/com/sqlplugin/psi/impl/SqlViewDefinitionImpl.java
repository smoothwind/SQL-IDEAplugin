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

public class SqlViewDefinitionImpl extends ASTWrapperPsiElement implements SqlViewDefinition {

  public SqlViewDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitViewDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlLevelsClause getLevelsClause() {
    return findChildByClass(SqlLevelsClause.class);
  }

  @Override
  @NotNull
  public SqlQueryExpression getQueryExpression() {
    return findNotNullChildByClass(SqlQueryExpression.class);
  }

  @Override
  @NotNull
  public SqlTableName getTableName() {
    return findNotNullChildByClass(SqlTableName.class);
  }

  @Override
  @NotNull
  public SqlViewSpecification getViewSpecification() {
    return findNotNullChildByClass(SqlViewSpecification.class);
  }

}
