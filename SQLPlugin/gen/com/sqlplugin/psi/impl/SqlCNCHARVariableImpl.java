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

public class SqlCNCHARVariableImpl extends ASTWrapperPsiElement implements SqlCNCHARVariable {

  public SqlCNCHARVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCNCHARVariable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlCArraySpecification> getCArraySpecificationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlCArraySpecification.class);
  }

  @Override
  @NotNull
  public List<SqlCHostIdentifier> getCHostIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlCHostIdentifier.class);
  }

  @Override
  @NotNull
  public List<SqlCInitialValue> getCInitialValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlCInitialValue.class);
  }

  @Override
  @Nullable
  public SqlCharacterSetSpecification getCharacterSetSpecification() {
    return findChildByClass(SqlCharacterSetSpecification.class);
  }

  @Override
  @Nullable
  public SqlComma getComma() {
    return findChildByClass(SqlComma.class);
  }

}
