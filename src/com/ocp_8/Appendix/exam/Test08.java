package com.ocp_8.Appendix.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanat KB on 04.11.2017.
 * 8. A,B,C. Option A compiles since it is allowed to use generics on just one side in a declaration.
 Option B compiles using the diamond operator. Option C is a longer form of option B;
 it spells out the generics type. Option D does not compile because the diamond operator is
 allowed only on the right side. Option E does not compile because List is allowed only on
 the left side, since it’s an interface rather than a concrete type. Option F does not compile
 because primitives are not allowed to be ArrayList types. Autoboxing works only when
 working with the ArrayList, not when declaring it.
 */
public class Test08 {
    public static void main(String[] args) {
         List<Integer> l1 = new ArrayList();               //A
         List<Integer> l2 = new ArrayList<>();             //B
         List<Integer> l3 = new ArrayList<Integer>();      //C
        // List<> l4 = new ArrayList<Integer>();             //D
         //List<Integer> l5 = new List<Integer>();           //F
         //ArrayList<int> l6 = new List<int>();              //G
    }
}
