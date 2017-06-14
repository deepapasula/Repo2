package com.bootcamp.psbregent.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcamp.psbregent.entity.Address;
import com.bootcamp.psbregent.entity.Company;
import com.bootcamp.psbregent.entity.Contact;
import com.bootcamp.psbregent.service.RegistrationService;


/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String companyName = request.getParameter("companyname");
		String companyEmail = request.getParameter("email");
		String CompanyPhone = request.getParameter("phone");
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
	
		Company comp = new Company();
		comp.setCompanyName(companyName);
		comp.setCompanyEmail(companyEmail);
		comp.setComanyPhone(CompanyPhone);
		comp.setUserId(userId);
		comp.setPassword(password);
		
		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");

		Address adr = new Address();
		
		adr.setAddressLine1(addressLine1);
		adr.setAddressLine2(addressLine2);
		adr.setCity(city);
		adr.setState(state);
		adr.setState(state);
		adr.setZip(zip);
		comp.setAddress(adr);

		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		Contact con=new Contact();
		con.setName(name);
		con.setEmail(email);
		con.setPhone(phone);
		comp.setContact(con);

		
		RegistrationService reg = new RegistrationService();
		 if(reg.saveDetails(comp)){
		 PrintWriter out = response.getWriter();

		 response.setContentType("text/html;charset=UTF-8");
		 out.println(" <html><body>registration sucessfull"
		 		+ "<a href ='login.html'>click here for login</a><body></html>");
	}

}
