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

public class SqlCVariableSpecificationImpl extends ASTWrapperPsiElement implements SqlCVariableSpecification {

  public SqlCVariableSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCVariableSpecification(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCCharacterVariable getCCharacterVariable() {
    return findChildByClass(SqlCCharacterVariable.class);
  }

  @Override
  @Nullable
  public SqlCDerivedVariable getCDerivedVariable() {
    return findChildByClass(SqlCDerivedVariable.class);
  }

  @Override
  @Nullable
  public SqlCNumericVariable getCNumericVariable() {
    return findChildByClass(SqlCNumericVariable.class);
  }

}
