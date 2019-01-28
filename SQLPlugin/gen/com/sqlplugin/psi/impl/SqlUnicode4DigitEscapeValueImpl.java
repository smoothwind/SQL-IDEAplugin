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

public class SqlUnicode4DigitEscapeValueImpl extends ASTWrapperPsiElement implements SqlUnicode4DigitEscapeValue {

  public SqlUnicode4DigitEscapeValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitUnicode4DigitEscapeValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlHexit> getHexitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlHexit.class);
  }

  @Override
  @NotNull
  public SqlPlusSign getPlusSign() {
    return findNotNullChildByClass(SqlPlusSign.class);
  }

}
