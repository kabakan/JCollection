package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 26.08.2017.
 * <p>
 * 11. Which lambda can replace the MySecret class to return the same value? (Choose all that apply.)
 * <p>
 * 11. A, F. B is incorrect because it does not use the return keyword. C, D, and E are incorrect
 * because the variable e is already in use from the lambda and cannot be redefined. Additionally,
 * C is missing the return keyword and E is missing the semicolon. A and F are the only
 * correct lambda expressions that match the functional interface.
 * <p>
 * <p>
 * A. caller((e) -> "Poof"); ***
 * B. caller((e) -> {"Poof"});
 * C. caller((e) -> { String e = ""; "Poof" });
 * D. caller((e) -> { String e = ""; return "Poof"; });
 * E. caller((e) -> { String e = ""; return "Poof" });
 * F. caller((e) -> { String f = ""; return "Poof"; }); ***
 */
public class Test11 {}

class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}

interface Secret {
    String magic(double d);
}
/*
class Test {
    public static void main(final String[] args) {
        MySecret secret;
        secret = () -> {
            return "Poof";
        };

        caller((e) -> "Poof");
    }

    private static void caller(Object o) {
        System.out.println("STR:"+o.toString());
    }
}
*/