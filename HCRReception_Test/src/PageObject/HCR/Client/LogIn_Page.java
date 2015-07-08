package PageObject.HCR.Client;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogIn_Page extends BaseClass{
	
	public LogIn_Page(WebDriver driver){
		
		super(driver);
		
	}

	public static WebElement element = null;
	
	

//ת������ҵ��½�Ľ���
	public static WebElement enterpriseLogin(){
		
	
		return	driver.findElement(By.xpath("//div[@class='loginTab']/ul/li[@class='current']"));
		
	}
	
//��ȡ��ҵ�û����˻���Ԫ��	
	public static WebElement enterpriseUserName(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberAccount']"));
			
	}
	
//��ȡ��ҵ�û���½������Ԫ��	
	public static WebElement enterprisePassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberPassword']"));
			
	}
	
//��ȡ��ҵ��½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement enterpriseAuthCode(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='membervalidCode']"));
		
	}
	
//��ȡ��ҵ��½��ť��Ԫ��	
	public static WebElement enterpriseLogInBtn(WebDriver driver){
		
		return driver.findElement(By.id("memberloginbtn"));
		
	}

//�û���½���棬�������밴ť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement forgetPWBtn(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[1]"));
		
	}

//�û���½���棬ע�ᰴť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement signInBtn(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[2]"));
		
	}
	
//ת�������ڻ�����½�Ľ���
	public static WebElement bankingLogIn(WebDriver driver){
		
		return	driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/ul/li[2]"));
		
	}


//��ȡ���ڻ����û������ı���
	public static WebElement bankingUserName(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopAccount']"));
			
	}

//��ȡ���ڻ���������ı���	
	public static WebElement bankingPassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopPassword']"));
			
	}
	
	
//��ȡ���ڻ�����½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement bankingAuthCode(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='shopvalidCode']"));
		
	}
	
	
//��ȡ���ڻ�����½��ť��Ԫ��
	public static WebElement bankingLogInBtn(WebDriver driver){
		
		return driver.findElement(By.id("shoploginbtn"));
		
	}
}
