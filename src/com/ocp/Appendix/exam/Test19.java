package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 19. Which of the following lines of code compile? (Choose all that apply.)
 *
 * 19. A,E. Underscores are allowed as long as they are directly between two other digits. This
 means that options A and E are correct. Options B and C are incorrect because the underscore
 is adjacent to the decimal point. Option D is incorrect because the underscore is the
 last character.
 *
 A. int i1 = 1_234;
 B. double d1 = 1_234_.0;
 C. double d2 = 1_234._0;
 D. double d3 = 1_234.0_;
 E. double d4 = 1_234.0;
 F. None of the above
 */
public class Test19 {
    public static void main(String[] args) {

        int i1 = 1_234;
        //double d1 = 1_234_.0;
       // double d2 = 1_234._0;
       // double d3 = 1_234.0_;
        double d4 = 1_234.0;
    }
}
