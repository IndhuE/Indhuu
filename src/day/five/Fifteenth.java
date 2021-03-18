package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fifteenth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement btnSignin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		actions.moveToElement(btnSignin).perform();
		WebElement clkSignIn = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		clkSignIn.click();
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		txtUserName.sendKeys("indhu");
		WebElement btnContinue = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		btnContinue.sendKeys("9076534567");
		WebElement txtPassword= driver.findElement(By.xpath("//input[@id='ap_password']"));
		txtPassword.sendKeys("9076534567");
		WebElement btnContinueOne = driver.findElement(By.xpath("//input[@id='continue']"));
		btnContinueOne.click();
		WebElement txtCaptcha = driver.findElement(By.xpath("//input[@name='cvf_captcha_input']"));
		txtCaptcha.sendKeys("txtCaptcha");
		WebElement btnCreateAccount = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
		btnCreateAccount.click();
	}
}
