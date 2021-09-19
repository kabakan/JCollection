package com.ocp_8.chapter08IO;

import java.io.*;

/**
 * Created by Kanat KB on 19.10.2017.
 * 10. The following method is designed to delete a directory tree recursively. Which of the
 * following properties reflect the method definition? (Choose all that apply.)
 * <p>
 * 10. C, F. The code compiles, so D and E are incorrect. There is a bug in the method in that
 * file.delete() should be executed at the end of the method for both files and directories
 * alike. As written, the method will delete all files within a directory but none of the directories
 * themselves. Therefore, A and B are incorrect and C is correct. F is correct, because
 * most methods in the File class that interact with the file system are capable of throwing an
 * exception at runtime, such as when the directory does not exist.
 * <p>
 * A. It can delete a directory that contains only files.
 * B. It can delete a directory tree of arbitrary length.
 * C. It can delete a single file.                        ***
 * D. The code will not compile because of line 2.
 * E. The code will not compile because of line 3.
 * F. It compiles but may throw an exception at runtime.  ***
 */
public class Test10 {
    public static void main(String[] args) {
        File file = new File("C:\\KANATKB\\soft\\JCollection\\temp\\data\\zoo.txt");
        deleteTree(file);
    }

    public static void deleteTree(File file) {
        if (!file.isFile())
            for (File entry : file.listFiles())
                deleteTree(entry);
        else file.delete();
    }

}
