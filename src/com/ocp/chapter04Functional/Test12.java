package com.ocp.chapter04Functional;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Created by Kanat KB on 02.10.2017.
 * 12. Which functional interfaces complete the following code? (Choose all that apply.)
 * <p>
 * 12. A, F, G. Line 6 doesn’t take any parameters, and it returns a String, making it a Supplier.
 * Another clue is that it uses a constructor reference, which should scream Supplier!
 * This makes choice F correct. Line 7 takes two parameters, and it doesn’t return anything
 * making it a BiConsumer. The print statement should also be a clue that we are dealing with
 * a Consumer or BiConsumer. This makes choice A correct. Choices C and D are there to
 * mislead you; these interfaces don’t actually exist. BinaryOperator spells out binary. The
 * other functional interfaces use the prefix Bi. Finally, line 8 takes a single parameter, and it
 * returns the same type, which is a UnaryOperator. Since the types are the same, only one
 * generic is needed, making choice G correct.
 * <p>
 * A. BiConsumer<String, String>   ***
 * B. BiFunction<String, String>
 * C. BinaryConsumer<String, String>
 * D. BinaryFunction<String, String>
 * E. Consumer<String>
 * F. Supplier<String>   ***
 * G. UnaryOperator<String>  ***
 * H. UnaryOperator<String, String>
 */
public class Test12 {
    public static void main(String[] args) {
      /*6*/
        Supplier<String> x = String::new;
      /*7*/
        BiConsumer<String, String> y = (a, b) -> System.out.println();
      /*8*/
        UnaryOperator<String> z = a -> a + a;
    }
}

/*
A. BiConsumer<String, String>
B. BiFunction<String, String>
C. BinaryConsumer<String, String>
D. BinaryFunction<String, String>
E. Consumer<String>
F. Supplier<String>
G. UnaryOperator<String>
H. UnaryOperator<String, String>
*/