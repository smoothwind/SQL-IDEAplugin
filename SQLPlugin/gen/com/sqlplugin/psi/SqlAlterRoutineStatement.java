// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlAlterRoutineStatement extends PsiElement {

  @NotNull
  SqlAlterRoutineBehavior getAlterRoutineBehavior();

  @NotNull
  SqlAlterRoutineCharacteristics getAlterRoutineCharacteristics();

  @NotNull
  SqlSpecificRoutineDesignator getSpecificRoutineDesignator();

}
