package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class DeleteLeadPage extends OpentapsWrappers{

	public DeleteLeadPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Edit lead page", "FAIL");
		}

	}
	
	public FindLeadPage clickfindlead(){
		clickByXpath(prop.getProperty("FindLead.clickfindlead.Xpath"));
		return new FindLeadPage();
	}
	
	
	
	
}
