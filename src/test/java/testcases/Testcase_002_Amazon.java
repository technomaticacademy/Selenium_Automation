package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_002_Amazon {

	public static void main(String[] args) {

		
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		//1. Open the browser and launch the URL
		driver.get("https://www.amazon.com/");
		
		//2. Enter the product name
		driver.findElement(By.id("//input[@id='twotabsearchtextbox']")).sendKeys("Dell laptop");
		
		//3. Enter the password
		driver.findElement(By.id("nav-search-submit-button")).click();
				
		//4. Click on login
		//driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'2022 Newest Dell Inspiron 3510 Laptop, 15.6 HD Dis')]")).click();
		
		driver.close();
		
		
		
		

	}

}
