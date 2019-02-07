package weinvest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class flipkart {

        WebDriver driver;
        Logger log=Logger.getLogger(flipkart.class);
        
        @BeforeMethod
         
        @Parameters("browser")
        public void setup(String browsername)
        {
        	if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("lunching chrome browser");
        	}
        	else if(browsername.equalsIgnoreCase("IE"))
        	{
        		System.setProperty("webdriver.ie.driver","D:\\poject folder\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");		
        		driver=new InternetExplorerDriver();
        	}
		   driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().window().maximize();
        }
        @Test(priority=1)
        public void Title()
        {
        	  log.info("***************************************************wel come to home page**********************************");
              String s=driver.getTitle();
        	  System.out.println(s);
        	  log.debug("title is not coming");
        }
        @Test(priority=2)
        public void signup()
        {
        	log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++sign of pages+++++++++++++++++++++++++++++++++++++++++++");
        	WebElement w=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
        	  System.out.println(w.getText());
        	  log.fatal("element is not found");
        }
      
      
        
		//WebElement w=driver.findElement(By.xpath("//a[text()='Login & Signup']"));//.click();
	     //driver.findElement(By.xpath("//div[@class='_39M2dM']/child::input[@type='text']"));//.sendKeys("8093987502");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9438091447d");
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

 @AfterMethod
	
public void down()
{
	
}

}


