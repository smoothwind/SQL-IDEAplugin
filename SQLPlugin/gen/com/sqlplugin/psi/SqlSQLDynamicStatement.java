// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLDynamicStatement extends PsiElement {

  @Nullable
  SqlSQLDynamicDataStatement getSQLDynamicDataStatement();

  @Nullable
  SqlDeallocatePreparedStatement getDeallocatePreparedStatement();

  @Nullable
  SqlDescribeStatement getDescribeStatement();

  @Nullable
  SqlExecuteImmediateStatement getExecuteImmediateStatement();

  @Nullable
  SqlExecuteStatement getExecuteStatement();

  @Nullable
  SqlPrepareStatement getPrepareStatement();

  @Nullable
  SqlSystemDescriptorStatement getSystemDescriptorStatement();

}
