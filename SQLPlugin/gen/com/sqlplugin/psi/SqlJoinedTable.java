// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlJoinedTable extends PsiElement {

  @Nullable
  SqlCrossJoin getCrossJoin();

  @Nullable
  SqlNaturalJoin getNaturalJoin();

  @Nullable
  SqlQualifiedJoin getQualifiedJoin();

  @Nullable
  SqlUnionJoin getUnionJoin();

}
