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

public class SqlEmbeddedSQLDeclareSectionImpl extends ASTWrapperPsiElement implements SqlEmbeddedSQLDeclareSection {

  public SqlEmbeddedSQLDeclareSectionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitEmbeddedSQLDeclareSection(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlEmbeddedSQLBeginDeclare getEmbeddedSQLBeginDeclare() {
    return findNotNullChildByClass(SqlEmbeddedSQLBeginDeclare.class);
  }

  @Override
  @NotNull
  public SqlEmbeddedSQLEndDeclare getEmbeddedSQLEndDeclare() {
    return findNotNullChildByClass(SqlEmbeddedSQLEndDeclare.class);
  }

  @Override
  @Nullable
  public SqlEmbeddedCharacterSetDeclaration getEmbeddedCharacterSetDeclaration() {
    return findChildByClass(SqlEmbeddedCharacterSetDeclaration.class);
  }

  @Override
  @Nullable
  public SqlHostVariableDefinition getHostVariableDefinition() {
    return findChildByClass(SqlHostVariableDefinition.class);
  }

}
