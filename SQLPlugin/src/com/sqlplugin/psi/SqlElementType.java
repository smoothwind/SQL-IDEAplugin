package com.sqlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.sqlplugin.SQLLanguage;
import org.jetbrains.annotations.NonNls;

/**
 * @author qiuyj
 */
public class SqlElementType extends IElementType {

    public SqlElementType(@NonNls String debugName){
        super(debugName, SQLLanguage.INSTANCE);
    }
}
