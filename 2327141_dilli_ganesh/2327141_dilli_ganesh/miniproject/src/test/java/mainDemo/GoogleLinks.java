package mainDemo;

import java.io.IOException;
//import java.time.Duration;
import java.util.List;
import java.util.Scanner;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import userSetup.DriverSetup;
import userSetup.ScreenShot;
import testcases.Page1Search;
import testcases.Page2Images;
import testcases.Page3News;
import testcases.Page4Videos;

public class GoogleLinks {
	public static WebDriver driver;
	
	   public static String browser;
	   public static WebElement allLinks,search,searchoptions,clickgooglesearch,aboutresults,images,News,videos;
	   public static Page1Search page1Search;
	   public static Page2Images page2Images;
	   public static Page3News page3News;
	   public static Page4Videos page4Videos;
	   
	   public static void launchbrowser(String browser)
	   {
		   
		   driver=DriverSetup.launchdriver(browser);
		   
	   }
	   public static void openUrl()
	   {
		   driver.get("https://www.google.com");
	       
	   }
	   public static void linkCount() 
	   {
		   page1Search=new Page1Search(driver);
		   List<WebElement> allLinks = Page1Search.allLinks();
		      System.out.println("Number of links in the web page: " + allLinks.size());
		      System.out.println("Link names:");
		      for(WebElement link : allLinks) {
		    	  System.out.println(link.getText());
		      }    
	   }
	   public static void enterCognizant()
	   {
		   WebElement search= Page1Search.search();
		   search.sendKeys("Cognizant");
	   }
	   public static void displayOptions() 
	   {
		   
		   List<WebElement> searchoptions = Page1Search.searchoptions();
		   System.out.println("Number of search options dispalyed: " + searchoptions.size());
		   try {
			ScreenShot.getscreenshot(driver,"optionsdisplayed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   System.out.println("searchoptions names:");
	       for(WebElement opt:searchoptions) 
	       {
	       System.out.println(opt.getText());
	       }   
	   }
	   public static void clickGoogle()
	   {
		   WebElement clickgooglesearch = Page1Search.clickgooglesearch();
		   clickgooglesearch.click();
	   }
	   public static void results() 
	   {
		   page2Images =new Page2Images(driver);
		   WebElement aboutresults = Page2Images.aboutresults();
		   System.out.println(aboutresults.getText());	 
		   try {
			ScreenShot.getscreenshot(driver,"searchresults");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   public static void displayImages() 
	   {
		   WebElement images = Page2Images.images();
		   images.click();
		   try {
			ScreenShot.getscreenshot(driver,"Images");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   public static void displayNews() 
	   {
		    page3News=new Page3News(driver);
		   WebElement news = Page3News.news();
		   news.click();
		   try {
			ScreenShot.getscreenshot(driver,"news");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   public static void displayVideos() 
	   {
		    page4Videos=new Page4Videos(driver);
		   WebElement videos = Page4Videos.videos();
		   videos.click();
		   try {
			ScreenShot.getscreenshot(driver,"videos");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   public static void closeBrowser()
	   {
		   driver.quit();
	   }
	   public static void main(String[] args) 
	   {
		   System.out.println("Enter the browser:");
		   Scanner scan = new Scanner(System.in);
		   browser = scan.next();
		   launchbrowser(browser);
		   
		   openUrl();
		   linkCount();
		   enterCognizant();
		   displayOptions();
		   clickGoogle();
		   results();
		   displayImages();
		   displayNews();
		   displayVideos();
		   closeBrowser();   
	   }
	   
	}



