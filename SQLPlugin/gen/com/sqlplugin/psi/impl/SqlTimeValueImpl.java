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

public class SqlTimeValueImpl extends ASTWrapperPsiElement implements SqlTimeValue {

  public SqlTimeValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTimeValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SqlColon> getColonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlColon.class);
  }

  @Override
  @NotNull
  public SqlHoursValue getHoursValue() {
    return findNotNullChildByClass(SqlHoursValue.class);
  }

  @Override
  @NotNull
  public SqlMinutesValue getMinutesValue() {
    return findNotNullChildByClass(SqlMinutesValue.class);
  }

  @Override
  @NotNull
  public SqlSecondsValue getSecondsValue() {
    return findNotNullChildByClass(SqlSecondsValue.class);
  }

}
