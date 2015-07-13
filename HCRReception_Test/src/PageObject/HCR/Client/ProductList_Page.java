package PageObject.HCR.Client;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.HCR.Client.Log;

public class ProductList_Page extends BaseClass {
	
	private static WebElement element;
	
	public ProductList_Page(WebDriver driver){
		
		super(driver);
		
	} 
	
	public static WebElement toProductList_Page() throws Exception{
		
		try {
			
			element = driver.findElement(By.xpath("html/body/div[3]/div/ul/li[2]/a"));
			Log.info("�ɹ��ҵ�����ҳ��Ԫ��");	
		} catch (Exception e) {
			Log.error("û���ҵ�����ҳ��Ԫ��");
			throw(e);
		}
		
		return element;
		
	}
	
	
	public static class search_Page{
		
		@SuppressWarnings("unused")
		public static WebElement MoneyLimit(){
			
			List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='J_cateAttrBox']/dl[1]/dd/a"));
			for(int i=0;i<elements.size();i++){
				
				return elements.get(i);
				
			}
			return null;
		}
		
	}

}
