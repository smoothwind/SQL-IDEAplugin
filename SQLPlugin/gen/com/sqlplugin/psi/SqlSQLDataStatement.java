// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLDataStatement extends PsiElement {

  @Nullable
  SqlSQLDataChangeStatement getSQLDataChangeStatement();

  @Nullable
  SqlCloseStatement getCloseStatement();

  @Nullable
  SqlFetchStatement getFetchStatement();

  @Nullable
  SqlFreeLocatorStatement getFreeLocatorStatement();

  @Nullable
  SqlHoldLocatorStatement getHoldLocatorStatement();

  @Nullable
  SqlOpenStatement getOpenStatement();

  @Nullable
  SqlSelectStatementSingleRow getSelectStatementSingleRow();

}
