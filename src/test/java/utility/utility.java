package utility;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import pages.basePage;

public class utility extends basePage {
@FindBy(locator="common.loc")
private QAFWebElement loc;

    public void tapOnText(String str){
        QAFWebElement ele = new QAFExtendedWebElement(String.format(pageProps.getString("common.loc"),str));
        ele.waitForVisible(60000);
        ele.click();
    }

    public void scrollTillElementVisible(){
    // put code here
    
    }
}