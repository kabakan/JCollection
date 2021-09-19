package com.ocp_8.chapter10JDBC;

/**
 * Created by Kanat KB on 25.10.2017.
 * 1. Which interfaces or classes are in a database-specific JAR file? (Choose all that apply.)
 * 1. B, F. The Driver, Connection, Statement, and ResultSet interfaces are part of the JDK,
 * making choices A and E incorrect. The concrete DriverManager class is also part of the
 * JDK, making choices C and D incorrect. Choices B and F are correct since the implementation
 * of these interfaces is part of the database-specific driver JAR file.
 * A. Driver
 * B. Driver’s implementation   ***
 * C. DriverManager
 * D. DriverManager’s implementation
 * E. Statement   ***
 * F. Statement’s implementation
 */
public class Test01 {
}
