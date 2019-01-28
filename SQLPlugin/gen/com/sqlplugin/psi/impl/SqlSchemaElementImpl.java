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

public class SqlSchemaElementImpl extends ASTWrapperPsiElement implements SqlSchemaElement {

  public SqlSchemaElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSchemaElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAssertionDefinition getAssertionDefinition() {
    return findChildByClass(SqlAssertionDefinition.class);
  }

  @Override
  @Nullable
  public SqlCharacterSetDefinition getCharacterSetDefinition() {
    return findChildByClass(SqlCharacterSetDefinition.class);
  }

  @Override
  @Nullable
  public SqlCollationDefinition getCollationDefinition() {
    return findChildByClass(SqlCollationDefinition.class);
  }

  @Override
  @Nullable
  public SqlDomainDefinition getDomainDefinition() {
    return findChildByClass(SqlDomainDefinition.class);
  }

  @Override
  @Nullable
  public SqlGrantStatement getGrantStatement() {
    return findChildByClass(SqlGrantStatement.class);
  }

  @Override
  @Nullable
  public SqlRoleDefinition getRoleDefinition() {
    return findChildByClass(SqlRoleDefinition.class);
  }

  @Override
  @Nullable
  public SqlSchemaRoutine getSchemaRoutine() {
    return findChildByClass(SqlSchemaRoutine.class);
  }

  @Override
  @Nullable
  public SqlSequenceGeneratorDefinition getSequenceGeneratorDefinition() {
    return findChildByClass(SqlSequenceGeneratorDefinition.class);
  }

  @Override
  @Nullable
  public SqlTableDefinition getTableDefinition() {
    return findChildByClass(SqlTableDefinition.class);
  }

  @Override
  @Nullable
  public SqlTransformDefinition getTransformDefinition() {
    return findChildByClass(SqlTransformDefinition.class);
  }

  @Override
  @Nullable
  public SqlTransliterationDefinition getTransliterationDefinition() {
    return findChildByClass(SqlTransliterationDefinition.class);
  }

  @Override
  @Nullable
  public SqlTriggerDefinition getTriggerDefinition() {
    return findChildByClass(SqlTriggerDefinition.class);
  }

  @Override
  @Nullable
  public SqlUserDefinedCastDefinition getUserDefinedCastDefinition() {
    return findChildByClass(SqlUserDefinedCastDefinition.class);
  }

  @Override
  @Nullable
  public SqlUserDefinedOrderingDefinition getUserDefinedOrderingDefinition() {
    return findChildByClass(SqlUserDefinedOrderingDefinition.class);
  }

  @Override
  @Nullable
  public SqlUserDefinedTypeDefinition getUserDefinedTypeDefinition() {
    return findChildByClass(SqlUserDefinedTypeDefinition.class);
  }

  @Override
  @Nullable
  public SqlViewDefinition getViewDefinition() {
    return findChildByClass(SqlViewDefinition.class);
  }

}
