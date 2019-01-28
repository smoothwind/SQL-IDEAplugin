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

public class SqlSQLLanguageCharacterImpl extends ASTWrapperPsiElement implements SqlSQLLanguageCharacter {

  public SqlSQLLanguageCharacterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLLanguageCharacter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLSpecialCharacter getSQLSpecialCharacter() {
    return findChildByClass(SqlSQLSpecialCharacter.class);
  }

  @Override
  @Nullable
  public SqlDigit getDigit() {
    return findChildByClass(SqlDigit.class);
  }

  @Override
  @Nullable
  public SqlSimpleLatinLetter getSimpleLatinLetter() {
    return findChildByClass(SqlSimpleLatinLetter.class);
  }

}
