package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_001_Sample {

	public static void main(String[] args) {
		WebDriver driver;
		
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		//1. Open the browser and launch the URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//2. Enter the user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//3. Enter the password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//4. Click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		//5. Close the browser
		driver.close();

	}

}
