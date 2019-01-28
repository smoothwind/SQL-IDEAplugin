// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAlterGroup extends PsiElement {

  @NotNull
  SqlAlterTransformActionList getAlterTransformActionList();

  @NotNull
  SqlGroupName getGroupName();

  @NotNull
  SqlLeftParen getLeftParen();

  @NotNull
  SqlRightParen getRightParen();

}
