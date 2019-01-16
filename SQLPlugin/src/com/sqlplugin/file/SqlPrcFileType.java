package com.sqlplugin.file;


import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author qiuyj
 */
public class SqlPrcFileType implements FileType {
    public static final SqlPrcFileType INSTANCE = new SqlPrcFileType();

    private SqlPrcFileType() {

    }


    @Override
    @NotNull
    public String getName() {
        return "Procedure";
    }


    @Override
    @NotNull
    public String getDescription() {
        return "Storage procedure";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "prc";
    }

    @Override
    public Icon getIcon() {
        return SqlIcons.PRC_FILE;
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
