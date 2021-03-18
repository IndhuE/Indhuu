package day.five;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fourth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement btnMobile = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[21]"));
		actions.moveToElement(btnMobile).perform();
		Alert al = driver.switchTo().alert();
		al.dismiss();
		WebElement btnSmartPhone = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		btnSmartPhone.click();
		WebElement clkAbove = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		clkAbove.click();
		driver.quit();
	}
	
	
}
