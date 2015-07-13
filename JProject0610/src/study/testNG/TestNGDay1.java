package study.testNG;

import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
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
import org.testng.annotations.Parameters;
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
	
	@Ignore
	@Test
	public void testMethond1(){
		
		System.out.println("This is test methond1");
		
	}
	
	@Ignore
	@Test(priority=1)
	public void testMethond2(){
		
		System.out.println("This is test methond2");
		
	}
	
	@Ignore
	@Test(groups={"test1"},priority=2,enabled=false)
	public void group1Test1(){
		
		System.out.println("this is group1 test1");
		Reporter.log("logGroup1Test1");
		
	}
	
	@Ignore
	@Test(groups={"test1"},priority=0)
	public void group1Test2(){
		
		System.out.println("this is group2 test1");
		Reporter.log("Log Group1Test2 passed");
	}
	
	@Ignore
	@Test(groups={"test2"})
	public void group2Test1(){
		
		System.out.println("this is group1 test2");
		Reporter.log("Log Group2Test1 passed");
	}
	
	@Ignore
	@Test(groups={"test1","test2"})
	public void mixGroupTest(){
		
		System.out.println("This is mix group test");
		
	}
	
	@Test
	@Parameters({"userName", "passWord"})
	public void testParameter(String userName, String passWord){
		System.out.println("The user is:"+userName);
		System.out.println("the passWordis "+ passWord);
		
	}
	
	
	
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

