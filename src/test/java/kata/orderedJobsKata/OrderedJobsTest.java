package kata.orderedJobsKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedJobsTest {

	/**
	 * Potential production method
	 * @param input
	 * @return
	 */
	String orderJobs(String input) {
		if(input.isEmpty()){
			return "";
		} else {
			return "a";
		}
	}
	
	private String expected;
	private String input;
	private String output;
	
	@Test
	public void testEmptyInputStringReturnsEmptyString(){
		expected = "";
		input = "";
		executeTest();
	}
	
	@Test
	public void testSingleJobaAsInputReturnsaAsOutput(){
		expected = "a";
		input = "a =>";
		executeTest();
	}
	
	/**
	 * Test Method
	 */
	private void executeTest() {
		output = orderJobs(input);
		assertEquals(expected,output);
	}

}
