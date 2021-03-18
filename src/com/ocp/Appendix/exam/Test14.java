package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 14. B,C,D. 0b is the prefix for a binary value, making option B correct. 0X is the prefix for
 a hexadecimal value. This value can be assigned to many primitive types, including int
 and double, making options C and D correct. Option A is incorrect because 9L is a long
 value. long amount = 9L would be allowed. Option E is incorrect because the underscore
 is immediately before the decimal. Option F is incorrect because the underscore is the very
 last character.
 *
 * A. int amount = 9L;
 B. int amount = 0b101;
 C. int amount = 0xE;
 D. double amount = 0xE;
 E. double amount = 1_2_.0_0;
 F. int amount = 1_2_;
 G. None of the above
 */
public class Test14 {
    public static void main(String [] args) {
        Price p = new Price();
        p.admission();
    }
}
class Price {
    public void admission() {
// INSERT CODE HERE
        int amount = 0xE+1_2+0b101;
        double amount1 = 1_2.0_0;
        System.out.println(amount);
    } }