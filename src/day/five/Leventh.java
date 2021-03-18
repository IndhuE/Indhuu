package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leventh {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement btnDep = driver.findElement(By.xpath("//li[@class='ShoppingLinks__item'][1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(btnDep).perform();
		WebElement btnProduct = driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));	
		actions.moveToElement(btnProduct).perform();
		WebElement btnProductOne = driver.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		actions.moveToElement(btnProductOne).perform();
		WebElement btnProductTwo = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		//actions.moveToElement(btnProductTwo).perform();
		btnProductTwo.click();
		//Thread.sleep(3000);
		driver.quit();
		
	}
}
