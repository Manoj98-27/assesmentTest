package pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class basePage extends WebDriverBaseTestPage<WebDriverBaseTestPage>
{

    @Override
    protected void openPage(PageLocator pageLocator, Object... objects)
    {

    }
    protected static AndroidDriver getAndroidDriver(){
        return (AndroidDriver)checkType(AndroidDriver.class);
    }

    protected static IOSDriver getIOSDriver(){
        return (IOSDriver) checkType(IOSDriver.class);
    }


    private static <T> T checkType(Class<T> expectedClass){
        T driver=(T)(new WebDriverTestBase()).getDriver().getUnderLayingDriver();
        if(expectedClass.isInstance(driver)) {
            return driver;
        }else
        {
            throw new ClassCastException("");
        }

    }

}
