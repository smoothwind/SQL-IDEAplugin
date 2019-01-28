// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlSetDescriptorInformation extends PsiElement {

  @Nullable
  SqlComma getComma();

  @Nullable
  SqlItemNumber getItemNumber();

  @NotNull
  List<SqlSetHeaderInformation> getSetHeaderInformationList();

  @NotNull
  List<SqlSetItemInformation> getSetItemInformationList();

}
