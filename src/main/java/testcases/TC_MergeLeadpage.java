package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_MergeLeadpage extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC01A_Mergelead";
		testCaseName 	= "Classwork merge lead";
		testDescription = "Classwork decription merge lead";
	}

	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String leadid1,String leadid2) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickcreateleadlink()
		.clickmergelead()
		.clickfromleadmerge()
		.entermergeleadid(leadid1)
		.clickmergefindleadbutton()
		.clickmergefindleadlink()
		.clicktoleadmerge()
		.entermergeleadid(leadid2)
		.clickmergefindleadbutton()
		.clickmergefindleadlink()
		.clickmerge();
		
	}
	
}
