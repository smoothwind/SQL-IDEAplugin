// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSQLDataChangeStatement extends PsiElement {

  @Nullable
  SqlDeleteStatementPositioned getDeleteStatementPositioned();

  @Nullable
  SqlDeleteStatementSearched getDeleteStatementSearched();

  @Nullable
  SqlInsertStatement getInsertStatement();

  @Nullable
  SqlMergeStatement getMergeStatement();

  @Nullable
  SqlUpdateStatementPositioned getUpdateStatementPositioned();

  @Nullable
  SqlUpdateStatementSearched getUpdateStatementSearched();

}
