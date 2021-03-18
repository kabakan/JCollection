package com.example.Scanner;


import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();


        String sum = sumTwoNumbers(s1, s2);

        System.out.println("summ: "+sum.toString());

    }

    public static String sumTwoNumbers(String s1, String s2) {
        StringBuilder sb = new StringBuilder(0);

        int index1=s1.length()-1;
        int index2=s2.length()-1;

        int buffer = 0;


        while(index1>=0 || index2>=0) {

            int a = index1>=0?s1.charAt(index1)-48:0;
            int b = index2>=0?s2.charAt(index2)-48:0;
            int c = a + b + buffer;
            sb.insert(0,c%10);
            buffer =  c/10;
            index1--;
            index2--;
        }
        if(buffer>0)
            sb.insert(0,buffer%10);
        return sb.toString();
    }


}
