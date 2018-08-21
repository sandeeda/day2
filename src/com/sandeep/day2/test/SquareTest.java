package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.Square;

class SquareTest {

	@Test
	void testSquare() {
		
				
				assertEquals(25, Square.doSquare(5));
				assertEquals(25, Square.doSquare(-5));
				assertEquals(0.25, Square.doSquare(0.5));
				assertEquals(0.25, Square.doSquare(-0.5));

				
			}

		

		
	

}


 