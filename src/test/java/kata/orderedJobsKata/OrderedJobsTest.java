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
			return input.substring(0, 1);
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
	
	@Test
	public void testSingleJobbAsInputReturnsbAsOutput(){
		expected = "b";
		input = "b =>";
		executeTest();
	}
	
	@Test
	public void testTwoJobsabAsnputReturnsabAsOutput(){
		expected ="ab";
		input = "a =>\nb =>";
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
