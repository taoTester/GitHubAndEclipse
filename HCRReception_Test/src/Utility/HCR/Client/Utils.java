package Utility.HCR.Client;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static String getClassName(String className) throws Exception{
		
		String value = className;
		//��ȡһ�����Name������ֱ��ͨ��this.toString������
		//���ǻ�ȡ����Class Name�ǡ�study.testNG.TestStructureMethond@659e0bfd������һ�ָ�ʽ��
		//����+Class Name + @������
		try {
			
			int position = className.indexOf("@");
			String fullName = className.substring(0, position);
			int position2 = fullName.lastIndexOf(".");
			value =  fullName.substring(position2+1);
			return value;
			
			
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
	
	
}
