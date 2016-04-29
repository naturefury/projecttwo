package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadMergePage extends OpentapsWrappers{

	public FindLeadMergePage() {

		if(!verifyTitle("Find Leads")){
			Reporter.reportStep("This is NOT find lead page", "FAIL");
		}

	}
	
	
	
	
	public FindLeadMergePage entermergeleadid(String leadid){
		enterByXpath(prop.getProperty("FindLeadMerge.Enterfindleadid.Xpath"),leadid);
		return this;
	}
	
	public FindLeadMergePage clickmergefindleadbutton() throws InterruptedException{
		clickByXpath(prop.getProperty("FindLeadMerge.clickfindleadbutton.Xpath"));
		Thread.sleep(3000);
		return this;
	}
	
	public MergeLeadPage clickmergefindleadlink() throws InterruptedException{
		clickByXpath(prop.getProperty("FindLeadMerge.clickfindleadlink.Xpath"));
		SwitchPrimarywindow();
		Thread.sleep(2000);
		return new MergeLeadPage();
		
	}
	public FindLeadMergePage clickfindleadlinkandverifylinkispresent(){
		
		if(clickfindleadlinkandverifylinkispresent(prop.getProperty("FindLead.clickfindleadlinkandverifylinkispresent.Xpath")).contentEquals("No records to display"))
		{
			System.out.println("Lead deleted sucessfully");
		}
		return this;
	}

	
}
