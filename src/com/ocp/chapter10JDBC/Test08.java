package com.ocp.chapter10JDBC;

/**
 * Created by Kanat KB on 25.10.2017.
 * 8. Given a valid conn object of type Connection, what will happen if you run this code when
 * the requested mode is not supported?
 * <p>
 * conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
 * <p>
 * 8. E. When a Statement is requested with an unsupported mode, the JDBC driver will downgrade
 * the request to one that is supported. Therefore, choice E is correct. No exception is
 * thrown. Furthermore, choices B and D are incorrect because exceptions with those names
 * do not exist.
 * <p>
 * A. A ClassNotFoundException is thrown.
 * B. A NoSuchTypeException is thrown.
 * C. A SQLException is thrown.
 * D. A TypeNotFoundException is thrown.
 * E. The code will run without throwing an exception.   ***
 * F. None of the above. The code will not compile.
 */
public class Test08 {
}
