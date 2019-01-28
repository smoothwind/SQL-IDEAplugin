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

public class SqlGeneralLiteralImpl extends ASTWrapperPsiElement implements SqlGeneralLiteral {

  public SqlGeneralLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitGeneralLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlUnicodeCharacterStringLiteral getUnicodeCharacterStringLiteral() {
    return findChildByClass(SqlUnicodeCharacterStringLiteral.class);
  }

  @Override
  @Nullable
  public SqlBinaryStringLiteral getBinaryStringLiteral() {
    return findChildByClass(SqlBinaryStringLiteral.class);
  }

  @Override
  @Nullable
  public SqlBooleanLiteral getBooleanLiteral() {
    return findChildByClass(SqlBooleanLiteral.class);
  }

  @Override
  @Nullable
  public SqlCharacterStringLiteral getCharacterStringLiteral() {
    return findChildByClass(SqlCharacterStringLiteral.class);
  }

  @Override
  @Nullable
  public SqlDatetimeLiteral getDatetimeLiteral() {
    return findChildByClass(SqlDatetimeLiteral.class);
  }

  @Override
  @Nullable
  public SqlIntervalLiteral getIntervalLiteral() {
    return findChildByClass(SqlIntervalLiteral.class);
  }

  @Override
  @Nullable
  public SqlNationalCharacterStringLiteral getNationalCharacterStringLiteral() {
    return findChildByClass(SqlNationalCharacterStringLiteral.class);
  }

}
