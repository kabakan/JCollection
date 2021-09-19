package com.ocp_8.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 2. Why does Console.readPassword() return a char[] array instead of a String object?
 * (Choose all that apply.)
 * <p>
 * 2. B, E, F. The method returns a char[] array so that the password value never enters the
 * reusable String pool in memory, and the value can be immediately erased from memory
 * after use. E and F support this principle. The result is that the value is more secure, so B is
 * also correct. If the value did enter the reusable String pool, it might stay in memory long
 * after the method using it completed, meaning that a memory dump of the application could
 * retrieve it. A, C, and D are incorrect and not features of the readPassword() method.
 * <p>
 * A. It improves performance.
 * B. It is more secure.   ***
 * C. To encrypt the password data.
 * D. To support all character encodings.
 * E. Because Java puts all String values in a reusable pool.  ***
 * F. So that the value can be removed from memory immediately after use.  ***
 */
public class Test02 {
}
