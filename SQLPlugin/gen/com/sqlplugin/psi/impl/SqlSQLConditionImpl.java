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

public class SqlSQLConditionImpl extends ASTWrapperPsiElement implements SqlSQLCondition {

  public SqlSQLConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLCondition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLSTATEClassValue getSQLSTATEClassValue() {
    return findChildByClass(SqlSQLSTATEClassValue.class);
  }

  @Override
  @Nullable
  public SqlSQLSTATESubclassValue getSQLSTATESubclassValue() {
    return findChildByClass(SqlSQLSTATESubclassValue.class);
  }

  @Override
  @Nullable
  public SqlConstraintName getConstraintName() {
    return findChildByClass(SqlConstraintName.class);
  }

  @Override
  @Nullable
  public SqlMajorCategory getMajorCategory() {
    return findChildByClass(SqlMajorCategory.class);
  }

}
