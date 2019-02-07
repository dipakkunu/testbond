package weinvest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validations
{
	@Test
	public void mytest()

	 {
		System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String x=driver.findElement(By.xpath("//label[text()='Email or Phone']")).getText();
		Assert.assertEquals("Email or Phone", x);
	

	 }

}
