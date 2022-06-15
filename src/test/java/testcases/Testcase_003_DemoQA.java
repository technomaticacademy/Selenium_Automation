package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_003_DemoQA {

	public static void main(String arg[]) throws InterruptedException {

		Salman();

	}

	public static void Salman() {
		//Create the driver instance
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys("salman");
		driver.findElement(By.id("lastName")).sendKeys("alam");
		driver.findElement(By.id("userEmail")).sendKeys("alam");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("2352");
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("jhbdas");
		
		driver.close();
	}

	public static void Rafsan() throws InterruptedException {
		//Create the driver instance
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys("Rafsan");
		driver.findElement(By.id("lastName")).sendKeys("I");

		//Email
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");

		// Gender
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

		//mobile number
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("123456789");

		//date of birth 

		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys(Keys.DELETE);
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("01 Jan 2021");

		// Subject 
		driver.findElement(By.id("subjectsInput")).sendKeys("Amigos");

		//Hobbies
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();

		//Picture
		//driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();

		//Current Address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Life is full of mysteries to unfold everyday");
		//submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

	public void Mohammed() {
		//Create the driver instance
		String driverPath = "E:\\Technomatic\\git\\Selenium_Project\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);



		driver.findElement(By.id("firstName")).sendKeys("Mohammed");
		driver.findElement(By.id("lastName")).sendKeys("M");

		driver.findElement(By.id("userEmail")).sendKeys("abc@xyz.com");



		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("123456789");

		//submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();


		//driver.close();
	}




}
