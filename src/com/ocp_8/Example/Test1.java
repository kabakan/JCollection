package com.ocp_8.Example;

import java.util.stream.IntStream;

public class Test1 {
    public void testRefs2(StringBuilder sb){
        sb.append("sssss");
    }

    public void testRefs(String str, StringBuilder sb){
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }
    public static void main(String[] args){
        String str = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new Test1().testRefs(str, sb);
        new Test1().testRefs2(sb);
        sb.append("123");
        System.out.println("str=" + str + " sb=" + sb);
    }
}
