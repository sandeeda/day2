package com.sandeep.day2;

public class ArmstrongRange {

	public static int[] isArnmstrong(int start , int end ) {
		int i,digit,copy1,copy2,sum=0,count=0;
		int result[]=new int[12];

		
		
		
		if(start<end && start>=0)
		{		
				for(i=start;i<end;i++)
				{
					copy1=i;
					copy2=i;
					sum=0;
					while(copy1>0)
					{
						digit=copy1%10;
						sum+=digit*digit*digit;
						copy1/=10;
						
					}
					
					
					
					if(sum==copy2)
					{
						result[count]=sum;
						count++;
					}
					
					
				}
				
		}	
		
		for (int j : result) {
			System.out.println(j);
		}
		return result;
	}

}
