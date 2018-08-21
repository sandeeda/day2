package com.sandeep.day2;

public class DatePattern {

	public static String generateDate(String input) {

		
		String month="";
		String monthInString="";
		int monthInInteger;
		
		
		if(input.charAt(2)==',' && input.charAt(5)==',')
		{
		month=input.substring(3, 5);

		monthInInteger=Integer.parseInt(month);
		
		
		switch(monthInInteger)
		{
		
		case 1:
			monthInString+="January";
			break;
		case 2:
			monthInString+="February";
			break;
		case 3:
			monthInString+="March";
			break;
		case 4:
			monthInString+="April";
			break;
		case 5:
			monthInString+="May";
			break;
		case 6:
			monthInString+="June";
			break;
		case 7:
			monthInString+="July";
			break;
		case 8:
			monthInString+="August";
			break;
		case 9:
			monthInString+="September";
			//hello world
			break;
		case 10:
			monthInString+="October";
			break;
		case 11:
			monthInString+="November";
			break;
		case 12:
			monthInString+="December";
			break;
		default:
			System.out.println("Please enter month correctly");
			return "Please enter month correctly";
			
		
		}
		
		
		
		
		System.out.println(input.substring(0,2)+"/"+monthInString+"/"+input.substring(6,10));
		
		
		return input.substring(0,2)+"/"+monthInString+"/"+input.substring(6,10);

		}
		
		
		else
		{
			System.out.println("Enter the format correctly");
			return "Enter the format correctly";
		}
		
		
	
	}

}
