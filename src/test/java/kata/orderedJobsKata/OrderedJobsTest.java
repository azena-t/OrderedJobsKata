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
			//Now check there are multiple jobs
			if(input.indexOf("\n")!=(-1)){
				String [] jobs = input.split("\n");
				for(int i = 0; i < jobs.length; i++){
					
					//New Stuff
					//Split the string into the job and dependency
					String [] jobDependency = jobs[i].split("=>");
					//If there is a dependency then do this
					if(jobDependency.length == 2){
						//Clean up the strings
						for(int j = 0; j < jobDependency.length; j++){
							jobDependency[j] = jobDependency[j].trim();
						}
						String dependee = jobDependency[0];
						String dependence = jobDependency[1];
						int deeIndex = output.indexOf(dependee);
						int decIndex = output.indexOf(dependence);
						if(decIndex == -1 && deeIndex == -1){
							output += dependence + dependee;
						}
					}
					//End of New Stuff
					if(output.indexOf(jobs[i].substring(0,1)) == -1){
						output += jobs[i].substring(0,1);
					}
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
	public void testTwoJobsabWhereaIsDependentOnbReturnsbaAsOutput(){
		expected = "ba";
		input = "a => b\nb =>";
		executeTest();
		/*output = "";
		String [] jobs = input.split("\n");
		for(int i = 0; i < jobs.length; i++){
			//Split the string into the job and dependency
			String [] jobDependency = jobs[i].split("=>");
			//If there is a dependency then do this
			if(jobDependency.length == 2){
				//Clean up the strings
				for(int j = 0; j < jobDependency.length; j++){
					jobDependency[j] = jobDependency[j].trim();
				}
				String dependee = jobDependency[0];
				String dependence = jobDependency[1];
				int deeIndex = output.indexOf(dependee);
				int decIndex = output.indexOf(dependence);
				if(decIndex == -1 && deeIndex == -1){
					output += dependence + dependee;
				}
			}
		}
		assertEquals(expected,output);*/
	}
	
	/*@Test
	public void testThreeJobsabcWherecIsDependentOnbReturnsacbAsOutput(){
		expected = "acb";
		input = "a =>\n"
	}*/
	
	@Test
	public void testThreeJobsabcAsInputReturnsabcAsOutput(){
		expected = "abc";
		input = "a =>\nb =>\nc =>";
		executeTest();
	}
	
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
