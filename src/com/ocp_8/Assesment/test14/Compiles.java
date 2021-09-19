package com.ocp_8.Assesment.test14;

/**
 * Created by Kanat KB on 13.07.2017.
 * D. Line 5 is incorrect because String does not implement AutoCloseable. Not all
 * objects can be declared in a try-with-resources try clause. Line 7 is incorrect because
 * RainException is a checked exception and is not declared or handled. Line 9 is incorrect
 * because s is declared in the try clause and is therefore out of scope for the finally block.
 */
public class Compiles {
    class RainException extends Exception {
    }

    public static void main(String[] args) {
      /*  try(Scanner s = new Scanner("rain"); String line = "";)
        {
            if (s.nextLine().equals("rain"))
                throw new RainException();
        } finally {
            s.close();
        } */
    }
}