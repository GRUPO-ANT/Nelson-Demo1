import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class calculoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {
		//fail("Not yet implemented");
		calculo cal= new calculo();
		
		assertTrue(cal.suma(2,3)==5);//assert sale ok
		
		
	}

	@Test
	public void testMinus() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplici() {
		fail("Not yet implemented");
	}

}
