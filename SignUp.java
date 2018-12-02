package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUp {

	// Declaration of main method
	public static void main(String[] args) {

		// Setting path for Firefox Driver
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the web site for facebook
		driver.get("https://www.facebook.com");

		// Locating the text box First Name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='u_0_j']"));
		firstName.sendKeys("Srinivas");

		// Locating the text box for Last Name
		WebElement lastName = driver.findElement(By.xpath("//*[contains(@id,'u_0_l')]"));
		lastName.sendKeys("Thatikonda");

		// Locating the text box mobile or email-address
		WebElement mobileEmail = driver.findElement(By.xpath("//*[starts-with(@id,'u_0_o')]"));
		mobileEmail.sendKeys("srinivas.nirmal@gmail.com");

		// To locate re enter email address text box
		WebElement reEmail = driver.findElement(By.xpath("//*[@id='u_0_r' or @name='reg_email_confirmation__']"));
		reEmail.sendKeys("srinivas.nirmal@gmail.com");

		// To locate New password text box
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='u_0_v']"));
		newPassword.sendKeys("welcome123");

		// To locate signup button and click on it
		WebElement signUp = driver.findElement(By.xpath("//*[text()='Sign Up']"));
		signUp.click();

	}

} // End of program
