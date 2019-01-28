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

public class SqlDomainDefinitionImpl extends ASTWrapperPsiElement implements SqlDomainDefinition {

  public SqlDomainDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDomainDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCollateClause getCollateClause() {
    return findChildByClass(SqlCollateClause.class);
  }

  @Override
  @NotNull
  public SqlDataType getDataType() {
    return findNotNullChildByClass(SqlDataType.class);
  }

  @Override
  @Nullable
  public SqlDefaultClause getDefaultClause() {
    return findChildByClass(SqlDefaultClause.class);
  }

  @Override
  @Nullable
  public SqlDomainConstraint getDomainConstraint() {
    return findChildByClass(SqlDomainConstraint.class);
  }

  @Override
  @NotNull
  public SqlDomainName getDomainName() {
    return findNotNullChildByClass(SqlDomainName.class);
  }

}
