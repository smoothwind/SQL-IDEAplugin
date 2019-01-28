// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlConditionInformation extends PsiElement {

  @Nullable
  SqlComma getComma();

  @NotNull
  List<SqlConditionInformationItem> getConditionInformationItemList();

  @NotNull
  SqlConditionNumber getConditionNumber();

}
