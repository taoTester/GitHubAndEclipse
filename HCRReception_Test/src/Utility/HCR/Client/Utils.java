package Utility.HCR.Client;

import java.io.File;
import java.util.concurrent.TimeUnit;

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
		
		//String value = className;
		//��ȡһ�����Name������ֱ��ͨ��this.toString������
		//���ǻ�ȡ����Class Name�ǡ�study.testNG.TestStructureMethond@659e0bfd������һ�ָ�ʽ��
		//����+Class Name + @������
		try {
			
			int position = className.indexOf("@");
			String fullName = className.substring(0, position);
			int position2 = fullName.lastIndexOf(".");
			return fullName.substring(position2+1);
			
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
	
	//����Excel���ж���Ĳ�ͬ�������������ѡ��launch��ͬ�������
	public static WebDriver openBrowser(int testCaseRow) throws Exception{
		
		String browserName;
		try {
			browserName = ExcelUtils.getCellData(testCaseRow, Constant.EXCEL_BROWSER);
			if(browserName.equalsIgnoreCase("FireFox")){
			
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(Constant.BASE_URL);
				Log.info("Utils | openBrowser | Successfull to open the Firefox.");
				
			} else if (browserName.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "E:\\JavaCodeWorkSpace\\HCRReception_Test\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(Constant.BASE_URL);
				Log.info("Utils | openBrowser | Successfull to open the Chrome.");
				
			}else if (browserName.equalsIgnoreCase("IE")) {
				
				System.setProperty("webdriver.ie.driver", "E:\\JavaCodeWorkSpace\\HCRReception_Test\\IEDriver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(Constant.BASE_URL);
				Log.info("Utils | openBrowser | Successfull to open the IE.");
			}
			
		} catch (Exception e) {
			
			Log.error("Utils | openBrowser | -"+ e.getMessage());
		}

		return driver;
		
	}
	
}
