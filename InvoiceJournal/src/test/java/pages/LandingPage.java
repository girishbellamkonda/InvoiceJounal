package pages;

import common.commonMethods;

public class LandingPage {
	
	String LoginLink = "Login";
	
	commonMethods cm = new commonMethods();
	
	public void navagateToLoginPage() {
		cm.clickElement(LoginLink);
	}

}
