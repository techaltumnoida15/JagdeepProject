package org.demoProject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		//Chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cheapoair.com/");
		
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
