package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {

		if(!verifyTitle("opentaps CRM")){
			Reporter.reportStep("This is NOT Edit lead page", "FAIL");
		}

	}
	
	
	public EditLeadPage enterupdatecompanyname(String companyname){
		enterById(prop.getProperty("EditLead.enter.updatecompanyname"), companyname);
		return this;
	}
	// Verify the username
	public EditLeadPage enterupdatefirstname(String firstname){
		enterById(prop.getProperty("EditLead.enter.updatefirstname"), firstname);
		return this;
	}

	public EditLeadPage enterupdatelastname(String lastname){
		enterById(prop.getProperty("EditLead.enter.updatelastname"), lastname);
		return this;
	}
	
	public ViewLeadPage clickupdatelead(){
		clickByClassName(prop.getProperty("EditLead.clickupdate.Class"));
		return new ViewLeadPage();
	}
	
	
	
}
