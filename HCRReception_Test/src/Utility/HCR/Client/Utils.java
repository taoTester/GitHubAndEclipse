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
		//��ȡһ�����Name������ֱ��ͨ��this.toString������
		//���ǻ�ȡ����Class Name�ǡ�study.testNG.TestStructureMethond@659e0bfd������һ�ָ�ʽ��
		//����+Class Name + @������
		try {
			
			int position = className.indexOf("@");
			String fullName = className.substring(0, position);
			int position2 = fullName.lastIndexOf(".");
			value =  fullName.substring(position2+1);
			return value;
			
			
		} catch (Exception e) {
			Log.error("�����ҵ�ClassName��ԭ����:"+e.getMessage());
			throw(e);
		}
		
		
	}
	
	//ͨ����������ܻ�ȡ��ǰҳ��Ľ�ͼ
	public static void takeScreenShot(WebDriver driver, String testCaseName) throws Exception{
		try {
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("locationOfStore"+testCaseName+".jpg"));
			
		} catch (Exception e) {
		
			Log.error("��ȡͼƬʧ�ܵ�ԭ���ǣ�"+e.getMessage());
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
