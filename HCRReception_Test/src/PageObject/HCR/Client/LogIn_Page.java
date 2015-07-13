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
	public static WebElement enterpriseUserName(){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberAccount']"));
			
	}
	
//��ȡ��ҵ�û���½������Ԫ��	
	public static WebElement enterprisePassWord(){
		
		
		return driver.findElement(By.xpath(".//*[@id='memberPassword']"));
			
	}
	
//��ȡ��ҵ��½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement enterpriseAuthCode(){
		
		return driver.findElement(By.xpath(".//*[@id='membervalidCode']"));
		
	}
	
//��ȡ��ҵ��½��ť��Ԫ��	
	public static WebElement enterpriseLogInBtn(){
		
		return driver.findElement(By.id("memberloginbtn"));
		
	}

//�û���½���棬�������밴ť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement forgetPWBtn(){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[1]"));
		
	}

//�û���½���棬ע�ᰴť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement signInBtn(){
		
		return driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[2]"));
		
	}
	
//ת�������ڻ�����½�Ľ���
	public static WebElement bankingLogIn(){
		
		return	driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/ul/li[2]"));
		
	}


//��ȡ���ڻ����û������ı���
	public static WebElement bankingUserName(){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopAccount']"));
			
	}

//��ȡ���ڻ���������ı���	
	public static WebElement bankingPassWord(){
		
		
		return driver.findElement(By.xpath(".//*[@id='shopPassword']"));
			
	}
	
	
//��ȡ���ڻ�����½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement bankingAuthCode(){
		
		return driver.findElement(By.xpath(".//*[@id='shopvalidCode']"));
		
	}
	
	
//��ȡ���ڻ�����½��ť��Ԫ��
	public static WebElement bankingLogInBtn(){
		
		return driver.findElement(By.id("shoploginbtn"));
		
	}
}
