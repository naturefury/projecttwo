package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_EditLeadpage extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC01A_Editlead";
		testCaseName 	= "Classwork edit lead";
		testDescription = "Classwork decription edit lead";
	}

	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String leadid,String upcompname,String upfirtname,String uplastname) throws InterruptedException {
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
		.clickeditlead()
		.enterupdatecompanyname(upcompname)
		.enterupdatefirstname(upfirtname)
		.enterupdatelastname(uplastname)
		.clickupdatelead();
	}
	
}
