package PageObject.HCR.Client;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogIn_Page extends BaseClass{
	
	public static WebElement element = null;
	
	public LogIn_Page(WebDriver driver){
		
		super(driver);
		
	}

//ת������ҵ��½�Ľ���
	public static WebElement enterpriseLogin(){
		
	
	element=driver.findElement(By.xpath("//div[@class='loginTab']/ul/li[@class='current']"));
	return element;
		
	}
	
//��ȡ��ҵ�û����˻���Ԫ��	
	public static WebElement enterpriseUserName(){
		
		
		element= driver.findElement(By.xpath(".//*[@id='memberAccount']"));
		return element;	
	}
	
//��ȡ��ҵ�û���½������Ԫ��	
	public static WebElement enterprisePassWord(){
		
		
		element= driver.findElement(By.xpath(".//*[@id='memberPassword']"));
		return element;
	}
	
//��ȡ��ҵ��½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement enterpriseAuthCode(){
		
		element= driver.findElement(By.xpath(".//*[@id='membervalidCode']"));
		return element;
	}
	
//��ȡ��ҵ��½��ť��Ԫ��	
	public static WebElement enterpriseLogInBtn(){
		
		element= driver.findElement(By.id("memberloginbtn"));
		return element;
	}

//�û���½���棬�������밴ť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement forgetPWBtn(){
		
		element= driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[1]"));
		return element;
	}

//�û���½���棬ע�ᰴť��Ԫ�أ�����ֻ����ҵ�û������ѡ����ڻ������û��ǹ���Ա�ں�̨�½��ģ���֧��ע��	
	public static WebElement signInBtn(){
		
		element= driver.findElement(By.xpath(".//*[@id='memberLoginForm']/div[5]/p[2]/a[2]"));
		return element;
	}
	
//ת�������ڻ�����½�Ľ���
	public static WebElement bankingLogIn(){
		
		element= driver.findElement(By.xpath("html/body/div[3]/div/div/div[1]/ul/li[2]"));
		return element;
	}


//��ȡ���ڻ����û������ı���
	public static WebElement bankingUserName(){
		
		
		element= driver.findElement(By.xpath(".//*[@id='shopAccount']"));
		return element;
	}

//��ȡ���ڻ���������ı���	
	public static WebElement bankingPassWord(){
		
		
		element= driver.findElement(By.xpath(".//*[@id='shopPassword']"));
		return element;
	}
	
	
//��ȡ���ڻ�����½����֤��������Ԫ�أ�����ط���Ҫ�ҿ�����һ�����ţ�ȡ��һ�����ܵ���֤�룬������ɺ���Ҫ����ɾ��	
	public static WebElement bankingAuthCode(){
		
		element= driver.findElement(By.xpath(".//*[@id='shopvalidCode']"));
		return element;
	}
	
	
//��ȡ���ڻ�����½��ť��Ԫ��
	public static WebElement bankingLogInBtn(){
		
		element= driver.findElement(By.id("shoploginbtn"));
		return element;
	}
}
