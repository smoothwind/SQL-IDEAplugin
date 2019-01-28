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

public class SqlStaticMethodInvocationImpl extends ASTWrapperPsiElement implements SqlStaticMethodInvocation {

  public SqlStaticMethodInvocationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitStaticMethodInvocation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLArgumentList getSQLArgumentList() {
    return findChildByClass(SqlSQLArgumentList.class);
  }

  @Override
  @NotNull
  public SqlDoubleColon getDoubleColon() {
    return findNotNullChildByClass(SqlDoubleColon.class);
  }

  @Override
  @NotNull
  public SqlMethodName getMethodName() {
    return findNotNullChildByClass(SqlMethodName.class);
  }

  @Override
  @NotNull
  public SqlPathResolvedUserDefinedTypeName getPathResolvedUserDefinedTypeName() {
    return findNotNullChildByClass(SqlPathResolvedUserDefinedTypeName.class);
  }

}
