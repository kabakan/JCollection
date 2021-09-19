package com.ocp_8.chapter08IO;

import java.io.*;

/*
 * Created by Kanat KB on 19.10.2017.
 * 15. Assuming zoo-data.txt is a multiline text file, what is true of the following method?
 *
 * 15. A. This code compiles and runs without issue, so C and E are incorrect. It uses a try-withresource
block to open the FileReader and BufferedReader objects. Therefore, both get
closed automatically, and D is incorrect. The body of the try block reads in the first line
of the file and outputs it to the user. Therefore, A is correct. Since the rest of the file is not
read, B is incorrect.
 *
 A. It prints the first line of the file to the console.   ***
 B. It prints the entire contents of the file.
 C. The code does not compile because the reader is not closed.
 D. The code does compile, but the reader is not closed.
 E. The code does not compile for another reason.
 */
public class Test15 {
    public static void main(String[] args) throws IOException {
        echo();
    }

    private static void echo() throws IOException {
        try (FileReader fileReader = new FileReader("zoo-data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
