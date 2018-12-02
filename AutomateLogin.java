package com.ibm.seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutomateLogin {

		//Declaration of main method
	public static void main(String[] args) {
		
		// Setting path for Firefox Driver
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Launch the web site for facebook
		driver.get("https://www.facebook.com");
		
		
		// Locating the text box Email
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("srinivas.nirmal@gmail.com");
		
		//Locating the text box password
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("welcome123");
		
		//Locating and clicking Login button
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
	


	}

}//End of program
