package com.ocp_8.chapter03Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 7. Which of the following statements are true? (Select two.)
 * <p>
 * 7. A, D. The code compiles fine. It uses the diamond operator, and it allows any implementation
 * of Number to be added. HashSet does not guarantee any iteration order, making A and
 * <p>
 * A. The code compiles successfully.  ***
 * B. The output is 8675null309.
 * C. The output is 867586null309.
 * D. The output is indeterminate.  ***
 * E. There is a compiler error on line 3.
 * F. There is a compiler error on line 9.
 * G. An exception is thrown.
 */
public class Test07 {
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
    }
}
