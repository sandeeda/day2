package com.sandeep.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void calculateIncomeTaxTest () {
		assertEquals(0.0, IncomeTax.calculateIncomeTax(12345));
		assertEquals(9999999.0, IncomeTax.calculateIncomeTax(-12345));
		assertEquals(0, IncomeTax.calculateIncomeTax(0));
		assertEquals(19000.0, IncomeTax.calculateIncomeTax(190000));
		assertEquals(80157.8, IncomeTax.calculateIncomeTax(400789));
		assertEquals(203673.3, IncomeTax.calculateIncomeTax(678911));
		assertEquals(203673.596295, IncomeTax.calculateIncomeTax(678911.98765));

	}

}
