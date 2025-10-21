package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SeleniumCode_2_DynamiC_Attributes {
	@Test
	public void testDynamicAttributes() {

		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Sampath");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("sam@gmail.com");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-10-2025");
		driver.findElement(By.xpath("//textarea[contains(@name,'additional-')]")).sendKeys("It is a very special event");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
         EdgeOptions options=new EdgeOptions();
         options.setAcceptInsecureCerts(false);
		
	}
	

}
