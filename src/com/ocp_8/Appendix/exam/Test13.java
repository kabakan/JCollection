package com.ocp_8.Appendix.exam;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 13. A,E. First off, the code compiles without issue, so B and C are incorrect. Next, it is possible
 for a directory to have an extension in the name, so A is correct, albeit uncommon. D is
 an incorrect answer, and it relates to threading, not a DirectoryStream walk process. E is
 correct, at least tangentially, because NotDirectoryException and NoSuchFileException
 extend IOException. *
 *
 * B. The code will not compile because of line 2.
 */
public class Test13 {
    public static void main(String [] args) {
         Path path = Paths.get("turtle.txt");
       /*  try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
             for (Path entry: directoryStream)
                 System.out.println(entry.getFileName());
             }
        } */
    }
}
