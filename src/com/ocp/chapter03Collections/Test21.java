package com.ocp.chapter03Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 21. Fill in the blanks to make this code compile and print 123. (Choose all that apply.)
 * <p>
 * 21. A, F. You have to memorize this. hasNext() returns a boolean, and it is used in the loop.
 * next() returns the next element.
 * <p>
 * A. On line 6, fill in the blank with hasNext().  ***
 * B. On line 6, fill in the blank with isNext().
 * C. On line 6, fill in the blank with next().
 * D. On line 7, fill in the blank with getNext().
 * E. On line 7, fill in the blank with hasNext().
 * F. On line 7, fill in the blank with next().  ***
 */
public class Test21 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        Iterator iter = list.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
    }
}
