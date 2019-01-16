package com.sqlplugin.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author qiuyj
 */
public class SqlTabFileType implements FileType {
    public static final SqlTabFileType INSTANCE = new SqlTabFileType();
    private SqlTabFileType(){}

    @NotNull
    @Override
    public String getName() {
        return "Table creation scripts";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "SQL file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "tab";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SqlIcons.TAB_FILE;
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Nullable
    @Override
    public String getCharset(@NotNull VirtualFile virtualFile, @NotNull byte[] bytes) {
        return virtualFile.getCharset().toString();
    }
}
