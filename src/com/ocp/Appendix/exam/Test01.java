package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 1. B. The code compiles and runs without issue, so options C, D, and E are not correct. The
 value of grade is 'B', and there is a matching case statement that will cause "great" to
 be printed. There is no break statement after the case, though, so the next case statement
 will be reached and "good" will be printed. There is a break after this case statement,
 though, so the switch statement will end. The correct answer is thus option B.
 * B. greatgood
 */
public class Test01 {
    public static void main(String[] args) {
        final char a = 'A', d = 'D'; // p1
        char grade = 'B';
        switch(grade) {
            case a: // p2
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d: // p3
            case 'F': System.out.print("not good");
        }
    }
}
