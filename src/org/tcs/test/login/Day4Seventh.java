package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Seventh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtFind = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtFind.sendKeys("greens VelMurugan");
		WebElement txtSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		txtSearch.click();
		WebElement btnClick = driver.findElement(By.xpath("(//div[@class='TbwUpd NJjxre'])[1]"));
		btnClick.click();

	}
}
