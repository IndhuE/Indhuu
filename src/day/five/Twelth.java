package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twelth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement btnDep = driver.findElement(By.xpath("//li[@class='ShoppingLinks__item'][1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(btnDep).perform();
		WebElement btnFirstDep = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		actions.moveToElement(btnFirstDep).perform();
		WebElement btnSecDep = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		actions.moveToElement(btnSecDep).perform();
		WebElement btnThirdDep = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		actions.moveToElement(btnThirdDep).perform();
		btnThirdDep.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
