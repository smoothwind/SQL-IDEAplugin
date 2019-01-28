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

public class SqlSQLSessionStatementImpl extends ASTWrapperPsiElement implements SqlSQLSessionStatement {

  public SqlSQLSessionStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitSQLSessionStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSetCatalogStatement getSetCatalogStatement() {
    return findChildByClass(SqlSetCatalogStatement.class);
  }

  @Override
  @Nullable
  public SqlSetLocalTimeZoneStatement getSetLocalTimeZoneStatement() {
    return findChildByClass(SqlSetLocalTimeZoneStatement.class);
  }

  @Override
  @Nullable
  public SqlSetNamesStatement getSetNamesStatement() {
    return findChildByClass(SqlSetNamesStatement.class);
  }

  @Override
  @Nullable
  public SqlSetPathStatement getSetPathStatement() {
    return findChildByClass(SqlSetPathStatement.class);
  }

  @Override
  @Nullable
  public SqlSetRoleStatement getSetRoleStatement() {
    return findChildByClass(SqlSetRoleStatement.class);
  }

  @Override
  @Nullable
  public SqlSetSchemaStatement getSetSchemaStatement() {
    return findChildByClass(SqlSetSchemaStatement.class);
  }

  @Override
  @Nullable
  public SqlSetSessionCharacteristicsStatement getSetSessionCharacteristicsStatement() {
    return findChildByClass(SqlSetSessionCharacteristicsStatement.class);
  }

  @Override
  @Nullable
  public SqlSetSessionCollationStatement getSetSessionCollationStatement() {
    return findChildByClass(SqlSetSessionCollationStatement.class);
  }

  @Override
  @Nullable
  public SqlSetSessionUserIdentifierStatement getSetSessionUserIdentifierStatement() {
    return findChildByClass(SqlSetSessionUserIdentifierStatement.class);
  }

  @Override
  @Nullable
  public SqlSetTransformGroupStatement getSetTransformGroupStatement() {
    return findChildByClass(SqlSetTransformGroupStatement.class);
  }

}
