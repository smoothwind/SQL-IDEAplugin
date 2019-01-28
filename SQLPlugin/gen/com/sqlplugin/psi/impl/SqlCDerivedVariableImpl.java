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

public class SqlCDerivedVariableImpl extends ASTWrapperPsiElement implements SqlCDerivedVariable {

  public SqlCDerivedVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCDerivedVariable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCBLOBLocatorVariable getCBLOBLocatorVariable() {
    return findChildByClass(SqlCBLOBLocatorVariable.class);
  }

  @Override
  @Nullable
  public SqlCBLOBVariable getCBLOBVariable() {
    return findChildByClass(SqlCBLOBVariable.class);
  }

  @Override
  @Nullable
  public SqlCCLOBLocatorVariable getCCLOBLocatorVariable() {
    return findChildByClass(SqlCCLOBLocatorVariable.class);
  }

  @Override
  @Nullable
  public SqlCCLOBVariable getCCLOBVariable() {
    return findChildByClass(SqlCCLOBVariable.class);
  }

  @Override
  @Nullable
  public SqlCNCHARVARYINGVariable getCNCHARVARYINGVariable() {
    return findChildByClass(SqlCNCHARVARYINGVariable.class);
  }

  @Override
  @Nullable
  public SqlCNCHARVariable getCNCHARVariable() {
    return findChildByClass(SqlCNCHARVariable.class);
  }

  @Override
  @Nullable
  public SqlCNCLOBVariable getCNCLOBVariable() {
    return findChildByClass(SqlCNCLOBVariable.class);
  }

  @Override
  @Nullable
  public SqlCREFVariable getCREFVariable() {
    return findChildByClass(SqlCREFVariable.class);
  }

  @Override
  @Nullable
  public SqlCVARCHARVariable getCVARCHARVariable() {
    return findChildByClass(SqlCVARCHARVariable.class);
  }

  @Override
  @Nullable
  public SqlCArrayLocatorVariable getCArrayLocatorVariable() {
    return findChildByClass(SqlCArrayLocatorVariable.class);
  }

  @Override
  @Nullable
  public SqlCMultisetLocatorVariable getCMultisetLocatorVariable() {
    return findChildByClass(SqlCMultisetLocatorVariable.class);
  }

  @Override
  @Nullable
  public SqlCUserDefinedTypeLocatorVariable getCUserDefinedTypeLocatorVariable() {
    return findChildByClass(SqlCUserDefinedTypeLocatorVariable.class);
  }

  @Override
  @Nullable
  public SqlCUserDefinedTypeVariable getCUserDefinedTypeVariable() {
    return findChildByClass(SqlCUserDefinedTypeVariable.class);
  }

}
