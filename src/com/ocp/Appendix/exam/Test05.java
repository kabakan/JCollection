package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 *5. D. The code does not compile because in order to implement the FileVisitor interface,
 all four visitor methods must be provided, so D is correct. If instead of implementing the
 FileVisitor interface, it extended the SimpleFileVisitor class, which does not require
 any methods to be overridden, then the code would compile and produce the list of filenames
 in the directory tree, making B the correct answer.
 * D. The code will not compile because of line 1.
 */
public class Test05 {
}
/*
 public class FilePrinter implements FileVisitor<Path> {
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
    throws IOException {
        System.out.println("Found file: "+file.getFileName());
         return FileVisitResult.CONTINUE;
         }
     }
*/