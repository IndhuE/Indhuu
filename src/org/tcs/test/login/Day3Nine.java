package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Nine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtUserId = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));
		txtUserId.sendKeys("Indhu@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]"));
		txtPassword.sendKeys("Indhu");
		driver.quit();
	}
}
