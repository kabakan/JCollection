package com.ocp_8.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * 2. Which of the following changes when made independently would make this code compile? (Choose all that apply.)
 * <p>
 * 2. B, C. Option A is incorrect because it will move the compilation error to the close() method
 * since it does throw an exception that must be handled or declared. Option B is correct
 * because the unhandled exception becomes declared. Option C is correct because the exception
 * becomes handled. Option D is incorrect because the exception remains unhandled.
 * <p>
 * A. Remove throws Exception from the declaration on line 2.
 * B. Add throws Exception to the declaration on line 5.  ***
 * C. Change line 8 to } catch (Exception e) {}. ***
 * D. Change line 8 to } finally {}.
 * E. None of the above will make the code compile.
 * F. The code already compiles as is.
 */
public class Test02 {
}

class StuckTurkeyCage implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args) {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}