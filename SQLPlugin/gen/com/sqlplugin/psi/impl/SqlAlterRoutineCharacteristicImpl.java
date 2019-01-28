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

public class SqlAlterRoutineCharacteristicImpl extends ASTWrapperPsiElement implements SqlAlterRoutineCharacteristic {

  public SqlAlterRoutineCharacteristicImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterRoutineCharacteristic(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlSQLDataAccessIndication getSQLDataAccessIndication() {
    return findChildByClass(SqlSQLDataAccessIndication.class);
  }

  @Override
  @Nullable
  public SqlDynamicResultSetsCharacteristic getDynamicResultSetsCharacteristic() {
    return findChildByClass(SqlDynamicResultSetsCharacteristic.class);
  }

  @Override
  @Nullable
  public SqlExternalRoutineName getExternalRoutineName() {
    return findChildByClass(SqlExternalRoutineName.class);
  }

  @Override
  @Nullable
  public SqlLanguageClause getLanguageClause() {
    return findChildByClass(SqlLanguageClause.class);
  }

  @Override
  @Nullable
  public SqlNullCallClause getNullCallClause() {
    return findChildByClass(SqlNullCallClause.class);
  }

  @Override
  @Nullable
  public SqlParameterStyleClause getParameterStyleClause() {
    return findChildByClass(SqlParameterStyleClause.class);
  }

}
