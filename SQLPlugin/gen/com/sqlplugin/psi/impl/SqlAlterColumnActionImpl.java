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

public class SqlAlterColumnActionImpl extends ASTWrapperPsiElement implements SqlAlterColumnAction {

  public SqlAlterColumnActionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterColumnAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAddColumnScopeClause getAddColumnScopeClause() {
    return findChildByClass(SqlAddColumnScopeClause.class);
  }

  @Override
  @Nullable
  public SqlAlterIdentityColumnSpecification getAlterIdentityColumnSpecification() {
    return findChildByClass(SqlAlterIdentityColumnSpecification.class);
  }

  @Override
  @Nullable
  public SqlDropColumnDefaultClause getDropColumnDefaultClause() {
    return findChildByClass(SqlDropColumnDefaultClause.class);
  }

  @Override
  @Nullable
  public SqlDropColumnScopeClause getDropColumnScopeClause() {
    return findChildByClass(SqlDropColumnScopeClause.class);
  }

  @Override
  @Nullable
  public SqlSetColumnDefaultClause getSetColumnDefaultClause() {
    return findChildByClass(SqlSetColumnDefaultClause.class);
  }

}
