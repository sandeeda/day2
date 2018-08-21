package com.sandeep.day2.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.DatePattern;

class DatePatternTest {

	@Test
	void dateTest() {
		
		
		
		
		assertEquals("09/July/2010", DatePattern.generateDate("09,07,2010"));
		assertEquals("19/February/2015", DatePattern.generateDate("19,02,2015"));
		assertEquals("25/June/1996", DatePattern.generateDate("25,06,1996"));
		assertEquals("Enter the format correctly", DatePattern.generateDate("25/07,1996"));

		
	}

}
