package com.ocp_8.chapter03Collections;

import java.util.*;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 5. Which of these statements compile? (Choose all that apply.)
 * <p>
 * 5. B, C, F. Option A does not compile because the generic types are not compatible. We could
 * say HashSet<? extends Number> hs2 = new HashSet<Integer>();. Option B uses a lower bound, so
 * it allows superclass generic types. Option C is a traditional use of generics
 * where the generic type is the same and the List type uses the interface as the type. Option
 * D does not compile because a Set is not a List. Option E does not compile because upper
 * bounds are not allowed when instantiating the type. Finally, Option F does compile because
 * the upper bound is on the correct side of =.
 * <p>
 * A. HashSet<Number> hs = new HashSet<Integer>();
 * B. HashSet<? super ClassCastException> set = new HashSet<Exception>();  ***
 * C. List<String> list = new Vector<String>();   ***
 * D. List<Object> values = new HashSet<Object>();
 * E. List<Object> objects = new ArrayList<? extends Object>();
 * F. Map<String, ? extends Number> hm = new HashMap<String, Integer>(); ***
 */
public class Test05 {
    public static void main(String[] args) {
        //  HashSet<Number> hs = new HashSet<Integer>(); //A.
        HashSet<? super ClassCastException> set = new HashSet<Exception>(); //B.
        List<String> list = new Vector<String>(); //C.
        //  List<Object> values = new HashSet<Object>(); //D.
        //  List<Object> objects = new ArrayList<? extends Object>(); //E.
        Map<String, ? extends Number> hm = new HashMap<String, Integer>(); //F.
    }
}
