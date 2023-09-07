package groupsconcept;

import org.testng.annotations.Test;


public class groups_practise_class2 {
	
	@Test
	public void sample(){
		System.out.println("sample");
		
	}
	
	@Test(groups="smoke")
	public void sample1(){
		System.out.println("sample1");
		
	}

}
