package com.ocp_8.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 6. B,C. The code will not compile due to problems with the case values. First, badMovie is
 not a constant value; therefore line 6 will not compile. If it was marked final, it would
 compile, so B is correct. Next, Line 9 has the same case value of 4 as Line 8. Since there's no
 option to remove Line 8 available in the choices, Line 9 should be removed and C is correct.
 The other answers are incorrect, because the rest of the lines of the code compile.
 *
 * B. The code will not compile because of line 7.
 */
public class Test06 {
    public static void main(String[] args) {
         final int movieRating = 4;
         int badMovie = 9;
         switch(badMovie) {
             case 0:
           //  case badMovie: System.out.println("Awful"); break;
           //  case movieRating: System.out.println("Great"); break;
             case 4:
                 default:
                 case (int)'a':
                 case 1*1: System.out.println("Too be determined"); break;
             }
    }
}
