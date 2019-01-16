package com.sqlplugin.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author qiuyj
 */
public class SqlFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        /**  Example for multi file extensions.
            for (FileType ft : Arrays.asList(JavaClassFileType.INSTANCE, JavaFileType.INSTANCE, JShellFileType.INSTANCE)) {
            consumer.consume(ft, ft.getDefaultExtension());
         }
         */
        for (FileType ft : Arrays.asList(SqlPrcFileType.INSTANCE, SqlFileType.INSTANCE, SqlTabFileType.INSTANCE)) {
            fileTypeConsumer.consume(ft, ft.getDefaultExtension());
        }
    }
}
