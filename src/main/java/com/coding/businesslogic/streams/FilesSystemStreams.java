package com.coding.businesslogic.streams;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This program lists the files under a Directory <Top Level>
 */
public class FilesSystemStreams {
    public static void main(String[] args) {
        String workingDirectory = "/Users/rajatbhatnagar/cisl";
        Path workingDirPath = FileSystems.getDefault().getPath(workingDirectory);
        try {
            Files.list(workingDirPath).forEach(
                            System.out::println
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
