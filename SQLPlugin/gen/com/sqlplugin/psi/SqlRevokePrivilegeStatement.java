// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlRevokePrivilegeStatement extends PsiElement {

  @Nullable
  SqlComma getComma();

  @NotNull
  SqlDropBehavior getDropBehavior();

  @NotNull
  List<SqlGrantee> getGranteeList();

  @Nullable
  SqlGrantor getGrantor();

  @NotNull
  SqlPrivileges getPrivileges();

  @Nullable
  SqlRevokeOptionExtension getRevokeOptionExtension();

}
