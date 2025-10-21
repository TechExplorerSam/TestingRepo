package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadowDomCode1 {

	@Test
	
	public void performShadowDomTesting() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
//		WebElement element=driver.findElement(By.xpath("//shop-app[@page='home']"));
//		SearchContext contextshadow=element.getShadowRoot();
//		WebElement two =  contextshadow.findElement(By.cssSelector("iron-pages > shop-home"));
//		SearchContext c =  two.getShadowRoot();
//		c.findElement(By.cssSelector("div:nth-of-type(1) > shop-button > a")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement ele=(WebElement)jse.executeScript("return document.querySelector('shop-app').shadowRoot."+"querySelector('iron-pages').shadowRoot."+"querySelector('iron-pages').shadowRoot.querySelector(div:n-th-of-type(1) > shop-button > a)");
		ele.click();
	}
}
