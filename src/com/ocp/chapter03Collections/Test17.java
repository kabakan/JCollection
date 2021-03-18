package com.ocp.chapter03Collections;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 17. Which two options can fill in the blanks to make this code compile? (Choose all that apply.)
 * <p>
 * 17. B, D. Line 1 is a generic class that requires specifying a name for the type. Options A and
 * C are incorrect because no type is specified. Line 3 tries to use the diamond operator to
 * instantiate the class. Option E is incorrect because T is not a class and certainly not one
 * compatible with String. Option F is incorrect because a wildcard cannot be specified on
 * the right side when instantiating an object.
 * <p>
 * A. On line 1, fill in with <>.
 * B. On line 1, fill in with <T>.  ***
 * C. On line 1, fill in with <?>.
 * D. On line 3, fill in with <>.  ***
 * E. On line 3, fill in with <T>.
 * F. On line 3, fill in with <?>.
 */
class Generic<T> {  //line 1
    public static void main(String[] args) {
        Generic<String> g = new Generic<>(); //line 3
        Generic<Object> g2 = new Generic();
    }
}
public class Test17 {
}
