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

public class SqlObjectNameImpl extends ASTWrapperPsiElement implements SqlObjectName {

  public SqlObjectNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitObjectName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlCharacterSetName getCharacterSetName() {
    return findChildByClass(SqlCharacterSetName.class);
  }

  @Override
  @Nullable
  public SqlCollationName getCollationName() {
    return findChildByClass(SqlCollationName.class);
  }

  @Override
  @Nullable
  public SqlDomainName getDomainName() {
    return findChildByClass(SqlDomainName.class);
  }

  @Override
  @Nullable
  public SqlSchemaResolvedUserDefinedTypeName getSchemaResolvedUserDefinedTypeName() {
    return findChildByClass(SqlSchemaResolvedUserDefinedTypeName.class);
  }

  @Override
  @Nullable
  public SqlSequenceGeneratorName getSequenceGeneratorName() {
    return findChildByClass(SqlSequenceGeneratorName.class);
  }

  @Override
  @Nullable
  public SqlSpecificRoutineDesignator getSpecificRoutineDesignator() {
    return findChildByClass(SqlSpecificRoutineDesignator.class);
  }

  @Override
  @Nullable
  public SqlTableName getTableName() {
    return findChildByClass(SqlTableName.class);
  }

  @Override
  @Nullable
  public SqlTransliterationName getTransliterationName() {
    return findChildByClass(SqlTransliterationName.class);
  }

}
