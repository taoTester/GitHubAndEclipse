package test;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actionModules.LogIn_Actions;
import PageObject.HCR.Client.BaseClass;
import Utility.HCR.Client.Constant;
import Utility.HCR.Client.ExcelUtils;
import Utility.HCR.Client.Log;
import Utility.HCR.Client.Utils;

@Listeners(Utility.HCR.Client.TestNGListener.class)
public class Test_LogIn {

	public WebDriver driver;
	public boolean flag;
	private String testCaseName;
	private int iTestCaseRow;
	
	@BeforeMethod
	public void setUp() throws Exception{
		
		PropertyConfigurator.configure("log4j.properties");
		
		testCaseName = Utils.getClassName(this.toString());
		Log.info(testCaseName);
		
		Log.startTestCase(testCaseName);
		
		ExcelUtils.setExcelFile(Constant.EXCELFILE_PATH, Constant.EXCELSHEET_NAME);
		
		iTestCaseRow=ExcelUtils.getConstantNum(testCaseName, Constant.EXCEl_TESTCASENAME);
		
		driver = Utils.openBrowser(iTestCaseRow);

		new  BaseClass(driver);
	}
	
	@Test
	public void test_LogIn() throws Exception{
		
		
	try {
		
		LogIn_Actions.execute(iTestCaseRow);
		
		
	//	Assert.assertEquals("actual", "expected");
		
		
	} catch (Exception e) {
		
		Utils.takeScreenShot(driver, testCaseName);
		ExcelUtils.setCellData("Failed", iTestCaseRow, Constant.EXCEL_RESULT);
		Log.error(testCaseName +"is failed"+e.getMessage());
		throw(e);
	}
		
		
	}

	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}
	
}
