package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Twelth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		txtSearch.sendKeys("Mobiles");
		WebElement btnsearch = driver.findElement(By.xpath("(//a[@onclick='searchTrigger()'])[1]"));
		btnsearch.click();
		WebElement firstProduct = driver.findElement(By.id("det_img_135157491"));
		firstProduct.click();
		
	}
	
	
}
