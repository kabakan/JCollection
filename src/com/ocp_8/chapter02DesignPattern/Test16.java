package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 29.08.2017.
 * <p>
 * 16. Choose the correct statement about the following code:
 * <p>
 * 16. F. The interface variable amount is correctly declared, with public, static, and final
 * being assumed and automatically inserted by the compiler, so B is incorrect. The method
 * declaration for eatGrass() on line 3 is incorrect because the method has been marked as
 * static but no method body has been provided. The method declaration for chew() on
 * line 4 is also incorrect, since an interface method that provides a body must be marked as
 * default or static explicitly. Therefore, F is the correct answer since this code contains
 * two compile-time errors.
 * <p>
 * A. It compiles and runs without issue.
 * B. The code will not compile because of line 2.
 * C. The code will not compile because of line 3.
 * D. The code will not compile because of line 4.
 * E. The code will not compile because of lines 2 and 3.
 * F. The code will not compile because of lines 3 and 4.  ***
 * /*
 * public interface Herbivore {
 * int amount = 10;
 * public static void eatGrass(); //line 3
 * <p>
 * public int chew() { //line 3
 * return 13;
 * }
 * }
 */

public  class Test16 {

}