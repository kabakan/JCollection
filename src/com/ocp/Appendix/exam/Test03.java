package com.ocp.Appendix.exam;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * 3. Assuming that we have access to a WatchService object, which has been properly initialized
 and registered with at least one Path, what two problems make the code unusable?

 3. A,E. First off, the WatchService.poll() method returns immediately with a value
 of null if there are no events available. Unless the file system is constantly busy, this
 code is likely to produce a NullPointerException on line 3 almost immediately after
 it starts, rendering the code unusable; therefore A is correct. The other major problem
 with this code is that the WatchKey method reset() is not called after the WatchKey
 is processed, meaning that this code can receive at most one event, at which point it
 loops infinitely; therefore E is correct. B is irrelevant information and therefore incorrect.
 For event type, it is recommended that you check for OVERFLOW events but it is
 not required, so C is incorrect. The event details can be outputted without casting to
 WatchEvent<Path>, so D is incorrect. Infinite loops are common with the WatchService
 API, so F is incorrect.

 * Created by Kanat KB on 04.11.2017.
 */
public class Test03 {
    public static void main(String[] args) {
        WatchService watchService = null;
        for (; ; ) {
            WatchKey key = watchService.poll();
            for (WatchEvent<?> event : key.pollEvents())
                System.out.println(event.kind() + "," + event.context());
        }
    }
}
