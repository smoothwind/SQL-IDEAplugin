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

public class SqlTransliterationDefinitionImpl extends ASTWrapperPsiElement implements SqlTransliterationDefinition {

  public SqlTransliterationDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTransliterationDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlSourceCharacterSetSpecification getSourceCharacterSetSpecification() {
    return findNotNullChildByClass(SqlSourceCharacterSetSpecification.class);
  }

  @Override
  @NotNull
  public SqlTargetCharacterSetSpecification getTargetCharacterSetSpecification() {
    return findNotNullChildByClass(SqlTargetCharacterSetSpecification.class);
  }

  @Override
  @NotNull
  public SqlTransliterationName getTransliterationName() {
    return findNotNullChildByClass(SqlTransliterationName.class);
  }

  @Override
  @NotNull
  public SqlTransliterationSource getTransliterationSource() {
    return findNotNullChildByClass(SqlTransliterationSource.class);
  }

}
