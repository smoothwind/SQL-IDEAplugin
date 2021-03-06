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

public class SqlCharacterOverlayFunctionImpl extends ASTWrapperPsiElement implements SqlCharacterOverlayFunction {

  public SqlCharacterOverlayFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCharacterOverlayFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharLengthUnits getCharLengthUnits() {
    return findChildByClass(SqlCharLengthUnits.class);
  }

  @Override
  @NotNull
  public List<SqlCharacterValueExpression> getCharacterValueExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlCharacterValueExpression.class);
  }

  @Override
  @NotNull
  public SqlLeftParen getLeftParen() {
    return findNotNullChildByClass(SqlLeftParen.class);
  }

  @Override
  @NotNull
  public SqlRightParen getRightParen() {
    return findNotNullChildByClass(SqlRightParen.class);
  }

  @Override
  @NotNull
  public SqlStartPosition getStartPosition() {
    return findNotNullChildByClass(SqlStartPosition.class);
  }

  @Override
  @Nullable
  public SqlStringLength getStringLength() {
    return findChildByClass(SqlStringLength.class);
  }

}
