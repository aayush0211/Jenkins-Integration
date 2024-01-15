package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YelpSearchTest {
	 
		@Test
	    public void yelpSearchScenario() {
	        // Set the path to the ChromeDriver executable
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to Yelp website
	        driver.get("https://www.yelp.com/");

	        // Enter "Restaurant" in the search box
	        WebElement searchBox = driver.findElement(By.id("search_description"));
	        searchBox.sendKeys("Restaurant");

	        // Click on the search button
	        WebElement searchButton = driver.findElement(By.xpath("//*[@id='header_find_form']/div[3]/button"));
	        searchButton.click();

	        // Verify the title of the result page
	        String expectedTitle = "TOP 10 BEST Restaurant in San Francisco, CA - January 2024 - Yelp";
	        String actualTitle = driver.getTitle();

			System.out.println(actualTitle);
	        Assert.assertEquals(expectedTitle, actualTitle);

	        // Close the browser
	        driver.quit();
	    }
}
