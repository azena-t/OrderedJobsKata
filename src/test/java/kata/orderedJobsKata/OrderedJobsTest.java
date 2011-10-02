package kata.orderedJobsKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedJobsTest {

	/**
	 * @param input
	 * @return
	 */
	String orderJobs(String input) {
		if(input.isEmpty()){
			return "";
		}
		return null;
	}
	
	@Test
	public void testEmptyInputStringReturnsEmptyString(){
		String expected = "";
		String input = "";
		String output = orderJobs(input);
		assertEquals(expected,output);
	}
	@Test
	public void testSingleJobaAsInputReturnsaAsOutput(){
		String expected = "a";
		String input = "a =>";
		String output = orderJobs(input);
		assertEquals(expected,output);
	}

}
