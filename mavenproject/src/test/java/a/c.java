package a;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class c{
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/saber/Desktop/Formation selenuim/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl ="https://jb3technologies.com/";
		String expectedTitle ="JB3 test test test  Technologies";
		String actualTitle="";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("test Passed");
		}
		else { System.out.println("test Failed");
				
	}
driver.close();
}
}


