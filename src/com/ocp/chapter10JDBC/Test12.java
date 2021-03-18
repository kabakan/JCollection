package com.ocp.chapter10JDBC;

/**
 * Created by Kanat KB on 25.10.2017.
 * 12. Which is the correct order in which to close database resources?
 * <p>
 * 12. D. JDBC resources should be closed in the reverse order from that in which they were
 * opened. The order for opening is Connection, Statement, and ResultSet. The order for
 * closing is ResultSet, Statement, and Connection.
 * <p>
 * A. Connection, ResultSet, Statement
 * B. Connection, Statement, ResultSet
 * C. ResultSet, Connection, Statement
 * D. ResultSet, Statement, Connection  ***
 * E. Statement, Connection, ResultSet
 * F. Statement, ResultSet, Connection
 */
public class Test12 {

}
