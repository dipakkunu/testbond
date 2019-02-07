package Banking.ranford;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Testencapsulation {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		encapsulation ecp=new encapsulation();
		ecp.setname("deepak");
		ecp.setage(25);
		ecp.setstate("odisha");
	    //int x=ecp.getage();
	    System.out.println(ecp.getname()+" "+ecp.getage()+" "+ecp.getstate());
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	    

	}

}
