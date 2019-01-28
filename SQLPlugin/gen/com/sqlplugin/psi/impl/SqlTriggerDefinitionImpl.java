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

public class SqlTriggerDefinitionImpl extends ASTWrapperPsiElement implements SqlTriggerDefinition {

  public SqlTriggerDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitTriggerDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlOldOrNewValuesAliasList getOldOrNewValuesAliasList() {
    return findChildByClass(SqlOldOrNewValuesAliasList.class);
  }

  @Override
  @NotNull
  public SqlTableName getTableName() {
    return findNotNullChildByClass(SqlTableName.class);
  }

  @Override
  @NotNull
  public SqlTriggerActionTime getTriggerActionTime() {
    return findNotNullChildByClass(SqlTriggerActionTime.class);
  }

  @Override
  @NotNull
  public SqlTriggerEvent getTriggerEvent() {
    return findNotNullChildByClass(SqlTriggerEvent.class);
  }

  @Override
  @NotNull
  public SqlTriggerName getTriggerName() {
    return findNotNullChildByClass(SqlTriggerName.class);
  }

  @Override
  @NotNull
  public SqlTriggeredAction getTriggeredAction() {
    return findNotNullChildByClass(SqlTriggeredAction.class);
  }

}
