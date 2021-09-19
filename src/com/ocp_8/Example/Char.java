package com.ocp_8.Example;

public class Char {
    char var;
    public static void main (String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'b';
        Char c1 = new Char();
        Char c2 = c1;
        c1.var = 'c';
        c2.var = 'd';
        System.out.print(var1 + ", " + var2);
        System.out.print(c1.var + ", " + c2.var);
        String str = "";
        String str1    = "";

    }
}
