package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fourteenth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement btnMobNTab = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		actions.moveToElement(btnMobNTab).perform();
		WebElement btnTwo = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		actions.moveToElement(btnTwo).perform();
		btnTwo.click();
		WebElement btnThree = driver.findElement(By.xpath("(//div[text()='Heels'])[1]"));
		actions.moveToElement(btnThree).perform();
		btnThree.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
