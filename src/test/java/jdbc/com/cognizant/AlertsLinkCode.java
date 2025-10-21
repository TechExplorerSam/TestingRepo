package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertsLinkCode {
	
	@Test
	
	public void ALertTesting() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		driver.manage().window().maximize();
		WebElement simpleAlertButton=driver.findElement(By.xpath("//button[@id='simple']"));
		simpleAlertButton.click();
		driver.switchTo().alert().accept();
		WebElement confirmationAlertButton=driver.findElement(By.xpath("//button[@id='confirmation']"));
		confirmationAlertButton.click();
		driver.switchTo().alert().accept();
		WebElement promptAlertButton=driver.findElement(By.xpath("//button[@id='prompt']"));
		promptAlertButton.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Hello World");
		al.accept();
		
		
	}

}
