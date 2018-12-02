package com.ibm.seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class SearchShirt {

	//Declaration of main method
	public static void main(String[] args) {
		
		//Setting relative path for Chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		
		//Launching web application
		driver.get("https://www.jcpenney.com");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("closeButton")));
		driver.findElement(By.xpath("//a[@id='closeButton']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchTerm")));
		
		//Locating Search text box and entering vlaue
		WebElement searchElt = driver.findElement(By.xpath("//input[@id='searchTerm']"));
		searchElt.sendKeys("shirts");
		
		//Locating search button and clicking on it
		//WebElement searchButton=driver.findElement(By.xpath("//button[@class='btn_searchForm']"));
		WebElement searchButton=driver.findElement(By.xpath("//button[@title='search']"));
		//WebElement searchButton=driver.findElement(By.xpath("//form[@id='keywordSearch']/descendant::button[1]"));
		searchButton.click();
		
				
		//To click on displayed shirt image
		driver.findElement(By.xpath("//img[@class='productDisplay_image--default']")).click();
		
				
		//To locate the drop down field Size and selecting size value
		WebElement sizeElt = driver.findElement(By.xpath("//select[@id='SIZE']"));
		Select selectSize = new Select(sizeElt);
		selectSize.selectByVisibleText("14.5 / 32-33");		
		
		//To click on color box
		driver.findElement(By.xpath("//img[@title='Blooming Blue']")).click();
		
		
		//To locate and click on Add to Bag button
		driver.findElement(By.xpath("//*[contains(@name,'add to bag') and text()='Add to Bag']")).click();
				
			
		//To locate frame and switch to frame	
		WebElement frameElt=driver.findElement(By.xpath("//*[@id='modalIframe']"));
		driver.switchTo().frame(frameElt);
		
		//Wait for the checkout button to be visible
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btncheckout")));
		
		
		//To locate and click on Check out button
		WebElement checkoutButton=driver.findElement(By.xpath("//input[@id='btncheckout']"));
		checkoutButton.click();
		
		//Wait for the another check out button to visible 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Checkout")));
		
		//To locate and click on Next Check out button
		driver.findElement(By.xpath("//input[@id='Checkout']")).click();
				
	}

} //End of program
