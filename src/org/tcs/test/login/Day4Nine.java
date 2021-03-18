package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Nine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtProduct = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txtProduct.sendKeys("mobiles");
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchIcon.click();
		WebElement btnFirstProduct = driver.findElement(By.xpath("//img[@src='https://n2.sdlcdn.com/imgs/i/p/6/230X258_sharpened/Oppo-A5s-CPH1909-32GB-2-SDL833776089-1-4b2d3.png']"));
		btnFirstProduct.click();
		driver.quit();		
	}
}
