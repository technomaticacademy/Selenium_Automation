package testcases;

import org.openqa.selenium.By;

import reusables.Common;

public class Mohd_Progressive {

	public static void main(String[] args) {
		
		//Create objects
		Common com  = new Common();
		
		//XPath
		By btnAutoXPath = By.xpath("//a[@data-tracking-label='auto_section']");
		By edtZipXPath = By.xpath("//input[@id='zipCode_overlay']");
		By getAQuote = By.xpath("//input[@id='qsButton_overlay']");
		By FirstName = By.xpath("//input[@aria-label='First Name']");
		
		//Initiate driver instance
		com.initDriver();
		
		//Launch URL
		com.launchURL("https://www.progressive.com/");
		
		//Click on Auto
		com.click(btnAutoXPath);
		
		//Enter Zip code
		com.enter(edtZipXPath, "10001");
		
		//Click on Get A Quote
		com.click(getAQuote);
		
		com.enter(FirstName, "Mohammed");
		
		
	}

}
