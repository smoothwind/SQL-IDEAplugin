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

public class SqlCommonSequenceGeneratorOptionImpl extends ASTWrapperPsiElement implements SqlCommonSequenceGeneratorOption {

  public SqlCommonSequenceGeneratorOptionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SqlVisitor visitor) {
    visitor.visitCommonSequenceGeneratorOption(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SqlVisitor) accept((SqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SqlBasicSequenceGeneratorOption getBasicSequenceGeneratorOption() {
    return findChildByClass(SqlBasicSequenceGeneratorOption.class);
  }

  @Override
  @Nullable
  public SqlSequenceGeneratorStartWithOption getSequenceGeneratorStartWithOption() {
    return findChildByClass(SqlSequenceGeneratorStartWithOption.class);
  }

}
