package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusables.Common;

public class Mohd_MultipleElements {
	
	

	public static void main(String[] args) {
		
		Common com = new Common();
		com.initDriver();
		com.launchURL("https://demoqa.com/elements");
		com.clickAllTabs();
		
	}

}
