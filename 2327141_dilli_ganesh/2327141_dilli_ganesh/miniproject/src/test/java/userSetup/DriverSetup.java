package userSetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	 public static WebDriver driver;
     
     public static String browsertype;
 	  public static WebDriver launchdriver(String browser) {
 		browsertype = browser;
 		
 		if(browsertype.equalsIgnoreCase("chrome")) {
 			driver = new ChromeDriver();
 	 		driver.manage().window().maximize();	
 	 		driver.manage().deleteAllCookies();
 	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
 		}
 		else if(browsertype.equalsIgnoreCase("edge")){
 			driver = new EdgeDriver();
 	 		driver.manage().window().maximize();	
 	 		driver.manage().deleteAllCookies();
 	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
 	 		
 		}
 		return driver;
 	    
  }
}
