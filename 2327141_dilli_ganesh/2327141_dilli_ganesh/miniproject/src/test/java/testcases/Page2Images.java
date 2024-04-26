package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page2Images {

	  public static WebDriver driver;
	  
	  public Page2Images(WebDriver driver) {
		  this.driver=driver;
	  }
	  
	  public static WebElement aboutresults()
	  {
		  WebElement aboutresults = driver.findElement(By.xpath("//*[@id='result-stats']"));
		  return aboutresults;
	  }
	  
	  public static WebElement images() 
	  {
	      WebElement images = driver.findElement(By.xpath("//*[@id='bqHHPb']/div/div/div/div[1]/div[1]/a/div/span"));
	      return images;
	  }
	}



	