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

public class SqlColumnDefinitionImpl extends ASTWrapperPsiElement implements SqlColumnDefinition {

  public SqlColumnDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitColumnDefinition(this);
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
  @Nullable
  public SqlColumnConstraintDefinition getColumnConstraintDefinition() {
    return findChildByClass(SqlColumnConstraintDefinition.class);
  }

  @Override
  @NotNull
  public SqlColumnName getColumnName() {
    return findNotNullChildByClass(SqlColumnName.class);
  }

  @Override
  @Nullable
  public SqlDataType getDataType() {
    return findChildByClass(SqlDataType.class);
  }

  @Override
  @Nullable
  public SqlDefaultClause getDefaultClause() {
    return findChildByClass(SqlDefaultClause.class);
  }

  @Override
  @Nullable
  public SqlDomainName getDomainName() {
    return findChildByClass(SqlDomainName.class);
  }

  @Override
  @Nullable
  public SqlGenerationClause getGenerationClause() {
    return findChildByClass(SqlGenerationClause.class);
  }

  @Override
  @Nullable
  public SqlIdentityColumnSpecification getIdentityColumnSpecification() {
    return findChildByClass(SqlIdentityColumnSpecification.class);
  }

  @Override
  @Nullable
  public SqlReferenceScopeCheck getReferenceScopeCheck() {
    return findChildByClass(SqlReferenceScopeCheck.class);
  }

}
