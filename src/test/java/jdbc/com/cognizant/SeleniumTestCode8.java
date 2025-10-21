package jdbc.com.cognizant;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestCode8 {

	@Test
	
	public void performTest() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/dynamic-content");
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		WebDriverWait webdwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='porch']")));
		System.out.println(driver.findElement(By.xpath("//h2[text()='porch']")).getText());
	}
}
