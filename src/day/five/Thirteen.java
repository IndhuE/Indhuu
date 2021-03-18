package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Thirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement btnMobNTab = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(btnMobNTab).perform();
		WebElement btnTwo = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		actions.moveToElement(btnTwo).perform();
		btnTwo.click();
		
	}
}
