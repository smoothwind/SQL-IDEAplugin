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

public class SqlConnectionTargetImpl extends ASTWrapperPsiElement implements SqlConnectionTarget {

  public SqlConnectionTargetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitConnectionTarget(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLServerName getSQLServerName() {
    return findChildByClass(SqlSQLServerName.class);
  }

  @Override
  @Nullable
  public SqlConnectionName getConnectionName() {
    return findChildByClass(SqlConnectionName.class);
  }

  @Override
  @Nullable
  public SqlConnectionUserName getConnectionUserName() {
    return findChildByClass(SqlConnectionUserName.class);
  }

}
