package org.hcl.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumFirst {
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\IE driver\\IEDriverServer.exe" );
	WebDriver driver =new InternetExplorerDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	//driver.quit();
	
	}
}




















//public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Indhu\\eclipse-workspace\\Indhu\\gecko\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.greenstechnologys.com/");
		//driver.quit();
		
	//}