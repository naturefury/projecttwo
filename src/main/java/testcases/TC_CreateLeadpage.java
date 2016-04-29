package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC_CreateLeadpage extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC01A_createlead";
		testCaseName 	= "Classwork Create lead";
		testDescription = "Classwork decription create elad";
	}

	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password, String loginName,String compname,String firtname,String lastname) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickcreateleadlink()
		.entercompanyname(compname)
		.enterfirstname(firtname)
		.enterlastname(lastname)
		.clickcreatelead()
		.verifyfirstname(firtname);
	}
	
}
