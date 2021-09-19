package com.ocp_8.Example;

public class DemoArray {

    int[] arr = new int[]{10, 20, 30};
    int[] getArr1() { return arr; }
    int[] getArr2() { throw new NullPointerException(); }


    public static void main(String[] args) {
        int idx = 0;
        System.out.println(
                new DemoArray().getArr1()[idx = 1] + ", idx = " + idx);
        try {
            System.out.println(new DemoArray().getArr2()[idx++]);        // 20, idx = 1
        }
        catch (NullPointerException npe){
            System.out.println("Caught NPE!");                      // Caught NPE!
        }
        System.out.println("idx is still " + idx);                  // idx is still 1
    }

    public static void isArray(){
        int[][] arr = new int [4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
                System.out.print(arr[i][j]);
                if (j == arr[i].length-1)
                    System.out.println();
            }
        }
    }
}
