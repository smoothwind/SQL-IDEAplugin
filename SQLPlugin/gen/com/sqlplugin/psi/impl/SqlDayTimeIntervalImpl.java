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

public class SqlDayTimeIntervalImpl extends ASTWrapperPsiElement implements SqlDayTimeInterval {

  public SqlDayTimeIntervalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDayTimeInterval(this);
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
  public SqlDaysValue getDaysValue() {
    return findNotNullChildByClass(SqlDaysValue.class);
  }

  @Override
  @Nullable
  public SqlHoursValue getHoursValue() {
    return findChildByClass(SqlHoursValue.class);
  }

  @Override
  @Nullable
  public SqlMinutesValue getMinutesValue() {
    return findChildByClass(SqlMinutesValue.class);
  }

  @Override
  @Nullable
  public SqlSecondsValue getSecondsValue() {
    return findChildByClass(SqlSecondsValue.class);
  }

  @Override
  @Nullable
  public SqlSpace getSpace() {
    return findChildByClass(SqlSpace.class);
  }

}
