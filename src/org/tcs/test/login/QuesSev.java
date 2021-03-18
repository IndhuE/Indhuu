package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesSev {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtFromStation = driver.findElement(By.xpath("//input[@title='From station']"));
		txtFromStation.sendKeys("Chennai");
		WebElement txtToStation = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtToStation.sendKeys("Kanyakumari");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSearch.click();
		
	}
}
