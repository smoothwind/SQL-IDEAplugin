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

public class SqlCVariableDefinitionImpl extends ASTWrapperPsiElement implements SqlCVariableDefinition {

  public SqlCVariableDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCVariableDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCClassModifier getCClassModifier() {
    return findChildByClass(SqlCClassModifier.class);
  }

  @Override
  @Nullable
  public SqlCStorageClass getCStorageClass() {
    return findChildByClass(SqlCStorageClass.class);
  }

  @Override
  @NotNull
  public SqlCVariableSpecification getCVariableSpecification() {
    return findNotNullChildByClass(SqlCVariableSpecification.class);
  }

  @Override
  @NotNull
  public SqlSemicolon getSemicolon() {
    return findNotNullChildByClass(SqlSemicolon.class);
  }

}
