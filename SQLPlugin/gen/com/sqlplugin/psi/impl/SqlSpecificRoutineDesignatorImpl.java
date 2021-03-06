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

public class SqlSpecificRoutineDesignatorImpl extends ASTWrapperPsiElement implements SqlSpecificRoutineDesignator {

  public SqlSpecificRoutineDesignatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSpecificRoutineDesignator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlMemberName getMemberName() {
    return findChildByClass(SqlMemberName.class);
  }

  @Override
  @NotNull
  public SqlRoutineType getRoutineType() {
    return findNotNullChildByClass(SqlRoutineType.class);
  }

  @Override
  @Nullable
  public SqlSchemaResolvedUserDefinedTypeName getSchemaResolvedUserDefinedTypeName() {
    return findChildByClass(SqlSchemaResolvedUserDefinedTypeName.class);
  }

  @Override
  @Nullable
  public SqlSpecificName getSpecificName() {
    return findChildByClass(SqlSpecificName.class);
  }

}
