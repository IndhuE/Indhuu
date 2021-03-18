package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Eight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@id='username'])[1]"));
		txtUserName.sendKeys("Indhu@gmail.com");
		String userName = txtUserName.getAttribute("value");
		System.out.println(userName);
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		txtPassword.sendKeys("12345");
		String userPassword = txtPassword.getAttribute("value");
		System.out.println(userPassword);
	}
}
