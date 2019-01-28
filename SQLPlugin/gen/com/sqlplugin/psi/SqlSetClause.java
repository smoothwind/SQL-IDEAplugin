// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSetClause extends PsiElement {

  @Nullable
  SqlEqualsOperator getEqualsOperator();

  @Nullable
  SqlMultipleColumnAssignment getMultipleColumnAssignment();

  @Nullable
  SqlSetTarget getSetTarget();

  @Nullable
  SqlUpdateSource getUpdateSource();

}
