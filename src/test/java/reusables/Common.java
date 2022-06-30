package reusables;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	public WebDriver driver;
	
	public void initDriver() {
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
	}
	
	public void launchURL(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
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
		dropdown.selectByVisibleText("March");
		dropdown.deselectByIndex(2);

	}
	
	public void click(By xPath) {
		driver.findElement(xPath).click();
		System.out.println("Clicked on -->" + xPath);
	}
	
	public void enter(By xPath,String text) {
		driver.findElement(xPath).sendKeys(text);
		System.out.println("Entered " + text + " in textbox -->" + xPath);
	}
	
	public void select(By xPath,String text) {
		Select listbox = new Select(driver.findElement(xPath));
		listbox.selectByVisibleText(text);
		System.out.println("Selected " + text + " in Listbox -->" + xPath);
	}
	
	
	
	public void getFirstCountryName() {
		String FirstCountryXPath = "//table[@id='countries']//tr[2]/td[2]";
		String countryName = driver.findElement(By.xpath(FirstCountryXPath)).getText();
		
		System.out.println(countryName);
		
		String SecondCountryXPath = "//table[@id='countries']//tr[3]/td[1]/input";
		driver.findElement(By.xpath(SecondCountryXPath)).click();
	}
	
	public void getallNames() {
		String allCountryXPath = "";
		String allCapitalXPath = "//table[@id='countries']//tr/td[3]";
		String allCurrencyxPath = "//table[@id='countries']//tr/td[4]";
		String allLanguageXPath = "";
		
		List<WebElement> listCurrency = driver.findElements(By.xpath(allCurrencyxPath));
		
		for(WebElement currency:listCurrency) {
			System.out.println(currency.getText());
		}
		
		System.out.println("----------------------------------------");
		
		List<WebElement> listCapitals = driver.findElements(By.xpath(allCapitalXPath));
		
		for(WebElement capital:listCapitals) {
			System.out.println(capital.getText());
		}
		
	}
	
	
	public void createAutoQuote() throws InterruptedException {
		String AutoXPath = "(//span[text()='Auto'])[1]";
		String ZipXPath = "//*[@id='zipCode_overlay']";
		String GetaQuote = "//input[@id='qsButton_overlay']";
		String FirstNameXPath = "//input[@aria-label='First Name']";
		String LastNameXPath = "//input[@aria-label='Last Name']";
		
		driver.findElement(By.xpath(AutoXPath)).click();
		
		driver.findElement(By.xpath(ZipXPath)).sendKeys("10001");
		
		System.out.println(driver.findElement(By.xpath(ZipXPath)).getAttribute("size"));
		
		System.out.println(driver.findElement(By.xpath(ZipXPath)).getAttribute("type"));
		
		System.out.println(driver.findElement(By.xpath(ZipXPath)).getAttribute("autocomplete"));
		
		System.out.println(driver.findElement(By.xpath(ZipXPath)).getTagName());
		
		System.out.println(driver.findElement(By.xpath(GetaQuote)).isEnabled());
				
		driver.findElement(By.xpath(GetaQuote)).click();
		
		//Thread.sleep(10000); // Not Recommended
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(FirstNameXPath)));
		
		driver.findElement(By.xpath(FirstNameXPath)).sendKeys("Mohammed");
		
		
		
		//Fluent Wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LastNameXPath)));

		
		driver.findElement(By.xpath(LastNameXPath)).sendKeys("M");
		
		driver.findElement(By.xpath(FirstNameXPath)).clear();
		
		driver.findElement(By.xpath(LastNameXPath)).getText();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public void seleniumBasicCommands() {
		String url = driver.getCurrentUrl();
		System.out.println("url-->" + url);
		
		String title = driver.getTitle();
		System.out.println("title-->" + title);
		
	}
	
	public void close() {
		driver.close();
		driver.quit();
	}

}
