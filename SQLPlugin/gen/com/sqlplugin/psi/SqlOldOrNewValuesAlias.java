// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlOldOrNewValuesAlias extends PsiElement {

  @Nullable
  SqlNewValuesCorrelationName getNewValuesCorrelationName();

  @Nullable
  SqlNewValuesTableAlias getNewValuesTableAlias();

  @Nullable
  SqlOldValuesCorrelationName getOldValuesCorrelationName();

  @Nullable
  SqlOldValuesTableAlias getOldValuesTableAlias();

}
