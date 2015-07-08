package PageObject.HCR.Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIngPage {
	
	
//�û���Ԫ�أ��û���������8-20λ��Ӣ�Ļ����ֻ�_�ַ��������ַ���������
	public static WebElement inPutUserName(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='account']"));
		
	}

//���������û����ַ�������Ҫ��
// 1. ������Ӣ�ġ������Լ�"_"��� �������������ַ���
// 2. ������ַ����Ȳ��� �����Ȳ�����
// 3. �������û��� ��δ�����û�����
	public static WebElement userNameInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='account_ms']"));
		
	}

	//����Ԫ�أ����볤����8-20λ��Ӣ�Ļ����ֻ�_�ַ��������ַ���������	
	public static WebElement inPutPassWord(WebDriver driver){
		
		
		return driver.findElement(By.xpath(".//*[@id='pwd']"));
		
	}

	
//�������������ַ�������Ҫ��
// 1. ��������볤�Ȳ��������Ȳ�����
// 2. ����ֻ������Ӣ�ġ������Լ�"_"��ϣ������������ַ���	
// 3. ���������루δ�������룩
	public static WebElement passWordInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='pass_ms']"));
		
	}

	//����ȷ�Ͽ�
	public static WebElement confirmPassWord(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='repwd']"));
		
	}
	
//��������ȷ�������ַ�������Ҫ��
//	���ٴ���������
//	������������벻һ��
	public static WebElement confirmPWInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='repass_ms']"));
		
	}
	
//��ȡ�ֻ�������Ԫ��
	public static WebElement inPutPhone(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='mobile']"));
		
	}

//	���������ֻ��������ַ�������Ҫ��
//	1. �������ֻ���	 ��û������룩
//	2. ������ ��ȷ���ֻ��� ������ĺ��볤�Ȼ�����ȷ���ֻ��ţ�
	public static WebElement phoneInfo(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='mobile_ms']"));
		
	}

	//�����Ķ��ĵ�ѡ��
	public static WebElement aggreeRadio(WebDriver driver){
		
		return driver.findElement(By.xpath(".//*[@id='chbox']"));
		
	}
	
	//ע�ᰴť��Ԫ��
	public static WebElement signInBtn(WebDriver driver){
		
		
		return driver.findElement(By.xpath("//td[@class='posTd']/p/a[@class='regBtn']"));
		
	}
	
	
	//ע��ҳ��ĵ�½��ť
	public static WebElement logInBtn(WebDriver driver){
		
		return driver.findElement(By.xpath("//div[@class='fl reg_r']/div/a[@class='cor_blur']"));
		
	}
	
	
}
