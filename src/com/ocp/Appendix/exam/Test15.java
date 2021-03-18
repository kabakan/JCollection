package com.ocp.Appendix.exam;

/**
 * Created by Kanat KB on 04.11.2017.
 * 15. E. For this problem you need to remember your rules about numeric promotion as well as
 what data types are allowed in a switch statement. The expression x % 4. automatically
 promotes the x to a double; since 4. is a double, the result is a double. Because a switch
 statement does not accept the type double, the code fails to compile due to line 4, so option
 E is the correct answer.

 */
public class Test15 {
    public static void main(String [] args) {
         int x = 10;
         switch(x % 4) {
             default: System.out.print("Not divisible by 4");
                 case 0: System.out.print("Divisible by 4");
                 }
    }
}
