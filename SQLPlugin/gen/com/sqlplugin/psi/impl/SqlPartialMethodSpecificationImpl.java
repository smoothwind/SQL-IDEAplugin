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

public class SqlPartialMethodSpecificationImpl extends ASTWrapperPsiElement implements SqlPartialMethodSpecification {

  public SqlPartialMethodSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitPartialMethodSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlSQLParameterDeclarationList getSQLParameterDeclarationList() {
    return findNotNullChildByClass(SqlSQLParameterDeclarationList.class);
  }

  @Override
  @NotNull
  public SqlMethodName getMethodName() {
    return findNotNullChildByClass(SqlMethodName.class);
  }

  @Override
  @NotNull
  public SqlReturnsClause getReturnsClause() {
    return findNotNullChildByClass(SqlReturnsClause.class);
  }

  @Override
  @Nullable
  public SqlSpecificMethodName getSpecificMethodName() {
    return findChildByClass(SqlSpecificMethodName.class);
  }

}
