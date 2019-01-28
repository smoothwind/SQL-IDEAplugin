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

public class SqlDateValueImpl extends ASTWrapperPsiElement implements SqlDateValue {

  public SqlDateValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDateValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDaysValue getDaysValue() {
    return findNotNullChildByClass(SqlDaysValue.class);
  }

  @Override
  @NotNull
  public List<SqlMinusSign> getMinusSignList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SqlMinusSign.class);
  }

  @Override
  @NotNull
  public SqlMonthsValue getMonthsValue() {
    return findNotNullChildByClass(SqlMonthsValue.class);
  }

  @Override
  @NotNull
  public SqlYearsValue getYearsValue() {
    return findNotNullChildByClass(SqlYearsValue.class);
  }

}
