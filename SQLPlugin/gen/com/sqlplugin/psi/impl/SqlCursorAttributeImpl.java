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

public class SqlCursorAttributeImpl extends ASTWrapperPsiElement implements SqlCursorAttribute {

  public SqlCursorAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCursorAttribute(this);
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

}
