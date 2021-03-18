package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seventeenth {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	WebElement firstMouseOver = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
	actions.moveToElement(firstMouseOver).perform();	
	
	
}
}
