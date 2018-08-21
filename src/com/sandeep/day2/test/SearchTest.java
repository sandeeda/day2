package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.Search;

class SearchTest {

	@Test
	void linearSearchTest() {

		assertEquals(true, Search.linearSearch(new int []  {-1,8,45,21,89,32,45,76,84,59,03,20,85,59,04},3));
		assertEquals(true, Search.linearSearch(new int []  {-1,-3,45,21,89,32,45,76,84,59,03,20,85,59,04},-3));
		assertEquals(false, Search.linearSearch(new int []  {-1,8,45,21,89,32,45,76,84,59,03,20,85,59,04},2));
		
	
	}

}
