package com.ocp.chapter10JDBC;

import java.sql.SQLException;

/**
 * Created by Kanat KB on 25.10.2017.
 * 9. Which of the options can fill in the blanks in order to make the code compile?
 * <p>
 * 9. B. The first line has a return type of boolean because any type of SQL statement can be
 * run, making it an execute() call. The second line returns the number of modified rows,
 * making it an executeUpdate() call. The third line returns the results of a query, making it
 * an executeQuery() call.
 * <p>
 * A. execute, executeQuery, executeUpdate
 * B. execute, executeUpdate, executeQuery  ***
 * C. executeQuery, execute, executeUpdate
 * D. executeQuery, executeUpdate, execute
 * E. executeUpdate, execute, executeQuery
 * F. executeUpdate, executeQuery, execute
 */
public class Test09 {
    public static void main(String[] args) throws SQLException {
     /*   boolean bool = stmt. (sql);
        int num = stmt. (sql);
        ResultSet rs = stmt. (sql);
        */
    }
}
