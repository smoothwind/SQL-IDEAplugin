package com.sqlplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SqlTokenType extends IElementType {
    public SqlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SQLLanguage.INSTANCE);
    }
}
