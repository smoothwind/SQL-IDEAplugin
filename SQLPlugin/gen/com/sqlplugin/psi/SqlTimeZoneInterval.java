// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTimeZoneInterval extends PsiElement {

  @NotNull
  SqlColon getColon();

  @NotNull
  SqlHoursValue getHoursValue();

  @NotNull
  SqlMinutesValue getMinutesValue();

  @NotNull
  SqlSign getSign();

}
