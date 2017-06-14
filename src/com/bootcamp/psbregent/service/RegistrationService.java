/**
 * 
 */
package com.bootcamp.psbregent.service;

import com.bootcamp.psbregent.dao.RegistrationDao;
import com.bootcamp.psbregent.entity.Company;

/**
 * @author Deepa pasula
 *
 */
public class RegistrationService {
public boolean saveDetails(Company comp){
	
	RegistrationDao reg=new RegistrationDao();
   
	return   reg.saveDetails(comp);
	
	
}
}
