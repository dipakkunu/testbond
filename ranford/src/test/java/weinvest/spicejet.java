package weinvest;

        import java.util.List;
		import java.util.concurrent.TimeUnit;
        import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class spicejet {
			
		public static void main(String[] args)
		   {
			WebDriver driver;
			boolean flag=false;
			System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			//launch site(SWD)
			driver.get("http://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("[//input[@name='ctl00$mainContent$view_date1']")).click();
			while(true)
			{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			String month=driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]/span")).getText();
			if(month.contains("May"))
			{
				WebElement table=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table"));
				List<WebElement> rows=table.findElements(By.tagName("tr"));
				for(WebElement row:rows)
				{
				List<WebElement> coloumns=row.findElements(By.tagName("td"));
				for(WebElement col:coloumns)
				{
					String x=col.getText();
					//System.out.println(x);
					if(x.contains("25"))
					{
						col.click();
						flag=true;
						break;
					}
				}
				if(flag==true)
				{
					break;
					
				}
				}
			
			
			if(flag==true)
			{
				break;
			}
			}
			
			}
			

			}

		

		

	}


