package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Second {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnOne = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
		btnOne.click();
		WebElement content = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan')][2]"));
		String Vel = content.getText();
		System.out.println(Vel);
	
		
		
	}
}
