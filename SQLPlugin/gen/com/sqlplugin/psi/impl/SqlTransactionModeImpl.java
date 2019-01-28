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

public class SqlTransactionModeImpl extends ASTWrapperPsiElement implements SqlTransactionMode {

  public SqlTransactionModeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTransactionMode(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlDiagnosticsSize getDiagnosticsSize() {
    return findChildByClass(SqlDiagnosticsSize.class);
  }

  @Override
  @Nullable
  public SqlIsolationLevel getIsolationLevel() {
    return findChildByClass(SqlIsolationLevel.class);
  }

  @Override
  @Nullable
  public SqlTransactionAccessMode getTransactionAccessMode() {
    return findChildByClass(SqlTransactionAccessMode.class);
  }

}
