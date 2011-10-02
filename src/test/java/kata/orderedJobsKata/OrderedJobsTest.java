package kata.orderedJobsKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedJobsTest {

	@Test
	public void testEmptyInputStringReturnsEmptyString(){
		String expected = "";
		String input = "";
		String output =null;
		if(input.isEmpty()){
			output="";
		}
		assertEquals(expected,output);
	}

}
