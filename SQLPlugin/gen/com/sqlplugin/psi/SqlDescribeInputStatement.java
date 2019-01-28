// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDescribeInputStatement extends PsiElement {

  @NotNull
  SqlSQLStatementName getSQLStatementName();

  @Nullable
  SqlNestingOption getNestingOption();

  @NotNull
  SqlUsingDescriptor getUsingDescriptor();

}
