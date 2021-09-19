package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 13. There are currently 100 rows in the table species before inserting a new row. What is the
 * output of the following code?
 * <p>
 * 13. D. A Statement automatically closes the open ResultSet when another SQL statement is
 * run. This means that rs is no longer open by the println, and a SQLException is thrown
 * because the ResultSet is closed.
 * <p>
 * A. 100
 * B. 101
 * C. The code does not compile.
 * D. A SQLException is thrown.     ***
 * E. A different exception is thrown.
 */
public class Test13 {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("select count(*) from species");
            int num = stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)");
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
