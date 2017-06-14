/**
 * 
 */
package com.bootcamp.psbregent.entity;

/**
 * @author Deepa pasula
 *
 */
public class PaymentInfo {
private String nameOnCard;
private String cardNumber;
private String cvv;
private String rentAmount;
/**
 * @return the nameOnCard
 */
public String getNameOnCard() {
	return nameOnCard;
}
/**
 * @param nameOnCard the nameOnCard to set
 */
public void setNameOnCard(String nameOnCard) {
	this.nameOnCard = nameOnCard;
}
/**
 * @return the cardNumber
 */
public String getCardNumber() {
	return cardNumber;
}
/**
 * @param cardNumber the cardNumber to set
 */
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
/**
 * @return the cvv
 */
public String getCvv() {
	return cvv;
}
/**
 * @param cvv the cvv to set
 */
public void setCvv(String cvv) {
	this.cvv = cvv;
}
/**
 * @return the rentAmount
 */
public String getRentAmount() {
	return rentAmount;
}
/**
 * @param rentAmount the rentAmount to set
 */
public void setRentAmount(String rentAmount) {
	this.rentAmount = rentAmount;
}

}
