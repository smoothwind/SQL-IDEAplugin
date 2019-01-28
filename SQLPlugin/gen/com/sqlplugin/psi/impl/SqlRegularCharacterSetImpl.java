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

public class SqlRegularCharacterSetImpl extends ASTWrapperPsiElement implements SqlRegularCharacterSet {

  public SqlRegularCharacterSetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitRegularCharacterSet(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharacterEnumeration getCharacterEnumeration() {
    return findChildByClass(SqlCharacterEnumeration.class);
  }

  @Override
  @Nullable
  public SqlCharacterEnumerationExclude getCharacterEnumerationExclude() {
    return findChildByClass(SqlCharacterEnumerationExclude.class);
  }

  @Override
  @Nullable
  public SqlCharacterEnumerationInclude getCharacterEnumerationInclude() {
    return findChildByClass(SqlCharacterEnumerationInclude.class);
  }

  @Override
  @Nullable
  public SqlCircumflex getCircumflex() {
    return findChildByClass(SqlCircumflex.class);
  }

  @Override
  @Nullable
  public SqlLeftBracket getLeftBracket() {
    return findChildByClass(SqlLeftBracket.class);
  }

  @Override
  @Nullable
  public SqlUnderscore getUnderscore() {
    return findChildByClass(SqlUnderscore.class);
  }

}
