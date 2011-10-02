package kata.orderedJobsKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedJobsTest {

	@Test
	public void testEmptyInputStringReturnsEmptyString(){
		String expected = "";
		String input = "";
		String output = orderJobs(input);
		assertEquals(expected,output);
	}

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

}
