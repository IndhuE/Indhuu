package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver); 
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement bankCash = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement bankAmount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement salesAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement salesCash= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement salesAmount= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		actions.dragAndDrop(bank, account).perform();
		actions.dragAndDrop(bankCash, bankAmount).perform();
		actions.dragAndDrop(sales, salesAccount).perform();
		actions.dragAndDrop(salesCash, salesAmount).perform();
		
		
	}
}
