package com.example.algoritm.amasone;

public class Matrix1 {
    public static void main(String[] args){
        int arr[][]={{1,1,1},{1,1,1},{1,1,1}};
        System.out.println("arr.length is: "+arr.length);
        for(int m=0;m<arr.length;m++) {
            if(arr.length-m-1 == m) {
                System.out.print(" "+arr[m][m]+" ");
                System.out.println();
            } else {
                System.out.print(arr[m][m]+" "+arr[arr.length-m-1][m]);
                System.out.println();
            }

        }
    }
}
