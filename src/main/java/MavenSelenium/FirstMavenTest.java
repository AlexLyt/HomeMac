package MavenSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;




public class FirstMavenTest {
	 WebDriver wd;

	
	
	 @BeforeClass
		public void SetUp (){
	
	System.out.println("Firefox started");
	System.setProperty("webdriver.gecko.driver", "/Users/alexlytvynenko/Desktop/Alex's/Selenium/SeleniumSetUp/geckodriver");
    wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}
	 @Test
	  public void verifyHomepageTitle()  {
		wd.get("https://www.jpmorgan.com/country/US/en/jpmorgan");
		String text = wd.findElement(By.id("nav1320480976926")).getText();
		String newtext = text;
		
		System.out.println("Text is" + newtext);
		
		System.out.println(" Here is my changes for git ripo ");
		
	}

	 @AfterClass
		public void tearDown() {
			if(wd!=null) {
				System.out.println("Closing chrome browser");
				wd.quit();
			}
		}
	}

