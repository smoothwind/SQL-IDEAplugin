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

public class SqlTimeZoneIntervalImpl extends ASTWrapperPsiElement implements SqlTimeZoneInterval {

  public SqlTimeZoneIntervalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTimeZoneInterval(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlColon getColon() {
    return findNotNullChildByClass(SqlColon.class);
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
  public SqlSign getSign() {
    return findNotNullChildByClass(SqlSign.class);
  }

}
