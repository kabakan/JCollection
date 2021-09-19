package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 10. Suppose that the table animal has five rows and this SQL statement updates all of them.
 * What is the result of this code?
 * <p>
 * 10. C. This code works as expected. It updates each of the five rows in the table and returns the
 * number of rows updated. Therefore, choice C is correct.
 * <p>
 * A. 0
 * B. 1
 * C. 5  ***
 * D. The code does not compile.
 * E. A SQLException is thrown.
 * F. A different exception is thrown.
 */
public class Test10 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("update animal set name = name");
        System.out.println(result);
    }
}
