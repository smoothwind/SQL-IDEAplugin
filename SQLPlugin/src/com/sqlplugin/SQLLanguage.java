package com.sqlplugin;

import com.intellij.lang.Language;

/**
 * @author qiuyj
 */
public class SQLLanguage extends Language {
    public static final SQLLanguage INSTANCE = new SQLLanguage();
    private  SQLLanguage() { super("SQL");}
}
