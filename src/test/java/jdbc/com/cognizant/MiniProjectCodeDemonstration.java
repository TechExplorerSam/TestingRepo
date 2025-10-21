package jdbc.com.cognizant;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
 * Case Study: Alert Handling

Problem Statement: 

Alert handling 

Handle the alert when user clicks on “Sign in” button without filling any information 
Handle alert when user clicks on “Forgot Password” link  
Suggested site: https://mail.rediff.com/cgi-bin/login.cgi  

Detailed Description:

Launch the browser 
Enter URL: https://rediff.com 
Click on “Sign in” link.
Keep all the fields empty 
Click on Sign In button 
Fetch the text of Alert and Verify whether correct alert is displayed.
Close the alert 
Click on Forgot password link 
Click on Next button without filling details 
Fetch the text of Alert and Verify whether correct alert is displayed 
Close the alert and Navigate back to the webpage
Click on “Privacy Policy” link which there at the bottom of the page
Verify whether respective page is displayed in new tab
Close the new window and close the browser 
Key Automation Scope: 

Automation Concepts, Selenium Configuration, Web driver Basics 
Object Identification
Page Navigation 
Form Registration Basic 
Reusable method creation 
Alert and Window Handling 
Driver setup and browser capabilities 
Test validation
 * 
 **/
public class MiniProjectCodeDemonstration {
	@Test

	public void HandleAlertsInRediffMail() {
		WebDriver driver = new EdgeDriver();
		// predefined Test Conditions
		
		
		
		String expectedAlertText = "Please enter a valid user name";
		String expectedAlertTextForgotPassword = "Please enter your email ID";
		String expectedChildWindowTitle = "Welcome to rediff.com";

		// Navigating the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Maximizing the Window
		
		driver.manage().window().maximize();

		// Store Parent Window Id Here
		
		String parentWindowHandle = driver.getWindowHandle();

		// Find the Log in button in the webpage using xpath locator
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		// click the loginButton web element;
		
		loginButton.click();

		// store the alert object in a variable with Alert Interface Reference
		
		Alert al = driver.switchTo().alert();

		// Verification of first Test Case scenario where the alert which is captured
		// upon clicking on the Log in button.
		
		if (al.getText().equals(expectedAlertText)) {
			System.out.println("First Test scenerio is passed the expected alert text was  " + expectedAlertText
					+ "  and the actual result obtained by testing is  " + al.getText());

		} else {
			System.out.println("First Test scenerio is failed the expected alert text was   " + expectedAlertText
					+ "  and the actual result obtained by testing is   " + al.getText());

		}
		// close the alert
		
		al.accept();

		// Find the forgot password link on the Web page by using xpath locator
		
		WebElement ForgotPasswordLink = driver.findElement(By.xpath("//a[text()='Forgot password?']"));

		// click on the forgot password link
		
		ForgotPasswordLink.click();

		// Locate the nextButton element in the WebPage
		
		WebElement nextButton = driver.findElement(By.xpath("//input[@name='next']"));
		nextButton.click();

		// store the alert object in a variable with Alert Interface Reference

		Alert al2 = driver.switchTo().alert();

		// Verification of Second Test Case scenario where the alert which is captured
		// upon clicking on the Next button.

		if (al2.getText().equals(expectedAlertTextForgotPassword)) {
			System.out.println(
					"Second Test scenerio is passed the expected alert text was   " + expectedAlertTextForgotPassword
							+ "   and the actual result obtained by testing is  " + al2.getText());
		} else {
			System.out.println(
					"Second Test scenerio is failed the expected alert text was   " + expectedAlertTextForgotPassword
							+ "   and the actual result obtained by testing is  " + al2.getText());

		}
		// Close the alert
		
		al2.accept();
		// navigate back to the previous parent page
		
		driver.navigate().back();

		// Use Explicit Wait of duration 10 seconds to load the page and making sure the
		// elements to be in a intractable and clickable state.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement privacyPolicyLink = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Privacy Policy']"))));
		// Use the actions class to navigate to the anchor link element and click it.
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Privacy Policy']"))).click().perform();

		// Get all the window handles
		
		Set<String> windowhandles = driver.getWindowHandles();
		String childWindowHandle = "";
		for (String windowHandle : windowhandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				childWindowHandle = windowHandle;
			}
		}
		// switch to child window.
		
		driver.switchTo().window(childWindowHandle);

		// Get the title of the child window using driver.getTitle() method.
		
		String childWindowTitle = driver.getTitle();

		// Verification of Final Test Case scenario where the alert which is captured
		// upon clicking on the privacy policy button.
             
		if (childWindowTitle.equals(expectedChildWindowTitle)) {
			System.out.println("Final Test scenerio passed  the expected title was  " + expectedChildWindowTitle
					+ "  and title obtained from testing is  " + childWindowTitle);
		} else {
			System.out.println("Final Test scenerio failed  the expected title was  " + expectedChildWindowTitle
					+ "  and title obtained from testing is  " + childWindowTitle);

		}

		// close the child window and the parent window by using driver.quit() as it
		// closes the both windows.
		
		driver.quit();

	}

}
