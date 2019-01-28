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

public class SqlFieldDefinitionImpl extends ASTWrapperPsiElement implements SqlFieldDefinition {

  public SqlFieldDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitFieldDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDataType getDataType() {
    return findNotNullChildByClass(SqlDataType.class);
  }

  @Override
  @NotNull
  public SqlFieldName getFieldName() {
    return findNotNullChildByClass(SqlFieldName.class);
  }

  @Override
  @Nullable
  public SqlReferenceScopeCheck getReferenceScopeCheck() {
    return findChildByClass(SqlReferenceScopeCheck.class);
  }

}
