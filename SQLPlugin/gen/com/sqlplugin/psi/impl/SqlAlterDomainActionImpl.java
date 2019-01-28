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

public class SqlAlterDomainActionImpl extends ASTWrapperPsiElement implements SqlAlterDomainAction {

  public SqlAlterDomainActionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterDomainAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAddDomainConstraintDefinition getAddDomainConstraintDefinition() {
    return findChildByClass(SqlAddDomainConstraintDefinition.class);
  }

  @Override
  @Nullable
  public SqlDropDomainConstraintDefinition getDropDomainConstraintDefinition() {
    return findChildByClass(SqlDropDomainConstraintDefinition.class);
  }

  @Override
  @Nullable
  public SqlDropDomainDefaultClause getDropDomainDefaultClause() {
    return findChildByClass(SqlDropDomainDefaultClause.class);
  }

  @Override
  @Nullable
  public SqlSetDomainDefaultClause getSetDomainDefaultClause() {
    return findChildByClass(SqlSetDomainDefaultClause.class);
  }

}
