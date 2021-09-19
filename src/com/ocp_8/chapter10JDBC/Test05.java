package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 5. Suppose that you have a table named animal with two rows. What is the result of the following code?
 * <p>
 * 5. C. A Connection is created using a static method on DriverManager. It does not use a constructor.
 * Therefore, choice C is correct. If the Connection was created properly, the answer
 * would be choice B.
 * <p>
 * A. 0
 * B. 2
 * C. There is a compiler error on line 6.   ***
 * D. There is a compiler error on line 9.
 * E. There is a compiler error on another line.
 * F. A runtime exception is thrown.
 */
public class Test05 {
    public static void main(String[] args) throws SQLException {
        /* Connection conn = new Connection(url, userName, password);  //6
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("select count(*) from animal");
         if (rs.next()) System.out.println(rs.getInt(1)); */
    }
}
