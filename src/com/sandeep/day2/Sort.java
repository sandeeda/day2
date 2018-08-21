package com.sandeep.day2;

public class Sort {

	public static int[] bubbleSort(int[] list) {

		for (int i = 0; i < 15-1; i++)
            for (int j = 0; j < 15-i-1; j++)
                if (list[j] > list[j+1])
                {
                    // swap temp and arr[i]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
		
		
		return list;
	}

}
