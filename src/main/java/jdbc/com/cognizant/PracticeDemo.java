package jdbc.com.cognizant;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDemo {
	
	@Test
	
	public void performTest() {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.contains("IRCTC")) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			
			WebElement fromSourceElement=driver.findElement(By.xpath("//label[text()='From']/preceding::span/input[contains(@aria-controls,'id_1')]"));
			fromSourceElement.click();
			fromSourceElement.sendKeys("Hyd");
			List<WebElement> fromSuggesstions=driver.findElements(By.xpath("//label[text()='From']/preceding::span/div/ul[@role='listbox']/li"));
			
			for(WebElement suggestion: fromSuggesstions) {
				if(suggestion.getText().contains("HYDERABAD")) {
					suggestion.click();
				}
			}
			WebElement toDestinationElement=driver.findElement(By.xpath("//label[text()='To']/preceding::span/input[contains(@aria-controls,'id_2')]"));
			toDestinationElement.click();
			toDestinationElement.sendKeys("Pune");
		    List<WebElement> toSuggesstions=driver.findElements(By.xpath("//label[text()='To']/preceding::span/div/ul[@role='listbox']/li"));
		    for(WebElement suggestion: toSuggesstions) {
				if(suggestion.getText().contains("PUNE")) {
					suggestion.click();
				}
			}
		
			
		}
		else {
			return;
		}
		
		
	}

}
