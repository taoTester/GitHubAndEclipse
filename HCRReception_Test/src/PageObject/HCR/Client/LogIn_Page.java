package PageObject.HCR.Client;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogIn_Page extends BaseClass{
	
	public LogIn_Page(WebDriver driver){
		
		super(driver);
		
	}

	public static WebElement element = null;
	
	

//转换到企业登陆的界面
	public static WebElement enterpriseLogin(){
		
	
		return	driver.findElement(By.xpath("//div[@class='loginTab']/ul/li[@class='current']"));
		
	}
	
//获取企业用户名账户的元素	
	public static WebElement enterpriseUserName(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberAccount']"));
			
	}
	
//获取企业用户登陆的密码元素	
	public static WebElement enterprisePassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberPassword']"));
			
	}
	
//获取企业登陆的验证码输入框的元素，这个地方需要找开发留一个后门，取得一个万能的验证码，测试完成后需要马上删掉	
	public static WebElement enterpriseAuthCode(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='membervalidCode']"));
		
	}
	
//获取企业登陆按钮的元素	
	public static WebElement enterpriseLogInBtn(WebDriver driver){
		
		return driver.findElement(By.id("memberloginbtn"));
		
	}

//用户登陆界面，忘记密码按钮的元素，仅仅只有企业用户有这个选项，金融机构的用户是管理员在后台新建的，不支持注册	
	public static WebElement forgetPWBtn(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[1]"));
		
	}

//用户登陆界面，注册按钮的元素，仅仅只有企业用户有这个选项，金融机构的用户是管理员在后台新建的，不支持注册	
	public static WebElement signInBtn(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[2]"));
		
	}
	
//转换到金融机构登陆的界面
	public static WebElement bankingLogIn(WebDriver driver){
		
		return	driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/ul/li[2]"));
		
	}


//获取金融机构用户名的文本框
	public static WebElement bankingUserName(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopAccount']"));
			
	}

//获取金融机构密码的文本框	
	public static WebElement bankingPassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopPassword']"));
			
	}
	
	
//获取金融机构登陆的验证码输入框的元素，这个地方需要找开发留一个后门，取得一个万能的验证码，测试完成后需要马上删掉	
	public static WebElement bankingAuthCode(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='shopvalidCode']"));
		
	}
	
	
//获取金融机构登陆按钮的元素
	public static WebElement bankingLogInBtn(WebDriver driver){
		
		return driver.findElement(By.id("shoploginbtn"));
		
	}
}
