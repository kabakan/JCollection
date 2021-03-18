package com.example.Scanner;


import java.util.Scanner;

public class Test3 {

    public static boolean canIWin(char[][] matrix)
    {
        //vertical
        for (int x = 0; x < 10; x++) {
            int gap = 0, count = 0;
            for (int y = 0; y < 10; y++) {
                RowInfo rowInfo = new RowInfo(matrix[y][x], gap, count).invoke();
                count = rowInfo.getCount();
                gap = rowInfo.getGap();
                if(count==4 && gap==1)
                    return true;
            }
        }

        //horizontal
        for (int y = 0; y < 10; y++) {
            int gap = 0, count = 0;
            for (int x = 0; x < 10; x++) {
                RowInfo rowInfo = new RowInfo(matrix[y][x], gap, count).invoke();
                count = rowInfo.getCount();
                gap = rowInfo.getGap();
                if(count==4 && gap==1)
                    return true;
            }
        }

        //LR-diagonal
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                int gap = 0, count = 0;
                for(int d=0;y+d<10&&x+d<10;d++) {
                    RowInfo rowInfo = new RowInfo(matrix[y+d][x+d], gap, count).invoke();
                    count = rowInfo.getCount();
                    gap = rowInfo.getGap();
                    if (count == 4 && gap == 1)
                        return true;
                }
            }
        }

        //RL-diagonal
        for (int x = 4; x < 10; x++) {
            for (int y = 0; y < 6; y++) {
                int gap = 0, count = 0;
                for(int d=0;y+d<10&&x-d>0;d++) {
                    RowInfo rowInfo = new RowInfo(matrix[y+d][x-d], gap, count).invoke();
                    count = rowInfo.getCount();
                    gap = rowInfo.getGap();
                    if (count == 4 && gap == 1)
                        return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[10][10];

        for (int y = 0; y < 10; y++) {
            String line = scanner.nextLine();
            for (int x = 0; x < 10; x++) {
                matrix[y][x] = (char) line.charAt(x);
            }
        }

        System.out.println(canIWin(matrix)?"YES":"NO");


        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                System.out.print(matrix[y][x]);
            }
            System.out.println();
        }

    }

    private static class RowInfo {
        private char c;
        private int gap;
        private int count;

        public RowInfo(char c, int gap, int count) {
            this.c = c;
            this.gap = gap;
            this.count = count;
        }

        public int getGap() {
            return gap;
        }

        public int getCount() {
            return count;
        }

        public RowInfo invoke() {
            switch (c){
                case '.': gap++;
                          if(gap>1)
                              count=0;
                          break;
                case 'o': gap=0;
                          count=0;
                          break;
                case 'x': count++;
                          break;
            }
            return this;
        }
    }
}
