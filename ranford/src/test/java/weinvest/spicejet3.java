package weinvest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet3 {

	public static void main(String[] args)
	{
		  
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				//launch site(SWD)
				driver.get("http://www.spicejet.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("[//input[@id='ctl00_mainContent_txt_Fromdate']/following-sibling::button[@class='ui-datepicker-trigger']")).click();
//				while(true)
//				{
//				driver.findElement(By.xpath("//span[text()='Prev']")).click();
//	
//
//	}

	}
}
