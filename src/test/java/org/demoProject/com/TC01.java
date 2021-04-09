package org.demoProject.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC01 extends BaseClass{
	
	@Test
	public void testCase01() throws Exception {
		System.out.println("Running tests");
		
		//Get title
		System.out.println("Page title is = " + driver.getTitle());
		
		/*
		 * Sel intreacts with HTML code only
		 * 
		 */
		
		
		//Click on Hotels
		driver.findElement(By.cssSelector("a[id='hotels']")).click();
		System.out.println("Click on Hotels");
		
		
		Thread.sleep(5000);
		
	}

}
