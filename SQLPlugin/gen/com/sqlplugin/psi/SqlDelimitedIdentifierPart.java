// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlDelimitedIdentifierPart extends PsiElement {

  @Nullable
  SqlUnicodeDelimiterBody getUnicodeDelimiterBody();

  @Nullable
  SqlUnicodeEscapeSpecifier getUnicodeEscapeSpecifier();

  @Nullable
  SqlAmpersand getAmpersand();

  @NotNull
  List<SqlDoubleQuote> getDoubleQuoteList();

  @Nullable
  SqlDoublequoteSymbol getDoublequoteSymbol();

  @Nullable
  SqlNondoublequoteCharacter getNondoublequoteCharacter();

}
