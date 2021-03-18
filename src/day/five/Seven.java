package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnCourse = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(btnCourse).perform();
		WebElement btnOracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		actions.moveToElement(btnOracle).perform();
		WebElement btnOracleCourse = driver.findElement(By.xpath("//a['href=\"http://www.greenstechnologys.com/oracle-sql-plsql-training-in-chennai.html\"']"));
		actions.moveToElement(btnOracleCourse).perform();
		btnOracleCourse.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
