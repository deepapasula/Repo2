/**
 * 
 */
package com.bootcamp.psbregent.entity;

/**
 * @author Deepa pasula
 *
 */
public class Company {

private String companyName;
private String companyEmail;
private String comanyPhone;
private String userId;
private String password;
private int companyId;
 /**
 * @return the companyId
 */
public int getCompanyId() {
	return companyId;
}
/**
 * @param companyId the companyId to set
 */
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
Address address;
 Contact contact;
/**
 * @return the adr
 */
public Address getAddress() {
	return address;
}
/**
 * @param adr the adr to set
 */
public void setAddress(Address address) {
	this.address = address;
}
/**
 * @return the con
 */
public Contact getContact() {
	return contact;
}
/**
 * @param con the con to set
 */
public void setContact(Contact contact) {
	this.contact = contact;
}
/**
 * @return the companyName
 */
public String getCompanyName() {
	return companyName;
}
/**
 * @param companyName the companyName to set
 */
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
/**
 * @return the companyEmail
 */
public String getCompanyEmail() {
	return companyEmail;
}
/**
 * @param companyEmail the companyEmail to set
 */
public void setCompanyEmail(String companyEmail) {
	this.companyEmail = companyEmail;
}
/**
 * @return the comanyPhone
 */
public String getComanyPhone() {
	return comanyPhone;
}
/**
 * @param comanyPhone the comanyPhone to set
 */
public void setComanyPhone(String comanyPhone) {
	this.comanyPhone = comanyPhone;
}
/**
 * @return the userId
 */
public String getUserId() {
	return userId;
}
/**
 * @param userId the userId to set
 */
public void setUserId(String userId) {
	this.userId = userId;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
}
