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

public class SqlExplicitRowValueConstructorImpl extends ASTWrapperPsiElement implements SqlExplicitRowValueConstructor {

  public SqlExplicitRowValueConstructorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitExplicitRowValueConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlComma getComma() {
    return findChildByClass(SqlComma.class);
  }

  @Override
  @Nullable
  public SqlLeftParen getLeftParen() {
    return findChildByClass(SqlLeftParen.class);
  }

  @Override
  @Nullable
  public SqlRightParen getRightParen() {
    return findChildByClass(SqlRightParen.class);
  }

  @Override
  @Nullable
  public SqlRowSubquery getRowSubquery() {
    return findChildByClass(SqlRowSubquery.class);
  }

  @Override
  @Nullable
  public SqlRowValueConstructorElement getRowValueConstructorElement() {
    return findChildByClass(SqlRowValueConstructorElement.class);
  }

  @Override
  @Nullable
  public SqlRowValueConstructorElementList getRowValueConstructorElementList() {
    return findChildByClass(SqlRowValueConstructorElementList.class);
  }

}
