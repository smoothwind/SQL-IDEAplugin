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

public class SqlStatementOrDeclarationImpl extends ASTWrapperPsiElement implements SqlStatementOrDeclaration {

  public SqlStatementOrDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitStatementOrDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLProcedureStatement getSQLProcedureStatement() {
    return findChildByClass(SqlSQLProcedureStatement.class);
  }

  @Override
  @Nullable
  public SqlDeclareCursor getDeclareCursor() {
    return findChildByClass(SqlDeclareCursor.class);
  }

  @Override
  @Nullable
  public SqlDynamicDeclareCursor getDynamicDeclareCursor() {
    return findChildByClass(SqlDynamicDeclareCursor.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedAuthorizationDeclaration getEmbeddedAuthorizationDeclaration() {
    return findChildByClass(SqlEmbeddedAuthorizationDeclaration.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedCollationSpecification getEmbeddedCollationSpecification() {
    return findChildByClass(SqlEmbeddedCollationSpecification.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedExceptionDeclaration getEmbeddedExceptionDeclaration() {
    return findChildByClass(SqlEmbeddedExceptionDeclaration.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedPathSpecification getEmbeddedPathSpecification() {
    return findChildByClass(SqlEmbeddedPathSpecification.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedTransformGroupSpecification getEmbeddedTransformGroupSpecification() {
    return findChildByClass(SqlEmbeddedTransformGroupSpecification.class);
  }

  @Override
  @Nullable
  public SqlTemporaryTableDeclaration getTemporaryTableDeclaration() {
    return findChildByClass(SqlTemporaryTableDeclaration.class);
  }

}
