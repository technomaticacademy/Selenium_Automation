package reusables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Common {
	public WebDriver driver;
	
	public void initDriver() {
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	
	public void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void locateMultipleElements() {
		String labelsxPath = "//label";
		String[] expectedfields = {"Name","Email"};
		
		WebElement label = driver.findElement(By.xpath(labelsxPath));
		String txt = label.getText();
		System.out.println(txt);
		
		List<WebElement> labels = driver.findElements(By.xpath(labelsxPath));
		for(int i=0;i<labels.size();i++) {
			txt = labels.get(i).getText();
			System.out.println(txt);
		}
	}
		
		public void clickAllTabs()  {
			String tabNamesxPath = "(//div[@class='element-group'])[1]//li";
			
			List<WebElement> tabs = driver.findElements(By.xpath(tabNamesxPath));
			
			for(WebElement ele:tabs) {
				System.out.println(ele.getText());
				ele.click();
			
				
			}
			
			
		}
		
	public void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();", ele);
	}
	
	
	
	public void liberty_quote() {
		String xpathStartquote = "//a[@class='lmig-Button lmig-Button--medium lmig-Button--secondary']";
		String xPathAuto = "//input[@aria-label='Get Auto Insurance']";
		String xpathZip = "//input[@id='quote-zipCode-input']";
		String xpathGetPrice = "//button[normalize-space()='Get my price']";
		String xpathNo = "//span[normalize-space()='Yes']";
		String xpathDOBMonth = "//select[@name='month']";
		
		
		driver.findElement(By.xpath(xpathStartquote)).click();
		
		driver.findElement(By.xpath(xPathAuto)).click();
		
		driver.findElement(By.xpath(xpathZip)).sendKeys("10001");
		
		driver.findElement(By.xpath(xpathGetPrice)).click();
		
		driver.findElement(By.xpath(xpathNo)).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath(xpathDOBMonth)));
		
		dropdown.selectByIndex(3);
		dropdown.selectByValue("03");
		dropdown.selectByVisibleText("March");
		
		
		
		
	}

}
