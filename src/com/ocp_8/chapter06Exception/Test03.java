package com.ocp_8.chapter06Exception;

import java.io.IOException;

/**
 * Created by Kanat KB on 07.10.2017.
 * 3. Which of the following fills in the blank to make the code compile? (Choose all that apply)
 * <p>
 * 3. E. Options B, D, and F are incorrect because only one variable name is allowed in a
 * multi-catch block. Option A is incorrect because FileNotFoundException is a subclass
 * of IOException. A multi-catch statement does not allow redundancy, and just catching
 * IOException would have been e
 * <p>
 * A. FileNotFoundException | IOException e
 * B. FileNotFoundException e | IOException e
 * C. FileNotFoundException | RuntimeException e
 * D. FileNotFoundException e | RuntimeException e
 * E. IOException | RuntimeException e ***
 * F. IOException e | RuntimeException e
 */
public class Test03 {

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException | RuntimeException e) {
        }
    }
}
