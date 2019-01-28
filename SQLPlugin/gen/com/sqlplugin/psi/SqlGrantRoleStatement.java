// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlGrantRoleStatement extends PsiElement {

  @NotNull
  List<SqlComma> getCommaList();

  @NotNull
  List<SqlGrantee> getGranteeList();

  @Nullable
  SqlGrantor getGrantor();

  @NotNull
  List<SqlRoleGranted> getRoleGrantedList();

}
