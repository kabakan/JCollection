package com.example.all;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String text = "55 Ег��������о=р91 Алла!чка& Анна?����-=+5";
        String text1 = "Егор + Алла Анна-=+";
        String str = text.replaceAll("[^а-я,А-Я,a-z,A-Z,\\d,!,?,&,+,-,=,_]"," ");
        System.out.println("Result: "+str);
    }
}
