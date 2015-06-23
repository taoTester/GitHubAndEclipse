package study.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDay2 {
	

	
	@BeforeMethod
	public void beforeMethond(){
		
		System.out.println("This is before Methond Test");
	}
	
	@Test
	public void testMethond3(){
		
		System.out.println("This is test methond3");
		
	}

	@AfterMethod
	public void afterMethond(){
		
		System.out.println("This is after methond test");
		
	}
}
