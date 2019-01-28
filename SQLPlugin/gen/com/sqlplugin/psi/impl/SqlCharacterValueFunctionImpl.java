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

public class SqlCharacterValueFunctionImpl extends ASTWrapperPsiElement implements SqlCharacterValueFunction {

  public SqlCharacterValueFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCharacterValueFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharacterOverlayFunction getCharacterOverlayFunction() {
    return findChildByClass(SqlCharacterOverlayFunction.class);
  }

  @Override
  @Nullable
  public SqlCharacterSubstringFunction getCharacterSubstringFunction() {
    return findChildByClass(SqlCharacterSubstringFunction.class);
  }

  @Override
  @Nullable
  public SqlCharacterTransliteration getCharacterTransliteration() {
    return findChildByClass(SqlCharacterTransliteration.class);
  }

  @Override
  @Nullable
  public SqlFold getFold() {
    return findChildByClass(SqlFold.class);
  }

  @Override
  @Nullable
  public SqlNormalizeFunction getNormalizeFunction() {
    return findChildByClass(SqlNormalizeFunction.class);
  }

  @Override
  @Nullable
  public SqlRegularExpressionSubstringFunction getRegularExpressionSubstringFunction() {
    return findChildByClass(SqlRegularExpressionSubstringFunction.class);
  }

  @Override
  @Nullable
  public SqlSpecificTypeMethod getSpecificTypeMethod() {
    return findChildByClass(SqlSpecificTypeMethod.class);
  }

  @Override
  @Nullable
  public SqlTranscoding getTranscoding() {
    return findChildByClass(SqlTranscoding.class);
  }

  @Override
  @Nullable
  public SqlTrimFunction getTrimFunction() {
    return findChildByClass(SqlTrimFunction.class);
  }

}
