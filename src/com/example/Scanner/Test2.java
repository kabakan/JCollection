package com.example.Scanner;

import java.util.Scanner;

public class Test2 {

    public static int sumNumber(int value){
        if(value==0)
            return 0;
        return value%10 + sumNumber(value / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();

        System.out.println(sumNumber(value));

    }
}
