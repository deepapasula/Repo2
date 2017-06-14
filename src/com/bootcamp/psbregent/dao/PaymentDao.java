/**
 * 
 */
package com.bootcamp.psbregent.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bootcamp.psbregent.entity.PaymentInfo;

/**
 * @author Deepa pasula
 *
 */
public class PaymentDao {
	private static final String file = "C:\\BCJDec16\\Workspace\\Corejava\\PSBRegent\\src\\PaymentInfo";
public boolean verifyPayment(PaymentInfo payment){
	 boolean flag=false;
		String[] info = null;
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {

				info = sCurrentLine.split(" ");
			
					if (info[0].equals(payment.getNameOnCard()) && info[1].equals(payment.getCardNumber())
							&& info[2].equals(payment.getCvv())
							&& Integer.parseInt((info[3])) > payment.getRentAmount()) {
						flag= true;
						break;
					} else {
						flag=false;
					}
				
			}
			
		} catch (IOException e) {

			e.printStackTrace();
			

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		return flag;

	
}
}
