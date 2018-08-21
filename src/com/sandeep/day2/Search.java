package com.sandeep.day2;

public class Search {

	public static boolean linearSearch(int[] list, int key) {
		for(int i=0;i<15;i++)
		{
			if(list[i]==key)
			{
				return true;
			}
		}
		return false;
	}

}
