package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT CRM Home page", "FAIL");
		}

	}
	// Verify the username
	public CRMHomePage verifyLoggedinUserName(String userName){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
		return this;
	}
	
	public LoginPage clickLogout(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage();
	}
	
}
