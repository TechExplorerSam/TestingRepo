package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumcode5 {
	@Test
	
	public void performTest() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		driver.manage().window().maximize();
		//Finding web Elements 
		
		WebElement element1=driver.findElement(By.xpath("//img[@id='ball']"));
		WebElement element2=driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement element3=driver.findElement(By.xpath("//div[@id='dropzone2']"));
		Actions action=new Actions(driver);
		
		int ballWidthX=element1.getLocation().getX();
		int ballWidthY=element1.getLocation().getY();
		
		int targetLength=element2.getLocation().getX();
		int targetWidth=element2.getLocation().getY();
		
		int finalResX1=targetLength-ballWidthX;
		int finalResY1=targetWidth-ballWidthY;
		
		action.clickAndHold(element1).moveByOffset(finalResX1, finalResY1).release().perform();
	
		
		int targetLength2=element3.getLocation().getX();
		int targetWidth2=element3.getLocation().getY();
		
		int finalResX2=targetLength2-ballWidthX;
		int finalResY2=targetWidth2-ballWidthY;
		action.clickAndHold(element1).moveByOffset(finalResX2, finalResY2).release().perform();
		
	}

}
