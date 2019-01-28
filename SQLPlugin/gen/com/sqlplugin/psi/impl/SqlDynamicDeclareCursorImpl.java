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

public class SqlDynamicDeclareCursorImpl extends ASTWrapperPsiElement implements SqlDynamicDeclareCursor {

  public SqlDynamicDeclareCursorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDynamicDeclareCursor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCursorHoldability getCursorHoldability() {
    return findChildByClass(SqlCursorHoldability.class);
  }

  @Override
  @NotNull
  public SqlCursorName getCursorName() {
    return findNotNullChildByClass(SqlCursorName.class);
  }

  @Override
  @Nullable
  public SqlCursorReturnability getCursorReturnability() {
    return findChildByClass(SqlCursorReturnability.class);
  }

  @Override
  @Nullable
  public SqlCursorScrollability getCursorScrollability() {
    return findChildByClass(SqlCursorScrollability.class);
  }

  @Override
  @Nullable
  public SqlCursorSensitivity getCursorSensitivity() {
    return findChildByClass(SqlCursorSensitivity.class);
  }

  @Override
  @NotNull
  public SqlStatementName getStatementName() {
    return findNotNullChildByClass(SqlStatementName.class);
  }

}
