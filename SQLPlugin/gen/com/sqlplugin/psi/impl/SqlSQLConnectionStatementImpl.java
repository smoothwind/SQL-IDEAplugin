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

public class SqlSQLConnectionStatementImpl extends ASTWrapperPsiElement implements SqlSQLConnectionStatement {

  public SqlSQLConnectionStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLConnectionStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlConnectStatement getConnectStatement() {
    return findChildByClass(SqlConnectStatement.class);
  }

  @Override
  @Nullable
  public SqlDisconnectStatement getDisconnectStatement() {
    return findChildByClass(SqlDisconnectStatement.class);
  }

  @Override
  @Nullable
  public SqlSetConnectionStatement getSetConnectionStatement() {
    return findChildByClass(SqlSetConnectionStatement.class);
  }

}
