package jdbc.com.cognizant;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaSeleniumCode9 {
    @Test
    public void performScrollingOnPage() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.goibibo.com/flights/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
Actions act=new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fromContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'searchCity')]")));
        fromContainer.click();

        WebElement fromInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='From']")));
        fromInput.sendKeys("HYDERABAD");

        List<WebElement> fromSuggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[@for='fromCity']/following::li")));
        for (WebElement suggestion : fromSuggestions) {
            if (suggestion.getText().equalsIgnoreCase("Hyderabad")) {
            	suggestion.click();
            	act.moveToElement(suggestion).sendKeys(Keys.ENTER);
             
                break;
            }
        }



WebElement toContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'searchToCity')]")));
        toContainer.click();

        WebElement toInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='To']")));
        toInput.sendKeys("BHUBANESHWAR");

        List<WebElement> toSuggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[@for='toCity']/following::li")));
        for (WebElement suggestion : toSuggestions) {
            if (suggestion.getText().equalsIgnoreCase("Bhubaneshwar")) {
            	suggestion.click();
            	act.moveToElement(suggestion).sendKeys(Keys.ENTER);
            	break;
            }
        }


    }
}
