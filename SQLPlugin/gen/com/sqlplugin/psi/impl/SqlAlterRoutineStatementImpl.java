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

public class SqlAlterRoutineStatementImpl extends ASTWrapperPsiElement implements SqlAlterRoutineStatement {

  public SqlAlterRoutineStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitAlterRoutineStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlAlterRoutineBehavior getAlterRoutineBehavior() {
    return findNotNullChildByClass(SqlAlterRoutineBehavior.class);
  }

  @Override
  @NotNull
  public SqlAlterRoutineCharacteristics getAlterRoutineCharacteristics() {
    return findNotNullChildByClass(SqlAlterRoutineCharacteristics.class);
  }

  @Override
  @NotNull
  public SqlSpecificRoutineDesignator getSpecificRoutineDesignator() {
    return findNotNullChildByClass(SqlSpecificRoutineDesignator.class);
  }

}
