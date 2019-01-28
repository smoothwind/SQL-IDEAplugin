// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlTriggerDefinition extends PsiElement {

  @Nullable
  SqlOldOrNewValuesAliasList getOldOrNewValuesAliasList();

  @NotNull
  SqlTableName getTableName();

  @NotNull
  SqlTriggerActionTime getTriggerActionTime();

  @NotNull
  SqlTriggerEvent getTriggerEvent();

  @NotNull
  SqlTriggerName getTriggerName();

  @NotNull
  SqlTriggeredAction getTriggeredAction();

}
