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

public class SqlSQLClientModuleDefinitionImpl extends ASTWrapperPsiElement implements SqlSQLClientModuleDefinition {

  public SqlSQLClientModuleDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLClientModuleDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlLanguageClause getLanguageClause() {
    return findNotNullChildByClass(SqlLanguageClause.class);
  }

  @Override
  @NotNull
  public SqlModuleAuthorizationClause getModuleAuthorizationClause() {
    return findNotNullChildByClass(SqlModuleAuthorizationClause.class);
  }

  @Override
  @NotNull
  public SqlModuleContents getModuleContents() {
    return findNotNullChildByClass(SqlModuleContents.class);
  }

  @Override
  @NotNull
  public SqlModuleNameClause getModuleNameClause() {
    return findNotNullChildByClass(SqlModuleNameClause.class);
  }

  @Override
  @Nullable
  public SqlModulePathSpecification getModulePathSpecification() {
    return findChildByClass(SqlModulePathSpecification.class);
  }

  @Override
  @Nullable
  public SqlModuleTransformGroupSpecification getModuleTransformGroupSpecification() {
    return findChildByClass(SqlModuleTransformGroupSpecification.class);
  }

  @Override
  @Nullable
  public SqlTemporaryTableDeclaration getTemporaryTableDeclaration() {
    return findChildByClass(SqlTemporaryTableDeclaration.class);
  }

}
