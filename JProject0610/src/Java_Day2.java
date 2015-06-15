import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Java_Day2 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		Java_Day2.selectOption();
		
	}
	
	public static void selectOption(){
		
		
		Select select = new Select(driver.findElement(By.id("continents")));
		List<WebElement> options = select.getOptions();
		for(int index=0; index<options.size();index++){
			
			select.selectByIndex(index);
			System.out.println("the value is:"+ options.get(index).getText());
			System.out.println("The checkBox is MultipleBox:"+select.isMultiple());
		}
	
	}
	
	public static void actionPerform(){
		
		WebElement from = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement to = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		Actions actions = new Actions(driver);
	    Action action = actions.clickAndHold(from).moveToElement(to).release(to).build();
	    action.perform();
		
	}
	
//	public static void waitTime(By by){
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	//	WebElement element = (WebElement) wait.until(ExpectedConditions.elementToBeSelected(by));
//		
//		
//	}
	
}
