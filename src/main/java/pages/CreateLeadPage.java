package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT create lead page", "FAIL");
		}

	}
	
	public CreateLeadPage clickcreateleadlink(){
		clickByXpath(prop.getProperty("CreateLead.clickCreatelead.Xpath"));
		return this;
	}
	
	public CreateLeadPage entercompanyname(String companyname){
		enterById(prop.getProperty("CreateLead.enter.companyname"), companyname);
		return this;
	}
	// Verify the username
	public CreateLeadPage enterfirstname(String firstname){
		enterById(prop.getProperty("CreateLead.enter.firstname"), firstname);
		return this;
	}

	public CreateLeadPage enterlastname(String lastname){
		enterById(prop.getProperty("CreateLead.enter.lastname"), lastname);
		return this;
	}
	
	public ViewLeadPage clickcreatelead(){
		clickByClassName(prop.getProperty("CreateLead.clicksubmit.Class"));
		return new ViewLeadPage();
	}
	public FindLeadPage clickfindlead(){
		clickByXpath(prop.getProperty("FindLead.clickfindlead.Xpath"));
		return new FindLeadPage();
	}
	
	public MergeLeadPage clickmergelead(){
		clickByXpath(prop.getProperty("MergeLead.clickmergelead.Xpath"));
		return new MergeLeadPage();
	}
	
}
