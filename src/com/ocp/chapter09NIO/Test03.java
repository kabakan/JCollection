package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Kanat KB on 24.10.2017.
 * 3. What is the result of executing the following code? (Choose all that apply.)
 * <p>
 * 3. D. The setTimes() method is available only on BasicFileAttributeView, not the readonly
 * BasicFileAttributes class, so line 4 will not compile and D is correct. You need to
 * retrieve an instance of the view class to update the data. The rest of the lines compile without
 * issue and only D is correct.
 * <p>
 * A. It compiles and runs without issue.
 * B. The code will not compile because of line 2.
 * C. The code will not compile because of line 3.
 * D. The code will not compile because of line 4.  ***
 * E. The code compiles but throws an exception at runtime.
 */
public class Test03 {
    public static void main(String[] arg) throws IOException {
        Path path = Paths.get("sloth.schedule");
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
            //attributes.setTimes(null,null,null);   //4
        }
    }
}
