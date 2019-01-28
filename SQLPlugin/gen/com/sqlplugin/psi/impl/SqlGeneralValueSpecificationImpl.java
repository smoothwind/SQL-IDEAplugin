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

public class SqlGeneralValueSpecificationImpl extends ASTWrapperPsiElement implements SqlGeneralValueSpecification {

  public SqlGeneralValueSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitGeneralValueSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLParameterReference getSQLParameterReference() {
    return findChildByClass(SqlSQLParameterReference.class);
  }

  @Override
  @Nullable
  public SqlCurrentCollationSpecification getCurrentCollationSpecification() {
    return findChildByClass(SqlCurrentCollationSpecification.class);
  }

  @Override
  @Nullable
  public SqlDynamicParameterSpecification getDynamicParameterSpecification() {
    return findChildByClass(SqlDynamicParameterSpecification.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedVariableSpecification getEmbeddedVariableSpecification() {
    return findChildByClass(SqlEmbeddedVariableSpecification.class);
  }

  @Override
  @Nullable
  public SqlHostParameterSpecification getHostParameterSpecification() {
    return findChildByClass(SqlHostParameterSpecification.class);
  }

  @Override
  @Nullable
  public SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName() {
    return findChildByClass(SqlPathResolvedUserDefinedTypeName.class);
  }

}
