package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthikeyan\\Downloads\\Selenium\\Drivers\\chromedriver.exe"); //Set a path for chrome driver
		WebDriver driver = new ChromeDriver(); //Chrome Launch	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Synchronized the code
		
		driver.get("https://b2b-stage.tiredev.net/auth-signin"); //Navigate to the URL
		driver.manage().window().maximize(); //Maximize the window
		
		driver.findElement(By.id("username")).sendKeys("keerthi"); //Username
		driver.findElement(By.name("password")).sendKeys("Keerthi@29"); //Password
		driver.findElement(By.xpath("//button[text()='Sign In']")).click(); //SignIn
		
		driver.findElement(By.cssSelector("input[id = 'sizeNumber']")).sendKeys("2256016");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@id = 'btn-save-event'])[1]")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text() = '225/60R16 98V PETLAS VELOX SPORT PT741 BLK']")).getText(), "225/60R16 98V PETLAS VELOX SPORT PT741 BLK");
		System.out.println(driver.findElement(By.xpath("//h4[text() = '225/60R16 98V PETLAS VELOX SPORT PT741 BLK']")).getText());

	}

}
