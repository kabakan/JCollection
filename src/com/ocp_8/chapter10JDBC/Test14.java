package com.ocp_8.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 14. Which of the following can fill in the blank correctly? (Choose all that apply.)
 * <p>
 * 14. B, F. In a ResultSet, columns are indexed starting with 1, not 0. Therefore, choices A, C,
 * and E are incorrect. There are methods to get the column as a String or Object. However,
 * choice D is incorrect because an Object cannot be assigned to a String without a cast.
 * <p>
 * A. String s = rs.getString(0);
 * B. String s = rs.getString(1);   ***
 * C. String s = rs.getObject(0);
 * D. String s = rs.getObject(1);
 * E. Object s = rs.getObject(0);
 * F. Object s = rs.getObject(1);   ***
 */
public class Test14 {
    public static void main(String[] args) throws SQLException {
        /*ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
        } */
    }
}
