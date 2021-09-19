package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 18. Suppose that you have a table animal with three rows. The names in those rows are Anna,
 * Betty, and Cat. What does the following output?
 * <p>
 * 18. A. The call to absolute(0) moves the cursor to a location immediately before the results,
 * and then next() goes to the first row, so the answer is choice A.
 * <p>
 * A. Anna ***
 * B. Betty
 * C. Cat
 * D. The code does not compile.
 * E. A SQLException is thrown.
 */
public class Test18 {
    public static void main(String[] args) throws SQLException {
        String sql = "select name from animal order by id";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            rs.absolute(0);
            rs.next();
            System.out.println(rs.getString(1));
        }
    }
}
