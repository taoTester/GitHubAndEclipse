package PageObject.HCR.Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIngPage {
	
	
//用户名元素，用户名长度在8-20位的英文或数字或_字符，其它字符都不符合
	public static WebElement inPutUserName(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='account']"));
		
	}

//如果输入的用户名字符不符合要求：
// 1. 请输入英文、数字以及"_"组合 （包含不符的字符）
// 2. 输入的字符长度不符 （长度不够）
// 3. 请输入用户名 （未输入用户名）
	public static WebElement userNameInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='account_ms']"));
		
	}

	//密码元素，密码长度在8-20位的英文或数字或_字符，其它字符都不符合	
	public static WebElement inPutPassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='pwd']"));
		
	}

	
//如果输入的密码字符不符合要求：
// 1. 输入的密码长度不符（长度不够）
// 2. 密码只能输入英文、数字以及"_"组合（包含不符的字符）	
// 3. 请输入密码（未输入密码）
	public static WebElement passWordInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='pass_ms']"));
		
	}

	//密码确认框
	public static WebElement confirmPassWord(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='repwd']"));
		
	}
	
//如果输入的确认密码字符不符合要求：
//	请再次输入密码
//	两次输入的密码不一致
	public static WebElement confirmPWInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='repass_ms']"));
		
	}
	
//获取手机输入框的元素
	public static WebElement inPutPhone(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='mobile']"));
		
	}

//	如果输入的手机号码码字符不符合要求：
//	1. 请输入手机号	 （没输入号码）
//	2. 请输入 正确的手机号 （输入的号码长度或不是正确的手机号）
	public static WebElement phoneInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='mobile_ms']"));
		
	}

	//我已阅读的单选框
	public static WebElement aggreeRadio(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='chbox']"));
		
	}
	
	//注册按钮的元素
	public static WebElement signInBtn(WebDriver driver){
		
		
		return driver.findElement(By.xpath("//td[@class='posTd']/p/a[@class='regBtn']"));
		
	}
	
	
	//注册页面的登陆按钮
	public static WebElement logInBtn(WebDriver driver){
		
		return driver.findElement(By.xpath("//div[@class='fl reg_r']/div/a[@class='cor_blur']"));
		
	}
	
	
}
