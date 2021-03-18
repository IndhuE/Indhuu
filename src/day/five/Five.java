package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Five {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement btnMobile = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[26]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(btnMobile).perform();
		WebElement btnSmartPhone = driver.findElement(By.xpath("(//a[@target='_blank'])[3]"));
		btnSmartPhone.click();

	}
}
