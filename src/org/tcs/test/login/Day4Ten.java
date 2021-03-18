package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Ten {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnMobiles = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		btnMobiles.sendKeys("mobiles");
		WebElement btnMobileType = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnMobileType.click();
		WebElement btnFirst = driver.findElement(By.xpath("//div[@class='CXW8mj'][1]"));
		btnFirst.click();
		driver.quit();
	}
}
