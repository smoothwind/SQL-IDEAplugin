package com.sqlplugin.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import com.sqlplugin.SQLLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @Author: qiuyj
 * 定义SQL文件类型
 */
public class SqlFileType extends LanguageFileType {
    public static final SqlFileType INSTANCE = new SqlFileType();

    private SqlFileType() {
        super(SQLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SQL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "SQL File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "SQL";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SqlIcons.SQL_FILE;
    }
}
