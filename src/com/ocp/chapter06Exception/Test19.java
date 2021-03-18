package com.ocp.chapter06Exception;

import java.sql.SQLException;

/**
 * Created by Kanat KB on 07.10.2017.
 * 19. Which of the following cannot fill in the blank? (Choose all that apply.)
 * <p>
 * 19. D. Choice A is allowed because Java 7 and later “translates” Exception in a catch block to
 * the correct one. Choices C and E are allowed because they actually catch a SQLException.
 * Choice D is not allowed because there is no IOException declared. Choice B is allowed
 * because a method does not have to handle an exception if it declares it.
 * <p>
 * A. Exception
 * B. RuntimeException
 * C. SQLException
 * D. SQLException | IOException  ***
 * E. SQLException | RuntimeException
 */
public class Test19 {
    public void read() throws SQLException {
      /*  try {
          //  readFromDatabase();
            System.out.println("");
        } catch (SQLException | IOException e) {
            throw e;
        }*/
    }
}
