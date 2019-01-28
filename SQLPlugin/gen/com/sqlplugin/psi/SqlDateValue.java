// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDateValue extends PsiElement {

  @NotNull
  SqlDaysValue getDaysValue();

  @NotNull
  List<SqlMinusSign> getMinusSignList();

  @NotNull
  SqlMonthsValue getMonthsValue();

  @NotNull
  SqlYearsValue getYearsValue();

}
