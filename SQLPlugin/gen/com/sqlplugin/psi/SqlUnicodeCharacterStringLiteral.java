// This is a generated file. Not intended for manual editing.
package com.sqlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SqlUnicodeCharacterStringLiteral extends PsiElement {

  @NotNull
  List<SqlUnicodeRepresentation> getUnicodeRepresentationList();

  @NotNull
  SqlAmpersand getAmpersand();

  @Nullable
  SqlCharacterSetSpecification getCharacterSetSpecification();

  @Nullable
  SqlEscapeCharacter getEscapeCharacter();

  @Nullable
  SqlIntroducer getIntroducer();

  @NotNull
  List<SqlQuote> getQuoteList();

  @Nullable
  SqlSeparator getSeparator();

}
