package com.ocp_8.chapter10JDBC;

/**
 * Created by Kanat KB on 25.10.2017.
 * 11. Suppose that the table food has five rows and this SQL statement updates all of them. What
 * is the result of this code?
 * <p>
 * 11. D. JDBC code throws a SQLException, which is a checked exception. The code does not
 * handle or declare this exception, and therefore it doesn’t compile. If the exception were
 * handled or declared, the answer would be choice C.
 * <p>
 * A. 0
 * B. 1
 * C. 5
 * D. The code does not compile.  ***
 * E. A SQLException is thrown.
 * F. A different exception is thrown.
 */
public class Test11 {
    public static void main(String[] args) {
      /*  Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("update food set amount = amount + 1");
        System.out.println(result);
        */
    }
}
