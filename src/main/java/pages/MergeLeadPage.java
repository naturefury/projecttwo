package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage() {

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Edit lead page", "FAIL");
		}

	}
	
	
	public FindLeadMergePage clickfromleadmerge(){
		clickByXpath(prop.getProperty("MergeLead.clickfromleadmergeicon.Xpath"));
		SwitchToLastwindow();
		return new FindLeadMergePage();
		
	}
	public FindLeadMergePage clicktoleadmerge(){
		clickByXpath(prop.getProperty("MergeLead.clicktoleadmergeicon.Xpath"));
		SwitchToLastwindow();
		return new FindLeadMergePage();
	}
	
	
	public ViewLeadPage clickmerge() throws InterruptedException{
		clickByClassNamewithoutsnap(prop.getProperty("MergeLead.clickmerge.Class"));
		Thread.sleep(2000);
		Acceptalertwithoutsnap();
		Thread.sleep(1000);
		return new ViewLeadPage();
	}
	
}
