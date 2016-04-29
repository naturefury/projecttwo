package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT view lead page", "FAIL");
		}

	}
	
	
	public ViewLeadPage verifyfirstname(String firstname){
		verifyTextContainsByXpath(prop.getProperty("ViewLead.clickfirstname.Xpath"),firstname);
		return this;
	}
	
	public EditLeadPage clickeditlead(){
		clickByXpath(prop.getProperty("ViewLead.clickEditlead.Xpath"));
		return new EditLeadPage();
	}
	
	public DeleteLeadPage clickdeletelead(){
		clickByXpath(prop.getProperty("ViewLead.clickDeletelead.Xpath"));
		return new DeleteLeadPage();
	}
	
}
