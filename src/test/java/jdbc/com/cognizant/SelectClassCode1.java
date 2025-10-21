package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassCode1 {
	@Test
	
	public void performTest() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/selects");
		driver.manage().window().maximize();
		WebElement multiselectdropdown=driver.findElement(By.xpath("//select[@multiple]"));
		Select select=new Select(multiselectdropdown);
		select.selectByContainsVisibleText("Rust");
		select.selectByContainsVisibleText("Java");
		select.selectByContainsVisibleText("React");
		
	}

}
