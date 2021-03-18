package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Six {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnCourse = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(btnCourse).perform();
		WebElement btnCourseSelect = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		actions.moveToElement(btnCourseSelect).perform();
		WebElement btnCourseName = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		actions.moveToElement(btnCourseName).perform();
		btnCourseName.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
