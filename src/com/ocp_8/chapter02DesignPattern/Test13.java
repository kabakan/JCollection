package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 29.08.2017.
 * 13. Which of the following are properties of classes that define immutable objects? (Choose all
 * that apply.)
 * <p>
 * 13. B, C, E. Immutable objects may not be modified after creation. B, C, and E are correct
 * statements that support this property. A is incorrect, as immutable objects may have getter
 * methods, just not setter methods. D is incorrect, as static methods are not part of the
 * immutable object pattern. F is also incorrect, as the getter methods are not required to be
 * marked synchronized.
 * <p>
 * A. They don’t define any getter methods.
 * B. All of the instance variables marked private and final.  ***
 * C. They don’t define any setter methods. ***
 * D. They mark all instance variables static.
 * E. They prevent methods from being overridden.  ***
 * F. All getter methods are marked synchronized.
 */
public class Test13 {
}
