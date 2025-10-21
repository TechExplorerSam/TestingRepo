package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Hello {

	
	@Test
	public void performTest() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
	}
}
