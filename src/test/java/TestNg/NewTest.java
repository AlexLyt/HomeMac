package TestNg;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
    public WebDriver wd ; 
    
    @BeforeClass
	public void SetUp (){
    	   System.out.println("launching firefox browser"); 
  	System.setProperty("webdriver.gecko.driver", "/Users/alexlytvynenko/Desktop/Alex's/Selenium/SeleniumSetUp/geckodriver");
    	
      wd = new FirefoxDriver();
    }
     
  @Test
  public void verifyHomepageTitle() {
       
	   System.out.println("Raning test"); 


      wd.get("http://demo.guru99.com/selenium/newtours/");
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = wd.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println( expectedTitle+" = "+actualTitle);
     
  }
  @AfterClass
	public void tearDown() {
	  System.out.println("Closing");
			wd.quit();
		}
}