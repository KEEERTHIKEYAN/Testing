package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthikeyan\\Downloads\\Selenium\\Drivers\\chromedriver.exe"); //Set a path for chrome driver
		WebDriver driver = new ChromeDriver(); //Chrome Launch	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Synchronized the code
		
		driver.get("https://b2b-stage.tiredev.net/auth-signin"); //Navigate to the URL
		System.out.println("Current URL: " + driver.getCurrentUrl()); //Print the current URL
		System.out.println("Page Tittle: " + driver.getTitle()); //Print the Page Tittle
		driver.manage().window().maximize(); //Maximize the window
		
		driver.findElement(By.id("username")).sendKeys("keerthi"); //Username
		driver.findElement(By.name("password")).sendKeys("Keerthi@29"); //Password
		driver.findElement(By.xpath("//button[text()='Sign In']")).click(); //SignIn
		
		//driver.findElement(By.linkText("Sign In")).click(); // start with <a> tag
		
		//xpath:
		//driver.findElement(By.xpath("//input[@id = 'sizeNumber']")).clear(); //Clear the data in the text box
		//driver.findElement(By.xpath("input[contains(@placeholder = 'Size Number...')]")).sendKeys("2257016"); // Partial text
		
		//Css Selector:		
		//System.out.println(driver.findElement(By.cssSelector("div#error-toast")).getText()); //Error Msg //Css Selector
		//driver.findElement(By.cssSelector("input[placeholder* = 'Size Number...']")).sendKeys("2257016"); // Partial text //Css Selector		
		
		driver.findElement(By.xpath("//a[text() = 'Tires']")).click(); //Click the Tires tab
		driver.findElement(By.xpath("//input[@id = 'sizeNumber']")).sendKeys("11225"); //Type the value in the size number field
		driver.findElement(By.xpath("//input[@id = 'sizeNumber']")).clear(); //Clear the data in the text box
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder = 'Size Number...']")).sendKeys("2256016"); //Type the value in the size number field
		driver.findElement(By.xpath("(//button[text() = 'Search'])[1]")).click(); //Click the search button //index
		System.out.println(driver.findElement(By.cssSelector("div a h4")).getText()); //print the text //ParentTagname ChildTagname

	}

}
