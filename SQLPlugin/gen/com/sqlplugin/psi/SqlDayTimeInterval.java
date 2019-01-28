// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDayTimeInterval extends PsiElement {

  @NotNull
  List<SqlColon> getColonList();

  @NotNull
  SqlDaysValue getDaysValue();

  @Nullable
  SqlHoursValue getHoursValue();

  @Nullable
  SqlMinutesValue getMinutesValue();

  @Nullable
  SqlSecondsValue getSecondsValue();

  @Nullable
  SqlSpace getSpace();

}
