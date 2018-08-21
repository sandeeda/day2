package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.ResultOfStudent;

class ResultOfStudentTest {

	@Test
	void declareResultTest() {
		
		assertEquals("passed", ResultOfStudent.declareResult(new int[] {70,80,90}));
		assertEquals("promoted", ResultOfStudent.declareResult(new int[] {30,80,90}));
		assertEquals("failed", ResultOfStudent.declareResult(new int[] {20,30,90}));
		assertEquals("failed", ResultOfStudent.declareResult(new int[] {20,30,0}));
		assertEquals("Marks should be greater than or equal to zero and less than 100", ResultOfStudent.declareResult(new int[] {-100,20,50}));
	}

}
