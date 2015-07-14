package test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actionModules.LogIn_Actions;
import bsh.This;
import PageObject.HCR.Client.BaseClass;
import PageObject.HCR.Client.Home_Page;
import PageObject.HCR.Client.LogIn_Page;
import PageObject.HCR.Client.SignIn_Page;
import Utility.HCR.Client.Constant;
import Utility.HCR.Client.ExcelUtils;
import Utility.HCR.Client.Log;
import Utility.HCR.Client.TestNGListeners;
import Utility.HCR.Client.Utils;

//@Listeners(Utility.HCR.Client.TestNGListeners.class)
@Listeners(Utility.HCR.Client.TestNGListener.class)
public class Test1  {

	
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		PropertyConfigurator.configure("log4j.properties");
		ExcelUtils.setExcelFile(Constant.EXCELFILE_PATH, Constant.EXCELSHEET_NAME);
		String t1= ExcelUtils.getCellData(1, 1);
		ExcelUtils.setCellData("pass", 1, Constant.EXCEL_RESULT);
	//	int rownum=ExcelUtils.getLastRow();
		
		System.out.println(t1);
		Test1 t2 = new Test1();
		t2.f2();
		
		new BaseClass(driver);
		driver =new FirefoxDriver();
		driver.get("http://172.16.7.46:7106/etmallWeb/login/login.xhtml");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.xpath(".//*[@id='memberAccount']")).sendKeys("xxxxx");
		LogIn_Page.enterpriseUserName().sendKeys("xxxxxxxx");

	//	Home_Page.logInBtn().click();
	//	LogIn_Actions.execute(1);
	//	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/span[2]/a[1]")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div[1]/span[2]/a[1]")).click();
		
	}
	
	
public void f2(){
	
	
	System.out.println(this.toString());
	
}
	
	

	
//private static String testCaseName;
//
//public static void main(String[] args) {
//	
//	Test1 t1 = new Test1();
//	t1.t1();
//}
//
//public void t1(){
//	
//	System.out.println(this.toString());
//}
//   
//	@Test
//	public void testM1() throws Exception{
//		
//		testCaseName = this.toString();
//	//	testCaseName = Utils.getClassName(testCaseName);
//		Log.info("≥ı…Û"+testCaseName);
//		Assert.assertEquals(1, 1);
//		
//	}
//	
///*	@Test
//	public void testM2(){
//		
//		Assert.assertEquals(1, 2);
//	}
//	
//	@Test(skipFailedInvocations=true)
//	public void testM3(){
//		
//		Assert.assertEquals(1, 2);
//	}*/
}
