// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlBlobOverlayFunction extends PsiElement {

  @NotNull
  List<SqlBlobValueExpression> getBlobValueExpressionList();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlStartPosition getStartPosition();

  @Nullable
  SqlStringLength getStringLength();

}
