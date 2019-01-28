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

public class SqlTimeIntervalImpl extends ASTWrapperPsiElement implements SqlTimeInterval {

  public SqlTimeIntervalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTimeInterval(this);
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

}
