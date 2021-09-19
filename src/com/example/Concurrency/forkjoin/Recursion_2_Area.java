package com.example.Concurrency.forkjoin;

/*
    Recursively computes area of a triangle modeled as squares:

        []
        [][]        when width = 4, area = 10 
        [][][]
        [][][][]
        |-width-|

*/

public class Recursion_2_Area {
    
    static class RecursiveTriangle{
        int width;

        public RecursiveTriangle(int width) {
            this.width = width;
        }

//--- base case 1 must be in place, otherwise poorly initialized object
//    (like new RecursiveTriangle(0)) will cause StackOverflowError       
        int calcArea(){
            if (width <= 0) return 0;  // base case 1
            if (width == 1) return 1;  // base case 2
            else{
                RecursiveTriangle smaller = new RecursiveTriangle(width-1);
                int smallerArea = smaller.calcArea();
                return smallerArea + width;
            }
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Area = " + new RecursiveTriangle(4).calcArea()); // 10
    }
}
