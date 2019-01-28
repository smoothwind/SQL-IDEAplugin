// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlCharacterValueFunction extends PsiElement {

  @Nullable
  SqlCharacterOverlayFunction getCharacterOverlayFunction();

  @Nullable
  SqlCharacterSubstringFunction getCharacterSubstringFunction();

  @Nullable
  SqlCharacterTransliteration getCharacterTransliteration();

  @Nullable
  SqlFold getFold();

  @Nullable
  SqlNormalizeFunction getNormalizeFunction();

  @Nullable
  SqlRegularExpressionSubstringFunction getRegularExpressionSubstringFunction();

  @Nullable
  SqlSpecificTypeMethod getSpecificTypeMethod();

  @Nullable
  SqlTranscoding getTranscoding();

  @Nullable
  SqlTrimFunction getTrimFunction();

}
