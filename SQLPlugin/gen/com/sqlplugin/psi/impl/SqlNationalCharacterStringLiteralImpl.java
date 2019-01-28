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

public class SqlNationalCharacterStringLiteralImpl extends ASTWrapperPsiElement implements SqlNationalCharacterStringLiteral {

  public SqlNationalCharacterStringLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitNationalCharacterStringLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlCharacterRepresentation> getCharacterRepresentationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlCharacterRepresentation.class);
  }

  @Override
  @NotNull
  public List<SqlQuote> getQuoteList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlQuote.class);
  }

  @Override
  @Nullable
  public SqlSeparator getSeparator() {
    return findChildByClass(SqlSeparator.class);
  }

}
