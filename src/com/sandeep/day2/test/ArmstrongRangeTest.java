package com.sandeep.day2.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void testIsArmstrong() {
		
		
		assertArrayEquals(new int[] {0,1,153,370,371,407,0,0,0,0,0,0},ArmstrongRange.isArnmstrong(0,999));
		assertArrayEquals(new int[] {0,0,0,0,0,0,0,0,0,0,0,0},ArmstrongRange.isArnmstrong(1000,9990));
		
		
	}

}
