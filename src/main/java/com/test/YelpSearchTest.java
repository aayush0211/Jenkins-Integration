package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	        WebElement searchBox = driver.findElement(By.id("find_desc"));
	        searchBox.sendKeys("Restaurant");

	        // Click on the search button
	        WebElement searchButton = driver.findElement(By.id("header-search-submit"));
	        searchButton.click();

	        // Verify the title of the result page
	        String expectedTitle = "Search Results";
	        String actualTitle = driver.getTitle();

	        Assert.assertEquals(expectedTitle, actualTitle);

	        // Close the browser
	        driver.quit();
	    }
}
