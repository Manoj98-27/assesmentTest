package steps;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import io.cucumber.java.en.When;
import pages.appLaunchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

@QAFTestStepProvider
public class appLaunchPageSteps {
    appLaunchPage page = new appLaunchPage();

    @Given("I open the application")
    public void app_open_successfully(){
    	page.openApplication();
    }
    
    @Then("I verify user is on home page of the application")
    public void IVerifyUserIsOnHomePage() {
    	page.verifyUserIsOnHomePage();
    }
    
    @Then("I verify {0} is present in the list")
    public void IverifyUserIsPresentInTheList(String str) {
    	page.VerifyUserIsPresentInTheList(str);
    	
    }
    
    
    @When("I get the list of all users displyaed on list")
    public void igetthelistofallusersdisplyaedonlist() {
    	page.Getthelistofallusersdisplyaedonlist();
    }
    
    @When("I verify {0} is present on {1} number ")
    public void iVerifyUserIsPresentInList(String str,int no) {
    	page.verifyUserIsPresentInList(str,no);
    }
    
}
