
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Java_Day1 {
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://172.16.7.46:7106/MallManager/");
		driver.manage().window().maximize();
		Log.logInfo("成功登陆合产融后台");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='admin']/div[4]/input")).click();
	//	driver.close();
		Log.logInfo("浏览器已经退出");
	}


}
