package com.ocp.Assesment.test19;

import java.sql.*;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. rs.absolute(0)
 * D. rs.beforeFirst()
 */
public class Test19 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name from animal")) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}
