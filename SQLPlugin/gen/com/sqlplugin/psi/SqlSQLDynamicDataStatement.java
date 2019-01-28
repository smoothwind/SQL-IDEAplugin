// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLDynamicDataStatement extends PsiElement {

  @Nullable
  SqlAllocateCursorStatement getAllocateCursorStatement();

  @Nullable
  SqlDynamicCloseStatement getDynamicCloseStatement();

  @Nullable
  SqlDynamicDeleteStatementPositioned getDynamicDeleteStatementPositioned();

  @Nullable
  SqlDynamicFetchStatement getDynamicFetchStatement();

  @Nullable
  SqlDynamicOpenStatement getDynamicOpenStatement();

  @Nullable
  SqlDynamicUpdateStatementPositioned getDynamicUpdateStatementPositioned();

}
