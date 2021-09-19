package com.ocp_8.Example;

public class Test3 {
    public static void main(String []args) {
        float fVar = 123.123f;
                double dVar  = 123;
               short sVar = 123;
                int iVar = 123;
               long lVar = 123;
             //   iVar = fVar;
                fVar = iVar;
                dVar = fVar;
                lVar = sVar;
             //   fVar = dVar;
               dVar = iVar;
             //  iVar = dVar;

      //  byte myByte = 128;
        byte yourByte = (byte) 128;
      //  byte hisByte = (short) 128;
      //   byte herByte = (int) 128;
        double[] darr = {11, 22.0, '%', 33.0f};
        for (double e : darr) {
            e = e + 10;
            System.out.print(e + " ");
        }


    }
}
