package com.sandeep.day2;

public class IncomeTax {

	public static double calculateIncomeTax(double ctc) {

		double tax=9999999;
		if(ctc>=0 && ctc<=1000000)
		{
			

			if(ctc>=0 && ctc<=180000)
			{
				tax= 0;
				System.out.println(tax);
				return tax;
				
			}


			else if(ctc>=180001 && ctc<=300000)
			{
				tax= 0.1*ctc;
				System.out.println(tax);

				return tax;
			}


			else if(ctc>=300001 && ctc<=500000)
			{
				tax= 0.2*ctc;
				System.out.println(tax);
				return tax;
			}


			else if(ctc>=500001 && ctc<=1000000)
			{
				tax= 0.3*ctc;
				System.out.println(tax);

				return tax;
			}
				
				
		}
		
		System.out.println(tax);

		return tax;
		
		
		
		
	}

}
