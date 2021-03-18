package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 4. F. This question is designed to test your ability to spot syntax errors with switch statements.
 In particular, the colon (:) goes after the value in the case statement, not before.
 Therefore neither line 5 nor line 6 will compile, and option F is the correct answer. If the
 colon were moved after the values, the output would be Just Right, and the answer would
 be option B. *
 *
 * F. The code will not compile because of lines 5 and 6.
 */
public class Test04 {
    public static void main(String[] args) {
         int x = 10 % 2 + 1;
         switch(x) {
        //     case: 0 System.out.print("Too High"); break;
         //    case: 1 System.out.print("Just Right"); break;
             default: System.out.print("Too Low");
              }
    }
}
