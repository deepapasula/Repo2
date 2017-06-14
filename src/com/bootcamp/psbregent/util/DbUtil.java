/**
 * 
 */
package com.bootcamp.psbregent.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Deepa pasula
 *
 */
public class DbUtil {
	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psbregent", "root", "root");

		return con;
}
}