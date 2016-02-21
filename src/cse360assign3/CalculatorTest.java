//Brett Bauman
//PIN 117
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}

	@Test
	public void testGetTotal() { 
		Calculator testCalc = new Calculator();
		
		// initialized total should be 0
		assertEquals(0, testCalc.getTotal());
	}
	
	@Test
	public void testGetTotalWithOperations() {
		Calculator testCalc = new Calculator();
		testCalc.add(4);
		testCalc.subtract(2);
		testCalc.divide(2);
		testCalc.multiply(2);
		
		// (4 - 2) / 2 * 2 == 2
		assertEquals(2, testCalc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator testCalc = new Calculator();
		testCalc.add(3);
		
		assertEquals(3, testCalc.getTotal());
		
	}

	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(3);
		
		assertEquals(-3, testCalc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator testCalc = new Calculator();
		
		//add 1 so that total isn't 0 (because anything multiplied by 0 is 0)
		testCalc.add(1);
		testCalc.multiply(3);
		
		assertEquals(3, testCalc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator testCalc = new Calculator();
		
		//add 3 to total so we aren't dividing from 0
		testCalc.add(3);
		testCalc.divide(3);
		
		assertEquals(1, testCalc.getTotal());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator testCalc = new Calculator();
		
		//add 3 to total so we aren't dividing from 0
		testCalc.add(3);
		
		//divide by 0
		testCalc.divide(0);
		
		assertEquals(0, testCalc.getTotal());
	}

	@Test
	public void testGetHistoryNoHistory() {
		Calculator testCalc = new Calculator();
		
		assertEquals("0", testCalc.getHistory());
	}
	
	@Test
	public void testGetHistoryOneHistory() {
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		
		assertEquals("0 + 5", testCalc.getHistory());
	}
	
	@Test
	public void testGetHistoryUsingAllOperations() {
		Calculator testCalc = new Calculator();
		testCalc.add(4);
		testCalc.subtract(2);
		testCalc.divide(2);
		testCalc.multiply(2);
		
		assertEquals("0 + 4 - 2 / 2 * 2", testCalc.getHistory());
	}
	
	@Test
	public void testGetHistoryDivideByZero() {
		Calculator testCalc = new Calculator();
		testCalc.add(4);
		testCalc.subtract(2);
		testCalc.divide(0);
		testCalc.multiply(2);
		
		assertEquals("0 + 4 - 2 / 0 * 2", testCalc.getHistory());
	}

}
