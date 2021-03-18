package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 10. What is the difference between the WatchService method take() and the no-argument
 version of poll()? (Choose all that apply.)

 10. A,D. Remember that take() waits indefinitely for a key, whereas the no-argument poll()
 returns immediately with null if there are no keys; therefore D is correct. Since take()
 waits indefinitely, it can throw an InterruptedException, so A is correct. B is incorrect,
 because the method does not wait. C has the descriptions of the methods reversed, and it is
 thus incorrect. E and F are completely false statements.

 A. Only take() can throw an InterruptedException.   ***
 B. Only poll() can throw an InterruptedException.
 C. take() returns immediately; poll() waits indefinitely.
 D. Unlike take(), poll() returns null if no keys are present.  ***
 E. By default, take() waits up to one minute for a key.
 F. None. The methods behave identically.
 */
public class Test10 {
}
