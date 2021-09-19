package com.ocp_8.chapter03Collections;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 22. What code change is needed to make the method compile?
 * <p>
 * 22. B. When using generic types in a static method, the generic specification goes before the
 * return type.
 * <p>
 * A. Add <T> after the public keyword.
 * B. Add <T> after the static keyword.  ***
 * C. Add <T> after T.
 * D. Add <?> after the public keyword.
 * E. Add <?> after the static keyword.
 * F. No change required. The code already compiles.
 */
public class test22 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static <T> T identity(T t) {
        return t;
    }
}
