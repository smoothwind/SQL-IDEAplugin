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

public class SqlDropRoutineStatementImpl extends ASTWrapperPsiElement implements SqlDropRoutineStatement {

  public SqlDropRoutineStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDropRoutineStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDropBehavior getDropBehavior() {
    return findNotNullChildByClass(SqlDropBehavior.class);
  }

  @Override
  @NotNull
  public SqlSpecificRoutineDesignator getSpecificRoutineDesignator() {
    return findNotNullChildByClass(SqlSpecificRoutineDesignator.class);
  }

}
