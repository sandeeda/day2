package com.sandeep.day2;

public class ResultOfStudent {

	public static String declareResult(int [] marks) {
		int flag=0;
		String result="";
		if(marks[0]>=0 && marks[1]>=0 && marks[2]>=0 && marks[0]<100 && marks[1]<100 && marks[2]<100)
		{
			for(int i=0;i<3;i++)
			{
				if(marks[i]>60)
				{
					flag++;
				}
			}
			
			
			if(flag==3)
			{
				result+="passed";
			}
			else if(flag==2)
			{
				result+="promoted";
			}
			else if(flag<=1) 
			{	
				result+="failed";
			}
		}
			
		else			
		{
			result+="Marks should be greater than or equal to zero and less than 100";
		}
		
		System.out.println(result);
		return result;
	}

}
