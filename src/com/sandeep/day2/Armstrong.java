package com.sandeep.day2;

public class Armstrong {

	public static boolean isArmstrong(int number) {
		// TODO Auto-generated method stub
		int copy=number;
		int digit,sum=0;
		if(number>=0)
		{
			while(number>0)
			{
				digit=number%10;
				sum+=(digit*digit*digit);
				number/=10;
				
			}
			
		}
		if(sum==copy)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
