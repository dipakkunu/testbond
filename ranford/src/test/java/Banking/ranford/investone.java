package Banking.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class investone 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();;
		driver.findElement(By.name("firstName")).sendKeys("deepak");
		driver.findElement(By.name("lastName")).sendKeys("sahoo");
		driver.findElement(By.name("phone")).sendKeys("894752369");
		driver.findElement(By.name("address1")).sendKeys("marathalli");
		driver.findElement(By.name("city")).sendKeys("bangalore");
//		WebElement e=driver.findElement(By.xpath("//a[@id='btn-explore79']"));
//		e.click();
//		driver.findElement(By.xpath("//a[@href='explore_portfolio/1']")).click();
//		driver.findElement(By.xpath("//a[text()='Customise']")).click();
//		Actions act=new Actions(driver);
//		act.clickAndHold(driver.findElement(By.xpath("//input[@type='range']"))).moveByOffset(4, 50).build().perform();
//		driver.findElement(By.xpath("//a[text()='Rebalance']")).click();
//		driver.findElement(By.xpath("//a[text()='Invest Now']")).click();
//		WebElement obj =driver.findElement(By.xpath("//li[@class='list-group-item col-md-6']"));
//		String value=obj.getText();
//		if(value.contains("50"))
//		{
//			System.out.println("the portfolio contain 50 is true");
//		}
//		else{
//			System.out.println("the portfolio contain previous value is false");
//		}
		}

	}


