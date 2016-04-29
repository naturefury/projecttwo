package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{

	public FindLeadPage() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT find lead page", "FAIL");
		}

	}
	
	
	
	
	public FindLeadPage enterleadid(String leadid){
		enterByXpath(prop.getProperty("FindLead.Enterfindleadid.Xpath"),leadid);
		return this;
	}
	
	public FindLeadPage clickfindleadbutton() throws InterruptedException{
		clickByXpath(prop.getProperty("FindLead.clickfindleadbutton.Xpath"));
		Thread.sleep(3000);
		return this;
	}
	
	public ViewLeadPage clickfindleadlink(){
		clickByXpath(prop.getProperty("FindLead.clickfindleadlink.Xpath"));
		return new ViewLeadPage();
		
	}
	public FindLeadPage clickfindleadlinkandverifylinkispresent(){
		
		if(clickfindleadlinkandverifylinkispresent(prop.getProperty("FindLead.clickfindleadlinkandverifylinkispresent.Xpath")).contentEquals("No records to display"))
		{
			System.out.println("Lead deleted sucessfully");
		}
		return this;
	}
	public FindLeadPage switchtolastwindow() throws InterruptedException{
		SwitchToLastwindow();
		Thread.sleep(3000);
		return this;
	}
	
}
