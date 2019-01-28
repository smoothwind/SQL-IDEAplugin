// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlWidthBucketFunction extends PsiElement {

  @NotNull
  List<SqlComma> getCommaList();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

  @NotNull
  SqlWidthBucketBound1 getWidthBucketBound1();

  @NotNull
  SqlWidthBucketBound2 getWidthBucketBound2();

  @NotNull
  SqlWidthBucketCount getWidthBucketCount();

  @NotNull
  SqlWidthBucketOperand getWidthBucketOperand();

}
