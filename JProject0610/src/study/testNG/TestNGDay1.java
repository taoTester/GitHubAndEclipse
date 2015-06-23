package study.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDay1 {

	@BeforeSuite
	public void beforeSUite(){
		
		System.out.println("This is before Suite Test");
		
	}
	
	@BeforeClass
	
	public void beforeClass(){
		
		System.out.println("This is before Class Test");
	}
	
	@BeforeGroups
	public void beforeGroup(){
		
		System.out.println("This is beofre Group Test");
		
		
	}
	
	@BeforeTest
	public void beforeTest(){
		
		System.out.println("This is beofre Test");
	}
	
	@BeforeMethod
	public void beforeMethond(){
		
		System.out.println("This is before Methond Test");
	}
	
	@Test
	public void testMethond1(){
		
		System.out.println("This is test methond1");
		
	}
	
	@Test
	public void testMethond2(){
		
		System.out.println("This is test methond2");
		
	}
	
	@AfterSuite
	public void afterSuite(){
		
		System.out.println("this is after Suite Test");
		
	}
	
	@AfterClass
	public void afterClass(){
		
		System.out.println("this is after class test");
		
	}
	
	@AfterGroups
	public void afterGroup(){
		
		System.out.println("This is after group test");
	}
	
	
	@AfterMethod
	public void afterMethond(){
		
		System.out.println("This is after methond test");
	}
	
	@AfterTest
	public void afterTest(){
		
		System.out.println("this is after Test test");
	}
	
	
}

