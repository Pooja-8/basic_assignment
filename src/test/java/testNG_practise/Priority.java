package testNG_practise;

import org.testng.annotations.Test;

public class Priority {
	@Test (priority=-2, invocationCount =2)
	public void demo()
	{
		System.out.println("demo");
	}
	
	@Test (priority=1)
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test (invocationCount =2, enabled=false)
	public void demo2()
	{
		System.out.println("demo2");
	}

}
