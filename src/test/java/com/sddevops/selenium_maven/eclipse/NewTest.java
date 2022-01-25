package com.sddevops.selenium_maven.eclipse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;   
public class NewTest {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://duckduckgo.com/");
		// Click on the search text box and send value
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("npm big-xml-notify");

		// Click on the search button
		driver.findElement(By.id("search_button_homepage")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("r1-0")).click();
		
	
		String actualUrl="https://www.npmjs.com/package/big-xml-notify";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app")));   
		String expectedUrl= driver.getCurrentUrl();
		System.out.println(expectedUrl);
		Assert.assertEquals(expectedUrl,actualUrl);
		
		driver.close();
		
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
