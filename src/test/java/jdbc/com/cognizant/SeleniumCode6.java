package jdbc.com.cognizant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SeleniumCode6 {
    @Test
    public void keyboard() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        driver.manage().window().maximize();
        
        WebElement fullNameField = driver.findElement(By.xpath("//input[@placeholder = 'Full name']"));
        fullNameField.sendKeys("Sampath");
        fullNameField.sendKeys(Keys.CONTROL, Keys.ALT, "a");
        fullNameField.sendKeys(Keys.CONTROL, "c");
 
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        emailField.sendKeys(Keys.CONTROL,"v");


    }
    
}
        
