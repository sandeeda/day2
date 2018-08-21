package com.sandeep.day2.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testIsArmstrong() {
		
		
		
		assertEquals(false, Armstrong.isArmstrong(154));
		assertEquals(true, Armstrong.isArmstrong(153));
		assertEquals(false, Armstrong.isArmstrong(-153));
		assertEquals(true, Armstrong.isArmstrong(0));
		
		
	}

}
