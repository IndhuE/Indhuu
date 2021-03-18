package day.six;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fifth {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnResume = driver.findElement(By.xpath("//div[@class='card-header11 d-flex align-items-center justify-content-between']"));
		btnResume.click();
		WebElement btnModelPaper = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Selenium_5and6yrs_Experience_Resume.pdf']"));
		Actions actions= new Actions(driver);
		Robot robot=new Robot();
		actions.contextClick(btnModelPaper).perform();
		for (int i = 1; i <=3; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		driver.quit();
		
	}
}
