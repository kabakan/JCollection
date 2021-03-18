package com.ocp.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 9. What are the requirements for a class that you want to serialize with ObjectOutputStream?
 * (Choose all that apply.)
 * <p>
 * 9. A. First, the class must implement the Serializable interface, so A is correct. Serializable
 * is not a class; therefore B is incorrect. Creating a static serialVersionUID variable
 * is optional and recommended, but it is not required for use with the ObjectOutputStream,
 * so C is incorrect. Every instance variable must either be Serializable or be marked
 * transient, but all variables are not required to be either, so D and E are incorrect. F is
 * incorrect, because the class must be Serializable and have instance members that are
 * Serializable or marked transient.
 * <p>
 * A. The class must implement the Serializable interface.   ***
 * B. The class must extend the Serializable class.
 * C. The class must declare a static serialVersionUID variable.
 * D. All instance members of the class must be Serializable.
 * E. All instance members of the class must be marked transient.
 * F. Any class can be serialized with ObjectOutputStream.
 */
public class Test09 {
}
