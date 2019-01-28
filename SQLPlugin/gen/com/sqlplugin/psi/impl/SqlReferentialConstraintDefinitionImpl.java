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

public class SqlReferentialConstraintDefinitionImpl extends ASTWrapperPsiElement implements SqlReferentialConstraintDefinition {

  public SqlReferentialConstraintDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitReferentialConstraintDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlLeftParen getLeftParen() {
    return findNotNullChildByClass(SqlLeftParen.class);
  }

  @Override
  @NotNull
  public SqlReferencesSpecification getReferencesSpecification() {
    return findNotNullChildByClass(SqlReferencesSpecification.class);
  }

  @Override
  @NotNull
  public SqlReferencingColumns getReferencingColumns() {
    return findNotNullChildByClass(SqlReferencingColumns.class);
  }

  @Override
  @NotNull
  public SqlRightParen getRightParen() {
    return findNotNullChildByClass(SqlRightParen.class);
  }

}
