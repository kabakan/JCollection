package com.ocp.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 20. In the table animal with 10 rows, how many times does true get output by the following?
 * (Choose all that apply.)
 * <p>
 * 20. F. The first and last println statements do not compile. The beforeFirst() and
 * afterLast() methods have a void return type. Therefore, the code does not compile and
 * choice F is correct.
 * <p>
 * A. One
 * B. Two
 * C. Three
 * D. Four
 * E. Five
 * F. The code does not compile.    ***
 * G. A SQLException is thrown.
 */
public class Test20 {

    public static void main(String[] args) throws SQLException {
     /*   String sql = "select * from animal";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
             Statement stmt = conn.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)
        );
        System.out.println(rs.beforeFirst());
        System.out.println(rs.absolute(5));
        System.out.println(rs.previous());
        System.out.println(rs.relative(-2));
        System.out.println(rs.afterLast()); */
    }
}
