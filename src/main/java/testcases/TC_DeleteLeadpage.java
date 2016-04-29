package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_DeleteLeadpage extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC01A_Deletelead";
		testCaseName 	= "Classwork Delete lead";
		testDescription = "Classwork decription Delete lead";
	}

	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String leadid) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickcreateleadlink()
		.clickfindlead()
		.enterleadid(leadid)
		.clickfindleadbutton()
		.clickfindleadlink()
		.clickdeletelead()
		.clickfindlead()
		.enterleadid(leadid)
		.clickfindleadbutton()
		.clickfindleadlinkandverifylinkispresent();
	}
	
}
