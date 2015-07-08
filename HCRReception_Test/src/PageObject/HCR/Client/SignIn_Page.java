package PageObject.HCR.Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_Page extends BaseClass{
	
	public SignIn_Page(WebDriver driver){
		
		super(driver);
	}
	
//�û���Ԫ�أ��û���������8-20λ��Ӣ�Ļ����ֻ�_�ַ��������ַ���������
	public static WebElement inPutUserName(){
		
		return driver.findElement(By.xpath(".//*[@id='account']"));
		
	}

//���������û����ַ�������Ҫ��
// 1. ������Ӣ�ġ������Լ�"_"��� �������������ַ���
// 2. ������ַ����Ȳ��� �����Ȳ�����
// 3. �������û��� ��δ�����û�����
	public static WebElement userNameInfo(){
		
		return driver.findElement(By.xpath(".//*[@id='account_ms']"));
		
	}

	//����Ԫ�أ����볤����8-20λ��Ӣ�Ļ����ֻ�_�ַ��������ַ���������	
	public static WebElement inPutPassWord(){
		
		
		return driver.findElement(By.xpath(".//*[@id='pwd']"));
		
	}

	
//�������������ַ�������Ҫ��
// 1. ��������볤�Ȳ��������Ȳ�����
// 2. ����ֻ������Ӣ�ġ������Լ�"_"��ϣ������������ַ���	
// 3. ���������루δ�������룩
	public static WebElement passWordInfo(){
		
		return driver.findElement(By.xpath(".//*[@id='pass_ms']"));
		
	}

	//����ȷ�Ͽ�
	public static WebElement confirmPassWord(){
		
		return driver.findElement(By.xpath(".//*[@id='repwd']"));
		
	}
	
//��������ȷ�������ַ�������Ҫ��
//	���ٴ���������
//	������������벻һ��
	public static WebElement confirmPWInfo(){
		
		return driver.findElement(By.xpath(".//*[@id='repass_ms']"));
		
	}
	
//��ȡ�ֻ�������Ԫ��
	public static WebElement inPutPhone(){
		
		return driver.findElement(By.xpath(".//*[@id='mobile']"));
		
	}

//	���������ֻ��������ַ�������Ҫ��
//	1. �������ֻ���	 ��û������룩
//	2. ������ ��ȷ���ֻ��� ������ĺ��볤�Ȼ�����ȷ���ֻ��ţ�
	public static WebElement phoneInfo(){
		
		return driver.findElement(By.xpath(".//*[@id='mobile_ms']"));
		
	}

	//�����Ķ��ĵ�ѡ��
	public static WebElement aggreeRadio(){
		
		return driver.findElement(By.xpath(".//*[@id='chbox']"));
		
	}
	
	//ע�ᰴť��Ԫ��
	public static WebElement signInBtn(){
		
		
		return driver.findElement(By.xpath("//td[@class='posTd']/p/a[@class='regBtn']"));
		
	}
	
	
	//ע��ҳ��ĵ�½��ť
	public static WebElement logInBtn(){
		
		return driver.findElement(By.xpath("//div[@class='fl reg_r']/div/a[@class='cor_blur']"));
		
	}
	
	
}
