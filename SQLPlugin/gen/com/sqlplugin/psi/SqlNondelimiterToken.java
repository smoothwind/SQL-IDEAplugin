// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlNondelimiterToken extends PsiElement {

  @Nullable
  SqlKeyWord getKeyWord();

  @Nullable
  SqlLargeObjectLengthToken getLargeObjectLengthToken();

  @Nullable
  SqlMultiplier getMultiplier();

  @Nullable
  SqlNationalCharacterStringLiteral getNationalCharacterStringLiteral();

  @Nullable
  SqlRegularIdentifier getRegularIdentifier();

  @Nullable
  SqlUnsignedNumericLiteral getUnsignedNumericLiteral();

}
