package Utility.HCR.Client;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
	
	public static WebDriver driver = null;

	public static String getClassName(String className) throws Exception{
		
		String value = className;
		//获取一个类的Name，可以直接通过this.toString（）；
		//但是获取到的Class Name是“study.testNG.TestStructureMethond@659e0bfd”这样一种格式，
		//包名+Class Name + @序列码
		try {
			
			int position = className.indexOf("@");
			String fullName = className.substring(0, position);
			int position2 = fullName.lastIndexOf(".");
			value =  fullName.substring(position2+1);
			return value;
			
			
		} catch (Exception e) {
			Log.error("不能找到ClassName的原因是:"+e.getMessage());
			throw(e);
		}
		
		
	}
	
	//通过这个方法能获取当前页面的截图
	public static void takeScreenShot(WebDriver driver, String testCaseName) throws Exception{
		try {
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("locationOfStore"+testCaseName+".jpg"));
			
		} catch (Exception e) {
		
			Log.error("获取图片失败的原因是："+e.getMessage());
		    throw(e);
		}
	
		
	}
	
	public static void openBrowser(int testCaseRow) throws Exception{
		
		String browserName;
		browserName = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_BROWSER);
		if(browserName.equalsIgnoreCase("FireFox")){
		
			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\JavaCodeWorkSpace\\HCRReception_Test\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "E:\\JavaCodeWorkSpace\\HCRReception_Test\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
	}
	
}
