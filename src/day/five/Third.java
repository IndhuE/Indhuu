package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Third {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		WebElement btnCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCancel.click();
		WebElement btnFurniture = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[6]"));
		actions.moveToElement(btnFurniture).perform();
		WebElement btnSecond = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		btnSecond.click();
		
	}
}
