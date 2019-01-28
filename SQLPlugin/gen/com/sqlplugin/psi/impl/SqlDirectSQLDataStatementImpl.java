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

public class SqlDirectSQLDataStatementImpl extends ASTWrapperPsiElement implements SqlDirectSQLDataStatement {

  public SqlDirectSQLDataStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDirectSQLDataStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlDeleteStatementSearched getDeleteStatementSearched() {
    return findChildByClass(SqlDeleteStatementSearched.class);
  }

  @Override
  @Nullable
  public SqlDirectSelectStatementMultipleRows getDirectSelectStatementMultipleRows() {
    return findChildByClass(SqlDirectSelectStatementMultipleRows.class);
  }

  @Override
  @Nullable
  public SqlInsertStatement getInsertStatement() {
    return findChildByClass(SqlInsertStatement.class);
  }

  @Override
  @Nullable
  public SqlMergeStatement getMergeStatement() {
    return findChildByClass(SqlMergeStatement.class);
  }

  @Override
  @Nullable
  public SqlTemporaryTableDeclaration getTemporaryTableDeclaration() {
    return findChildByClass(SqlTemporaryTableDeclaration.class);
  }

  @Override
  @Nullable
  public SqlUpdateStatementSearched getUpdateStatementSearched() {
    return findChildByClass(SqlUpdateStatementSearched.class);
  }

}
