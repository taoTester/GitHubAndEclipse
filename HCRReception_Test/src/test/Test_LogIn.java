package test;

import org.apache.log4j.xml.DOMConfigurator;
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
import Utility.HCR.Client.TestNGListeners;
import Utility.HCR.Client.Utils;

@Listeners(Utility.HCR.Client.TestNGListener.class)
public class Test_LogIn extends TestNGListeners{

	private static String testCaseName;
	private static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception{
		
		DOMConfigurator.configure("E:\\JavaCodeWorkSpace\\HCRReception_Test\\config\\log4j.properties");
		
		testCaseName = this.toString();
		testCaseName = Utils.getClassName(this.toString());
		
		Log.startTestCase(testCaseName);
		
		ExcelUtils.setExcelFile(Constant.EXCELFILE_PATH, Constant.EXCELSHEET_NAME);
		
		ExcelUtils.getConstantNum(testCaseName, Constant.EXCEl_TESTCASENAME);
		
		Utils.openBrowser(1);
		
		new  BaseClass(driver);
	}
	
	@Test
	public void test_LogIn(){
		
		LogIn_Actions.execute(1);
		
	}

	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}
	
}
