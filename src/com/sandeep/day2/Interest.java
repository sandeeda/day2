package com.sandeep.day2;

public class Interest {

	public static double[] calculateInterest(double principal, double rate, double time, double occ) {
		// TODO Auto-generated method stub
		double [] result=new double[2];

		if(principal<=0 ||rate<=0 || time<=0 ||occ<=0)
		{
			result[0]=0;
			result[1]=0;
			return result;
		}
		
		result[0]=(principal*rate*time)/100;
		double factor;
		factor=Math.pow(((100+rate)/100),(occ*time));
		result[1]=(principal*factor)-principal;
		System.out.println(result[0]+"       "+result[1]);
		return result;
	}

}
