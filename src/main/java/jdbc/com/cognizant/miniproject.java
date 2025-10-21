package jdbc.com.cognizant;

import java.time.Duration;
import java.util.ArrayList;
import java.util.*;
 
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
 
public class miniproject {
	@Test
	public void staleElement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("mobile under 15000");
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		WebElement slider=driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']"));
		act.dragAndDropBy(slider, -190, 0).perform();
		
		
		WebElement scrol=driver.findElement(By.xpath("//div[contains(text(),'Number of Cores')]"));
		WebElement ele= driver.findElement(By.xpath("//section[@class='-5qqlC _2OLUF3'][22]//div//div"));
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrol);
		
		Thread.sleep(2000);
		ele.click();
		
		driver.findElement(By.xpath("//div[@class='e+xvXX KvHRYS']//span[contains(text(),'12 MORE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Pie']//label[@class='tJjCVx _3DvUAf']//div[@class='XqNaEv']")).click();
		
		Thread.sleep(3000);
		WebElement newest=driver.findElement(By.xpath("//div[@class='F9+fd2']//a"));
		js.executeScript("arguments[0].scrollIntoView(true);", newest);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='sHCOk2']//div[contains(text(),'Newest First')]")).click();
		
		
		
		Thread.sleep(2000);
		//
	}}
