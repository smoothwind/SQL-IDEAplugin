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

public class SqlDelimitedIdentifierPartImpl extends ASTWrapperPsiElement implements SqlDelimitedIdentifierPart {

  public SqlDelimitedIdentifierPartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDelimitedIdentifierPart(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlUnicodeDelimiterBody getUnicodeDelimiterBody() {
    return findChildByClass(SqlUnicodeDelimiterBody.class);
  }

  @Override
  @Nullable
  public SqlUnicodeEscapeSpecifier getUnicodeEscapeSpecifier() {
    return findChildByClass(SqlUnicodeEscapeSpecifier.class);
  }

  @Override
  @Nullable
  public SqlAmpersand getAmpersand() {
    return findChildByClass(SqlAmpersand.class);
  }

  @Override
  @NotNull
  public List<SqlDoubleQuote> getDoubleQuoteList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlDoubleQuote.class);
  }

  @Override
  @Nullable
  public SqlDoublequoteSymbol getDoublequoteSymbol() {
    return findChildByClass(SqlDoublequoteSymbol.class);
  }

  @Override
  @Nullable
  public SqlNondoublequoteCharacter getNondoublequoteCharacter() {
    return findChildByClass(SqlNondoublequoteCharacter.class);
  }

}
