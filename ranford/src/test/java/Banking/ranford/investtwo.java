package Banking.ranford;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class investtwo {

	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://sfo-demo.herokuapp.com/model-portfolio");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.xpath("//a[@id='btn-explore79']"));
	e.click();
	driver.findElement(By.xpath("//a[@href='explore_portfolio/1']")).click();
	WebElement e1=driver.findElement(By.xpath("//a[text()='Customise']"));
	e1.click();
	String obj=e1.getText();
	if(obj.contains("reset"))
	{
		System.out.println("reset btn is present");
	}
	else{
		System.out.println("their is no reset btn");
	}
	
	driver.findElement(By.xpath("//a[text()='+ Add Stock']")).click();
	Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("Window.scrollBy(0,500)");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Done']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@class='close']")).click();
	WebElement table=driver.findElement(By.xpath("//div[@class='col-md-12']"));
	List<WebElement>  rowsnum =table.findElements(By.tagName("tr"));
	for (WebElement row : rowsnum)
	{       
		List<WebElement>  colnum =row.findElements(By.tagName("td")) ;  
		for (WebElement coloumn : colnum)
		{
			String value=coloumn.getText();
			if(value.contains("BT Group plc"))
			{
				System.out.println("it contains BT Group plc is true");
			}
			else{
				System.out.println("it not contaion is false");
			}
		}
	}
	

}
	}
