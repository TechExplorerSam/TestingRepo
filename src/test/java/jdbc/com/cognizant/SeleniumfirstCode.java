package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumfirstCode {
	
	@Test
	public void performLoginFunctionality() {
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		WebElement inputElement=driver.findElement(By.id("username"));
		inputElement.sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//html/body/div/main/div/div/div/div/div[2]/form/button")).click();

		
		
		
	}
}
