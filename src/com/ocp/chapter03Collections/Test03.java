package com.ocp.chapter03Collections;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 3. What is the result of the following statements?
 * <p>
 * 3. E. The code does not compile. It attempts to mix generics and legacy code. Lines 3 through
 * 7 create an ArrayList without generics. This means that we can put any objects in it.
 * Line 7 should be looping through a list of Objects rather than Strings since we didn’t use
 * generics.
 * <p>
 * A. onetwo
 * B. onetwo7
 * C. onetwo followed by an exception
 * D. Compiler error on line 6
 * E. Compiler error on line 7  ***
 */
public class Test03 {
    // List list = new ArrayList();
    // list.add("one");
    // list.add("two");
    // list.add(7); //line 6
    //  for (String s: list) //line 7
    // System.out.print(s);
}
