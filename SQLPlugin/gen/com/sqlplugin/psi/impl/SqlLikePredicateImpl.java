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

public class SqlLikePredicateImpl extends ASTWrapperPsiElement implements SqlLikePredicate {

  public SqlLikePredicateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitLikePredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharacterLikePredicate getCharacterLikePredicate() {
    return findChildByClass(SqlCharacterLikePredicate.class);
  }

  @Override
  @Nullable
  public SqlOctetLikePredicate getOctetLikePredicate() {
    return findChildByClass(SqlOctetLikePredicate.class);
  }

}
