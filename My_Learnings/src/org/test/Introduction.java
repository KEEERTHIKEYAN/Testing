package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthikeyan\\Downloads\\Selenium\\Drivers\\chromedriver.exe"); //Set a path for chrome driver
		WebDriver driver = new ChromeDriver(); //Chrome Launch
		driver.get("https://b2b-stage.tiredev.net/auth-signin"); //Navigate to the URL
		System.out.println("Current URL : "+ driver.getCurrentUrl()); //Print the current URL
		System.out.println("Page Tittle : "+ driver.getTitle()); //Print the Page Tittle
		
		//driver.close(); //Closing the current window
		//driver.quit(); //Closing every associate window
		
	}

}
