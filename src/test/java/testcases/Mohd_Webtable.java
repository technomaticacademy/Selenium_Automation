package testcases;

import reusables.Common;

public class Mohd_Webtable {

	public static void main(String[] args) {
		Common com = new Common();
		
		com.initDriver();
		
		com.launchURL("https://cosmocode.io/automation-practice-webtable/");
		
		com.getallNames();

	}

}
