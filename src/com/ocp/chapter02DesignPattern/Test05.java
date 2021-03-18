package com.ocp.chapter02DesignPattern;

/**
 * Created by Kanat KB on 04.08.2017.
 * <p>
 * 5. What are some of the properties of using the singleton pattern? (Choose all that apply.)
 * <p>
 * 5. B, E, F. A is incorrect, as any method that changes the singleton breaks the singleton
 * pattern. B is correct, as the constructor of the singleton class must be private, else other
 * classes would be able to instantiate it, breaking the singleton pattern. C is incorrect, as the
 * name of the object itself, as well as the method to retrieve the singleton, is not defined in the
 * pattern. D is incorrect, as the object must be marked private. If it was marked protected,
 * it would not be properly encapsulated and other classes would have access to it. E is correct,
 * as the purpose of a singleton is to ensure that all threads share the same instance of the
 * object in memory. F is correct, as a public static method is required for all threads to
 * access the same singleton.
 * <p>
 * A. 1Singleton object can be replaced with encapsulated setter method. ***
 * B. Requires constructor of singleton class to be private.  ***
 * C. 1Singleton object must be named instance.
 * D. 1Singleton object may be private or protected.
 * E. Ensures that there is only one instance of an object in memory.  ***
 * F. Requires a public static method to retrieve the instance of the singleton.  ***
 */
public class Test05 {
}
