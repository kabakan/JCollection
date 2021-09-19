package com.ocp_8.chapter03Collections;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Vector;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 13. Which of these statements can fill in the blank so that the Wildcard class compiles
 * successfully? (Choose all that apply.)
 * <p>
 * 13. B, E. showSize() can take any type of List since it uses an unbounded wildcard. Option
 * A is incorrect because it is a Queue and not a List. Option C is incorrect because the wildcard
 * is not allowed to be on the right side of an assignment. Option D is incorrect because
 * the generic types are not compatible. Option B is correct because a lower-bounded wildcard
 * allows that same type to be the generic. Option E is correct because Integer is a subclass
 * of Number. Vector is an old type of List. It isn’t common in new code, but you still need to
 * know it for the exam and in case you encounter old code.
 * <p>
 * A. ArrayDeque<?> list = new ArrayDeque<String>();
 * B. ArrayList<? super Date> list = new ArrayList<Date>();  ***
 * C. List<?> list = new ArrayList<?>();
 * D. List<Exception> list = new LinkedList<java.io.IOException>();
 * E. Vector<? extends Number> list = new Vector<Integer>();  ***
 * F. None of the above
 */
class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        ArrayDeque<?> list = new ArrayDeque<String>();
        // ArrayList<? super Date> list1 = new ArrayList<Date>();
        //  List<?> list2 = new ArrayList<?>();
        // List<Exception> list3 = new LinkedList<IOException>();
        Vector<? extends Number> list4 = new Vector<Integer>();
        card.showSize(list4);
    }
}
public class Test13 {
}
