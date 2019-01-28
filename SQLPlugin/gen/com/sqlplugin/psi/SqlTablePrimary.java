// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTablePrimary extends PsiElement {

  @Nullable
  SqlCollectionDerivedTable getCollectionDerivedTable();

  @Nullable
  SqlCorrelationName getCorrelationName();

  @Nullable
  SqlDerivedColumnList getDerivedColumnList();

  @Nullable
  SqlDerivedTable getDerivedTable();

  @Nullable
  SqlJoinedTable getJoinedTable();

  @Nullable
  SqlLateralDerivedTable getLateralDerivedTable();

  @Nullable
  SqlLeftParen getLeftParen();

  @Nullable
  SqlOnlySpec getOnlySpec();

  @Nullable
  SqlRightParen getRightParen();

  @Nullable
  SqlTableFunctionDerivedTable getTableFunctionDerivedTable();

  @Nullable
  SqlTableOrQueryName getTableOrQueryName();

}
