// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDatetimeLiteral extends PsiElement {

  @Nullable
  SqlDateLiteral getDateLiteral();

  @Nullable
  SqlTimeLiteral getTimeLiteral();

  @Nullable
  SqlTimestampLiteral getTimestampLiteral();

}
