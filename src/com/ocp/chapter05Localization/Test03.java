package com.ocp.chapter05Localization;

/**
 * Created by Kanat KB on 03.10.2017.
 * 3. Which of the following are true?
 * <p>
 * 3. C, D. Choice A is incorrect because Java will look at parent bundles. For example, Java will
 * look at Props.properties if Props_en.properties does not contain the requested key.
 * Java class resource bundles can have non-String values while property files are limited to
 * strings. Therefore, choice B is incorrect and choice C is correct. Choice D is correct because
 * the locale is only changed in memory. Choice E is incorrect because Java specifies that it
 * will look for a Java class resource bundle before a property file of the same name.
 * <p>
 * A. All keys must be in the same resource bundle file to be used.
 * B. All resource bundles defined as Java classes can be expressed using the property file
 * format instead.
 * C. All resource bundles defined as property files can be expressed using the Java class list  ***
 * bundle format instead.
 * D. Changing the default locale lasts for only a single run of the program.     ***
 * E. It is forbidden to have both Props_en.java and Props_en.properties in the classpath
 * of an application.
 */
public class Test03 {
}
