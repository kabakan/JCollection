package com.ocp_8.Example.test8;

 import java.io.IOException;

            public class StayAlert {
       public static void main(String args[]) {
                 IOException ioe = null;
                 try {
                         throw null;
                     }
                 catch(NullPointerException npe){ System.out.print("Caught NPE ");}
                 try {
                         throw ioe;
                     }
                 catch(IOException oe){System.out.print("+ Caught IOE");}
             }
   }
