package com.example.Scanner;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class Test3UTest {

    private char[][] strToArray(String strMatrix)
    {
        Scanner scanner = new Scanner(strMatrix);

        char[][] matrix = new char[10][10];

        for (int y = 0; y < 10; y++) {
            String line = scanner.nextLine();
            for (int x = 0; x < 10; x++) {
                matrix[y][x] = (char) line.charAt(x);
            }
        }
        return matrix;
    }

    @Test
    public void Test1(){

        String inputStr = "x.........\n" +
                "x.........\n" +
                "..........\n" +
                "x.........\n" +
                "x.........\n" +
                ".....oooo.\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........";

        assertEquals(Test3.canIWin(strToArray(inputStr)),true);
    }

    @Test
    public void Test2(){

        String inputStr = ".....ooo..\n" +
                "x.........\n" +
                "..........\n" +
                "x.........\n" +
                "x.........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........";

        assertEquals(Test3.canIWin(strToArray(inputStr)),false);
    }

    @Test
    public void Test3(){

        String inputStr = "xx.xx.....\n" +
                ".oooo.....\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........";

        assertEquals(Test3.canIWin(strToArray(inputStr)),true);
    }

    @Test
    public void Test4(){

        String inputStr = "...ox.....\n" +
                "...o.x....\n" +
                "...o..x...\n" +
                "..........\n" +
                "...o....x.\n" +
                "...o.....x\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........";

        assertEquals(Test3.canIWin(strToArray(inputStr)),true);
    }

    @Test
    public void Test5(){

        String inputStr = "x.......o.\n" +
                ".x......o.\n" +
                "..o.......\n" +
                "...x....o.\n" +
                "....x...o.\n" +
                ".....x....\n" +
                "..........\n" +
                "..........\n" +
                ".....o..x.\n" +
                ".....o...x";

        assertEquals(Test3.canIWin(strToArray(inputStr)),false);
    }

    @Test
    public void Test6(){

        String inputStr = "..........\n" +
                "..........\n" +
                ".......o.x\n" +
                "........x.\n" +
                ".......xo.\n" +
                "......o...\n" +
                ".....x.o..\n" +
                "....x..o..\n" +
                "..........\n" +
                "..x...o...";

        assertEquals(Test3.canIWin(strToArray(inputStr)),false);
    }

    @Test
    public void Test7(){

        String inputStr = "..........\n" +
                "..........\n" +
                ".........x\n" +
                "........xo\n" +
                ".......xo.\n" +
                ".......o..\n" +
                ".....xo...\n" +
                "....x.....\n" +
                ".........o\n" +
                "..xo......";

        assertEquals(Test3.canIWin(strToArray(inputStr)),true);
    }




}
