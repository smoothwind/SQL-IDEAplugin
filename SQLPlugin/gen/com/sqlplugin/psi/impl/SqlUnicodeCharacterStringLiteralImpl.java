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

public class SqlUnicodeCharacterStringLiteralImpl extends ASTWrapperPsiElement implements SqlUnicodeCharacterStringLiteral {

  public SqlUnicodeCharacterStringLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitUnicodeCharacterStringLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlUnicodeRepresentation> getUnicodeRepresentationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlUnicodeRepresentation.class);
  }

  @Override
  @NotNull
  public SqlAmpersand getAmpersand() {
    return findNotNullChildByClass(SqlAmpersand.class);
  }

  @Override
  @Nullable
  public SqlCharacterSetSpecification getCharacterSetSpecification() {
    return findChildByClass(SqlCharacterSetSpecification.class);
  }

  @Override
  @Nullable
  public SqlEscapeCharacter getEscapeCharacter() {
    return findChildByClass(SqlEscapeCharacter.class);
  }

  @Override
  @Nullable
  public SqlIntroducer getIntroducer() {
    return findChildByClass(SqlIntroducer.class);
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
