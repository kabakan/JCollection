package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 19. In a table animal with 10 rows, how many times does true get output by the following?
 * (Choose all that apply.)
 * <p>
 * 19. C. The first println outputs false because the cursor is immediately before the result.
 * The second println outputs true because the cursor is pointing to the fifth row. The third
 * println outputs true because the cursor is pointing to the fourth row. The fourth println
 * outputs true because the cursor is pointing to the second row. The fifth println outputs
 * false because the cursor is located before the beginning of the result.
 * <p>
 * A. One
 * B. Two
 * C. Three   ***
 * D. Four
 * E. Five
 * F. The code does not compile.
 * G. A SQLException is thrown.
 */
public class Test19 {
    public static void main(String[] args) throws SQLException {
        String sql = "select * from animal";
        try (                                                                      Connection conn = DriverManager.getConnection("jdbc:derby:zoo")       ;
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println(rs.absolute(0));
            System.out.println(rs.absolute(5));
            System.out.println(rs.previous());
            System.out.println(rs.relative(-2));
            System.out.println(rs.relative(-100));
        }
    }
}
