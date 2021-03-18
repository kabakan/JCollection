package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 9. A,F. Option A is correct. Identifiers are allowed to begin with underscores. Numeric values
 are allowed to have underscores between two digits. Option B is incorrect because underscores
 are not allowed adjacent to a decimal point. Option C is incorrect because identifiers
 are not allowed to start with digits. Option D is incorrect because decimal values are not
 allowed in int variables—they can only go in float or double types. Option E is incorrect
 because 10d declares a double, and a double is bigger than a float. Option F is correct
 because it is a straightforward variable assignment.
 *
 */
public class Test09 {
    public static void main(String[] args) {

    }
}

class Rich {
     public void money() {
        int _million = 1_000_000;
         //double aThousand = 1_000_.00;
         //double 100 = 100;
         //int hundred = 100.00;
         //float ten = 10d;
         short one = 1;
         }
}