/**
 * 
 */
package com.bootcamp.psbregent.service;

import com.bootcamp.psbregent.dao.LoginDao;

/**
 * @author Deepa pasula
 *
 */
public class LoginService {
public boolean verifylogin(String userid,String password){
	LoginDao login=new LoginDao();
	boolean result=login.verifyLogin(userid, password);
	return result;
}
}
