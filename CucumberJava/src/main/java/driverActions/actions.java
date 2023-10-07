package driverActions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class actions {
	 
	
	
	public static WebDriver driver=new EdgeDriver();
	
	public static void action()
	{
		try {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
