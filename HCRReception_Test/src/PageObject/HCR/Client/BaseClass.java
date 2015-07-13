package PageObject.HCR.Client;


import org.openqa.selenium.WebDriver;

public class BaseClass{

	public static WebDriver driver;
	public static boolean isResult;
	
	public BaseClass(WebDriver driver){
	
		BaseClass.driver = driver;
		BaseClass.isResult = true;
		
	}
	
}
