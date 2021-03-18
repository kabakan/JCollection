package com.ocp.chapter10JDBC;

/**
 * Created by Kanat KB on 25.10.2017.
 * 6. Which of the following are true? (Choose all that apply.)
 * <p>
 * 6. B, E. Class.forName() was used with old JDBC drivers to load the driver. It is not needed
 * in JDBC 4.0, making choice A incorrect. If it is called, it throws a ClassNotFoundException.
 * By contrast, DriverManager.getConnection() throws a SQLException when the
 * driver cannot be found. Therefore, choices B and E are correct.
 * <p>
 * A. Calling Class.forName() is mandatory in JDBC 4.0.
 * B. Class.forName() throws a ClassNotFoundException if the driver class is not found.         ***
 * C. Class.forName() throws a SQLException if the driver class is not found.
 * D. DriverManager.getConnection() throws a ClassNotFoundException if the driver class is not found.
 * E. DriverManager.getConnection() throws a SQLException if the driver class is not found.      ***
 */
public class Test06 {
}
