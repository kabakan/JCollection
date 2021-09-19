package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 04.08.2017.
 * <p>
 * 4. Which of the following are valid lambda expressions? (Choose all that apply.)
 * <p>
 * 4. A, D. The first lambda expression is valid, taking no arguments and returning the empty
 * string, so A is correct. B is incorrect, as more than one parameter requires parentheses ().
 * C is incorrect, as brackets {} are required when using return. D is correct, as the expression
 * takes one Camel input and returns void. E is incorrect, as parentheses are required
 * when using the data type Wolf. F is incorrect, as it has no right-side expression. Finally, G
 * is incorrect, as specifying the data type for one parameter in a lambda expression requires
 * you to specify the data type for all parameters in the expression. In this case, z has a data
 * type and m does not, therefore the expression is invalid.
 * <p>
 * A. () -> ""   ***
 * B. x,y -> x+y
 * C. (Coyote y) -> return 0;
 * D. (Camel c) -> {return;} ***
 * E. Wolf w -> 39
 * F. () ->
 * G. (Animal z, m) -> a
 */
public class Test04 {
}
