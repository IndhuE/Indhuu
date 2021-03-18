package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesNine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtPhNo = driver.findElement(By.className("_2IX_2- VJZDxU"));
		txtPhNo.sendKeys("7397421739");
		WebElement txtPassword = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
		txtPassword.sendKeys("indhu");
		WebElement btnLogin = driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL"));
		btnLogin.click();
		
	}
}
