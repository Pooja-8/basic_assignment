package groupsconcept;

import org.testng.annotations.Test;


public class groups_practice_class1{
	
	@Test
	public void demo(){
		System.out.println("demo");
		
	}
	
	@Test(groups="smoke")
	public void demo1(){
		System.out.println("demo1");
		
	}

}
