package com.bootcamp.psbregent.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcamp.psbregent.entity.PaymentInfo;
import com.bootcamp.psbregent.service.PaymentService;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameOnCard=request.getParameter("nameOnCard");
		String cardNumber=request.getParameter("cardNumber");
		String cvv=request.getParameter("cvv");
		String RentAmount=request.getParameter("RentAmount");
		PaymentInfo payment=new PaymentInfo();
		payment.setNameOnCard(nameOnCard);
		payment.setCardNumber(cardNumber);
		payment.setCvv(cvv);
		payment.setRentAmount(RentAmount);
		PaymentService pay=new PaymentService();
		pay.verifyPayment(payment);
	}

}
