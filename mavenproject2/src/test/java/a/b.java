package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

@Test
public class b {
	 public String baseUrl = "http://demo.guru99.com/V4/";
	    String driverPath = "C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe";
	    public WebDriver driver ;
	    @BeforeTest
	      public void launchBrowser() {
	          
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);

	}
	@Parameters({"testParameters1","testParameters2"})
	    public void testMethod(@Optional String testParameters1, @Optional String testParameters2){
	            
	            driver.findElement(By.name("uid")).sendKeys(testParameters1);
	            driver.findElement(By.name("password")).sendKeys(testParameters2);
	            driver.findElement(By.name("btnLogin")).click();;
	         
	            
	        }
	  
	         
	}


