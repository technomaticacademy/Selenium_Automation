package testcases;

import reusables.Common;

public class Mohd_Liberty_001 {

	//test
	public static void main(String[] args) {
		Common com  = new Common();
		
		com.initDriver();
		
		com.launchURL("https://www.libertymutual.com/");
		
		com.liberty_quote();

	}

}
