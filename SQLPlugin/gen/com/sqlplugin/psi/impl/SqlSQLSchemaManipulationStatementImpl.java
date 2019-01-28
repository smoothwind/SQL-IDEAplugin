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

public class SqlSQLSchemaManipulationStatementImpl extends ASTWrapperPsiElement implements SqlSQLSchemaManipulationStatement {

  public SqlSQLSchemaManipulationStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLSchemaManipulationStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlAlterDomainStatement getAlterDomainStatement() {
    return findChildByClass(SqlAlterDomainStatement.class);
  }

  @Override
  @Nullable
  public SqlAlterRoutineStatement getAlterRoutineStatement() {
    return findChildByClass(SqlAlterRoutineStatement.class);
  }

  @Override
  @Nullable
  public SqlAlterSequenceGeneratorStatement getAlterSequenceGeneratorStatement() {
    return findChildByClass(SqlAlterSequenceGeneratorStatement.class);
  }

  @Override
  @Nullable
  public SqlAlterTableStatement getAlterTableStatement() {
    return findChildByClass(SqlAlterTableStatement.class);
  }

  @Override
  @Nullable
  public SqlAlterTransformStatement getAlterTransformStatement() {
    return findChildByClass(SqlAlterTransformStatement.class);
  }

  @Override
  @Nullable
  public SqlAlterTypeStatement getAlterTypeStatement() {
    return findChildByClass(SqlAlterTypeStatement.class);
  }

  @Override
  @Nullable
  public SqlDropAssertionStatement getDropAssertionStatement() {
    return findChildByClass(SqlDropAssertionStatement.class);
  }

  @Override
  @Nullable
  public SqlDropCharacterSetStatement getDropCharacterSetStatement() {
    return findChildByClass(SqlDropCharacterSetStatement.class);
  }

  @Override
  @Nullable
  public SqlDropCollationStatement getDropCollationStatement() {
    return findChildByClass(SqlDropCollationStatement.class);
  }

  @Override
  @Nullable
  public SqlDropDataTypeStatement getDropDataTypeStatement() {
    return findChildByClass(SqlDropDataTypeStatement.class);
  }

  @Override
  @Nullable
  public SqlDropDomainStatement getDropDomainStatement() {
    return findChildByClass(SqlDropDomainStatement.class);
  }

  @Override
  @Nullable
  public SqlDropRoleStatement getDropRoleStatement() {
    return findChildByClass(SqlDropRoleStatement.class);
  }

  @Override
  @Nullable
  public SqlDropRoutineStatement getDropRoutineStatement() {
    return findChildByClass(SqlDropRoutineStatement.class);
  }

  @Override
  @Nullable
  public SqlDropSchemaStatement getDropSchemaStatement() {
    return findChildByClass(SqlDropSchemaStatement.class);
  }

  @Override
  @Nullable
  public SqlDropSequenceGeneratorStatement getDropSequenceGeneratorStatement() {
    return findChildByClass(SqlDropSequenceGeneratorStatement.class);
  }

  @Override
  @Nullable
  public SqlDropTableStatement getDropTableStatement() {
    return findChildByClass(SqlDropTableStatement.class);
  }

  @Override
  @Nullable
  public SqlDropTransformStatement getDropTransformStatement() {
    return findChildByClass(SqlDropTransformStatement.class);
  }

  @Override
  @Nullable
  public SqlDropTransliterationStatement getDropTransliterationStatement() {
    return findChildByClass(SqlDropTransliterationStatement.class);
  }

  @Override
  @Nullable
  public SqlDropTriggerStatement getDropTriggerStatement() {
    return findChildByClass(SqlDropTriggerStatement.class);
  }

  @Override
  @Nullable
  public SqlDropUserDefinedCastStatement getDropUserDefinedCastStatement() {
    return findChildByClass(SqlDropUserDefinedCastStatement.class);
  }

  @Override
  @Nullable
  public SqlDropUserDefinedOrderingStatement getDropUserDefinedOrderingStatement() {
    return findChildByClass(SqlDropUserDefinedOrderingStatement.class);
  }

  @Override
  @Nullable
  public SqlDropViewStatement getDropViewStatement() {
    return findChildByClass(SqlDropViewStatement.class);
  }

  @Override
  @Nullable
  public SqlRevokeStatement getRevokeStatement() {
    return findChildByClass(SqlRevokeStatement.class);
  }

}
