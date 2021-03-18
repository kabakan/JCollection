package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Kanat KB on 24.10.2017.
 * 10. What is correct about the following code snippet? (Choose all that apply.)
 * <p>
 * 10. C, E. The REPLACE_EXISTING flag was not provided, so if the target exists, it will throw
 * an exception at runtime and A is incorrect. Next, the NOFOLLOW_LINKS option means that
 * if the source is a symbolic link, the link itself and not the target will be copied at runtime,
 * so B is also incorrect. The option ATOMIC_MOVE means that any process monitoring the file
 * system will not see an incomplete file during the move, so C is correct. D is incorrect, since
 * you could rename a file not to have an extension. Note that in this example, if monkey.txt
 * is a file, then the resulting /animals would be a file, not a directory. Likewise, if the source
 * is a directory, the result would also be a directory. E is correct, because moving always preserves
 * the metadata even if the COPY_ATTRIBUTES flag is not set.
 * <p>
 * A. If /animals exists, it will be overwritten at runtime.
 * B. If monkey.txt is a symbolic link, the file it points to will be moved at runtime.
 * C. If another process is monitoring the file system, it will not see an incomplete file at
 * runtime.
 * D. The code will always throw an exception, since no filename is specified in the target
 * folder path.
 * E. The metadata of the monkey.txt will be moved along with the file.
 */
public class Test10 {
    public static void main(String[] arg) throws IOException {
        Files.move(Paths.get("data.txt"), Paths.get("./temp/bats"),
                StandardCopyOption.ATOMIC_MOVE,
                LinkOption.NOFOLLOW_LINKS);
    }
}
