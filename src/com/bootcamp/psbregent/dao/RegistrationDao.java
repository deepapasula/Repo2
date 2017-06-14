/**
 * 
 */
package com.bootcamp.psbregent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bootcamp.psbregent.entity.Company;
import com.bootcamp.psbregent.util.DbUtil;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

/**
 * @author Deepa pasula
 *
 */
public class RegistrationDao {
	int addressId ;
	int contactId;
	int rows1;
	int rows;
	int rows2;
	public boolean saveDetails(Company comp) {
		
		try {
			DbUtil cd = new DbUtil();
			Connection con = cd.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"insert into address (addressline1,addressline2,city,state,zip) values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, comp.getAddress().getAddressLine1());
			ps.setString(2, comp.getAddress().getAddressLine2());
			ps.setString(3, comp.getAddress().getCity());
			ps.setString(4, comp.getAddress().getState());
			ps.setString(5, comp.getAddress().getZip());
			 rows=ps.executeUpdate();

			ResultSet rs = (ResultSet) ps.getGeneratedKeys();
			while (rs.next()) {
				addressId = rs.getInt(1);
			}

			

			PreparedStatement ps1 = con.prepareStatement("insert into psbregent.contact (name,email,phone) values (?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps1.setString(1, comp.getContact().getName());
			ps1.setString(2, comp.getContact().getEmail());
			ps1.setString(3, comp.getContact().getPhone());

		 rows1=	ps1.executeUpdate();
			ResultSet rs1 = (ResultSet) ps1.getGeneratedKeys();
			while(rs1.next()){
				contactId=rs1.getInt(1);
			}
			PreparedStatement ps2 = con.prepareStatement(
					"insert into psbregent.company(name,email,phone,userid,password,aid,contactid) values(?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps2.setString(1, comp.getCompanyName());
			ps2.setString(2, comp.getCompanyEmail());
			ps2.setString(3, comp.getComanyPhone());
			ps2.setString(4, comp.getUserId());
			ps2.setString(5, comp.getPassword());
			ps2.setInt(6, addressId);
			ps2.setInt(7, contactId);
			
			
			 rows2=ps2.executeUpdate();
			ResultSet rs2 = (ResultSet) ps2.getGeneratedKeys();
			if(rs2.next()) {
				comp.setCompanyId(rs2.getInt(1)); 
				
			}
			
			con.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	
	if (rows != 0 && rows1!= 0 && rows2!= 0)
		return true;
	else
		return false;
	}
}
