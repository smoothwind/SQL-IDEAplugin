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

public class SqlAlterTableActionImpl extends ASTWrapperPsiElement implements SqlAlterTableAction {

  public SqlAlterTableActionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterTableAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAddColumnDefinition getAddColumnDefinition() {
    return findChildByClass(SqlAddColumnDefinition.class);
  }

  @Override
  @Nullable
  public SqlAddTableConstraintDefinition getAddTableConstraintDefinition() {
    return findChildByClass(SqlAddTableConstraintDefinition.class);
  }

  @Override
  @Nullable
  public SqlAlterColumnDefinition getAlterColumnDefinition() {
    return findChildByClass(SqlAlterColumnDefinition.class);
  }

  @Override
  @Nullable
  public SqlDropColumnDefinition getDropColumnDefinition() {
    return findChildByClass(SqlDropColumnDefinition.class);
  }

  @Override
  @Nullable
  public SqlDropTableConstraintDefinition getDropTableConstraintDefinition() {
    return findChildByClass(SqlDropTableConstraintDefinition.class);
  }

}
