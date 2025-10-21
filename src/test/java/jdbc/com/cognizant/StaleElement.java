package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElement {
	@Test
	
	public void performTest() {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://training-support.net/webelements/login-form");
		driver.manage().window().maximize();
		WebElement username; 
		WebElement password;

		
			try {
				username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("admin");
				password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				password.sendKeys("password");

				driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
				driver.navigate().back();
				username.sendKeys("admin");
				password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				password.sendKeys("password");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();

			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
		
	
	}

}
