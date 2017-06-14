/**
 * 
 */
package com.bootcamp.psbregent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bootcamp.psbregent.util.DbUtil;

/**
 * @author Deepa pasula
 *
 */
public class LoginDao {
public boolean verifyLogin(String userid,String password){
	boolean result=false;
	try {
		DbUtil cd = new DbUtil();
		Connection con = cd.getConnection();

		PreparedStatement ps = con.prepareStatement("select userid,password from psbregent.company where userid=? and password=?");
		ps.setString(1, userid);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(userid.equals(rs.getString("userid")) && password.equals(rs.getString("password")))
			result=true;
		else
			result= false;
		
	
con.close();

} catch (Exception e2) {
System.out.println(e2);
}
	return result;
}
}
