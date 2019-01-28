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

public class SqlCharacterEnumerationImpl extends ASTWrapperPsiElement implements SqlCharacterEnumeration {

  public SqlCharacterEnumerationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCharacterEnumeration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharacterSpecifier getCharacterSpecifier() {
    return findChildByClass(SqlCharacterSpecifier.class);
  }

  @Override
  @NotNull
  public List<SqlColon> getColonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlColon.class);
  }

  @Override
  @Nullable
  public SqlLeftBracket getLeftBracket() {
    return findChildByClass(SqlLeftBracket.class);
  }

  @Override
  @Nullable
  public SqlMinusSign getMinusSign() {
    return findChildByClass(SqlMinusSign.class);
  }

  @Override
  @Nullable
  public SqlRegularCharacterSetIdentifier getRegularCharacterSetIdentifier() {
    return findChildByClass(SqlRegularCharacterSetIdentifier.class);
  }

}
