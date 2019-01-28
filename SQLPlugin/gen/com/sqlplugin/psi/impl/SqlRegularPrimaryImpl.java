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

public class SqlRegularPrimaryImpl extends ASTWrapperPsiElement implements SqlRegularPrimary {

  public SqlRegularPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitRegularPrimary(this);
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
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlPercent getPercent() {
    return findChildByClass(SqlPercent.class);
  }

  @Override
  @Nullable
  public SqlRegularCharacterSet getRegularCharacterSet() {
    return findChildByClass(SqlRegularCharacterSet.class);
  }

  @Override
  @Nullable
  public SqlRegularExpression getRegularExpression() {
    return findChildByClass(SqlRegularExpression.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

}
