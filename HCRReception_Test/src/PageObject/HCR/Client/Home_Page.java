package PageObject.HCR.Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.HCR.Client.Log;

public class Home_Page extends BaseClass{
	
	private static WebElement element = null;

	public Home_Page(WebDriver driver) {
		
		super(driver);
	}

	public static WebElement logInBtn() throws Exception{
		
		try {
			
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/span[2]/a[1]"));
			Log.info("Home_Page-logInBtn-成功找到登陆按钮");
			
		} catch (Exception e) {
			Log.error("Home_Page-logInBtn-失败的找到登陆按钮"+e.getMessage());	
		    throw(e);
		}
	
		return element;
	}
}