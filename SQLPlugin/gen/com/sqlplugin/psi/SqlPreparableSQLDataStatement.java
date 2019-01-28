// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlPreparableSQLDataStatement extends PsiElement {

  @Nullable
  SqlDeleteStatementSearched getDeleteStatementSearched();

  @Nullable
  SqlDynamicSelectStatement getDynamicSelectStatement();

  @Nullable
  SqlDynamicSingleRowSelectStatement getDynamicSingleRowSelectStatement();

  @Nullable
  SqlInsertStatement getInsertStatement();

  @Nullable
  SqlMergeStatement getMergeStatement();

  @Nullable
  SqlPreparableDynamicDeleteStatementPositioned getPreparableDynamicDeleteStatementPositioned();

  @Nullable
  SqlPreparableDynamicUpdateStatementPositioned getPreparableDynamicUpdateStatementPositioned();

  @Nullable
  SqlUpdateStatementSearched getUpdateStatementSearched();

}
