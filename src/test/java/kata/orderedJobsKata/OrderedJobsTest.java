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
		output = "";
		if(!input.isEmpty()){
			if(input.indexOf("\n")!=(-1)){
				String [] jobs = input.split("\n");
				for(int i = 0; i < jobs.length; i++){
					output += jobs[i].substring(0,1);
				}
			} else {
				output += input.substring(0, 1);
			}
		}
		return output;
	}
	
	private String expected;
	private String input;
	private String output;
	
	@Test
	public void testTwoJobsabAsnputReturnsabAsOutput(){
		expected ="ab";
		input = "a =>\nb =>";
		executeTest();
	}
	
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
	
	/**
	 * Test Method
	 */
	private void executeTest() {
		output = orderJobs(input);
		assertEquals(expected,output);
	}

}
