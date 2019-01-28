// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlReferenceType extends PsiElement {

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlReferencedType getReferencedType();

  @NotNull
  SqlRightParen getRightParen();

  @Nullable
  SqlScopeClause getScopeClause();

}
