package testcases;

import reusables.Common;

public class Mohd_Progressive_TC001 {

	public static void main(String[] args) throws InterruptedException {
		
		Common com = new Common();
		
		com.initDriver();
		com.launchURL("https://www.progressive.com/");
		
		com.createAutoQuote();
		
		com.seleniumBasicCommands();
		
		com.close();
				
				

	}

}
