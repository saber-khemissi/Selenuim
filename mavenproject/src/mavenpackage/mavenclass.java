package mavenpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class mavenclass {

	 public String baseUrl = "http://demo.guru99.com/V4/";
	    String driverPath = "C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe";
	    public WebDriver driver ;
	    @BeforeTest
	      public void launchBrowser() {
	          
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);

	}
	@Test
	@Parameters({"testParameters1","testParameters2"})
	    public void testMethod(@Optional String testParameters1, @Optional String testParameters2){
	            
	            driver.findElement(By.name("uid")).sendKeys(testParameters1);
	            driver.findElement(By.name("password")).sendKeys(testParameters2);
	            driver.findElement(By.name("btnLogin")).click();;
	         
	            
	        }
	  
	         
	}


