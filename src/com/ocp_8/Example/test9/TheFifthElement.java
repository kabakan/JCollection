package com.ocp_8.Example.test9;

class TheFifthElement {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("100");    // earth
        sb.append("2");                               // water
        sb.append("3");                               // air
        sb.append("4");                               // fire
      //  sb.replace(3,3,"Leeloo");                     // line t1
        sb.insert(1,"SS");
        System.out.println(sb);


    }
}