package com.ocp_8.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 10. Which of the following are true of the code? (Choose all that apply.)
 * <p>
 * 10. A, E. Line 5 does not compile because assert is a reserved word making Choice A correct.
 * B and C are incorrect because the parenthesis and message are both optional. D is incorrect
 * because assertions should not have side effects. E is correct because checking an argument
 * passed from elsewhere in the program is an appropriate use of an assertion.
 * <p>
 * A. Line 5 does not compile.  ***
 * B. Lines 6 and 7 do not compile because they are missing the String message.
 * C. Lines 6 and 7 do not compile because they are missing parentheses.
 * D. Line 6 is an appropriate use of an assertion.
 * E. Line 7 is an appropriate use of an assertion  ***
 */
public class Test10 {
    private int addPlusOne(int a, int b) {
        //boolean assert = false;
        assert a++ > 0;
        assert b > 0;
        return a + b;
    }
}
