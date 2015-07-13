package study.testNG;

import org.junit.internal.runners.TestMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDay2 {
	

	
	@BeforeMethod
	public void beforeMethond(){
		
		System.out.println("This is before Methond Test");
	}
	
	@DataProvider(name="haha")
	public static Object[][] getData(){
		
		return new Object[][]{{"liangtao1","lt19891228"},{"liangtao2","tao11111"}};
		
	}
	@Test
	@Parameters({"userName2","passWord2"})

	public void testMethond3(String userName2, String passWord2){
		
		System.out.println(userName2);

		System.out.println(passWord2);
	}
	
	@Test(dataProvider="haha")
	public void testMethond4(String userName, String passWord){
		
		System.out.println(userName);
		System.out.println(passWord);
		
	}

	@AfterMethod
	public void afterMethond(){
		
		System.out.println("This is after methond test");
		
	}
}
