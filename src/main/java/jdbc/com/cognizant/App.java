package jdbc.com.cognizant;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://www.google.com/");
//        try {
//			FluentWait<WebDriver> wait=new FluentWait<>(driver)
//					.withTimeout(Duration.ofSeconds(10))
//					.pollingEvery(Duration.ofSeconds(5))
//					.ignoring(Exception.class)
//					.withMessage("Time out.....");
//			WebElement ele1=wait.until(new Function<WebDriver,WebElement>(){
//				public WebElement apply(WebDriver driver) {
//					driver.findElement(By.name("djfwdkjfnkjfn")).sendKeys("Sampath");
//					return driver.findElement(By.name("q"));
//				
//			}
//				
//			});
//		} catch (Exception e) {
//			System.out.println("Huoptions.getBrowserName();rray you got an  exception");
//		}
//	        
//    }
    	
//    	EdgeOptions options=new EdgeOptions();
//  	options.setExperimentalOption("useAutomationExtension", false);
//   	options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
////    	
//    	options.addArguments("headless");
//    	
//    	options.addArguments("--ignore-certificate-errors");
//    	WebDriver driver=new EdgeDriver(options);
//    	driver.navigate().to("https://www.google.com/");
//    	driver.manage().window().maximize();
//    	System.out.println("Hello testing is done");
//    	
    	String s="sam";
    	String rev="";
    	for(int i=s.length()-1;i>=0;i--) {
    		rev+=s.charAt(i);
    		
    	}
    	System.out.println(rev);
    
}
}
