import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private int a, b, c;
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,  b);
			
			int expected = 9999;
			assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a,  b);
			
			int expected = 5555;
			assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiple() {
		int a = 5678;
		int b = 3;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a,  b);
			
			int expected = 17034;
			assertEquals(actual, expected);
	}
	
	@Test
	public void testDivide() {
		int a = 490;
		int b = 2;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a,  b);
			
			int expected = 245;
			assertEquals(actual, expected);
	}
	
	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented");
		
		try {
			cal.divide(a, c);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		} catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

}
