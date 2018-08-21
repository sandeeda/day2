package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.Sort;

class SortTest {

	@Test
	void bubbleSortTest() {
 
		
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},Sort.bubbleSort(new int[] {15,10,11,14,12,13,1,9,2,8,3,7,4,6,5} ));
		assertArrayEquals(new int[] {-9,-8,-7,-6,-5,-4,-3,-2,-1,10,11,12,13,14,15},Sort.bubbleSort(new int[] {15,10,11,14,12,13,-1,-9,-2,-8,-3,-7,-4,-6,-5} ));
	}

}
