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

public class SqlExternallyInvokedProcedureImpl extends ASTWrapperPsiElement implements SqlExternallyInvokedProcedure {

  public SqlExternallyInvokedProcedureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitExternallyInvokedProcedure(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlSQLProcedureStatement getSQLProcedureStatement() {
    return findNotNullChildByClass(SqlSQLProcedureStatement.class);
  }

  @Override
  @NotNull
  public SqlHostParameterDeclarationList getHostParameterDeclarationList() {
    return findNotNullChildByClass(SqlHostParameterDeclarationList.class);
  }

  @Override
  @NotNull
  public SqlProcedureName getProcedureName() {
    return findNotNullChildByClass(SqlProcedureName.class);
  }

  @Override
  @NotNull
  public List<SqlSemicolon> getSemicolonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlSemicolon.class);
  }

}
