package com.ocp.Appendix.exam;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 16. B,F. The code compiles without issue, so C, D, and E are each incorrect. Because a subclass
 of FileVisitor was used and not the DirectoryStream class, the code will recursively
 delete all matching files in the /zoo/data directory, so B is correct and A is incorrect.
 Finally, if the directory path does not exist or is not accessible in the file system, an exception
 will be thrown at runtime, so F is also correct.
 *
 */
public class Test16 {
}

class DeleteFilesWithExtension extends SimpleFileVisitor<Path> {
    private String extension;

    public DeleteFilesWithExtension(String extension) {
        this.extension = extension;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        if (file.getFileName().endsWith(extension) && !attrs.isSymbolicLink())
            Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("/zoo/data"),
                new DeleteFilesWithExtension("txt"));
    }
}