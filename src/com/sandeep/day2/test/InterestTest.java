package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.Interest;

class InterestTest {

	@Test
	void testInterest() {
		
		assertArrayEquals(new double [] {622.7134199999999,2059.483953642312}, Interest.calculateInterest(1234,5.67,8.9,2));
		assertArrayEquals(new double [] {1706.5728000000004,9485.584703309414}, Interest.calculateInterest(9876,5.4,3.2,4));
		assertArrayEquals(new double [] {0,0}, Interest.calculateInterest(-1000,5,6,3));
		assertArrayEquals(new double [] {300.0,340.09564062500044}, Interest.calculateInterest(1000,5,6,1));
		assertArrayEquals(new double [] {0,0}, Interest.calculateInterest(-1000,5,-6,3));
		assertArrayEquals(new double [] {0,0}, Interest.calculateInterest(-1000,-5,6,3));
	}

}
