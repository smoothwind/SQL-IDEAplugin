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

public class SqlDynamicFetchStatementImpl extends ASTWrapperPsiElement implements SqlDynamicFetchStatement {

  public SqlDynamicFetchStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitDynamicFetchStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SqlDynamicCursorName getDynamicCursorName() {
    return findNotNullChildByClass(SqlDynamicCursorName.class);
  }

  @Override
  @Nullable
  public SqlFetchOrientation getFetchOrientation() {
    return findChildByClass(SqlFetchOrientation.class);
  }

  @Override
  @NotNull
  public SqlOutputUsingClause getOutputUsingClause() {
    return findNotNullChildByClass(SqlOutputUsingClause.class);
  }

}
