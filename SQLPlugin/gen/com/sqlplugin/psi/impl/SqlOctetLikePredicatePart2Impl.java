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

public class SqlOctetLikePredicatePart2Impl extends ASTWrapperPsiElement implements SqlOctetLikePredicatePart2 {

  public SqlOctetLikePredicatePart2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitOctetLikePredicatePart2(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlEscapeOctet getEscapeOctet() {
    return findChildByClass(SqlEscapeOctet.class);
  }

  @Override
  @NotNull
  public SqlOctetPattern getOctetPattern() {
    return findNotNullChildByClass(SqlOctetPattern.class);
  }

}
