package pages;


import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.selenium.webdriver.GetText;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
//import org.openqa.selenium.support.FindBy;

import groovyjarjarpicocli.CommandLine.Help.Ansi.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.core.MessageTypes;
import utility.utility;

public class appLaunchPage extends basePage{
    utility Utility = new utility();

    @FindBy(locator="common.loc")
    private QAFWebElement loc;
    
    @FindBy(locator="homePage.loc")
    private QAFWebElement homePageLoc;
    
    @FindBy(locator="listoftext.loc")
    private List<QAFWebElement> list;
    
    
    
    public void openApplication() {
    	 Reporter.logWithScreenShot("Application is launched", MessageTypes.Pass);
    }


	public void verifyUserIsOnHomePage() {
		Utility.waitForPageToLoad();
		homePageLoc.verifyPresent("Home Page");
	}


	public void VerifyUserIsPresentInTheList(String str) {
		 QAFWebElement ele = new QAFExtendedWebElement(String.format(pageProps.getString("text.loc"),str));
	        ele.waitForVisible(60000);
	       
	       if(ele.isDisplayed()) {
	    	   Reporter.logWithScreenShot("text is present", MessageTypes.Pass);
	       }
	}


	public void Getthelistofallusersdisplyaedonlist() {
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			pageProps.setProperty("list_of_user_"+i, list.get(i).getText());
	}
		
}


	public void verifyUserIsPresentInList(String str, int no) {
		for(int i=0;i<list.size();i++) {
			if(pageProps.getString("list_of_user_"+i).equals(str)) {
				if(i==no) {
					System.out.println(str+" is present at "+i);
				}
			}
		}
	}
}
