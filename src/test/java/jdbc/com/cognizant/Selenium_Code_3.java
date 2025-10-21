package jdbc.com.cognizant;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Code_3 {
	@Test
	public void performTest() throws InterruptedException {
		WebDriver driver=new EdgeDriver();	
		driver.get("https://training-support.net/webelements/drag-drop");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//img[@id='ball']"));
		WebElement element2=driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement element3=driver.findElement(By.xpath("//div[@id='dropzone2']"));;
		Actions action=new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
		action.dragAndDrop(element1, element3).perform();
		Thread.sleep(36000);
		driver.close();
		
}
}
