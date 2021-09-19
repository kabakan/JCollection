package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 16. Suppose that you have a table with three rows. The names in those rows are Anna, Betty,
 * and Cat. What does the following output?
 * <p>
 * 16. E. By default, a Statement is not scrollable. The first call to previous() throws a SQLException
 * because the ResultSet type is TYPE_FORWARD_ONLY.
 * <p>
 * A. Anna
 * B. Betty
 * C. Cat
 * D. The code does not compile.
 * E. A SQLException is thrown.   ***
 */
public class Test16 {
    public static void main(String[] args) throws SQLException {
        String sql = "select name from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            rs.next();
            rs.previous();
            rs.previous();
            rs.next();
            rs.next();
            rs.absolute(2);
            System.out.println(rs.getString(1));
        }
    }
}
