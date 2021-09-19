package com.ocp_8.Assesment.test09;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Kanat KB on 12.07.2017.
 * A. ResultSet.CONCUR_READ_ONLY
 * C. ResultSet.CONCUR_UPDATABLE
 */
public class Test09 {
    public void stmt(Connection conn, int a) {
        try {
            Statement stmt = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
            System.out.print("Go!");
        } catch (SQLException ex) {
            System.out.print("Err: " + ex.getMessage());
        }
    }
}

class Test {
    public static void main(String[] args) {
        Test09 t = new Test09();
        Connection connection = null;
        t.stmt(connection, 10);
        System.out.println("Connect succes !!!");
    }
}