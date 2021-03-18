package com.ocp.chapter10JDBC;

import java.sql.*;

/**
 * Created by Kanat KB on 25.10.2017.
 * 7. Which of the following can fill in the blank? (Choose all that apply.)
 * <p>
 * 7. C, E, F. The first parameter is the ResultSet type. The second parameter is the ResultSet
 * concurrency mode. Choices A and B are incorrect because they represent the second parameter.
 * Choice D is incorrect because it is not a constant in JDBC. Choices C, E, and F are
 * correct.
 * <p>
 * A. ResultSet.CONCUR_READ_ONLY
 * B. ResultSet.CONCUR_UPDATABLE
 * C. ResultSet.TYPE_FORWARD_ONLY          ***
 * D. ResultSet.TYPE_REVERSE_ONLY
 * E. ResultSet.TYPE_SCROLL_INSENSITIVE    ***
 * F. ResultSet.TYPE_SCROLL_SENSITIVE      ***
 */
public class Test07 {
    public void stmt(Connection conn, int b) throws SQLException {
        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, b);
    }
}
