package com.ocp_8.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 20. Which of the following steps are required to use the WatchService correctly? (Choose all
 that apply.)

 20. D,E,F. Infinite loops are optional but not required when using the WatchService API, so A
 is incorrect. Ignoring OVERFLOW events is left to your discretion, so B is incorrect. There are
 no guidelines for how to process or respond to events when they happen, so C is incorrect.
 D is correct, because failure to reset a WatchKey will prevent you from receiving all future
 event notifications, rendering the WatchService useless. E is also correct in that if you
 do not register any objects, the WatchService does not do anything. Finally, F is correct,
 because the WatchService should be closed after use, preferably with a try-with-resource
 block if opened and closed in the same method.

 A. Iterate over the WatchService with an infinite loop.
 B. Stop using the WatchService if an OVERFLOW event is reported.
 C. Read the object returned by the WatchEvent context() method that is associated
 with the event.
 D. Reset a WatchKey when you are finished with it.    ***
 E. Register WatchService with at least one object and event. ***
 F. Close the WatchService when you are finished with it.  ***
 */
public class Test20 {
}
