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

public class SqlWindowFrameBetweenImpl extends ASTWrapperPsiElement implements SqlWindowFrameBetween {

  public SqlWindowFrameBetweenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitWindowFrameBetween(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlWindowFrameBound1 getWindowFrameBound1() {
    return findNotNullChildByClass(SqlWindowFrameBound1.class);
  }

  @Override
  @NotNull
  public SqlWindowFrameBound2 getWindowFrameBound2() {
    return findNotNullChildByClass(SqlWindowFrameBound2.class);
  }

}
