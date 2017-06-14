/**
 * 
 */
package com.bootcamp.psbregent.service;

import com.bootcamp.psbregent.dao.PaymentDao;
import com.bootcamp.psbregent.entity.PaymentInfo;

/**
 * @author Deepa pasula
 *
 */
public class PaymentService {
public boolean verifyPayment(PaymentInfo pay){
	PaymentDao payment=new PaymentDao();
	boolean result=payment.verifyPayment(pay);
	return result;
	
}
}
